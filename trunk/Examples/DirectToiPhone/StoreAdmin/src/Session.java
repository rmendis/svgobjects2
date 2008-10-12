//
// Session.java
// Project ITMSModelTest
//
// Created by rmendis on Thu Apr 21 2005
//

import com.webobjects.foundation.*;
import com.webobjects.appserver.*;
import com.webobjects.eocontrol.*;

public class Session extends WOSession {
    public EOEnterpriseObject user;

    public Session() {
        super();
        
        /* ** Put your per-session initialization code here ** */
        EOObjectStoreCoordinator osc = new EOObjectStoreCoordinator();
        setDefaultEditingContext(new EOEditingContext(osc));
    }
}
