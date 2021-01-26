package pl.put.poznan.bootstrapbuilder.rest;

import org.json.JSONException;
import org.junit.jupiter.api.Test;

import org.mockito.configuration.IMockitoConfiguration;
import pl.put.poznan.bootstrapbuilder.logic.Footer;
import pl.put.poznan.bootstrapbuilder.logic.Header;
import pl.put.poznan.bootstrapbuilder.logic.Tag;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BootstrapBuilderControllerTest {

    @Test
    void testPost() throws JSONException {
        Request mockedRequest = mock(Request.class);
        Tag mockedTag = mock(Tag.class);
        Header mockedHeader = mock(Header.class);
        Footer mockedFooter = mock(Footer.class);
        when(mockedRequest.getTag()).thenReturn(mockedTag);
        when(mockedRequest.getHeader()).thenReturn(mockedHeader);
        when(mockedRequest.getFooter()).thenReturn(mockedFooter);
        when(mockedTag.buildMetaOG()).thenReturn("<meta property=\"og:test\" content=\"contenttest\">");
        when(mockedHeader.buildHeader()).thenReturn("<header></header>");
        when(mockedFooter.buildFooter()).thenReturn("<footer></footer>");
        when(mockedTag.buildMeta()).thenReturn("<meta name= \"test\" content=\"contenttest\">");
        when(mockedTag.buildMetaTwitter()).thenReturn("<meta name=\"twitter:test\" content=\"contenttest\">");



        when(mockedRequest.getTag().toString()).thenReturn("<meta name= \"test\" content=\"contenttest\">");
        when(mockedRequest.getHeader().toString()).thenReturn("<header></header>");
        when(mockedRequest.getFooter().toString()).thenReturn("<footer></footer>");

        String expectedResult = """
                    <!doctype html>
                    <html lang="en">
                    <head>
                        <meta charset="UTF-8">
                        <meta name= "test" content="contenttest">
                        <meta name="twitter:test" content="contenttest">
                        <meta property="og:test" content="contenttest">
                        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
                        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
                    </head>
                    <body>
                        <header></header>
                        <main class="container">
                        </main>
                        <footer></footer>
                    </body>
                </html>
                """;

        BootstrapBuilderController bbc=new BootstrapBuilderController();
        assertEquals(expectedResult,bbc.post(mockedRequest));
    }
}