package com.webobjects.directtoiphone.ipodlook;

//
// PageTemplate.java: Class file for WO Component 'PageTemplate'
// Project DirectToiPod
//
// Created by rmendis on 3/28/06
//

import com.webobjects.foundation.*;
import com.webobjects.appserver.*;
import com.webobjects.eocontrol.*;
import com.webobjects.eoaccess.*;

public class PageTemplate extends WOComponent {

    public PageTemplate(WOContext context) {
        super(context);
    }
    
    /*
     * non-synching component
     */
    public boolean synchronizesVariablesWithBindings() {
        return false;
    }    
    
    /*
     * stateless
     */
    public boolean isStateless() {
        return true;
    }    
    
    /*
     * request/response
     */
    public void appendToResponse(WOResponse response, WOContext context) {
        super.appendToResponse(response, context);
        
        response.setHeader("image/svg+xml", "content-type");
    }
}
