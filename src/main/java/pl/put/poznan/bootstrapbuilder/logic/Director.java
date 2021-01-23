package pl.put.poznan.bootstrapbuilder.logic;

import pl.put.poznan.bootstrapbuilder.gui.DirectorySaver;

import java.io.FileNotFoundException;

/** Class implements Builder design pattern
 *
 *
 */

public class Director {

    /** responsible for organising data and running main building method
     * @return ready HTML code as String
     **/
    public static String create(Tag tag, Header header, Footer footer, DirectorySaver dir) throws FileNotFoundException {
        return new BootstrapBuilder()
                .setTag(tag)
                .setHeader(header)
                .setFooter(footer)
                .setDirectorySaver(dir)
                .build();

    }
}
