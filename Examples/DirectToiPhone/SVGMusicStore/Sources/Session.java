//
// Session.java
// Project DirectToiPod
//
// Created by rmendis on 3/13/06
//

import com.webobjects.foundation.*;
import com.webobjects.appserver.*;
import com.webobjects.eocontrol.*;
import com.webobjects.eoaccess.*;

public class Session extends WOSession {
    public NSArray songs;
    public NSArray albums;
    public NSArray artists;
    public NSArray genres;

    public Session() {
        super();
        
        /* ** Put your per-session initialization code here ** */
    }
}
