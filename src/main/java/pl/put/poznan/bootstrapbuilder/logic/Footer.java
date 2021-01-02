package pl.put.poznan.bootstrapbuilder.logic;

public class Footer {

    private boolean addFooter=false;

    public Footer(){
    }

    public String buildFooter(){
        return "<footer></footer>";
    }

    public boolean isAddFooter() {
        return addFooter;
    }

    public void setAddFooter(boolean addFooter) {
        this.addFooter = addFooter;
    }
}
