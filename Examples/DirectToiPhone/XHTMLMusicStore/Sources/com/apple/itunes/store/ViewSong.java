package com.apple.itunes.store;

import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WOContext;
import com.webobjects.directtoweb.D2WInspectPage;


public class ViewSong extends D2WInspectPage {
	public WOComponent prevPage;

    public ViewSong(WOContext context) {
        super(context);
    }
    
    // accessors
    public String stylesheet() {
    	return (String) d2wContext().valueForKey("stylesheet");
    }
}
