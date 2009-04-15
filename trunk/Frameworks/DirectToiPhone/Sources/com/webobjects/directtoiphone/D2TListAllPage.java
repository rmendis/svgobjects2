package com.webobjects.directtoiphone;

import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WOContext;
import com.webobjects.appserver.WODisplayGroup;
import com.webobjects.directtoweb.D2W;
import com.webobjects.directtoweb.D2WListPage;
import com.webobjects.directtoweb.D2WPage;
import com.webobjects.eoaccess.EODatabaseDataSource;
import com.webobjects.eocontrol.EODataSource;
import com.webobjects.foundation.NSArray;

public class D2TListAllPage extends D2WPage {
    public D2TListAllPage(WOContext context) {
        super(context);
    }
    
    public String visibleEntityName;
    public int index = 0;
    
    /*
     * accessors
     */
    @Override
    public String pageTitle() {
    	return (String) d2wContext().valueForKey("pageTitle");
    }
    
    public NSArray visibleEntityNames() {
        return D2W.factory().visibleEntityNames(session());
    }
    
    public String menuTitle() {
        return visibleEntityName + "s";
    }
    
    public String stylesheet() {
    	return (String) d2wContext().valueForKey("stylesheet");
    }

    /*
     * actions
     */
    public WOComponent list() {
        D2WListPage nextPage = (D2WListPage) D2W.factory().listPageForEntityNamed(visibleEntityName, session());
        WODisplayGroup displayGroup = nextPage.displayGroup();
        EODataSource dataSource = new EODatabaseDataSource(session().defaultEditingContext(), visibleEntityName);

        // Initialize your component here
        nextPage.setDataSource(dataSource);
        nextPage.takeValueForKey(this, "prevPage");
        
        return nextPage;
    }
}