//
// iPodListPage.java: Class file for WO Component 'iPodListPage'
// Project iPodLook
//
// Created by rmendis on 7/14/06
//
package com.webobjects.directtoiphone.ipodlook;

import com.webobjects.foundation.*;
import com.webobjects.appserver.*;
import com.webobjects.directtoiphone.D2TListPage;
import com.webobjects.directtoweb.*;
import com.webobjects.eocontrol.*;
import com.webobjects.eoaccess.*;

public class iPodListPage extends D2TListPage {
    public int index;    
    
    public iPodListPage(WOContext context) {
        super(context);
    }
    
    /*
     * accessors
     */
    public String pageTitle() {
        return (String) d2wContext().valueForKey("pageTitle");
    }
    
    public NSArray inspectableEntityNames() {
        return (NSArray) d2wContext().valueForKey("inspectableEntityNames");
    }
    
    public EOEnterpriseObject object() {
        return (EOEnterpriseObject) displayGroup().displayedObjects().objectAtIndex(index);
    }
    
    public String menuTitle() {
        return (String) object().valueForKey(displayPropertyKey());
    }
    
    private String destinationEntityName() {
        return (String) d2wContext().valueForKey("destinationEntityName");
    }
    
    protected String displayPropertyKey() {
        return (String) d2wContext().valueForKey("displayPropertyKey");
    }
    
    private String destinationRelationshipKey() {
        return (String) d2wContext().valueForKey("destinationRelationshipKey");
    }
    
    private boolean isInspect() {
        String entityName = object().entityName();
        return inspectableEntityNames().containsObject(entityName);
    }
    
    /*
     * actions
     */
    public WOComponent select() {
        return isInspect() ? inspect(): list();
    }
    
    private WOComponent inspect() {
        D2WComponent nextPage = (D2WComponent) D2W.factory().inspectPageForEntityNamed(destinationEntityName(), session());
        
        // set song to inspect
        nextPage.takeValueForKey(object(), "object");
        
        return nextPage;
    }
    
    private WOComponent list() {
        D2WListPage nextPage = (D2WListPage) D2W.factory().listPageForEntityNamed(destinationEntityName(), session());
        WODisplayGroup displayGroup = nextPage.displayGroup();
        NSArray objects = (NSArray) object().valueForKey(destinationRelationshipKey());
        
        // Initialize your component here
        displayGroup.setObjectArray(objects);
        
        return nextPage;
    }    
}
