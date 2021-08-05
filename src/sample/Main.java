package sample;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.awt.event.MouseEvent;
import java.beans.EventHandler;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Simulation d'une Unite Arithmetique et Logique");
        primaryStage.setScene(new Scene(root, 1300, 900));

       //primaryStage.initStyle(StageStyle.TRANSPARENT);


        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
