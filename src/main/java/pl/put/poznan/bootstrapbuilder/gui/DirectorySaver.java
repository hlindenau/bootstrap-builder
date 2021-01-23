package pl.put.poznan.bootstrapbuilder.gui;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class DirectorySaver {

    private String directory;


    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public void save2file(String codeHTML) throws FileNotFoundException {
        File savefile = new File(directory);
        PrintWriter out = new PrintWriter(savefile);
        out.println(codeHTML);
        out.close();
    }
}
