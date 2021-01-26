package pl.put.poznan.bootstrapbuilder.logic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeaderTest {

    private Header header;

    @BeforeEach
    void setUp() {
        header = new Header();
    }

    @Test
    void retFixedFalse() {
        header.setFixed(false);
        String expected = "style=\"position:static\"";
        assertEquals(expected, header.retFixed());
    }

    @Test
    void retFixedTrue() {
        header.setFixed(true);
        String expected = "style=\"position:fixed\"";
        assertEquals(expected, header.retFixed());
    }

    @Test
    void retFixedNull() {
        String expected = "style=\"position:static\"";
        assertEquals(expected, header.retFixed());
    }

    @Test
    void buildHeaderNullNull() {
        assertEquals("", header.buildHeader());
    }

    @Test
    void buildHeaderTrueNull() {
        header.setAddHeader(true);
        String expected = "<header style=\"position:static\"> </header>";
        assertEquals(expected, header.buildHeader());
    }

    @Test
    void buildHeaderFalseFalse() {
        header.setAddHeader(false);
        header.setFixed(false);
        assertEquals("", header.buildHeader());
    }

    @Test
    void buildHeaderFalseTrue() {
        header.setAddHeader(false);
        header.setFixed(true);
        assertEquals("", header.buildHeader());
    }

    @Test
    void buildHeaderTrueFalse() {
        header.setAddHeader(true);
        header.setFixed(false);
        String expected = "<header style=\"position:static\"> </header>";
        assertEquals(expected, header.buildHeader());
    }

    @Test
    void buildHeaderTrueTrue() {
        header.setAddHeader(true);
        header.setFixed(true);
        String expected = "<header style=\"position:fixed\"> </header>";
        assertEquals(expected, header.buildHeader());
    }

}