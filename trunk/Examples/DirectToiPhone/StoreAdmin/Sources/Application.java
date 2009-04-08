//
// Application.java
// Project ITMSModelTest
//
// Created by rmendis on Thu Apr 21 2005
//

import com.webobjects.foundation.*;
import com.webobjects.appserver.*;
import com.webobjects.directtoweb.*;
import com.webobjects.eocontrol.*;
import com.webobjects.jdbcadaptor.*;
import java.sql.*;

public class Application extends WOApplication {
    
    public static void main(String argv[]) {
        WOApplication.main(argv, Application.class);
    }
    
    public Application() {
        super();
        
        // turn off shared editing context
        EOSharedEditingContext.setDefaultSharedEditingContext(null);
    }
    
    /*
     * exception handling
     */
    public WOResponse handleException(Exception exception, WOContext context) {
        
        // debug
        NSLog.debug.appendln("Application: exception class: " + exception.getClass());
        
        // handle permissions errors
        if (exception instanceof JDBCAdaptorException) {
            SQLException sqlException = ((JDBCAdaptorException) exception).sqlException();
            
            // debug
            NSLog.debug.appendln("Application: sqlException: reason: " + sqlException.getMessage());
            NSLog.debug.appendln("Application: sqlException: error code: " + sqlException.getErrorCode());
            NSLog.debug.appendln("Application: sqlException: sql state: " + sqlException.getSQLState());
            
            if (sqlException.getSQLState().equals("42000")) {
                ErrorPageInterface errorPage = D2W.factory().errorPage(context);
                
                // set message and return page
                errorPage.setMessage(sqlException.getMessage());
                errorPage.setNextPage(D2W.factory().defaultPage(context.session()));
                
                return ((WOComponent) errorPage).generateResponse();
            }
        } return super.handleException(exception, context);
    }
}