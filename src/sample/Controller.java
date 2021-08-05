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
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
//import javax.sound.sampled.Line;
import javax.swing.*;
import java.awt.*;
//import java.awt.Rectangle;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;


public class Controller<text> implements Initializable {

    @FXML
    private Rectangle Rect0;

    @FXML
    private Rectangle Rect6;

    @FXML
    private Rectangle Rect3;

    @FXML
    private Rectangle Rect1;

    @FXML
    private Rectangle Rect5;
    @FXML
    private Button Play;

    @FXML
    private Rectangle Rect4;

    @FXML
    private Rectangle Rect2;


    @FXML
    private Rectangle square0;

    @FXML
    private Line line3;

    @FXML
    private Line line2;

    @FXML
    private Line line1;

    @FXML
    private Line line11;

    @FXML
    private Line line22;

    @FXML
    private Line line33;

    @FXML
    private Line Line;

    @FXML
    private Line line00;

    @FXML
    private Button btn;

    @FXML
    private Button btn1;
    @FXML
    private TextField Result;
    @FXML
    private TextField M;

    @FXML
    private TextField Cn;

    @FXML
    private TextField CarryOut;

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


    public Connection getConnection() {
        Connection conn;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/GestionConcours", "root", "henintsoa123");
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void executeQuery(String query) {
        Connection conn = getConnection();
        Statement st;
        try {
            st = conn.createStatement();
            st.executeUpdate(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    private Button Refresh;

    @FXML
    private void Refresh() {
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
        M.setText(" ");
        Cn.setText(" ");
        CarryOut.setText(" ");
        Result.setText( " ");
        Rect0.setFill(Color.valueOf("#e4dede"));
        Rect2.setFill(Color.valueOf("#e4dede"));
        Rect3.setFill(Color.valueOf("#e4dede"));
        Rect5.setFill(Color.valueOf("#e4dede"));
        Rect6.setFill(Color.valueOf("#e4dede"));
        Rect1.setFill(Color.valueOf("#e4dede"));
        Rect4.setFill(Color.valueOf("#e4dede"));
        Play.setStyle("-fx-background-color:red;");


    }
    @FXML private void save(){
        System.out.println("hello");
        Save.Save1();
    }
    @FXML
    private void Play() {
        Play.setStyle("-fx-background-color:green;");
//
//        run.setFill(Color.GREEN);
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
        String SelectionS = toggleButtonS0.getText() + toggleButtonS1.getText() + toggleButtonS2.getText() + toggleButtonS3.getText();
        System.out.println(toggleButtonS0.getText());
        System.out.println(toggleButtonS1.getText());
        System.out.println(toggleButtonS2.getText());
        System.out.println(toggleButtonS3.getText());
        System.out.println(SelectionS);
        int intSelectionS = Integer.parseInt(SelectionS, 2);
        System.out.println(intSelectionS);
        String C=Cn.getText();
        int Cn=Integer.parseInt(C,2);
        System.out.println(Cn);
        String Mn=M.getText();
        int M1=Integer.parseInt(Mn,2);
        System.out.println(M1);
        String res11=ET(OperandA,OperandB);
        String res16 =OU(OperandA,Complement(OperandB));
        String res26 =OU(OperandA, OperandB);
        String res3 = ET(OperandA,Complement(OperandB));
        int A = Integer.parseInt(OperandA,2);

        if((M1==1) && (Cn==0) ) {
            switch (intSelectionS) {
                case 0:
                    System.out.println(Complement(OperandA));
                    String res1=Complement(OperandA);
                    Result.setText(res1);
                    CarryOut.setText("0");
                    System.out.println(Integer.parseInt(res1,2));
                    affichage(res1);
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                    LocalDateTime now = LocalDateTime.now();

                    String query1 =
                            "INSERT INTO ALU" +
                                    "(Daty,OperandeA,OperandeB,Selection,M,Cn,Resultat,CarryOut)" +
                                    "VALUES" +
                                    "('" +dtf.format(now) + "','"+OperandA+ "','" +OperandB + "','" +Integer.toBinaryString(intSelectionS) + "', '" +Integer.toBinaryString(M1) + "','" +Integer.toBinaryString(Cn)  + "', '" +res1 + "', '" +CarryOut.getText() + "');\n";
                    executeQuery(query1);
                    break;
                case 1:
                    System.out.println(Complement(OU(OperandA, OperandB)));
                    //Result.setText(Complement(OU(OperandA, OperandB)));
                    String[] res90 = Test(Complement(OU(OperandA, OperandB)));
                    System.out.println("Retenue "+res90[1]);
                    System.out.println("Resultat"+res90[0]);
                    Result.setText(res90[0]);
                    affichage(res90[0]);
                    CarryOut.setText(res90[1]);
                    break;
                case 2:
                    String res = Complement(OperandA);
                    //System.out.println(res);
                    System.out.println(ET(res, OperandB));
                    String[] res91 = Test(ET(res, OperandB));
                    System.out.println("Retenue "+res91[1]);
                    System.out.println("Resultat"+res91[0]);
                    Result.setText(res91[0]);
                    affichage(res91[0]);
                    CarryOut.setText(res91[1]);
                    //Result.setText(ET(res, OperandB));
                    break;
                case 3:
                    System.out.println(0);
                    Result.setText("0000");
                    CarryOut.setText("0");
                    affichage("0");
                    break;
                case 4:
                    System.out.println(Complement(ET(OperandA, OperandB)));
                    //Result.setText(Complement(ET(OperandA, OperandB)));
                    String[] res92 = Test(Complement(ET(OperandA, OperandB)));
                    System.out.println("Retenue "+res92[1]);
                    System.out.println("Resultat"+res92[0]);
                    Result.setText(res92[0]);
                    affichage(res92[0]);
                    CarryOut.setText(res92[1]);
                    break;
                case 5:
                    System.out.println(Complement(OperandB));
                   // Result.setText(Complement(OperandB));
                    String[] res93 = Test(Complement(OperandB));
                    System.out.println("Retenue "+res93[1]);
                    System.out.println("Resultat"+res93[0]);
                    Result.setText(res93[0]);
                    affichage(res93[0]);
                    CarryOut.setText(res93[1]);
                    break;
                case 6:
                    System.out.println(XOR(OperandA, OperandB));
                    String[] res94 = Test(XOR(OperandA, OperandB));
                    System.out.println("Retenue "+res94[1]);
                    System.out.println("Resultat"+res94[0]);
                    Result.setText(res94[0]);
                    CarryOut.setText(res94[1]);
                    affichage(res94[0]);
                    //Result.setText(XOR(OperandA, OperandB));
                    break;
                case 7:
                    System.out.println(ET(OperandA, Complement(OperandB)));
                    //Result.setText(ET(OperandA, Complement(OperandB)));
                    String[] res95 = Test(ET(OperandA, Complement(OperandB)));
                    System.out.println("Retenue "+res95[1]);
                    System.out.println("Resultat"+res95[0]);
                    Result.setText(res95[0]);
                    CarryOut.setText(res95[1]);
                    affichage(res95[0]);
                    break;
                case 8:
                    System.out.println(OU(Complement(OperandA), OperandB));
                    //Result.setText(OU(Complement(OperandA), OperandB));
                    String[] res96 = Test(OU(Complement(OperandA), OperandB));
                    System.out.println("Retenue "+res96[1]);
                    System.out.println("Resultat"+res96[0]);
                    Result.setText(res96[0]);
                    affichage(res96[0]);
                    CarryOut.setText(res96[1]);
                    break;
                case 9:
                    System.out.println(Complement(XOR(OperandA, OperandB)));
                    //Result.setText(Complement(XOR(OperandA, OperandB)));
                    String[] res97 = Test(Complement(XOR(OperandA, OperandB)));
                    System.out.println("Retenue "+res97[1]);
                    System.out.println("Resultat"+res97[0]);
                    Result.setText(res97[0]);
                    affichage(res97[0]);
                    CarryOut.setText(res97[1]);
                    break;
                case 10:
                    System.out.println(OperandB);
                    Result.setText(OperandB);
                    CarryOut.setText("0");
                    affichage(OperandB);
                    break;
                case 11:
                    System.out.println(ET(OperandA, OperandB));
                    String res0=ET(OperandA, OperandB);
                    Result.setText(ET(OperandA, OperandB));
                    CarryOut.setText("0");
                    affichage(res0);
                    break;
                case 12:
                    System.out.println(1);
                    Result.setText("1");
                    CarryOut.setText("0");
                    affichage("1");
                    break;
                case 13:
                    System.out.println(OU(OperandA, Complement(OperandB)));
                    Result.setText(OU(OperandA, Complement(OperandB)));
                    CarryOut.setText("0");
                    affichage(OU(OperandA, Complement(OperandB)));
                    break;
                case 14:
                    System.out.println(OU(OperandA, OperandB));
                    Result.setText(OU(OperandA, OperandB));
                    affichage(OU(OperandA, OperandB));
                    CarryOut.setText("0");
                    break;
                case 15:
                    System.out.println(OperandA);
                    Result.setText(OperandA);
                    affichage(OperandA);
                    CarryOut.setText("0");
                    break;


            }
        }
        if((M1==0) && (Cn==1)){
            switch (intSelectionS) {
                case 0:
                    String res31 = Integer.toBinaryString(A+1);
                    System.out.println(res31);
                    String[] res96 = Test(res31);
                    System.out.println("Retenue "+res96[1]);
                    System.out.println("Resultat"+res96[0]);
                    Result.setText(res96[0]);
                    affichage(res96[0]);
                    CarryOut.setText(res96[1]);
                    //Result.setText(res31);
                    break;
                case 1:
                    int res32 = Integer.parseInt(res26,2) +1;
                    String res33 = Integer.toBinaryString(res32);
                    System.out.println(res33);
                    //Result.setText(res33);
                    String[] res97 = Test(res33);
                    System.out.println("Retenue "+res97[1]);
                    System.out.println("Resultat"+res97[0]);
                    Result.setText(res97[0]);
                    affichage(res97[0]);
                    CarryOut.setText(res97[1]);
                    break;
                case 2:
                    int res34 = Integer.parseInt(res16,2) +1;
                    String res35 = Integer.toBinaryString(res34);
                    System.out.println(res35);
                    String[] res78 = Test(res35);
                    System.out.println("Retenue "+res78[1]);
                    System.out.println("Resultat"+res78[0]);
                    Result.setText(res78[0]);
                    affichage(res78[0]);
                    CarryOut.setText(res78[1]);
                    //Result.setText(res35);
                    break;
                case 3:
                    String res22 ="0";
                    System.out.println(res22);
                    affichage(res22);
                    Result.setText("0000");
                    CarryOut.setText("0");
                    break;
                case 4:
                    String res= ADD(OperandA,ET(OperandA,Complement(OperandB)));
                    int res36 = Integer.parseInt(res,2)+1;
                    String res37 = Integer.toBinaryString(res36);
                    System.out.println(res37);
                    String[] res90 = Test(res37);
                    System.out.println("Retenue"+res90[1]);
                    System.out.println("resultat"+res90[0]);
                    Result.setText(res90[0]);
                    affichage(res90[0]);
                    CarryOut.setText(res90[1]);
                    /*String res38 =Res(res37);
                    String Retenue6 = CarryOut(res37);
                    System.out.println("Resultat: "+res38);
                    System.out.println("Retenue: "+Retenue6);
                    Result.setText(res37);*/
                    //CarryOut.setText(Retenue6);
                    break;
                case 5:
                    String res2 = OU(OperandA,OperandB);
                    //String res3 = ET(operandA,Complement(operandB));
                    String res4 = ADD(res2,res3);
                    int res52 = Integer.parseInt(res4,2)+1;
                    String res39 = Integer.toBinaryString(res52);
                    System.out.println(res39);
                    String[] res77 = Test(res39);
                    System.out.println("Retenue "+res77[1]);
                    System.out.println("Resultat"+res77[0]);
                    Result.setText(res77[0]);
                    CarryOut.setText(res77[1]);
                    affichage(res77[0]);
                    /*String res5 = Res(res39);
                    String REtenue1 = CarryOut(res39);
                    System.out.println("Resultat: "+res5);
                    System.out.println("Retenue: "+REtenue1);
                    Result.setText(res5);
                    CarryOut.setText(REtenue1);*/

                    break;
                case 6:
                    String res7 =subtract1(OperandA ,OperandB);

                    System.out.println(res7);
                    String[] res76 = Test(res7);
                    System.out.println("Retenue "+res76[1]);
                    System.out.println("Resultat"+res76[0]);
                    Result.setText(res76[0]);
                    affichage(res76[0]);
                    CarryOut.setText(res76[1]);
                    //Result.setText(res8);
                    break;
                case 7:
                    String res9 = ET(OperandA,Complement(OperandB));
                    System.out.println(res9);
                    String[] res75 = Test(res9);
                    System.out.println("Retenue "+res75[1]);
                    System.out.println("Resultat"+res75[0]);
                    Result.setText(res75[0]);
                    CarryOut.setText(res75[1]);
                    affichage(res75[0]);
                    //Result.setText(res9);
                    break;
                case 8:
                    String res12 = add(OperandA,res11);
                    int res40= Integer.parseInt(res12,2)+1;
                    String res41 = Integer.toBinaryString(res40);
                    System.out.println(res41);
                    String[] res74 = Test(res41);
                    System.out.println("Retenue "+res74[1]);
                    System.out.println("Resultat"+res74[0]);
                    Result.setText(res74[0]);
                    CarryOut.setText(res74[1]);
                    affichage(res74[0]);
                    break;
                case 9:
                    String res14 = add(OperandA,OperandB);
                    int res42 = Integer.parseInt(res14,2)+1;
                    String res43 = Integer.toBinaryString(res42);
                    System.out.println(res43);
                    String[] res73 = Test(res43);
                    System.out.println("Retenue "+res73[1]);
                    System.out.println("Resultat"+res73[0]);
                    Result.setText(res73[0]);
                    CarryOut.setText(res73[1]);
                    affichage(res73[0]);
                    break;
                case 10:
                    String res17 = add(res16,res11);
                    int res44 = Integer.parseInt(res17,2)+1;
                    String res45 = Integer.toBinaryString(res44);
                    System.out.println(res45);
                    String[] res72 = Test(res45);
                    System.out.println("Retenue "+res72[1]);
                    System.out.println("Resultat"+res72[0]);
                    Result.setText(res72[0]);
                    affichage(res72[0]);
                    CarryOut.setText(res72[1]);
                    break;
                case 11:
                    System.out.println(res11);
                    String[] res71 = Test(res11);
                    System.out.println("Retenue "+res71[1]);
                    System.out.println("Resultat"+res71[0]);
                    Result.setText(res71[0]);
                    CarryOut.setText(res71[1]);
                    affichage(res71[0]);
                    //Result.setText(res11);
                    break;
                case 12:
                    String res24 = ADD(OperandA,OperandA);
                    int res46 = Integer.parseInt(res24,2)+1;
                    String res47 = Integer.toBinaryString(res46);
                    System.out.println(res47);
                    String[] res70 = Test(res47);
                    System.out.println("Retenue "+res70[1]);
                    System.out.println("Resultat"+res70[0]);
                    Result.setText(res70[0]);
                    CarryOut.setText(res70[1]);
                    affichage(res70[0]);
                    //Result.setText(res47);
                    break;
                case 13:
                    String res25 = ADD(res26,OperandA);
                    int res48 = Integer.parseInt(res25,2)+1;
                    String res49 = Integer.toBinaryString(res48);
                    System.out.println(res49);
                    String[] res69 = Test(res49);
                    System.out.println("Retenue "+res69[1]);
                    System.out.println("Resultat"+res69[0]);
                    Result.setText(res69[0]);
                    CarryOut.setText(res69[1]);
                    affichage(res69[0]);
                    break;
                case 14:
                    String res27 = ADD(res16,OperandA);
                    int res50 = Integer.parseInt(res27,2)+1;
                    String res51 = Integer.toBinaryString(res50);
                    System.out.println(res51);
                    String[] res68 = Test(res51);
                    System.out.println("Retenue "+res68[1]);
                    System.out.println("Resultat"+res68[0]);
                    Result.setText(res68[0]);
                    CarryOut.setText(res68[1]);
                    affichage(res68[0]);
                    break;
                case 15:
                    System.out.println(OperandA);
                    Result.setText(OperandA);
                    CarryOut.setText("0");
                    affichage(OperandA);
                    break;

            }
        }
        if((M1==0) && (Cn==0)){
            switch (intSelectionS) {
                case 0:
                    System.out.println(OperandA);
                    Result.setText(OperandA);
                    break;
                case 1:
                    System.out.println(res26);
                    String[] res96 = Test(res26);
                    System.out.println("Retenue "+res96[1]);
                    System.out.println("Resultat"+res96[0]);
                    Result.setText(res96[0]);
                    CarryOut.setText(res96[1]);
                    affichage(res96[0]);
                    //Result.setText(res26);
                    break;
                case 2:
                    //String res = Complement(operandA);
                    //System.out.println(res);
                    System.out.println(res16);
                    String[] res95 = Test(res16);
                    System.out.println("Retenue "+res95[1]);
                    System.out.println("Resultat"+res95[0]);
                    Result.setText(res95[0]);
                    CarryOut.setText(res95[1]);
                    affichage(res95[0]);
                    //Result.setText(res16);
                    break;
                case 3:
                    System.out.println("-1");
                    Result.setText("1111");
                    affichage("1111");
                    CarryOut.setText("0");
                    break;
                case 4:
                    String res= ADD(OperandA,ET(OperandA,Complement(OperandB)));
                    String[] res94 = Test(res);
                    System.out.println("Retenue "+res94[1]);
                    System.out.println("Resultat"+res94[0]);
                    Result.setText(res94[0]);
                    CarryOut.setText(res94[1]);
                    affichage(res94[0]);
                    break;
                case 5:
                    String res2 = OU(OperandA,OperandB);
                    String res4 = ADD(res2,res3);
                    String[] res93 = Test(res4);
                    System.out.println("Retenue "+res93[1]);
                    System.out.println("Resultat"+res93[0]);
                    Result.setText(res93[0]);
                    CarryOut.setText(res93[1]);
                    affichage(res93[0]);
                    break;
                case 6:
                    String res6 =subtract(OperandA ,OperandB);
                    System.out.println(res6);
                    //Result.setText(res6);
                    String[] res92 = Test(res6);
                    System.out.println("Retenue "+res92[1]);
                    System.out.println("Resultat"+res92[0]);
                    Result.setText(res92[0]);
                    CarryOut.setText(res92[1]);
                    affichage(res92[0]);
                    break;
                case 7:
                    String res9 = ET(OperandA,Complement(OperandB));
                    int Res3 =Integer.parseInt(res9 , 2);
                    String res10 = Integer.toBinaryString(Res3 -1);
                    String[] res91 = Test(res10);
                    System.out.println("Retenue "+res91[1]);
                    System.out.println("Resultat"+res91[0]);
                    Result.setText(res91[0]);
                    CarryOut.setText(res91[1]);
                    affichage(res91[0]);
                    break;
                case 8:
                    String res12 = add(OperandA,res11);
                    System.out.println(res12);
                    String[] res90 = Test(res12);
                    System.out.println("Retenue "+res90[1]);
                    System.out.println("Resultat"+res90[0]);
                    Result.setText(res90[0]);
                    CarryOut.setText(res90[1]);
                    affichage(res90[0]);
                    break;
                case 9:
                    String res14 = add(OperandA,OperandB);
                    String[] res89 = Test(res14);
                    System.out.println("Retenue "+res89[1]);
                    System.out.println("Resultat"+res89[0]);
                    Result.setText(res89[0]);
                    CarryOut.setText(res89[1]);
                    affichage(res89[0]);
                    break;
                case 10:
                    String res17 = add(res16,res11);
                    System.out.println(res17);
                    String[] res88 = Test(res17);
                    System.out.println("Retenue "+res88[1]);
                    System.out.println("Resultat"+res88[0]);
                    Result.setText(res88[0]);
                    CarryOut.setText(res88[1]);
                    affichage(res88[0]);
                    break;
                case 11:
                    int res19 = Integer.parseInt(res11,2);
                    int res20 = res19 - 1;
                    String res21 = Integer.toBinaryString(res20);
                    System.out.println(res21);
                    String[] res87 = Test(res21);
                    System.out.println("Retenue "+res87[1]);
                    System.out.println("Resultat"+res87[0]);
                    Result.setText(res87[0]);
                    CarryOut.setText(res87[1]);
                    affichage(res87[0]);
                    break;
                case 12:
                    int res22 = A <<1;
                    String res23 = Integer.toBinaryString(res22);
                    String res24 = ADD(OperandA,res23);
                    System.out.println(res24);
                    String[] res86 = Test(res24);
                    System.out.println("Retenue "+res86[1]);
                    System.out.println("Resultat"+res86[0]);
                    Result.setText(res86[0]);
                    CarryOut.setText(res86[1]);
                    affichage(res86[0]);
                    break;
                case 13:
                    String res25 = ADD(res26,OperandA);
                    System.out.println(res25);
                    String[] res85 = Test(res25);
                    System.out.println("Retenue "+res85[1]);
                    System.out.println("Resultat"+res85[0]);
                    Result.setText(res85[0]);
                    CarryOut.setText(res85[1]);
                    affichage(res85[0]);
                    break;
                case 14:
                    String res27 = ADD(res16,OperandA);
                    System.out.println(res27);
                    String[] res84 = Test(res27);
                    System.out.println("Retenue "+res84[1]);
                    System.out.println("Resultat"+res84[0]);
                    Result.setText(res84[0]);
                    CarryOut.setText(res84[1]);
                    affichage(res84[0]);
                    break;
                case 15:
                    int res28 =A -1 ;
                    String res29 = Integer.toBinaryString(res28);
                    System.out.println(res29);
                    String[] res83 = Test(res29);
                    System.out.println("Retenue "+res83[1]);
                    System.out.println("Resultat"+res83[0]);
                    Result.setText(res83[0]);
                    CarryOut.setText(res83[1]);
                    affichage(res83[0]);
                    break;

            }
        }
        Result.setDisable(true);
    }
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
        public static String ADD(String a,String b){
            int a1 =Integer.parseInt(a,2);
            int b1=Integer.parseInt(b,2);
            int c = a1+b1;
            String res =Integer.toBinaryString(c);
            return res;
        }
    public static String subtract(String a, String b) {
        int a1 = Integer.parseInt(a, 2);
        int b1 = Integer.parseInt(b, 2);
        Long sum =(long) a1+(~b1+1);
        String res= Long.toBinaryString(sum);
        if(res.length()>4){
            String res1 = res.substring(res.length() -4);
            return res1;
        }else {
            return res;
        }

    }
    public static String subtract1(String a, String b) {
        int a1 = Integer.parseInt(a, 2);
        int b1 = Integer.parseInt(b, 2);
        Long sum =(long) a1+(~b1+1)-1;
        String res= Long.toBinaryString(sum);
        if(res.length()>4){
            String res1 = res.substring(res.length() -4);
            return res1;
        }else {
            return res;
        }

    }
    public static String Res(String a){
        String res5=" ";
        if (a.length()>4) {
            res5 = a.substring(1,5);
        }
        return  res5;
    }

    public static String CarryOut(String a){
        String b =" ";
        if (a.length()>4) {
            b = a.substring(0,1);
        }

        return  b;
    }
    public static String[] Test(String a){
            String result[] = new String[2];

            if (a.length()>4){
                result[0]= a.substring(1,5);
                result[1]= a.substring(0,1);
            }
            else if (a.length()==3){
                result[0]="0"+a;
                result[1]= "0";
            }
            else if (a.length()==2){
                result[0]="00"+a;
                result[1]= "0";
            }
            else if (a.length()==1){
                result[0]="000"+a;
                result[1]= "0";
            }
            else if (a.length()==4){
                result[0] =a;
                result[1] = "0";
            }
        return result;


    }
    public  static String add(String a,String b){
        int b1= Integer.parseInt(a,2);
        int b2= Integer.parseInt(b,2);
        int sum = b1+b2;
        return Integer.toBinaryString(sum);
        //return sum;
    }
    public static String Bits(String a){
        String res = " ";
        if(a.length()<4){
            res = "0" + a;
        }
        return res;
    }
    static char flip(char c)
    {
        return (c == '0') ? '1' : '0';
    }
    public static String Complement(String a){
        int n = a.length();
        int i;
        String ones = "";
        ones =  "";
        for (i = 0; i < n; i++)
        {
            ones += flip(a.charAt(i));
        }
        return ones;
    }
    public static String XOR(String a,String b){
        int b1 = Integer.parseInt(a, 2);
        int b2 = Integer.parseInt(b, 2);
        int c= b1^b2;
        return Integer.toBinaryString(c);
    }
    public static String OU(String a,String b){
        int b1 = Integer.parseInt(a, 2);
        int b2 = Integer.parseInt(b, 2);
        int c= b1|b2;
        String res= Integer.toBinaryString(c);
        while (res.length()<4){
            res="0"+res;
        }
        return res;
    }
    public static String ET(String a,String b)
    {
        int b1 = Integer.parseInt(a, 2);
        int b2 = Integer.parseInt(b, 2);
        int c= b1&b2;
        String res=Integer.toBinaryString(c);
        while (res.length()<4){
            res="0"+res;
        }
        return res;
    }
    public static void DB(int a){

        int [] entier= new int[40] ;

        int index = 0;
        int i;
        while (a >0){
            entier[index++] = a% 2;
            a=a/2;
        }
        for ( i =index - 1;i>=0;i-=1){
            System.out.print(entier[i]);
        }

    }
    public  void affichage(String a){
            int res=Integer.parseInt(a,2);
            switch (res){
                case 0:
                    Rect0.setFill(Color.RED);
                    Rect1.setFill(Color.RED);
                    Rect2.setFill(Color.RED);
                    Rect3.setFill(Color.valueOf("#e4dede"));
                    Rect4.setFill(Color.RED);
                    Rect5.setFill(Color.RED);
                    Rect6.setFill(Color.RED);
                    break;
                case 1:
                    Rect0.setFill(Color.valueOf("#e4dede"));
                    Rect2.setFill(Color.valueOf("#e4dede"));
                    Rect3.setFill(Color.valueOf("#e4dede"));
                    Rect5.setFill(Color.valueOf("#e4dede"));
                    Rect6.setFill(Color.valueOf("#e4dede"));
                    Rect1.setFill(Color.RED);
                    Rect4.setFill(Color.RED);
                    break;
                case 2:
                    Rect0.setFill(Color.RED);
                    Rect1.setFill(Color.RED);
                    Rect3.setFill(Color.RED);
                    Rect5.setFill(Color.RED);
                    Rect6.setFill(Color.RED);
                    Rect2.setFill(Color.valueOf("#e4dede"));
                    Rect4.setFill(Color.valueOf("#e4dede"));
                    break;
                case 3:
                    Rect0.setFill(Color.RED);
                    Rect2.setFill(Color.valueOf("#e4dede"));
                    Rect1.setFill(Color.RED);
                    Rect3.setFill(Color.RED);
                    Rect4.setFill(Color.RED);
                    Rect5.setFill(Color.valueOf("#e4dede"));
                    Rect6.setFill(Color.RED);
                    break;
                case 4:
                    Rect2.setFill(Color.RED);
                    Rect1.setFill(Color.RED);
                    Rect3.setFill(Color.RED);
                    Rect4.setFill(Color.RED);
                    Rect0.setFill(Color.valueOf("#e4dede"));
                    Rect5.setFill(Color.valueOf("#e4dede"));
                    Rect6.setFill(Color.valueOf("#e4dede"));
                    break;
                case 5:
                    Rect2.setFill(Color.RED);
                    Rect0.setFill(Color.RED);
                    Rect3.setFill(Color.RED);
                    Rect4.setFill(Color.RED);
                    Rect6.setFill(Color.RED);
                    Rect1.setFill(Color.valueOf("#e4dede"));
                    Rect5.setFill(Color.valueOf("#e4dede"));
                    break;
                case 6:
                    Rect2.setFill(Color.RED);
                    Rect0.setFill(Color.RED);
                    Rect3.setFill(Color.RED);
                    Rect4.setFill(Color.RED);
                    Rect5.setFill(Color.RED);
                    Rect6.setFill(Color.RED);
                    Rect1.setFill(Color.valueOf("#e4dede"));
                    break;
                case 7:
                    Rect2.setFill(Color.RED);
                    Rect0.setFill(Color.RED);
                    Rect1.setFill(Color.RED);
                    Rect4.setFill(Color.RED);
                    Rect3.setFill(Color.valueOf("#e4dede"));
                    Rect5.setFill(Color.valueOf("#e4dede"));
                    Rect6.setFill(Color.valueOf("#e4dede"));
                    break;
                case 8:
                    Rect2.setFill(Color.RED);
                    Rect0.setFill(Color.RED);
                    Rect3.setFill(Color.RED);
                    Rect4.setFill(Color.RED);
                    Rect5.setFill(Color.RED);
                    Rect6.setFill(Color.RED);
                    Rect1.setFill(Color.RED);
                    break;
                case 9:
                    Rect5.setFill(Color.valueOf("#e4dede"));
                    Rect2.setFill(Color.RED);
                    Rect0.setFill(Color.RED);
                    Rect3.setFill(Color.RED);
                    Rect4.setFill(Color.RED);
                    Rect1.setFill(Color.RED);
                    Rect6.setFill(Color.RED);
                    break;
                case 10:
                    Rect2.setFill(Color.RED);
                    Rect0.setFill(Color.RED);
                    Rect3.setFill(Color.RED);
                    Rect4.setFill(Color.RED);
                    Rect5.setFill(Color.RED);
                    Rect1.setFill(Color.RED);
                    Rect6.setFill(Color.valueOf("#e4dede"));
                    break;
                case 11:
                    Rect0.setFill(Color.valueOf("#e4dede"));
                    Rect1.setFill(Color.valueOf("#e4dede"));
                    Rect2.setFill(Color.RED);
                    Rect3.setFill(Color.RED);
                    Rect4.setFill(Color.RED);
                    Rect5.setFill(Color.RED);
                    Rect6.setFill(Color.RED);
                    break;
                case 12:
                    Rect2.setFill(Color.RED);
                    Rect0.setFill(Color.RED);
                    Rect5.setFill(Color.RED);
                    Rect6.setFill(Color.RED);
                    Rect1.setFill(Color.valueOf("#e4dede"));
                    Rect3.setFill(Color.valueOf("#e4dede"));
                    Rect4.setFill(Color.valueOf("#e4dede"));
                    break;
                case 13:
                    Rect1.setFill(Color.RED);
                    Rect3.setFill(Color.RED);
                    Rect4.setFill(Color.RED);
                    Rect5.setFill(Color.RED);
                    Rect6.setFill(Color.RED);
                    Rect2.setFill(Color.valueOf("#e4dede"));
                    Rect0.setFill(Color.valueOf("#e4dede"));
                    break;
                case 14:
                    Rect2.setFill(Color.RED);
                    Rect3.setFill(Color.RED);
                    Rect5.setFill(Color.RED);
                    Rect6.setFill(Color.RED);
                    Rect1.setFill(Color.valueOf("#e4dede"));
                    Rect0.setFill(Color.RED);
                    Rect4.setFill(Color.valueOf("#e4dede"));
                    break;
                case 15:
                    Rect2.setFill(Color.RED);
                    Rect0.setFill(Color.RED);
                    Rect3.setFill(Color.RED);
                    Rect5.setFill(Color.RED);
                    Rect1.setFill(Color.valueOf("#e4dede"));
                    Rect4.setFill(Color.valueOf("#e4dede"));
                    Rect6.setFill(Color.valueOf("#e4dede"));

                    break;
            }
    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {
            //Rect1.setFill(Color.RED);
            Line.setStroke(Color.RED);
        // btn.setStyle("-fx-background-color: linear-gradient(to right,#00fffc,#fff600); -fx-background-radius: 25; -fx-border-radius: 25;");
        //btn.setStyle(" -fx-background-radius: 100; -fx-height:30px; -fx-width:30px; -fx-background-color:violet; ");
        //btn.setStyle("-fx-background-color:#dd0808;");
//        btn1.setStyle(" -fx-background-radius: 50%; -fx-height:30px; -fx-width:30px;-fx-background-color:blue; ");


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