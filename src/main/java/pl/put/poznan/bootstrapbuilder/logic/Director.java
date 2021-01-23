package pl.put.poznan.bootstrapbuilder.logic;

/** Class implements Builder design pattern
 *
 *
 */

public class Director {

    /** responsible for organising data and running main building method
     * @return ready HTML code as String
     **/
    public static String create(Tag tag, Header header, Footer footer)  {
        return new BootstrapBuilder()
                .setTag(tag)
                .setHeader(header)
                .setFooter(footer)
                .build();

    }
}
