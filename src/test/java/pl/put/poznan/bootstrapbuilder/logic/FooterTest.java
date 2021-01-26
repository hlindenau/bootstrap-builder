package pl.put.poznan.bootstrapbuilder.logic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class FooterTest {
    private Footer footer;
    private boolean addFooter;

    @BeforeEach
    void setUp(){
        footer=new Footer();
    }

    @Test
    void buildFooter()  {
        footer.setAddFooter(true);
        String wynik = footer.buildFooter();
        String spodziewanyWynik= "\n<footer></footer>";
        assertEquals(spodziewanyWynik,wynik);
    }
    @Test
    void ignoreBuildFooter()  {
        footer.setAddFooter(false);
        String wynik = footer.buildFooter();
        String spodziewanyWynik= "";
        assertEquals(spodziewanyWynik,wynik);
    }
    @Test
    void noBoolBuildFooter()  {
        String wynik = footer.buildFooter();
        String spodziewanyWynik= "";
        assertEquals(spodziewanyWynik,wynik);
    }
}