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
    public static Stage parentWindow;

    @Override
    public void start(Stage primaryStage) throws Exception{
        parentWindow = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setResizable(true);
        primaryStage.setTitle("Simulation d'une Unite Arithmetique et Logique");
        primaryStage.setScene(new Scene(root, 1600, 1100));
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
