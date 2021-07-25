package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller<text> implements Initializable {

    @FXML
    private Button btn;
    @FXML
    private Button btn1;


    @FXML
    private TextField A0;
    @FXML
    private TextField A1;
    @FXML
    private TextField F0;

    /**
     * Initializes the controller class.
     */
    String text = A0.getText();
    EventHandler<ActionEvent> ev = new EventHandler<ActionEvent>() {
        //action that to be performed
        public void handle(ActionEvent e)
        {    if(text != " ")
            System.out.println("Hello");


        }
    };

   /* public void start(Stage primaryStage) {
        String text = A0.getText();
        A0.setOnAction(e->{
                    System.out.println("Hello");

        });
        /*A0.focusedProperty().addListener(new ChangeListener<Boolean>()
        {
            @Override
            public void changed(ObservableValue<? extends Boolean> arg0, Boolean oldPropertyValue, Boolean newPropertyValue)
            {
                if (text =="0" || text =="1")
                {
                    System.out.println("Textfield on focus");
                }
                else
                {
                    System.out.println("Textfield out focus");
                }
            }
        });
        /*
        A0.setOnAction((ActionEvent)-> {
            if (text =="0" || text =="1"){
                A0.setStyle("-fx-control-inner-background:green");
            }
            else {
                A0.setStyle("-fx-control-inner-background:red");
            }

        });*/



    /*{
        A0.setOnAction((ActionEvent)-> {
                if (text =="0" || text =="1"){
                    A0.setStyle("-fx-control-inner-background:green");
                }
                else {
                    A0.setStyle("-fx-control-inner-background:red");
                }

        });

    }*/



    @FXML private  void  button(){
        System.out.println("Button1");
        String text=A0.getText();
        int b1 = Integer.parseInt(text);
        System.out.println(b1);
        String text1=A1.getText();
        int b2 = Integer.parseInt(text1);
        System.out.println(b2);

        if (b1 != 0 && b1 !=1){
            A0.setStyle("-fx-control-inner-background:red");
        }
        else {
            A0.setStyle("-fx-control-inner-background:green");
            int b3 = b1+b2;
            String text3 = b3+"";
            F0.setEditable(false);
            F0.setText(text3);
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       // btn.setStyle("-fx-background-color: linear-gradient(to right,#00fffc,#fff600); -fx-background-radius: 25; -fx-border-radius: 25;");
        btn.setStyle(" -fx-background-radius: 50%; -fx-height:30px; -fx-width:30px; -fx-background-color:violet; ");
        btn1.setStyle(" -fx-background-radius: 50%; -fx-height:30px; -fx-width:30px;-fx-background-color:blue; ");

    }

}
