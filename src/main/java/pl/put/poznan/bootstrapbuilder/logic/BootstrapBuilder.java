package pl.put.poznan.bootstrapbuilder.logic;

import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BootstrapBuilder implements Builder{

    static Logger LOGGER = LoggerFactory.getLogger(BootstrapBuilder.class);
    private String jsonContent;
    private Header header;
    private Footer footer;
    private Tag tag;
    private String WebpageName;


    @Override
    public Builder setHeader(Header header) {
        this.header = header;

        return this;
    }

    @Override
    public Builder setFooter(Footer footer) {
        this.footer = footer;

        return this;
    }

    @Override
    public Builder setTag(Tag tag) {
        this.tag = tag;

        return this;
    }

    @Override
    public String build() {
        String html = "";

        try {
            html = tag.buildMeta()
                    + tag.buildMetaTwitter()
                    + tag.buildMetaOG()
                    + header.buildHeader()
                    + footer.buildFooter();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return html;
    }

    public Header getHeader() {
        return header;
    }

    public Footer getFooter() {
        return footer;
    }

    public Tag getTag() {
        return tag;
    }

    public void setWebpageName(String webpageName) {
        WebpageName = webpageName;
    }

    public String getWebpageName() {
        return WebpageName;
    }

}
