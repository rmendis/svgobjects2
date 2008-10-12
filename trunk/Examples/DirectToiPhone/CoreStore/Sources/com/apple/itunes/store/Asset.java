// Artist.java
// Created on Mon Apr 25 10:57:33 US/Pacific 2005 by Apple EOModeler Version 5.2

package com.apple.itunes.store;

import com.webobjects.foundation.*;
import com.webobjects.eocontrol.*;
import com.webobjects.eoaccess.*;
import java.math.BigDecimal;
import java.util.*;

public class Asset extends EOGenericRecord {
    private static String baseURL; 
    
    /*
     * awake
     */
    public void awakeFromInsertion(EOEditingContext ec) {
        super.awakeFromInsertion(ec);
        
        // set entity name
        takeValueForKey(entityName(), "entityName");
    }   
    
    /*
     * accessors
     */
    public Number assetID() {
        NSDictionary primaryKey = EOUtilities.primaryKeyForObject(editingContext(), this);
        return (Integer) primaryKey.valueForKey("assetID");
    }
    
    public String url() {
        String token = (String) valueForKey("token");
        return baseURL() + token;
    }
    
    private static String baseURL() {
        if (baseURL == null) {
            baseURL = System.getProperty("com.apple.itunes.store.Asset.baseURL");
        } return baseURL;
    }
}