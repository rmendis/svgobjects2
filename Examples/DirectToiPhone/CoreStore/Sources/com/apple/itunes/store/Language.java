// Language.java
// Created on Mon May 02 11:01:55 US/Pacific 2005 by Apple EOModeler Version 5.2

package com.apple.itunes.store;

import com.webobjects.foundation.*;
import com.webobjects.eocontrol.*;
import java.math.BigDecimal;
import java.util.*;

public class Language extends EOGenericRecord {
    
    /*
     * awake
     */
    public void awakeFromInsertion(EOEditingContext ec) {
        super.awakeFromInsertion(ec);
        
        // set entity name
        takeValueForKey(entityName(), "entityName");
    }    
}
