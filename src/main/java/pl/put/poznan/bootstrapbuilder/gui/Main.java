package pl.put.poznan.bootstrapbuilder.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/sample.fxml"));
        Parent root = (Parent) loader.load();
        primaryStage.setTitle("Bootstrap builder");
        primaryStage.setScene(new Scene(root, 500, 475));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
