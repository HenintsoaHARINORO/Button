package sample;

import com.jfoenix.controls.JFXToggleButton;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
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
    private JFXToggleButton toggleButtonB1;

    @FXML
    private JFXToggleButton toggleButtonB0;

    @FXML
    private JFXToggleButton toggleButtonB2;

    @FXML
    private JFXToggleButton toggleButtonB3;

    @FXML
    private JFXToggleButton toggleButtonA3;

    @FXML
    private JFXToggleButton toggleButtonA2;

    @FXML
    private JFXToggleButton toggleButtonA1;

    @FXML
    private JFXToggleButton toggleButtonA0;

    @FXML
    private JFXToggleButton toggleButtonS1;

    @FXML
    private JFXToggleButton toggleButtonS3;

    @FXML
    private JFXToggleButton toggleButtonS2;

    @FXML
    private JFXToggleButton toggleButtonS0;


    /**
     * Initializes the controller class.
     */
    @FXML
    private void refresh() {
        //toggleButton1.setText("0");
        toggleButtonA0.setSelected(false);
        toggleButtonA1.setSelected(false);
        toggleButtonA2.setSelected(false);
        toggleButtonA3.setSelected(false);
        toggleButtonB0.setSelected(false);
        toggleButtonB1.setSelected(false);
        toggleButtonB2.setSelected(false);
        toggleButtonB3.setSelected(false);
        toggleButtonS0.setSelected(false);
        toggleButtonS1.setSelected(false);
        toggleButtonS2.setSelected(false);
        toggleButtonS3.setSelected(false);

    }

    @FXML
    private void button() {

        /*System.out.println("Button1");
        String text=A0.getText();
        int b1 = Integer.parseInt(text);
        System.out.println(b1);
        String text1=A1.getText();
        int b2 = Integer.parseInt(text1);
        System.out.println(b2);*/
        String OperandA = toggleButtonA0.getText() + toggleButtonA1.getText() + toggleButtonA2.getText() + toggleButtonA3.getText();
        System.out.println(toggleButtonA0.getText());
        System.out.println(toggleButtonA1.getText());
        System.out.println(toggleButtonA2.getText());
        System.out.println(toggleButtonA3.getText());
        System.out.println(OperandA);
        int intOperandA = Integer.parseInt(OperandA, 2);
        System.out.println(intOperandA);
        String OperandB = toggleButtonB0.getText() + toggleButtonB1.getText() + toggleButtonB2.getText() + toggleButtonB3.getText();
        System.out.println(toggleButtonB0.getText());
        System.out.println(toggleButtonB1.getText());
        System.out.println(toggleButtonB2.getText());
        System.out.println(toggleButtonB3.getText());
        System.out.println(OperandB);
        int intOperandB = Integer.parseInt(OperandB, 2);
        System.out.println(intOperandB);
        /*if (b1 != 0 && b1 !=1){
            A0.setStyle("-fx-control-inner-background:red");
        }
        else {
            A0.setStyle("-fx-control-inner-background:green");
            int b3 = b1+b2;
            String text3 = b3+"";
            F0.setEditable(false);
            F0.setText(text3);
        }*/
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // btn.setStyle("-fx-background-color: linear-gradient(to right,#00fffc,#fff600); -fx-background-radius: 25; -fx-border-radius: 25;");
        btn.setStyle(" -fx-background-radius: 50%; -fx-height:30px; -fx-width:30px; -fx-background-color:violet; ");
        btn1.setStyle(" -fx-background-radius: 50%; -fx-height:30px; -fx-width:30px;-fx-background-color:blue; ");


        toggleButtonA0.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                if (toggleButtonA0.isSelected()) {
                    toggleButtonA0.setText("1");
                } else {
                    toggleButtonA0.setText("0");
                }
            }
        });
        toggleButtonA1.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                if (toggleButtonA1.isSelected()) {
                    toggleButtonA1.setText("1");
                } else {
                    toggleButtonA1.setText("0");
                }
            }
        });
        toggleButtonA2.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                if (toggleButtonA2.isSelected()) {
                    toggleButtonA2.setText("1");
                } else {
                    toggleButtonA2.setText("0");
                }
            }
        });
        toggleButtonA3.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                if (toggleButtonA3.isSelected()) {
                    toggleButtonA3.setText("1");
                } else {
                    toggleButtonA3.setText("0");
                }
            }
        });
        toggleButtonB0.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                if (toggleButtonB0.isSelected()) {
                    toggleButtonB0.setText("1");
                } else {
                    toggleButtonB0.setText("0");
                }
            }
        });
        toggleButtonB1.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                if (toggleButtonB1.isSelected()) {
                    toggleButtonB1.setText("1");
                } else {
                    toggleButtonB1.setText("0");
                }
            }
        });
        toggleButtonB2.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                if (toggleButtonB2.isSelected()) {
                    toggleButtonB2.setText("1");
                } else {
                    toggleButtonB2.setText("0");
                }
            }
        });
        toggleButtonB3.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                if (toggleButtonB3.isSelected()) {
                    toggleButtonB3.setText("1");
                } else {
                    toggleButtonB3.setText("0");
                }
            }
        });
        toggleButtonS0.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                if (toggleButtonS0.isSelected()) {
                    toggleButtonS0.setText("1");
                } else {
                    toggleButtonS0.setText("0");
                }
            }
        });
        toggleButtonS1.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                if (toggleButtonS1.isSelected()) {
                    toggleButtonS1.setText("1");
                } else {
                    toggleButtonS1.setText("0");
                }
            }
        });
        toggleButtonS2.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                if (toggleButtonS2.isSelected()) {
                    toggleButtonS2.setText("1");
                } else {
                    toggleButtonS2.setText("0");
                }
            }
        });
        toggleButtonS3.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                if (toggleButtonS3.isSelected()) {
                    toggleButtonS3.setText("1");
                } else {
                    toggleButtonS3.setText("0");
                }
            }
        });

    }


}
