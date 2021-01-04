package pl.put.poznan.bootstrapbuilder.logic;

public interface Builder {
    public Builder setHeader(Header header);
    public Builder setFooter(Footer footer);
    public Builder setTag(Tag tag);
    public String build();

}
