package pl.put.poznan.bootstrapbuilder.rest;

import pl.put.poznan.bootstrapbuilder.gui.DirectorySaver;
import pl.put.poznan.bootstrapbuilder.logic.Footer;
import pl.put.poznan.bootstrapbuilder.logic.Header;
import pl.put.poznan.bootstrapbuilder.logic.Tag;

public class Request {

    private Header header;
    private Footer footer;
    private Tag tag;
    private DirectorySaver directory;


    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Footer getFooter() {
        return footer;
    }

    public void setFooter(Footer footer) {
        this.footer = footer;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }


    public DirectorySaver getDirectory() {
        return directory;
    }

    public void setDirectory(DirectorySaver directory) {
        this.directory = directory;
    }
}
