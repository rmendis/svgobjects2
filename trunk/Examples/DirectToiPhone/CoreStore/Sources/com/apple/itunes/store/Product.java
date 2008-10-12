// Product.java
// Created on Tue May 03 17:50:37 US/Pacific 2005 by Apple EOModeler Version 5.2

package com.apple.itunes.store;

import com.webobjects.foundation.*;
import com.webobjects.eocontrol.*;
import java.math.BigDecimal;
import java.util.*;

public class Product extends EOGenericRecord {
    
    /*
     * awake
     */
    public void awakeFromInsertion(EOEditingContext ec) {
        super.awakeFromInsertion(ec);
        
        // set entity name
        takeValueForKey(entityName(), "entityName");
    }    
}
