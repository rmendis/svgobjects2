package com.webobjects.directtoiphone;

import com.webobjects.appserver.WOApplication;
import com.webobjects.appserver.WOContext;
import com.webobjects.appserver.WOComponent;
import com.webobjects.directtoweb.D2WContext;

public class D2TPageTemplate extends WOComponent {
    public D2TPageTemplate(WOContext context) {
        super(context);
    }
    
    @Override
    public boolean synchronizesVariablesWithBindings() {
    	return false;
    }
    
    @Override
    public boolean isStateless() {
    	return true;
    }
    
    // accessors    
    public String stylesheet() {
    	return (String) valueForBinding("stylesheet");
    }
    
    public String _href() {
    	return WOApplication.application().resourceManager().urlForResourceNamed(stylesheet(), "DirectToiPhone", null, context().request());
    }
}