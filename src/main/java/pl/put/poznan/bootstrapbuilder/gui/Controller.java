package pl.put.poznan.bootstrapbuilder.gui;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pl.put.poznan.bootstrapbuilder.logic.Director;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

/**
 * class responsible for handling elements of gui
 */

public class Controller {

    public Label label1, label2, label3, label4, label5;
    public TextField input1,input2, input3, input4, input5, input6, input7, input8, input9, input10, input11,input12;
    public CheckBox basic1, basic2, basic3,basic4, og1, og2, og3, og4, og5, twitter1, twitter2, header1, header2, footer_enabled, twitter3, twitter4;
    public Button button1;
    File savefile;

    @FXML
    private TextField directoryid;

    @FXML
    private Pane paneid;

    /**
     * mark functions make input boxes appear/disappear when checkbox is clicked by user; every mark is responsible for
     * one input box
     */
    public void mark1() {
        if (input1.isVisible() == true) {
            input1.setVisible(false);
        } else {
            input1.setVisible(true);
        }
    }

    public void mark2() {
        if (input2.isVisible() == true) {
            input2.setVisible(false);
        } else {
            input2.setVisible(true);
        }
    }

    public void mark3() {
        if (input3.isVisible() == true) {
            input3.setVisible(false);
        } else {
            input3.setVisible(true);
        }
    }

    public void mark4() {
        if (input4.isVisible() == true) {
            input4.setVisible(false);
        } else {
            input4.setVisible(true);
        }
    }

    public void mark5() {
        if (input5.isVisible() == true) {
            input5.setVisible(false);
        } else {
            input5.setVisible(true);
        }
    }

    public void mark6() {
        if (input6.isVisible() == true) {
            input6.setVisible(false);
        } else {
            input6.setVisible(true);
        }
    }



    public void mark7() {
        if (input7.isVisible() == true) {
            input7.setVisible(false);
        } else {
            input7.setVisible(true);
        }
    }

    public void mark8() {
        if (input8.isVisible() == true) {
            input8.setVisible(false);
        } else {
            input8.setVisible(true);
        }
    }

    public void mark9() {
        if (input9.isVisible() == true) {
            input9.setVisible(false);
        } else {
            input9.setVisible(true);
        }
    }

    public void mark10() {
        if (input10.isVisible() == true) {
            input10.setVisible(false);
        } else {
            input10.setVisible(true);
        }
    }

    public void mark11() {
        if (input11.isVisible() == true) {
            input11.setVisible(false);
        } else {
            input11.setVisible(true);
        }
    }

    public void mark12() {
        if (input12.isVisible() == true) {
            input12.setVisible(false);
        } else {
            input12.setVisible(true);
        }
    }


    public void header1() {
        if (header2.isSelected() == true) {
            header1.setSelected(false);
        }
    }

    public void header2() {
        if (header1.isSelected() == true) {
            header2.setSelected(false);
        }
    }

    /**
     * reads inputs of input boxes and adds them to json
     * @param object - main json
     */

    public void puttags(JSONObject object){
        JSONObject arrayElement = new JSONObject();
        JSONObject array2Element = new JSONObject();
        JSONObject array3Element = new JSONObject();
        JSONObject array4Element = new JSONObject();


        if (og1.isSelected()){
            try {
                array2Element.put("title", input5.getText());
            }
            catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (og2.isSelected()){
            try {
                array2Element.put("card", input6.getText());
            }
            catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (og3.isSelected()){
            try {
                array2Element.put("description", input7.getText());
            }
            catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (og4.isSelected()){
            try {
                array2Element.put("URL", input8.getText());
            }
            catch (JSONException e) {
                e.printStackTrace();
            }
        }
        try {
            arrayElement.put("ogArray", array2Element);
        }
        catch (JSONException e) {
            e.printStackTrace();
        }

        if (twitter1.isSelected()){
            try {
                array3Element.put("title", input9.getText());
            }
            catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (twitter2.isSelected()){
            try {
                array3Element.put("description", input10.getText());
            }
            catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (twitter3.isSelected()){
            try {
                array3Element.put("card", input11.getText());
            }
            catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (twitter4.isSelected()){
            try {
                array3Element.put("image", input12.getText());
            }
            catch (JSONException e) {
                e.printStackTrace();
            }
        }
        try {
            arrayElement.put("twitterArray", array3Element);
        }
        catch (JSONException e) {
            e.printStackTrace();
        }



        if (basic1.isSelected()){
            try {
                array4Element.put("image", input1.getText());
            }
            catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (basic2.isSelected()){
            try {
                array4Element.put("description", input2.getText());
            }
            catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (basic3.isSelected()){
            try {
                array4Element.put("card", input3.getText());
            }
            catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (basic4.isSelected()){
            try {
                array4Element.put("title", input4.getText());
            }
            catch (JSONException e) {
                e.printStackTrace();
            }
        }
        try {
            arrayElement.put("metaArray", array4Element);
        }
        catch (JSONException e) {
            e.printStackTrace();
        }





        try {
            object.put("tag", arrayElement);
        }
        catch (JSONException e) {
            e.printStackTrace();
        }

    }

    /**
     * responsible for putting info about parameters of header into json
     * @param object - main json
     */

    public void putheader(JSONObject object) {
        JSONObject arrayElement = new JSONObject();
        if (!header1.isSelected() && !header2.isSelected()) {
            try {
                arrayElement.put("addHeader", false);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else {
            try {
                arrayElement.put("addHeader", true);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (header1.isSelected()) {
            try {
                arrayElement.put("fixed", false);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }  if(header2.isSelected()){
            try {
                arrayElement.put("fixed", true);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        try {
            object.put("header",arrayElement);
        }
        catch(JSONException e){
            e.printStackTrace();
        }

    }

    /**
     * responsible for adding info about footer into json
     * @param object - main json
     */

public void putfooter(JSONObject object){

      JSONObject object1 = new JSONObject();



      try{
          object1.put("addFooter",true );
          object.put("footer",object1);
      }
      catch(JSONException e){
          e.printStackTrace();
      }


}
,
    /**
     * onclick method; creates json and calls all "put" functions to add informations to json;
     * makes json post request with HttpUrlConnection
     */
    public void ok() throws IOException {
        JSONObject object = new JSONObject();
        putfooter(object);
        putheader(object);
        puttags(object);
        savefile=new File(savefile,"StronaBB.html");

        URL url = new URL ("http://localhost:8081/bootstrap-builder");
        HttpURLConnection con = (HttpURLConnection)url.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/json; utf-8");
        con.setRequestProperty("Accept", "application/json");
        con.setDoOutput(true);
        System.out.println(object.toString());
        try(OutputStream os = con.getOutputStream()) {
            byte[] input = String.valueOf(object).getBytes("utf-8");
            os.write(input, 0, input.length);
        }


        try(BufferedReader br = new BufferedReader(
                new InputStreamReader(con.getInputStream(), "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String responseLine = null;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine);
                response.append("\n");
            }
            PrintWriter out = new PrintWriter(savefile);
            out.println(response.toString());
            out.close();
            System.out.println(response.toString());
        }


    }

    /**
     * lets the user choose the destination of output .html file and it's name
     * @param actionEvent - actionEvent occurs when user clicks "browse" button
     */

    public void fileBrowser(ActionEvent actionEvent) {

        final DirectoryChooser directorychooser = new DirectoryChooser();

        Stage stage = (Stage) paneid.getScene().getWindow();

        savefile = directorychooser.showDialog(stage);

        directoryid.setText(savefile.getAbsolutePath());

    }
}