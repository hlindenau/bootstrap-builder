package pl.put.poznan.bootstrapbuilder.logic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BootstrapBuilder {

    static Logger LOGGER = LoggerFactory.getLogger(BootstrapBuilder.class);
    private String jsonContent;
    private BottstrapInfo bootstrapinfo;
    private String WebpageName;


    public void setWebpageName(String webpageName) {
        WebpageName = webpageName;
    }

    public String getWebpageName() {
        return WebpageName;
    }

    /**
     * W TEJ KLASIE DAŁBYM FORMULARZ DO ZAZNACZENIA CO SIE CHCE MIEC NA SWOIM SZKIELECIE STRONY
     *
     *
     * I ZWRACA ON KOD HTML W POSTACI STRINGA
     */
    public String getBodyContent() {
        String result = "";



        //navbar
        if (bootstrapinfo.getHeader()!= null) {
            LOGGER.info("Navbar added");
            result += "<nav class=\"navbar";
        }

        else{
            LOGGER.debug("Brak lub błąd headera");
        }

        result += "<main class=\"";

        if (bootstrapinfo.getHeader().getFixed()) {  //TO TRZEBA NAPISAC KLASY HEADER FOOTER ITD.
            result += "; margin-top: 100px";
        } else {
            result += "; margin-top: 10px";
        }
        result += "\">";



        //footer
        if (bootstrapinfo.getFooter()!= null) {
            result += "<footer class=\"";
        }
        return "";
    }

}
