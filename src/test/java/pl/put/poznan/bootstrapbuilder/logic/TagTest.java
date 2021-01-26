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
        array.put( "description", "opistest");
        tag.setMetaArray(array);
    }

    @Test
    void buildMeta() throws JSONException {
        String wynik = tag.buildMeta();
        String spodziewanyWynik= """
                                <meta name="description" content="opistest">
                                <title>tytultest</title>\n""" ;
        assertEquals(spodziewanyWynik,wynik);
    }

    @Test
    void buildMetaTwitter() {
    }

    @Test
    void buildMetaOG() {
    }
}