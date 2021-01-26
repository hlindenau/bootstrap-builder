package pl.put.poznan.bootstrapbuilder.logic;

import org.apache.commons.lang3.text.StrSubstitutor;

import java.util.HashMap;
import java.util.Map;

/**
 * Class builds the header of html page
 */
public class Header {
    private boolean addHeader=false;
    private boolean fixed=false;

    /**
     * responsible for building HTML code of Header
     *@return HTML code as String
     */
    public String  buildHeader(){
        if (isAddHeader()){

            String style="";
            style=retFixed();

            //Analogicznie do retFixed mozemy odac inne elementy (navbar, search bar etc.)

            Map<String, String> values = new HashMap<String, String>();
            values.put("styles",style);
            StrSubstitutor sub = new StrSubstitutor(values, "%(", ")");
            String codeHTML = sub.replace("<header %(styles)> </header>");

            System.out.println(codeHTML);
            return codeHTML;
        }
        else
            return "";
    }

    public boolean isFixed() {
        return this.fixed;
    }

    public void setFixed(boolean fixed){
        this.fixed = fixed;
    }

    /**
     * responsible for building fragment of Header that decides value of "fixed"
     * based on user's choice.
     * @return HTML code
     */
    public String retFixed(){
        String style="";
        if (isFixed()) { style+="style=\"position:fixed\""; }
        else{ style+="style=\"position:static\""; }
        return style;
    }

    public boolean isAddHeader() {
        return addHeader;
    }

    public void setAddHeader(boolean addHeader) {
        this.addHeader = addHeader;
    }
}
