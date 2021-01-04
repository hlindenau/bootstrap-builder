package pl.put.poznan.bootstrapbuilder.logic;

public class Director {


    public static String create(Tag tag, Header header, Footer footer){
        return new BootstrapBuilder()
                .setTag(tag)
                .setHeader(header)
                .setFooter(footer)
                .build();

    }
}
