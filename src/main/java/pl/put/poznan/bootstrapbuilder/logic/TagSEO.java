package pl.put.poznan.bootstrapbuilder.logic;

public class TagSEO {

    private String tagType;

    public TagSEO() {
    }

    public String getTagType() {
        return tagType;
    }

    public void setTagType(String tagType) {
        this.tagType = tagType;
    }

    public enum MetaType{
        normal, og, twitter
    }
}
