package pl.put.poznan.bootstrapbuilder.logic;

public class Footer {
    private boolean addFooter=false;


    public Footer(){
    };


    private String buildFooter(){
        String codeHtml="<footer></footer>";
        return codeHtml;
    }


    public boolean isAddFooter() {
        return addFooter;
    }

    public void setAddFooter(boolean addFooter) {
        this.addFooter = addFooter;
    }
}
