package pl.put.poznan.bootstrapbuilder.rest;

import pl.put.poznan.bootstrapbuilder.logic.Footer;
import pl.put.poznan.bootstrapbuilder.logic.Header;
import pl.put.poznan.bootstrapbuilder.logic.Tag;

public class Request {

    private Header header;
    private Footer footer;
    private Tag tag;

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
}
