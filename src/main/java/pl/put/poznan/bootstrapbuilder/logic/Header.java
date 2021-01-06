package pl.put.poznan.bootstrapbuilder.logic;

import org.apache.commons.lang3.text.StrSubstitutor;

import java.util.HashMap;
import java.util.Map;


public class Header {
    private boolean addHeader=false;
    private boolean fixed=false;
//    private boolean nav;

    /**
     * resposible for building HTML code of Header
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

//    public static void main(String[] args) {
//        buildHeader();
//    }

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


//    public boolean isNav() {
//        return nav;
//    }
//
//    public void setNav(boolean nav) {
//        this.nav = nav;
//    }


    public boolean isAddHeader() {
        return addHeader;
    }

    public void setAddHeader(boolean addHeader) {
        this.addHeader = addHeader;
    }
}
