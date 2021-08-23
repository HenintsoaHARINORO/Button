package sample;

import com.jfoenix.controls.JFXToggleButton;
import com.jfoenix.controls.JFXToggleNode;
import com.jfoenix.svg.SVGGlyph;
//import com.sun.javafx.tk.quantum.PaintRenderJob;
import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import javafx.util.Duration;
//import javax.sound.sampled.Line;
import javax.swing.*;
//import javax.swing.text.html.ImageView;
import java.awt.*;
//import java.awt.Rectangle;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.Collections;
import java.util.ResourceBundle;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;


public class Controller implements Initializable {

    @FXML
    private Polygon TriM;
    @FXML private MenuItem aide;
    @FXML
    private Polygon TriCn;
    @FXML
    private Rectangle Rect0;
    @FXML
    private Rectangle RectCn;
    @FXML
    private Rectangle RectM;

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
    private Label Daty;

    @FXML
    private Rectangle Rect4;

    @FXML
    private Rectangle Rect2;

    @FXML
    private ImageView imagePlay;
    @FXML
    private Rectangle square0;

    @FXML
    private Line line3;

    @FXML
    private Line line2;

    @FXML
    private Line line1;
    @FXML
    private Rectangle Rectangle0;
    @FXML
    private Rectangle RectA0;

    @FXML
    private Rectangle RectS3;

    @FXML
    private Rectangle RectS2;

    @FXML
    private Rectangle RectS1;

    @FXML
    private Rectangle RectS0;
    @FXML
    private Line lineS2;
    @FXML
    private Label Title;

    @FXML
    private Line lineS1;
    @FXML
    private Line lineM;
    @FXML
    private Line lineCn;

    @FXML
    private Line lineS0;
    @FXML
    private Line lineCarryOut;

    @FXML
    private  Line lineS3;
    @FXML
    private  Line lineF32;

    @FXML
    private Line line01;

    @FXML
    private   Line line02;
    @FXML
    private  Line lineF31;

    @FXML
    private   Line line21;

    @FXML
    private    Line line11;

    @FXML
    private  Line line12;

    @FXML
    private   Line line22;
    @FXML
    private  Line lineF33;

    @FXML
    private   Line line23;

    @FXML
    private   Line line13;

    @FXML
    private   Line line03;

    @FXML
    private Label Label0;
    @FXML
    private Line lineA0;
    @FXML
    private Line lineA1;
    @FXML
    private Rectangle RectA3;
    @FXML
    private Rectangle RectA1;

    @FXML
    private Rectangle RectA2;
    @FXML
    private   Rectangle RectF0;
    @FXML
    private Line lineA3;

    @FXML
    private Line lineA2;


    @FXML
    private Line lineB2;

    @FXML
    private Line lineB1;

    @FXML
    private Line lineB0;

    @FXML
    private Line lineB3;
    @FXML
    private Rectangle RectB3;

    @FXML
    private Rectangle RectB2;

    @FXML
    private Rectangle RectB1;

    @FXML
    private Rectangle RectB0;
    @FXML
    private  Rectangle RectF1;
    @FXML
    private  Rectangle RectF3;
    @FXML
    private  Rectangle RectF2;



    @FXML
    private Line line33;

    @FXML   private  AnchorPane anchor;

    @FXML
    private  Line line00;

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
    public  TextField CarryOut;
    @FXML private Button Refresh;

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

    @FXML Button Button0;
    @FXML private void Button0(){
        if (Button0.getText().equals("0")) {
            Button0.setText("1");
            Button0.setStyle("-fx-background-color:green;");
            Button1.setDisable(true);
            TriM.setFill(Color.GREEN);
            TriM.setStroke(Color.GREEN);
            RectM.setFill(Color.GREEN);
            lineM.setStroke(Color.GREEN);
            RectM.setStroke(Color.GREEN);
        }
        else {
            Button0.setText("0");
            Button0.setStyle("-fx-background-color:red;");
            Button1.setDisable(false);
            TriM.setFill(Color.RED);
            TriM.setStroke(Color.RED);
            RectM.setFill(Color.RED);
            RectM.setStroke(Color.RED);
            lineM.setStroke(Color.RED);
        }
    }
    @FXML Button Button1;
    @FXML private void Button1(){
        if (Button1.getText().equals("0")) {
            Button1.setText("1");
            Button1.setStyle("-fx-background-color:green;");
            Button1.setDisable(false);
            TriCn.setStroke(Color.GREEN);
            TriCn.setFill(Color.GREEN);
            RectCn.setFill(Color.GREEN);
            lineCn.setStroke(Color.GREEN);
            RectCn.setStroke(Color.GREEN);

        }
        else {
            Button1.setText("0");
            Button1.setStyle("-fx-background-color:red;");
            Button1.setDisable(false);
            TriCn.setStroke(Color.RED);
            TriCn.setFill(Color.RED);
            RectCn.setFill(Color.RED);
            lineCn.setStroke(Color.RED);
            RectCn.setStroke(Color.RED);

        }
    }

