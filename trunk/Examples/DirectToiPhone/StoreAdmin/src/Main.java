// Created by Direct to Web's Project Builder Wizard

import com.webobjects.foundation.*;
import com.webobjects.appserver.*;
import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.directtoweb.*;
import java.util.*;

public class Main extends WOComponent {
    public String username;
    public String password;
    public boolean wantsWebAssistant = false;
    
    public Main(WOContext aContext) {
        super(aContext);
    }
    
    public WOComponent defaultPage() {
        if (isAssistantCheckboxVisible()) {
            D2W.factory().setWebAssistantEnabled(wantsWebAssistant);
        }
        
        // authenticate username/password        
        if (username != null && password != null) {
            NSArray keys = new NSArray(new String[]{"username", "password"});
            NSArray inputs = new NSArray(new String[]{username, password});
            NSDictionary overrides = new NSDictionary(inputs, keys);
            EOModel model = (EOModel) EOModelGroup.globalModelGroup().models().objectAtIndex(0);
            
            // per session dB connection
            try {
                EOUtilities.connectWithModelNamed(session().defaultEditingContext(), model.name(), overrides);
            } catch (Exception exception) {
                NSLog.err.appendln("Main: connect failed with exception: " + exception);
                return this;
            } 
            
            // set session user
            EOEnterpriseObject user = EOUtilities.objectMatchingKeyAndValue(session().defaultEditingContext(), "User", "name", username);
            takeValueForKeyPath(user, "session.user");
            
            return D2W.factory().defaultPage(session());
        } else return this;
    }
    
    public boolean isAssistantCheckboxVisible() {
        String s = System.getProperty("D2WWebAssistantEnabled");
        return s == null || NSPropertyListSerialization.booleanForString(s);
    }
}