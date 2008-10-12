//
// Application.java
// Project DirectToiPod
//
// Created by rmendis on 3/13/06
//

import com.webobjects.foundation.*;
import com.webobjects.appserver.*;
import com.webobjects.directtoweb.*;
import com.webobjects.eocontrol.*;

public class Application extends WOApplication {
    
    public static void main(String argv[]) {
        WOApplication.main(argv, Application.class);
    }

    public Application() {
        super();
        System.out.println("Welcome to " + this.name() + "!");
        
        /* ** Put your application initialization code here ** */
    }
    
    public WOResponse handleException(Exception anException, WOContext aContext) {
        WOComponent page = aContext.page();
        
        // debug
        if (page instanceof D2WComponent) 
            NSLog.debug.appendln("Application: d2wcontext: " + page.valueForKey("d2wContext"));
        
        return super.handleException(anException, aContext);
    }
}
