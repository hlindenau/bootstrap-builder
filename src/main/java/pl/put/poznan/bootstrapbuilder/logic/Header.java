package pl.put.poznan.bootstrapbuilder.logic;

import org.apache.commons.lang3.text.StrSubstitutor;

import java.util.HashMap;
import java.util.Map;

public class Header {
    private boolean addHeader=false;
    private static boolean fixed=false;
    private boolean nav;

    public static String  buildHeader(){
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



    public static void main(String[] args) {
        buildHeader();
    }



    public static boolean isFixed() {
        return fixed;
    }

    public void setFixed(boolean fixed){
        this.fixed = fixed;
    }

    public static String retFixed(){
        String style="";
        if (isFixed()) { style+="style=\"position:fixed\""; }
        else{ style+="style=\"position:static\""; }
        return style;
    }


    public boolean isNav() {
        return nav;
    }

    public void setNav(boolean nav) {
        this.nav = nav;
    }


}
