package pl.put.poznan.bootstrapbuilder.logic;

/** Class builds the footer of html page
 *
 */

public class Footer {

    private boolean addFooter=false;

    public Footer(){
    }
    /**
     * resposible for building HTML code of Footer
     *
     * @return HTML code as String
     */
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
