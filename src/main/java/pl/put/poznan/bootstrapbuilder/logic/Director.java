package pl.put.poznan.bootstrapbuilder.logic;

public class Director {

//    private Builder builder;
//
//    public Director(BootstrapBuilder builder) {
//        this.builder = builder;
//    }

    public static String create(Header header, Footer footer){
        return new BootstrapBuilder()
                .setHeader(header)
                .setFooter(footer)
                .build();

    }
}
