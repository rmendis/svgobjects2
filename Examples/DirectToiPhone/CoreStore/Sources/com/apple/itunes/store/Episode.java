// Episode.java
// Created on Fri Oct 28 16:34:18 US/Pacific 2005 by Apple EOModeler Version 5.2

package com.apple.itunes.store;

import com.webobjects.foundation.*;
import com.webobjects.eocontrol.*;
import java.math.BigDecimal;
import java.util.*;

public class Episode extends EOGenericRecord {
    
    /*
     * awake
     */
    public void awakeFromInsertion(EOEditingContext ec) {
        super.awakeFromInsertion(ec);
        
        // set entity name
        takeValueForKey(entityName(), "entityName");
    }
}