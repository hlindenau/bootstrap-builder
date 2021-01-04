package pl.put.poznan.bootstrapbuilder.logic;

public class Footer {

    private boolean addFooter=false;

    public Footer(){
    }

    public String buildFooter(){
        if (addFooter){
            System.out.println("\n<footer></footer>");
            return "\n<footer></footer>";
        }
        else
            return "";
    }

    public boolean isAddFooter() {
        return addFooter;
    }

    public void setAddFooter(boolean addFooter) {
        this.addFooter = addFooter;
    }
}
