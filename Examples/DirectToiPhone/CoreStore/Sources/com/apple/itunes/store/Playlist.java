// Playlist.java
// Created on Wed Jan 04 14:28:53 US/Pacific 2006 by Apple EOModeler Version 5.2
package com.apple.itunes.store;

import com.webobjects.foundation.*;
import com.webobjects.eocontrol.*;
import com.webobjects.eoaccess.*;
import java.math.BigDecimal;
import java.util.*;

public class Playlist extends EOGenericRecord {
    
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
    public Number playlistID() {
        NSDictionary primaryKey = EOUtilities.primaryKeyForObject(editingContext(), this);
        return (Integer) primaryKey.valueForKey("playlistID");
    }
}