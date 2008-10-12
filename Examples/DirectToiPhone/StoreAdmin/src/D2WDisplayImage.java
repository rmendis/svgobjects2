//
// D2WDisplayImage.java: Class file for WO Component 'D2WDisplayImage'
// Project D2WAdmin
//
// Created by rmendis on 2/10/06
//

import com.webobjects.foundation.*;
import com.webobjects.appserver.*;
import com.webobjects.eocontrol.*;
import com.webobjects.eoaccess.*;

public class D2WDisplayImage extends WOComponent {
    protected EOEnterpriseObject object;
    protected String key;
        
    public D2WDisplayImage(WOContext context) {
        super(context);
    }

    /*
     * accessors
     */
    public String value() {
        return (String) object.valueForKeyPath(key);
    }
    
    public void setValue(String value) {
        object.takeValueForKeyPath(value, key);
    }
    
}