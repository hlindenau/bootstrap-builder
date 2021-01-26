package pl.put.poznan.bootstrapbuilder.logic;

import org.json.JSONException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class TagTest {

    private Tag tag;
    private HashMap<String,String> array;

    @BeforeEach
    void setUp(){
        tag=new Tag();
        array=new HashMap<String,String>();
        array.put( "title", "tytultest");
    }

    @Test
    void buildMetaTitle() throws JSONException {
        tag.setMetaArray(array);
        String wynik = tag.buildMeta();
        String spodziewanyWynik= """
                                <title>tytultest</title>\n""" ;
        assertEquals(spodziewanyWynik,wynik);
    }

    @Test
    void buildMetaTwitterTitle() throws JSONException {
        tag.setTwitterArray(array);
        String wynik = tag.buildMetaTwitter();
        String spodziewanyWynik= """
                                <meta name="twitter:title" content="tytultest">\n""" ;
        assertEquals(spodziewanyWynik,wynik);


    }

    @Test
    void buildMetaOGTitle() throws JSONException {
        tag.setOgArray(array);
        String wynik = tag.buildMetaOG();
        String spodziewanyWynik= """
                <meta property="og:title" content="tytultest">\n""" ;
        assertEquals(spodziewanyWynik,wynik);
    }

    @Test
    void buildMeta() throws JSONException {
        array.put( "description", "opistest");
        tag.setMetaArray(array);
        String wynik = tag.buildMeta();
        String spodziewanyWynik= """
                                <meta name="description" content="opistest">
                                <title>tytultest</title>\n""" ;
        assertEquals(spodziewanyWynik,wynik);
    }

    @Test
    void buildMetaTwitter() throws JSONException {
        array.put( "description", "opistest");
        tag.setTwitterArray(array);
        String wynik = tag.buildMetaTwitter();
        String spodziewanyWynik= """
                                <meta name="twitter:description" content="opistest">
                                <meta name="twitter:title" content="tytultest">\n""" ;
        assertEquals(spodziewanyWynik,wynik);


    }

    @Test
    void buildMetaOG() throws JSONException {
        array.put( "description", "opistest");
        tag.setOgArray(array);
        String wynik = tag.buildMetaOG();
        String spodziewanyWynik= """
                <meta property="og:description" content="opistest">
                <meta property="og:title" content="tytultest">\n""" ;
        assertEquals(spodziewanyWynik,wynik);
    }




    @Test
    void buildMetaEmpty() throws JSONException {
        assertThrows(NullPointerException.class, ()-> {
            tag.buildMeta();
        });


    }

    @Test
    void buildMetaTwitterEmpty() throws JSONException {


        assertThrows(NullPointerException.class, ()-> {
            tag.buildMetaTwitter();
        });


    }

    @Test
    void buildMetaOGEmpty() throws JSONException {
        assertThrows(NullPointerException.class, ()-> {
            tag.buildMetaOG();
        });


    }

}