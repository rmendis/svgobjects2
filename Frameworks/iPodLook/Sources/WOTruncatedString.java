import com.webobjects.foundation.*;
import com.webobjects.appserver.*;
import com.webobjects.eocontrol.*;
import com.webobjects.eoaccess.*;

public class WOTruncatedString extends WOComponent {
    
    public WOTruncatedString(WOContext context) {
        super(context);
    }
    
    /*
     * non-synching component
     */
    public boolean synchronizesVariablesWithBindings() {
        return false;
    }
    
    /*
     * stateless
     */
    public boolean isStateless() {
        return true;
    }
    
    /*
     * accessors
     */
    public String value() {
        String value = (String) valueForBinding("value");
        int length = length();
        
        // abbreviate
        if (value.length() > length) {
            value = value.substring(0, length-1);
            value += "...";
        } return value;
    }
    
    public int length() {
        Number length = (Number) valueForBinding("length");
        return (length != null) ? length.intValue() : 1024;
    }
}
