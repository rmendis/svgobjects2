package com.webobjects.directtoiphone.ipodlook;
//
// MenuItem.java: Class file for WO Component 'MenuItem'
// Project DirectToiPod
//
// Created by rmendis on 3/29/06
//

import com.webobjects.foundation.*;
import com.webobjects.appserver.*;
import com.webobjects.eocontrol.*;
import com.webobjects.eoaccess.*;

public class MenuItem extends WOComponent {

    public MenuItem(WOContext context) {
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
     * accessors
     */
    public int index() {
        Number index = (Number) valueForBinding("index");
        return index.intValue();
    }
    
    public String textTransform() {
        return "matrix(1 0 0 1 10.5 " + t1(index()+1) + ")";
    }
    
    public String arrowTransform() {
        return "matrix(1 0 0 1 298.5 "  + t2(index()+1) + ")";
    }
    
    /*
     * functions
     */
    private static double t1(double x) {
        return 25.1*x + 16.7;
    }
    
    private static double t2(double x) {
        return 25.1*x + 17.2;
    }
}
