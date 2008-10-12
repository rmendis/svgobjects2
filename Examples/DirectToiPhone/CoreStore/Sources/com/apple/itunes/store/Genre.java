// Artist.java
// Created on Mon Apr 25 10:57:33 US/Pacific 2005 by Apple EOModeler Version 5.2

package com.apple.itunes.store;

import com.webobjects.foundation.*;
import com.webobjects.eocontrol.*;
import com.webobjects.eoaccess.*;
import java.math.BigDecimal;
import java.util.*;

public class Genre extends EOGenericRecord {
    public NSArray artists;
    
    /*
     * accessors
     */
    public NSArray artists() {
        if (artists == null) {
            NSDictionary bindings = new NSDictionary(this, "genre");
            artists = EOUtilities.objectsWithFetchSpecificationAndBindings(editingContext(), "Artist", "ByGenre", bindings);
        } return artists;
    }
}
