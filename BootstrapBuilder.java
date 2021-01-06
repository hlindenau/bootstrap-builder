package pl.put.poznan.bootstrapbuilder.logic;

import org.apache.commons.lang3.text.StrSubstitutor;
import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;


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
        String meta = "";
        String metaOG = "";
        String metaTwitter = "";
        String codeHeader = "";
        String codeFooter = "";
        try {
            meta = tag.buildMeta();
            metaOG = tag.buildMetaTwitter();
            metaTwitter = tag.buildMetaOG();
            codeHeader = header.buildHeader();
            codeFooter = footer.buildFooter();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Map<String, String> code = new HashMap<String, String>();
        code.put("meta",meta);
        code.put("metaOG",metaOG);
        code.put("metaTwitter",metaTwitter);
        code.put("codeHeader",codeHeader);
        code.put("codeFooter",codeFooter);
        StrSubstitutor sub = new StrSubstitutor(code, "%(", ")");
        String codeHTML = sub.replace("test"/*"
                <!doctype html>
                <html lang="en">
                <head>
                    <meta charset="UTF-8">
                    %(meta)
                    %(metaOG)
                    %(metaTwitter)
                    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
                    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
                </head>
                <body>
                    %(codeHeader)
                    <main class="container">
                    </main>
                    %(codeFooter)
                </body>
            </html>
            """
        */);
        System.out.println(codeHTML);

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