    @FXML
    private void Refresh() {
        lineCarryOut.setStroke(Color.RED);
        RectF3.setStroke(Color.RED);
        RectF3.setFill(Color.RED);
        lineF31.setStroke(Color.RED);
        lineF32.setStroke(Color.RED);
        lineF33.setStroke(Color.RED);
        RectF1.setFill(Color.RED);
        line11.setStroke(Color.RED);
        line12.setStroke(Color.RED);
        line13.setStroke(Color.RED);
        RectF1.setStroke(Color.RED);
        RectF2.setFill(Color.RED);
        RectF2.setStroke(Color.RED);
        line21.setStroke(Color.RED);
        line22.setStroke(Color.RED);
        line23.setStroke(Color.RED);
        RectF0.setFill(Color.RED);
        RectF0.setStroke(Color.RED);
        line01.setStroke(Color.RED);
        line02.setStroke(Color.RED);
        line03.setStroke(Color.RED);
        CarryOut.setStyle("-fx-background-color:white");
        TriM.setFill(Color.RED);
        TriM.setStroke(Color.RED);
        RectM.setFill(Color.RED);
        RectM.setStroke(Color.RED);
        lineM.setStroke(Color.RED);
        TriCn.setStroke(Color.RED);
        TriCn.setFill(Color.RED);
        RectCn.setFill(Color.RED);
        RectCn.setStroke(Color.RED);
        lineCn.setStroke(Color.RED);
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
        Button0.setText("0");
        Button1.setText("0");
        Button0.setStyle("-fx-background-color:red");
        Button1.setStyle("-fx-background-color:red");
        Button1.setDisable(false);
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
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String OperandA = toggleButtonA0.getText() + toggleButtonA1.getText() + toggleButtonA2.getText() + toggleButtonA3.getText();
        System.out.println(toggleButtonA0.getText());
        System.out.println(toggleButtonA1.getText());
        System.out.println(toggleButtonA2.getText());
        System.out.println(toggleButtonA3.getText());
        System.out.println(OperandA);
        String OperandB = toggleButtonB0.getText() + toggleButtonB1.getText() + toggleButtonB2.getText() + toggleButtonB3.getText();
        System.out.println(toggleButtonB0.getText());
        System.out.println(toggleButtonB1.getText());
        System.out.println(toggleButtonB2.getText());
        System.out.println(toggleButtonB3.getText());
        System.out.println(OperandB);
        String SelectionS = toggleButtonS0.getText() + toggleButtonS1.getText() + toggleButtonS2.getText() + toggleButtonS3.getText();
        System.out.println(toggleButtonS0.getText());
        System.out.println(toggleButtonS1.getText());
        System.out.println(toggleButtonS2.getText());
        System.out.println(toggleButtonS3.getText());
        System.out.println(SelectionS);
        String query =
                "INSERT INTO ALU" +
                        "(Daty,OperandeA,OperandeB,Selection,M,Cn,Resultat,CarryOut)" +
                        "VALUES" +
                        "('" +dtf.format(now) + "','"+OperandA+ "','" +OperandB + "','" +SelectionS + "', '" +Button0.getText() + "','" +Button1.getText()+ "', '" +Result.getText() + "', '" +CarryOut.getText()+ "');\n";
        executeQuery(query);
        Save.Save1();
        JOptionPane jop = new JOptionPane();
        jop.showMessageDialog(null,"Sauvegarde reussie","Information",JOptionPane.INFORMATION_MESSAGE);
    }
    @FXML private void aide(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Aide.fxml"));
        Parent ReportManager = loader.load();
        Scene ReportManagerScene = new Scene(ReportManager);

        Stage window = (Stage)anchor.getScene().getWindow();

        window.setScene(ReportManagerScene);

        window.show();



    }
    @FXML
    private void Play() {
        Play.setStyle("-fx-background-color:red;");

      //imagePlay.setStyle("-fx-background-color:red;");
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
        int Cn=0;
        if (Button1.isDisabled()){
            System.out.println("Nothing");
        }else{
            String C=Button1.getText();
            Cn=Integer.parseInt(C,2);
            System.out.println(Cn);

        }
        String Mn=Button0.getText();
        int M1=Integer.parseInt(Mn,2);
        System.out.println(M1);
        String res11=ET(OperandA,OperandB);
        String res16 =OU(OperandA,Complement(OperandB));
        String res26 =OU(OperandA, OperandB);
        String res3 = ET(OperandA,Complement(OperandB));
        int A = Integer.parseInt(OperandA,2);
        DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now6 = LocalDateTime.now();
        if((M1==1)  ) {
            switch (intSelectionS) {
                case 0:
                    System.out.println(Complement(OperandA));
                    String res1=Complement(OperandA);
                    Result.setText(res1);
                    CarryOut.setText("0");
                    carry("0");
                    System.out.println(Integer.parseInt(res1,2));
                    affichage(res1);
                    change(res1);
                    break;
                case 1:
                    System.out.println(Complement(OU(OperandA, OperandB)));
                    //Result.setText(Complement(OU(OperandA, OperandB)));
                    String[] res90 = Test(Complement(OU(OperandA, OperandB)));
                    System.out.println("Retenue "+res90[1]);
                    System.out.println("Resultat"+res90[0]);
                    Result.setText(res90[0]);
                    affichage(res90[0]);
                    change(res90[0]);
                    CarryOut.setText(res90[1]);
                    carry(res90[1]);

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
                    change(res91[0]);
                    CarryOut.setText(res91[1]);
                    carry(res91[1]);


                    //Result.setText(ET(res, OperandB));
                    break;
                case 3:
                    System.out.println(0);
                    String res45="0000";
                    Result.setText(res45);
                    CarryOut.setText("0");
                    affichage("0");
                    change("0000");
                    carry("0");

                    break;
                case 4:
                    System.out.println(Complement(ET(OperandA, OperandB)));
                    //Result.setText(Complement(ET(OperandA, OperandB)));
                    String[] res92 = Test(Complement(ET(OperandA, OperandB)));
                    System.out.println("Retenue "+res92[1]);
                    System.out.println("Resultat"+res92[0]);
                    Result.setText(res92[0]);
                    affichage(res92[0]);
                    change(res92[0]);
                    carry(res92[1]);
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
                    change(res93[0]);
                    carry(res93[1]);
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
                    change(res94[0]);
                    carry(res94[1]);

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
                    change(res95[0]);
                    carry(res95[1]);

                    break;
                case 8:
                    System.out.println(OU(Complement(OperandA), OperandB));
                    //Result.setText(OU(Complement(OperandA), OperandB));
                    String[] res96 = Test(OU(Complement(OperandA), OperandB));
                    System.out.println("Retenue "+res96[1]);
                    System.out.println("Resultat"+res96[0]);
                    Result.setText(res96[0]);
                    affichage(res96[0]);
                    change(res96[0]);
                    CarryOut.setText(res96[1]);
                    carry(res96[1]);

                    break;
                case 9:
                    System.out.println(Complement(XOR(OperandA, OperandB)));
                    //Result.setText(Complement(XOR(OperandA, OperandB)));
                    String[] res97 = Test(Complement(XOR(OperandA, OperandB)));
                    System.out.println("Retenue "+res97[1]);
                    System.out.println("Resultat"+res97[0]);
                    Result.setText(res97[0]);
                    affichage(res97[0]);
                    change(res97[0]);
                    CarryOut.setText(res97[1]);
                    carry(res97[1]);

                    break;
                case 10:
                    System.out.println(OperandB);
                    Result.setText(OperandB);
                    CarryOut.setText("0");
                    affichage(OperandB);
                    change(OperandB);
                    carry("0");

                    break;
                case 11:
                    System.out.println(ET(OperandA, OperandB));
                    String res0=ET(OperandA, OperandB);
                    Result.setText(ET(OperandA, OperandB));
                    CarryOut.setText("0");
                    carry("0");
                    affichage(res0);
                    change(res0);

                    break;
                case 12:
                    System.out.println(1);
                    Result.setText("0001");
                    CarryOut.setText("0");
                    affichage("0001");
                    change("0001");
                    carry("0");

                    break;
                case 13:
                    String re1=OU(OperandA, Complement(OperandB));
                    System.out.println(re1);
                    Result.setText(re1);
                    change(re1);
                    CarryOut.setText("0");
                    carry("0");
                    affichage(re1);

                    break;
                case 14:
                    String re2=OU(OperandA, OperandB);
                    System.out.println(re2);
                    Result.setText(re2);
                    affichage(re2);
                    change(re2);
                    CarryOut.setText("0");
                    carry("0");

                    break;
                case 15:
                    System.out.println(OperandA);
                    Result.setText(OperandA);
                    affichage(OperandA);
                    change(OperandA);
                    CarryOut.setText("0");
                    carry("0");

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
                    change(res96[0]);
                    CarryOut.setText(res96[1]);
                    carry(res96[1]);

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
                    change(res97[0]);
                    CarryOut.setText(res97[1]);
                    carry(res97[1]);

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
                    change(res78[0]);
                    CarryOut.setText(res78[1]);
                    carry(res78[1]);

                    //Result.setText(res35);
                    break;
                case 3:
                    String res22 ="0";
                    System.out.println(res22);
                    affichage(res22);
                    Result.setText("0000");
                    change("0000");
                    CarryOut.setText("0");
                    carry("0");

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
                    change(res90[0]);
                    CarryOut.setText(res90[1]);
                    carry(res90[1]);

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
                    change(res77[0]);
                    carry(res77[1]);

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
                    change(res76[0]);
                    carry(res76[1]);

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
                    change(res75[0]);
                    carry(res75[1]);

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
                    change(res74[0]);
                    carry(res74[1]);

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
                    change(res73[0]);
                    carry(res73[1]);

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
                    change(res72[0]);
                    CarryOut.setText(res72[1]);
                    carry(res72[1]);

                    break;
                case 11:
                    System.out.println(res11);
                    String[] res71 = Test(res11);
                    System.out.println("Retenue "+res71[1]);
                    System.out.println("Resultat"+res71[0]);
                    Result.setText(res71[0]);
                    CarryOut.setText(res71[1]);
                    affichage(res71[0]);
                    change(res71[0]);
                    carry(res71[1]);

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
                    change(res70[0]);
                    carry(res70[1]);

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
                    change(res69[0]);
                    affichage(res69[0]);
                    carry(res69[1]);
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
                    change(res68[0]);
                    affichage(res68[0]);
                    carry(res68[1]);
                    break;
                case 15:
                    System.out.println(OperandA);
                    Result.setText(OperandA);
                    CarryOut.setText("0");
                    affichage(OperandA);
                    change(OperandA);
                    carry("0");
                    break;

            }
        }
        if((M1==0) && (Cn==0)){
            switch (intSelectionS) {
                case 0:
                    System.out.println(OperandA);
                    Result.setText(OperandA);
                    Result.setText(OperandA);
                    CarryOut.setText("0");
                    change(OperandA);
                    carry("0");
                    affichage(OperandA);
                    break;
                case 1:
                    System.out.println(res26);
                    String[] res96 = Test(res26);
                    System.out.println("Retenue "+res96[1]);
                    System.out.println("Resultat"+res96[0]);
                    Result.setText(res96[0]);
                    CarryOut.setText(res96[1]);
                    affichage(res96[0]);
                    change(res96[0]);
                    carry(res96[1]);
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
                    change(res95[0]);
                    carry(res95[1]);
                    //Result.setText(res16);
                    break;
                case 3:
                    System.out.println("-1");
                    Result.setText("1111");
                    affichage("1111");
                    CarryOut.setText("0");
                    change("1111");
                    carry("0");
                    break;
                case 4:
                    String res= ADD(OperandA,ET(OperandA,Complement(OperandB)));
                    String[] res94 = Test(res);
                    System.out.println("Retenue "+res94[1]);
                    System.out.println("Resultat"+res94[0]);
                    Result.setText(res94[0]);
                    CarryOut.setText(res94[1]);
                    change(res94[0]);
                    affichage(res94[0]);
                    carry(res94[1]);
                    break;
                case 5:
                    String res2 = OU(OperandA,OperandB);
                    String res4 = ADD(res2,res3);
                    String[] res93 = Test(res4);
                    System.out.println("Retenue "+res93[1]);
                    System.out.println("Resultat"+res93[0]);
                    Result.setText(res93[0]);
                    CarryOut.setText(res93[1]);
                    change(res93[0]);
                    affichage(res93[0]);
                    carry(res93[1]);
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
                    change(res92[0]);
                    affichage(res92[0]);
                    carry(res92[1]);
                    break;
                case 7:
                    String res9 = ET(OperandA,Complement(OperandB));
                    int res10 = Integer.parseInt(res9,2) -1;
                    String res34 = Integer.toBinaryString(res10);
                    System.out.println(res34);
                    String[] res91 = Test(res34);
                    System.out.println("Retenue "+res91[1]);
                    System.out.println("Resultat"+res91[0]);
                    Result.setText(res91[0]);
                    CarryOut.setText(res91[1]);
                    change(res91[0]);
                    affichage(res91[0]);
                    carry(res91[1]);
                    break;
                case 8:
                    String res12 = add(OperandA,res11);
                    System.out.println(res12);
                    String[] res90 = Test(res12);
                    System.out.println("Retenue "+res90[1]);
                    System.out.println("Resultat"+res90[0]);
                    Result.setText(res90[0]);
                    CarryOut.setText(res90[1]);
                    change(res90[0]);
                    affichage(res90[0]);
                    carry(res90[1]);
                    break;
                case 9:
                    String res14 = add(OperandA,OperandB);
                    String[] res89 = Test(res14);
                    System.out.println("Retenue "+res89[1]);
                    System.out.println("Resultat"+res89[0]);
                    Result.setText(res89[0]);
                    CarryOut.setText(res89[1]);
                    affichage(res89[0]);
                    change(res89[0]);
                    carry(res89[1]);
                    break;
                case 10:
                    String res17 = add(res16,res11);
                    System.out.println(res17);
                    String[] res88 = Test(res17);
                    System.out.println("Retenue "+res88[1]);
                    System.out.println("Resultat"+res88[0]);
                    Result.setText(res88[0]);
                    CarryOut.setText(res88[1]);
                    change(res88[0]);
                    affichage(res88[0]);
                    carry(res88[1]);
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
                    change(res87[0]);
                    affichage(res87[0]);
                    carry(res87[1]);
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
                    change(res86[0]);
                    carry(res86[1]);
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
                    change(res85[0]);
                    carry(res85[1]);
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
                    change(res84[0]);
                    carry(res84[1]);
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
                    change(res83[0]);
                    carry(res83[1]);
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
    public void carry(String res){
        if (res =="0"){
            lineCarryOut.setStroke(Color.RED);
            CarryOut.setStyle("-fx-background-color:red;-fx-font-size:15px;");

        }else {
            lineCarryOut.setStroke(Color.GREEN);
            CarryOut.setStyle("-fx-background-color:green;-fx-font-size:15px;");
        }
    }
    public  void change(String res){
        int res1=Integer.parseInt(res,2);
        switch (res1){
            case 0:
                RectF3.setStroke(Color.RED);
                RectF3.setFill(Color.RED);
                lineF31.setStroke(Color.RED);
                lineF32.setStroke(Color.RED);
                lineF33.setStroke(Color.RED);
                RectF1.setFill(Color.RED);
                line11.setStroke(Color.RED);
                line12.setStroke(Color.RED);
                line13.setStroke(Color.RED);
                RectF1.setStroke(Color.RED);
                RectF2.setFill(Color.RED);
                RectF2.setStroke(Color.RED);
                line21.setStroke(Color.RED);
                line22.setStroke(Color.RED);
                line23.setStroke(Color.RED);
                RectF0.setFill(Color.RED);
                RectF0.setStroke(Color.RED);
                line01.setStroke(Color.RED);
                line02.setStroke(Color.RED);
                line03.setStroke(Color.RED);
                break;
            case 1:
                RectF3.setStroke(Color.RED);
                RectF3.setFill(Color.RED);
                lineF31.setStroke(Color.RED);
                lineF32.setStroke(Color.RED);
                lineF33.setStroke(Color.RED);
                RectF1.setFill(Color.RED);
                line11.setStroke(Color.RED);
                line12.setStroke(Color.RED);
                line13.setStroke(Color.RED);
                RectF1.setStroke(Color.RED);
                RectF2.setFill(Color.RED);
                RectF2.setStroke(Color.RED);
                line21.setStroke(Color.RED);
                line22.setStroke(Color.RED);
                line23.setStroke(Color.RED);
                RectF0.setFill(Color.GREEN);
                RectF0.setStroke(Color.GREEN);
                line01.setStroke(Color.GREEN);
                line02.setStroke(Color.GREEN);
                line03.setStroke(Color.GREEN);
                break;
            case 2:
                RectF3.setStroke(Color.RED);
                RectF3.setFill(Color.RED);
                lineF31.setStroke(Color.RED);
                lineF32.setStroke(Color.RED);
                lineF33.setStroke(Color.RED);
                RectF1.setFill(Color.GREEN);
                line11.setStroke(Color.GREEN);
                line12.setStroke(Color.GREEN);
                line13.setStroke(Color.GREEN);
                RectF1.setStroke(Color.GREEN);
                RectF2.setFill(Color.RED);
                RectF2.setStroke(Color.RED);
                line21.setStroke(Color.RED);
                line22.setStroke(Color.RED);
                line23.setStroke(Color.RED);
                RectF0.setFill(Color.RED);
                RectF0.setStroke(Color.RED);
                line01.setStroke(Color.RED);
                line02.setStroke(Color.RED);
                line03.setStroke(Color.RED);
                break;
            case 3:
                RectF3.setStroke(Color.RED);
                RectF3.setFill(Color.RED);
                lineF31.setStroke(Color.RED);
                lineF32.setStroke(Color.RED);
                lineF33.setStroke(Color.RED);
                RectF1.setFill(Color.GREEN);
                line11.setStroke(Color.GREEN);
                line12.setStroke(Color.GREEN);
                line13.setStroke(Color.GREEN);
                RectF1.setStroke(Color.GREEN);
                RectF2.setFill(Color.RED);
                RectF2.setStroke(Color.RED);
                line21.setStroke(Color.RED);
                line22.setStroke(Color.RED);
                line23.setStroke(Color.RED);
                RectF0.setFill(Color.GREEN);
                RectF0.setStroke(Color.GREEN);
                line01.setStroke(Color.GREEN);
                line02.setStroke(Color.GREEN);
                line03.setStroke(Color.GREEN);
                break;
            case 4:
                RectF3.setStroke(Color.RED);
                RectF3.setFill(Color.RED);
                lineF31.setStroke(Color.RED);
                lineF32.setStroke(Color.RED);
                lineF33.setStroke(Color.RED);
                RectF1.setFill(Color.RED);
                line11.setStroke(Color.RED);
                line12.setStroke(Color.RED);
                line13.setStroke(Color.RED);
                RectF1.setStroke(Color.RED);
                RectF2.setFill(Color.GREEN);
                RectF2.setStroke(Color.GREEN);
                line21.setStroke(Color.GREEN);
                line22.setStroke(Color.GREEN);
                line23.setStroke(Color.GREEN);
                RectF0.setFill(Color.RED);
                RectF0.setStroke(Color.RED);
                line01.setStroke(Color.RED);
                line02.setStroke(Color.RED);
                line03.setStroke(Color.RED);
                break;
            case 5:
                RectF3.setStroke(Color.RED);
                RectF3.setFill(Color.RED);
                lineF31.setStroke(Color.RED);
                lineF32.setStroke(Color.RED);
                lineF33.setStroke(Color.RED);
                RectF1.setFill(Color.RED);
                line11.setStroke(Color.RED);
                line12.setStroke(Color.RED);
                line13.setStroke(Color.RED);
                RectF1.setStroke(Color.RED);
                RectF2.setFill(Color.GREEN);
                RectF2.setStroke(Color.GREEN);
                line21.setStroke(Color.GREEN);
                line22.setStroke(Color.GREEN);
                line23.setStroke(Color.GREEN);
                RectF0.setFill(Color.GREEN);
                RectF0.setStroke(Color.GREEN);
                line01.setStroke(Color.GREEN);
                line02.setStroke(Color.GREEN);
                line03.setStroke(Color.GREEN);
                break;
            case 6:
                RectF3.setStroke(Color.RED);
                RectF3.setFill(Color.RED);
                lineF31.setStroke(Color.RED);
                lineF32.setStroke(Color.RED);
                lineF33.setStroke(Color.RED);
                RectF1.setFill(Color.GREEN);
                line11.setStroke(Color.GREEN);
                line12.setStroke(Color.GREEN);
                line13.setStroke(Color.GREEN);
                RectF1.setStroke(Color.GREEN);
                RectF2.setFill(Color.GREEN);
                RectF2.setStroke(Color.GREEN);
                line21.setStroke(Color.GREEN);
                line22.setStroke(Color.GREEN);
                line23.setStroke(Color.GREEN);
                RectF0.setFill(Color.RED);
                RectF0.setStroke(Color.RED);
                line01.setStroke(Color.RED);
                line02.setStroke(Color.RED);
                line03.setStroke(Color.RED);
                break;
            case 7:
                RectF3.setStroke(Color.RED);
                RectF3.setFill(Color.RED);
                lineF31.setStroke(Color.RED);
                lineF32.setStroke(Color.RED);
                lineF33.setStroke(Color.RED);
                RectF1.setFill(Color.GREEN);
                line11.setStroke(Color.GREEN);
                line12.setStroke(Color.GREEN);
                line13.setStroke(Color.GREEN);
                RectF1.setStroke(Color.GREEN);
                RectF2.setFill(Color.GREEN);
                RectF2.setStroke(Color.GREEN);
                line21.setStroke(Color.GREEN);
                line22.setStroke(Color.GREEN);
                line23.setStroke(Color.GREEN);
                RectF0.setFill(Color.GREEN);
                RectF0.setStroke(Color.GREEN);
                line01.setStroke(Color.GREEN);
                line02.setStroke(Color.GREEN);
                line03.setStroke(Color.GREEN);
                break;
            case 8:
                RectF3.setStroke(Color.GREEN);
                RectF3.setFill(Color.GREEN);
                lineF31.setStroke(Color.GREEN);
                lineF32.setStroke(Color.GREEN);
                lineF33.setStroke(Color.GREEN);
                RectF1.setFill(Color.RED);
                line11.setStroke(Color.RED);
                line12.setStroke(Color.RED);
                line13.setStroke(Color.RED);
                RectF1.setStroke(Color.RED);
                RectF2.setFill(Color.RED);
                RectF2.setStroke(Color.RED);
                line21.setStroke(Color.RED);
                line22.setStroke(Color.RED);
                line23.setStroke(Color.RED);
                RectF0.setFill(Color.RED);
                RectF0.setStroke(Color.RED);
                line01.setStroke(Color.RED);
                line02.setStroke(Color.RED);
                line03.setStroke(Color.RED);
                break;
            case 9:
                RectF3.setStroke(Color.GREEN);
                RectF3.setFill(Color.GREEN);
                lineF31.setStroke(Color.GREEN);
                lineF32.setStroke(Color.GREEN);
                lineF33.setStroke(Color.GREEN);
                RectF1.setFill(Color.RED);
                line11.setStroke(Color.RED);
                line12.setStroke(Color.RED);
                line13.setStroke(Color.RED);
                RectF1.setStroke(Color.RED);
                RectF2.setFill(Color.RED);
                RectF2.setStroke(Color.RED);
                line21.setStroke(Color.RED);
                line22.setStroke(Color.RED);
                line23.setStroke(Color.RED);
                RectF0.setFill(Color.GREEN);
                RectF0.setStroke(Color.GREEN);
                line01.setStroke(Color.GREEN);
                line02.setStroke(Color.GREEN);
                line03.setStroke(Color.GREEN);
                break;
            case 10:
                RectF3.setStroke(Color.GREEN);
                RectF3.setFill(Color.GREEN);
                lineF31.setStroke(Color.GREEN);
                lineF32.setStroke(Color.GREEN);
                lineF33.setStroke(Color.GREEN);
                RectF1.setFill(Color.GREEN);
                line11.setStroke(Color.GREEN);
                line12.setStroke(Color.GREEN);
                line13.setStroke(Color.GREEN);
                RectF1.setStroke(Color.GREEN);
                RectF2.setFill(Color.RED);
                RectF2.setStroke(Color.RED);
                line21.setStroke(Color.RED);
                line22.setStroke(Color.RED);
                line23.setStroke(Color.RED);
                RectF0.setFill(Color.RED);
                RectF0.setStroke(Color.RED);
                line01.setStroke(Color.RED);
                line02.setStroke(Color.RED);
                line03.setStroke(Color.RED);
                break;
            case 11:
                RectF3.setStroke(Color.GREEN);
                RectF3.setFill(Color.GREEN);
                lineF31.setStroke(Color.GREEN);
                lineF32.setStroke(Color.GREEN);
                lineF33.setStroke(Color.GREEN);
                RectF1.setFill(Color.GREEN);
                line11.setStroke(Color.GREEN);
                line12.setStroke(Color.GREEN);
                line13.setStroke(Color.GREEN);
                RectF1.setStroke(Color.GREEN);
                RectF2.setFill(Color.RED);
                RectF2.setStroke(Color.RED);
                line21.setStroke(Color.RED);
                line22.setStroke(Color.RED);
                line23.setStroke(Color.RED);
                RectF0.setFill(Color.GREEN);
                RectF0.setStroke(Color.GREEN);
                line01.setStroke(Color.GREEN);
                line02.setStroke(Color.GREEN);
                line03.setStroke(Color.GREEN);
                break;
            case 12:
                RectF3.setStroke(Color.GREEN);
                RectF3.setFill(Color.GREEN);
                lineF31.setStroke(Color.GREEN);
                lineF32.setStroke(Color.GREEN);
                lineF33.setStroke(Color.GREEN);
                RectF1.setFill(Color.RED);
                line11.setStroke(Color.RED);
                line12.setStroke(Color.RED);
                line13.setStroke(Color.RED);
                RectF1.setStroke(Color.RED);
                RectF2.setFill(Color.GREEN);
                RectF2.setStroke(Color.GREEN);
                line21.setStroke(Color.GREEN);
                line22.setStroke(Color.GREEN);
                line23.setStroke(Color.GREEN);
                RectF0.setFill(Color.RED);
                RectF0.setStroke(Color.RED);
                line01.setStroke(Color.RED);
                line02.setStroke(Color.RED);
                line03.setStroke(Color.RED);
                break;
            case 13:
                RectF3.setStroke(Color.GREEN);
                RectF3.setFill(Color.GREEN);
                lineF31.setStroke(Color.GREEN);
                lineF32.setStroke(Color.GREEN);
                lineF33.setStroke(Color.GREEN);
                RectF1.setFill(Color.RED);
                line11.setStroke(Color.RED);
                line12.setStroke(Color.RED);
                line13.setStroke(Color.RED);
                RectF1.setStroke(Color.RED);
                RectF2.setFill(Color.GREEN);
                RectF2.setStroke(Color.GREEN);
                line21.setStroke(Color.GREEN);
                line22.setStroke(Color.GREEN);
                line23.setStroke(Color.GREEN);
                RectF0.setFill(Color.GREEN);
                RectF0.setStroke(Color.GREEN);
                line01.setStroke(Color.GREEN);
                line02.setStroke(Color.GREEN);
                line03.setStroke(Color.GREEN);
                break;
            case 14:
                RectF3.setStroke(Color.GREEN);
                RectF3.setFill(Color.GREEN);
                lineF31.setStroke(Color.GREEN);
                lineF32.setStroke(Color.GREEN);
                lineF33.setStroke(Color.GREEN);
                RectF1.setFill(Color.GREEN);
                line11.setStroke(Color.GREEN);
                line12.setStroke(Color.GREEN);
                line13.setStroke(Color.GREEN);
                RectF1.setStroke(Color.GREEN);
                RectF2.setFill(Color.GREEN);
                RectF2.setStroke(Color.GREEN);
                line21.setStroke(Color.GREEN);
                line22.setStroke(Color.GREEN);
                line23.setStroke(Color.GREEN);
                RectF0.setFill(Color.RED);
                RectF0.setStroke(Color.RED);
                line01.setStroke(Color.RED);
                line02.setStroke(Color.RED);
                line03.setStroke(Color.RED);
                break;
            case 15:
                RectF3.setStroke(Color.GREEN);
                RectF3.setFill(Color.GREEN);
                lineF31.setStroke(Color.GREEN);
                lineF32.setStroke(Color.GREEN);
                lineF33.setStroke(Color.GREEN);
                RectF1.setFill(Color.GREEN);
                line11.setStroke(Color.GREEN);
                line12.setStroke(Color.GREEN);
                line13.setStroke(Color.GREEN);
                RectF1.setStroke(Color.GREEN);
                RectF2.setFill(Color.GREEN);
                RectF2.setStroke(Color.GREEN);
                line21.setStroke(Color.GREEN);
                line22.setStroke(Color.GREEN);
                line23.setStroke(Color.GREEN);
                RectF0.setFill(Color.GREEN);
                RectF0.setStroke(Color.GREEN);
                line01.setStroke(Color.GREEN);
                line02.setStroke(Color.GREEN);
                line03.setStroke(Color.GREEN);
                break;


        }
        /*if (res.charAt(0)=='0' && res.charAt(1)=='0' && res.charAt(2)=='0' && res.charAt(3)=='0'){
            RectF3.setStroke(Color.RED);
            RectF3.setFill(Color.RED);
            lineF31.setStroke(Color.RED);
            lineF32.setStroke(Color.RED);
            lineF33.setStroke(Color.RED);
            RectF1.setFill(Color.RED);
            line11.setStroke(Color.RED);
            line12.setStroke(Color.RED);
            line13.setStroke(Color.RED);
            RectF1.setStroke(Color.RED);
            RectF2.setFill(Color.RED);
            RectF2.setStroke(Color.RED);
            line21.setStroke(Color.RED);
            line22.setStroke(Color.RED);
            line23.setStroke(Color.RED);
            RectF0.setFill(Color.RED);
            RectF0.setStroke(Color.RED);

            line01.setStroke(Color.RED);
            line02.setStroke(Color.RED);
            line03.setStroke(Color.RED);
        }
        else if(res.charAt(0)=='1' && res.charAt(1)=='1' && res.charAt(2)=='1' && res.charAt(3)=='1'  ){
            RectF3.setStroke(Color.GREEN);
            lineF31.setStroke(Color.GREEN);
            RectF3.setFill(Color.GREEN);
            lineF32.setStroke(Color.GREEN);
            lineF33.setStroke(Color.GREEN);
            RectF1.setFill(Color.GREEN);
            line11.setStroke(Color.GREEN);
            line12.setStroke(Color.GREEN);
            line13.setStroke(Color.GREEN);
            RectF1.setStroke(Color.GREEN);
            RectF2.setFill(Color.GREEN);
            RectF2.setStroke(Color.GREEN);
            line21.setStroke(Color.GREEN);
            line22.setStroke(Color.GREEN);
            line23.setStroke(Color.GREEN);
            RectF0.setFill(Color.GREEN);
            RectF0.setStroke(Color.GREEN);
            line01.setStroke(Color.GREEN);
            line02.setStroke(Color.GREEN);
            line03.setStroke(Color.GREEN);

        }
        /*
        else if(res.charAt(2)=='1'){
            RectF1.setFill(Color.GREEN);
            line11.setStroke(Color.GREEN);
            line12.setStroke(Color.GREEN);
            line13.setStroke(Color.GREEN);
            RectF1.setStroke(Color.GREEN);

        }/*
        else if(res.charAt(2)=='0'){
            RectF1.setFill(Color.RED);
            line11.setStroke(Color.RED);
            line12.setStroke(Color.RED);
            line13.setStroke(Color.RED);
            RectF1.setStroke(Color.RED);

        }*/
        /*else if(res.charAt(1)=='1'){
            RectF2.setFill(Color.GREEN);
            RectF2.setStroke(Color.GREEN);
            line21.setStroke(Color.GREEN);
            line22.setStroke(Color.GREEN);
            line23.setStroke(Color.GREEN);

        }
       /* else if(res.charAt(1)=='0'){
            RectF2.setFill(Color.RED);
            RectF2.setStroke(Color.RED);
            line21.setStroke(Color.RED);
            line22.setStroke(Color.RED);
            line23.setStroke(Color.RED);

        }*/
      /*  else if(res.charAt(3)=='1'){
            RectF0.setFill(Color.GREEN);
            RectF0.setStroke(Color.GREEN);
            line01.setStroke(Color.GREEN);
            line02.setStroke(Color.GREEN);
            line03.setStroke(Color.GREEN);

        }
        /*
        else if(res.charAt(3)=='0'){
            RectF3.setFill(Color.RED);
            RectF3.setStroke(Color.RED);
            line01.setStroke(Color.RED);
            line02.setStroke(Color.RED);
            line03.setStroke(Color.RED);

        }*/
    }
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
                    Rect3.setFill(Color.valueOf("#eeeeee"));
                    Rect4.setFill(Color.RED);
                    Rect5.setFill(Color.RED);
                    Rect6.setFill(Color.RED);
                    break;
                case 1:
                    Rect0.setFill(Color.valueOf("#eeeeee"));
                    Rect2.setFill(Color.valueOf("#eeeeee"));
                    Rect3.setFill(Color.valueOf("#eeeeee"));
                    Rect5.setFill(Color.valueOf("#eeeeee"));
                    Rect6.setFill(Color.valueOf("#eeeeee"));
                    Rect1.setFill(Color.RED);
                    Rect4.setFill(Color.RED);
                    break;
                case 2:
                    Rect0.setFill(Color.RED);
                    Rect1.setFill(Color.RED);
                    Rect3.setFill(Color.RED);
                    Rect5.setFill(Color.RED);
                    Rect6.setFill(Color.RED);
                    Rect2.setFill(Color.valueOf("#eeeeee"));
                    Rect4.setFill(Color.valueOf("#eeeeee"));
                    break;
                case 3:
                    Rect0.setFill(Color.RED);
                    Rect2.setFill(Color.valueOf("#eeeeee"));
                    Rect1.setFill(Color.RED);
                    Rect3.setFill(Color.RED);
                    Rect4.setFill(Color.RED);
                    Rect5.setFill(Color.valueOf("#eeeeee"));
                    Rect6.setFill(Color.RED);
                    break;
                case 4:
                    Rect2.setFill(Color.RED);
                    Rect1.setFill(Color.RED);
                    Rect3.setFill(Color.RED);
                    Rect4.setFill(Color.RED);
                    Rect0.setFill(Color.valueOf("#eeeeee"));
                    Rect5.setFill(Color.valueOf("#eeeeee"));
                    Rect6.setFill(Color.valueOf("#eeeeee"));
                    break;
                case 5:
                    Rect2.setFill(Color.RED);
                    Rect0.setFill(Color.RED);
                    Rect3.setFill(Color.RED);
                    Rect4.setFill(Color.RED);
                    Rect6.setFill(Color.RED);
                    Rect1.setFill(Color.valueOf("#eeeeee"));
                    Rect5.setFill(Color.valueOf("#eeeeee"));
                    break;
                case 6:
                    Rect2.setFill(Color.RED);
                    Rect0.setFill(Color.RED);
                    Rect3.setFill(Color.RED);
                    Rect4.setFill(Color.RED);
                    Rect5.setFill(Color.RED);
                    Rect6.setFill(Color.RED);
                    Rect1.setFill(Color.valueOf("#eeeeee"));
                    break;
                case 7:
                    Rect2.setFill(Color.RED);
                    Rect0.setFill(Color.RED);
                    Rect1.setFill(Color.RED);
                    Rect4.setFill(Color.RED);
                    Rect3.setFill(Color.valueOf("#eeeeee"));
                    Rect5.setFill(Color.valueOf("#eeeeee"));
                    Rect6.setFill(Color.valueOf("#eeeeee"));
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
                    Rect5.setFill(Color.valueOf("#eeeeee"));
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
                    Rect6.setFill(Color.valueOf("#eeeeee"));
                    break;
                case 11:
                    Rect0.setFill(Color.valueOf("#eeeeee"));
                    Rect1.setFill(Color.valueOf("#eeeeee"));
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
                    Rect1.setFill(Color.valueOf("#eeeeee"));
                    Rect3.setFill(Color.valueOf("#eeeeee"));
                    Rect4.setFill(Color.valueOf("#eeeeee"));
                    break;
                case 13:
                    Rect1.setFill(Color.RED);
                    Rect3.setFill(Color.RED);
                    Rect4.setFill(Color.RED);
                    Rect5.setFill(Color.RED);
                    Rect6.setFill(Color.RED);
                    Rect2.setFill(Color.valueOf("#eeeeee"));
                    Rect0.setFill(Color.valueOf("#eeeeee"));
                    break;
                case 14:
                    Rect2.setFill(Color.RED);
                    Rect3.setFill(Color.RED);
                    Rect5.setFill(Color.RED);
                    Rect6.setFill(Color.RED);
                    Rect1.setFill(Color.valueOf("#eeeeee"));
                    Rect0.setFill(Color.RED);
                    Rect4.setFill(Color.valueOf("#eeeeee"));
                    break;
                case 15:
                    Rect2.setFill(Color.RED);
                    Rect0.setFill(Color.RED);
                    Rect3.setFill(Color.RED);
                    Rect5.setFill(Color.RED);
                    Rect1.setFill(Color.valueOf("#eeeeee"));
                    Rect4.setFill(Color.valueOf("#eeeeee"));
                    Rect6.setFill(Color.valueOf("#eeeeee"));

                    break;
            }
    }

    @FXML
    private Button btn2;
    @FXML
    private MenuBar menuBar;
    @FXML private JFXToggleNode ToggleNodeS;
    @FXML private JFXToggleNode toggleNodeB;
    @FXML private Menu Exporter;
    @FXML private Rectangle Rectangle;
    @FXML private void modeSombre(){
        System.out.println("SOmbre");
       anchor.setStyle("-fx-background-color:#75807e;");
       Title.setStyle("-fx-Text:white");
       ToggleNodeS.setStyle("-fx-background-color: #2ba46c");
        toggleNodeB.setStyle("-fx-background-color: #2ba46c");
        ToggleNode.setStyle("-fx-background-color: #2ba46c");
        Daty.setStyle("-fx-text-fill:white");
        Ora.setStyle("-fx-text-fill:white");
        Exporter.setStyle("-fx-text-fill:white");
        Title.setStyle("-fx-text-fill:white;-fx-font-size:25px;-fx-font-family:Junicode");

        Rectangle.setFill(Color.web("#2ba46c"));
        Rectangle.setStroke(Color.web("#226847"));
        Rect0.setFill(Color.WHITE);
        Rect1.setFill(Color.WHITE);
        Rect2.setFill(Color.WHITE);
        Rect3.setFill(Color.WHITE);
        Rect4.setFill(Color.WHITE);
        Rect5.setFill(Color.WHITE);
        Rect6.setFill(Color.WHITE);
                //Title

    }
    @FXML private void modeClair(){

        Rectangle.setFill(Color.PINK);
        Rectangle.setStroke(Color.web("#cd6a7c"));
        anchor.setStyle("-fx-background-color:white;");
        Daty.setStyle("-fx-text-fill:black");
        Ora.setStyle("-fx-text-fill:black");
        Title.setStyle("-fx-text-fill:black;-fx-font-size:25px;-fx-font-family:Junicode");
        ToggleNodeS.setStyle("-fx-background-color: pink");
        toggleNodeB.setStyle("-fx-background-color: pink");
        ToggleNode.setStyle("-fx-background-color: pink");
        Rect0.setFill(Color.web("#e4dede"));
        Rect1.setFill(Color.web("#e4dede"));
        Rect2.setFill(Color.web("#e4dede"));
        Rect3.setFill(Color.web("#e4dede"));
        Rect4.setFill(Color.web("#e4dede"));
        Rect5.setFill(Color.web("#e4dede"));
        Rect6.setFill(Color.web("#e4dede"));
    }
    @FXML private MenuItem save;

    @FXML
    private JFXToggleNode ToggleNode;
    @FXML
    private void quitter(){
        String[] options = new String[2];
        options[0] = new String("OUI");
        options[1] = new String("NON");
       int res= JOptionPane.showOptionDialog(null,"Voulez-vous vraiment quitter?","Confirmation", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);

        if(res ==0){
            System.exit(0);
        }
    }
    @FXML
    private void handleButtonAction() throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        Parent root;
        stage = (Stage) Play.getScene().getWindow();
        System.out.println("hello");
        root = FXMLLoader.load(getClass().getResource("Aide.fxml"));
        System.out.println("wtf");
        Scene scene = new Scene(root);
        stage.setScene(scene);

        stage.show();
        /*aide.setOnAction(actionEvent -> {
            Stage stage;
            Parent root;
            try {
                stage = (Stage) aide.getItems();
                System.out.println("hello");
                root = FXMLLoader.load(getClass().getResource("Aide.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
            /*else
        {

            stage = (Stage) btn2.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();*/

    }
    @FXML private  Label Ora;
    @FXML private MenuItem quitter;
    @Override
    public void initialize(URL url,ResourceBundle rs) {
      //        ToggleNode.setStyle("-fx-background-color:pink;");
       CarryOut.setStyle("-fx-font-size:15px;-fx-text-fill:white");
        Daty.setText(daty.Day());
        Ora.setText(daty.Ora());
       save.setAccelerator(KeyCombination.keyCombination("shortcut +S"));
       quitter.setAccelerator(KeyCombination.keyCombination("shortcut +Q"));
            //Rect1.setFill(Color.RED);
//            Line.setStroke(Color.RED);
        // btn.setStyle("-fx-background-color: linear-gradient(to right,#00fffc,#fff600); -fx-background-radius: 25; -fx-border-radius: 25;");
        //btn.setStyle(" -fx-background-radius: 100; -fx-height:30px; -fx-width:30px; -fx-background-color:violet; ");
        //btn.setStyle("-fx-background-color:#dd0808;");
//        btn1.setStyle(" -fx-background-radius: 50%; -fx-height:30px; -fx-width:30px;-fx-background-color:blue; ");
    /* FadeTransition fadeTransition = new FadeTransition(Duration.seconds(0.8),Title);
        fadeTransition.setFromValue(1.0);
        fadeTransition.setToValue(0.0);
        fadeTransition.setCycleCount(Animation.INDEFINITE);
        fadeTransition.play();*/

        toggleButtonA0.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                if (toggleButtonA0.isSelected()) {
                    toggleButtonA0.setText("1");
                    lineA0.setStroke(Color.GREEN);
                    RectA0.setFill(Color.GREEN);
                    RectA0.setStroke(Color.GREEN);
                } else {
                    toggleButtonA0.setText("0");
                    lineA0.setStroke(Color.RED);
                    RectA0.setFill(Color.RED);
                    RectA0.setStroke(Color.RED);
                }
            }
        });
        toggleButtonA1.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                if (toggleButtonA1.isSelected()) {
                    toggleButtonA1.setText("1");
                    lineA1.setStroke(Color.GREEN);
                    RectA1.setFill(Color.GREEN);
                    RectA1.setStroke(Color.GREEN);

                } else {
                    toggleButtonA1.setText("0");
                    lineA1.setStroke(Color.RED);
                    RectA1.setFill(Color.RED);
                    RectA1.setStroke(Color.RED);
                }
            }
        });
        toggleButtonA2.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                if (toggleButtonA2.isSelected()) {
                    toggleButtonA2.setText("1");
                    lineA2.setStroke(Color.GREEN);
                    RectA2.setFill(Color.GREEN);
                    RectA2.setStroke(Color.GREEN);
                } else {
                    toggleButtonA2.setText("0");
                    lineA2.setStroke(Color.RED);
                    RectA2.setFill(Color.RED);
                    RectA2.setStroke(Color.RED);
                }
            }
        });
        toggleButtonA3.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                if (toggleButtonA3.isSelected()) {
                    toggleButtonA3.setText("1");
                    lineA3.setStroke(Color.GREEN);
                    RectA3.setFill(Color.GREEN);
                    RectA3.setStroke(Color.GREEN);
                } else {
                    toggleButtonA3.setText("0");
                    lineA3.setStroke(Color.RED);
                    RectA3.setFill(Color.RED);
                    RectA3.setStroke(Color.RED);
                }
            }
        });
        toggleButtonB0.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                if (toggleButtonB0.isSelected()) {
                    toggleButtonB0.setText("1");
                    lineB0.setStroke(Color.GREEN);
                    RectB0.setFill(Color.GREEN);
                    RectB0.setStroke(Color.GREEN);
                } else {
                    toggleButtonB0.setText("0");
                    lineB0.setStroke(Color.RED);
                    RectB0.setFill(Color.RED);
                    RectB0.setStroke(Color.RED);
                }
            }
        });

        toggleButtonB1.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                if (toggleButtonB1.isSelected()) {
                    toggleButtonB1.setText("1");
                    lineB1.setStroke(Color.GREEN);
                    RectB1.setFill(Color.GREEN);
                    RectB1.setStroke(Color.GREEN);
                } else {
                    toggleButtonB1.setText("0");
                    lineB1.setStroke(Color.RED);
                    RectB1.setFill(Color.RED);
                    RectB1.setStroke(Color.RED);
                }
            }
        });
        toggleButtonB2.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                if (toggleButtonB2.isSelected()) {
                    toggleButtonB2.setText("1");
                    lineB2.setStroke(Color.GREEN);
                    RectB2.setFill(Color.GREEN);
                    RectB2.setStroke(Color.GREEN);
                } else {
                    toggleButtonB2.setText("0");
                    lineB2.setStroke(Color.RED);
                    RectB2.setFill(Color.RED);
                    RectB2.setStroke(Color.RED);
                }
            }
        });
        toggleButtonB3.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                if (toggleButtonB3.isSelected()) {
                    toggleButtonB3.setText("1");
                    lineB3.setStroke(Color.GREEN);
                    RectB3.setFill(Color.GREEN);
                    RectB3.setStroke(Color.GREEN);
                } else {
                    toggleButtonB3.setText("0");
                    lineB3.setStroke(Color.RED);
                    RectB3.setFill(Color.RED);
                    RectB3.setStroke(Color.RED);
                }
            }
        });
        toggleButtonS0.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                if (toggleButtonS0.isSelected()) {
                    toggleButtonS0.setText("1");
                    lineS0.setStroke(Color.GREEN);
                    RectS0.setFill(Color.GREEN);
                    RectS0.setStroke(Color.GREEN);
                } else {
                    toggleButtonS0.setText("0");
                    lineS0.setStroke(Color.RED);
                    RectS0.setFill(Color.RED);
                    RectS0.setStroke(Color.RED);
                }
            }
        });
        toggleButtonS1.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                if (toggleButtonS1.isSelected()) {
                    toggleButtonS1.setText("1");
                    lineS1.setStroke(Color.GREEN);
                    RectS1.setFill(Color.GREEN);
                    RectS1.setStroke(Color.GREEN);
                } else {
                    toggleButtonS1.setText("0");
                    lineS1.setStroke(Color.RED);
                    RectS1.setFill(Color.RED);
                    RectS1.setStroke(Color.RED);

                }
            }
        });
        toggleButtonS2.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public
            void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                if (toggleButtonS2.isSelected()) {
                    toggleButtonS2.setText("1");
                    lineS2.setStroke(Color.GREEN);
                    RectS2.setFill(Color.GREEN);
                    RectS2.setStroke(Color.GREEN);
                } else {
                    toggleButtonS2.setText("0");
                    lineS2.setStroke(Color.RED);
                    RectS2.setFill(Color.RED);
                    RectS2.setStroke(Color.RED);
                }
            }
        });
        toggleButtonS3.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                if (toggleButtonS3.isSelected()) {
                    toggleButtonS3.setText("1");
                    lineS3.setStroke(Color.GREEN);
                    RectS3.setFill(Color.GREEN);
                    RectS3.setStroke(Color.GREEN);
                } else {
                    toggleButtonS3.setText("0");
                    lineS3.setStroke(Color.RED);
                    RectS3.setFill(Color.RED);
                    RectS3.setStroke(Color.RED);
                }
            }
        });


    }

}