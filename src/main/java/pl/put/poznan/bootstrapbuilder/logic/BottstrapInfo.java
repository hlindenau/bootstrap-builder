package pl.put.poznan.bootstrapbuilder.logic;

public class BottstrapInfo {
        private Header header;
        private  Footer footer;
        private Tag tags;

        public void setFooter(Footer footer) {
                this.footer = footer;
        }

        public void setHeader(Header header) {
                this.header = header;
        }

        public void setTags(Tag tags) {
                this.tags = tags;
        }

        public Footer getFooter() {
                return footer;
        }

        public Header getHeader() {
                return header;
        }

        public Tag getTags() {
                return tags;
        }

}
