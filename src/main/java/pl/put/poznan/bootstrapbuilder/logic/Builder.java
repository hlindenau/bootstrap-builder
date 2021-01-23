package pl.put.poznan.bootstrapbuilder.logic;

import pl.put.poznan.bootstrapbuilder.gui.DirectorySaver;

import java.io.FileNotFoundException;

public interface Builder {
    public Builder setHeader(Header header);
    public Builder setFooter(Footer footer);
    public Builder setTag(Tag tag);
    public Builder setDirectorySaver(DirectorySaver dir);

    public String build() throws FileNotFoundException;

}
