// Artist.java
// Created on Mon Apr 25 10:57:33 US/Pacific 2005 by Apple EOModeler Version 5.2

package com.apple.itunes.store;

import com.webobjects.foundation.*;
import com.webobjects.eocontrol.*;
import com.webobjects.eoaccess.*;
import java.math.BigDecimal;
import java.util.*;

public class Artist extends EOGenericRecord {
    
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
    public Number artistID() {
        NSDictionary primaryKey = EOUtilities.primaryKeyForObject(editingContext(), this);
        return (Integer) primaryKey.valueForKey("artistID");
    }
    
    public NSArray playlists() {
        NSArray albums = (NSArray) valueForKey("albums");
        NSArray singles = (NSArray) valueForKey("singles");
        NSArray playlists = albums.arrayByAddingObjectsFromArray(singles);
        
        return playlists;
    }
}
