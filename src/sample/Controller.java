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

        if(M1==1) {
            switch (intSelectionS) {
                case 0:
                    System.out.println(Complement(OperandA));
                    Result.setText(Complement(OperandA));
                    break;
                case 1:
                    System.out.println(Complement(OU(OperandA, OperandB)));
                    Result.setText(Complement(OU(OperandA, OperandB)));
                    break;
                case 2:
                    String res = Complement(OperandA);
                    //System.out.println(res);
                    System.out.println(ET(res, OperandB));
                    Result.setText(ET(res, OperandB));
                    break;
                case 3:
                    System.out.println(0);
                    Result.setText("0");
                    break;
                case 4:
                    System.out.println(Complement(ET(OperandA, OperandB)));
                    Result.setText(Complement(ET(OperandA, OperandB)));
                    break;
                case 5:
                    System.out.println(Complement(OperandB));
                    Result.setText(Complement(OperandB));
                    break;
                case 6:
                    System.out.println(XOR(OperandA, OperandB));
                    Result.setText(XOR(OperandA, OperandB));
                    break;
                case 7:
                    System.out.println(ET(OperandA, Complement(OperandB)));
                    Result.setText(ET(OperandA, Complement(OperandB)));
                    break;
                case 8:
                    System.out.println(OU(Complement(OperandA), OperandB));
                    Result.setText(OU(Complement(OperandA), OperandB));
                    break;
                case 9:
                    System.out.println(Complement(XOR(OperandA, OperandB)));
                    Result.setText(Complement(XOR(OperandA, OperandB)));
                    break;
                case 10:
                    System.out.println(OperandB);
                    Result.setText(OperandB);
                    break;
                case 11:
                    System.out.println(ET(OperandA, OperandB));
                    Result.setText(ET(OperandA, OperandB));
                    break;
                case 12:
                    System.out.println(1);
                    Result.setText("1");
                    break;
                case 13:
                    System.out.println(OU(OperandA, Complement(OperandB)));
                    Result.setText(OU(OperandA, Complement(OperandB)));
                    break;
                case 14:
                    System.out.println(OU(OperandA, OperandB));
                    Result.setText(OU(OperandA, OperandB));
                    break;
                case 15:
                    System.out.println(OperandA);
                    Result.setText(OperandA);
                    break;


            }
        }
        if((M1==0) && (Cn==1)){
            switch (intSelectionS) {
                case 0:
                    String res31 = Integer.toBinaryString(A+1);
                    System.out.println(res31);
                    break;
                case 1:
                    int res32 = Integer.parseInt(res26,2) +1;
                    String res33 = Integer.toBinaryString(res32);
                    System.out.println(res33);
                    break;
                case 2:
                    int res34 = Integer.parseInt(res16,2) +1;
                    String res35 = Integer.toBinaryString(res34);
                    System.out.println(res35);
                    break;
                case 3:
                    System.out.println("0");
                    break;
                case 4:
                    String res= ADD(OperandA,ET(OperandA,Complement(OperandB)));
                    int res36 = Integer.parseInt(res,2)+1;
                    String res37 = Integer.toBinaryString(res36);
                    System.out.println(res37);
                    String res38 =Res(res37);
                    String Retenue6 = CarryOut(res37);
                    System.out.println("Resultat: "+res38);
                    System.out.println("Retenue: "+Retenue6);
                    break;
                case 5:
                    String res2 = OU(OperandA,OperandB);
                    //String res3 = ET(operandA,Complement(operandB));
                    String res4 = ADD(res2,res3);
                    int res52 = Integer.parseInt(res4,2)+1;
                    String res39 = Integer.toBinaryString(res52);
                    System.out.println(res39);
                    String res5 = Res(res39);
                    String REtenue1 = CarryOut(res39);
                    System.out.println("Resultat: "+res5);
                    System.out.println("Retenue: "+REtenue1);

                    break;
                case 6:
                    String res6 =subtract(OperandA ,OperandB);
                    int Res1=Integer.parseInt(res6,2);
                    int Res2= Res1 - 1;
                    String res7 = Integer.toBinaryString(Res2);
                    String res8 = Bits(res7);
                    System.out.println(res8);
                    break;
                case 7:
                    String res9 = ET(OperandA,Complement(OperandB));

                    System.out.println(res9);
                    break;
                case 8:
                    String res12 = add(OperandA,res11);
                    int res40= Integer.parseInt(res12,2)+1;
                    String res41 = Integer.toBinaryString(res40);
                    System.out.println(res41);
                    String res13 = Res(res41);
                    String REtenue2 = CarryOut(res41);
                    System.out.println("Resultat: "+res13);
                    System.out.println("Retenue: "+REtenue2);
                    break;
                case 9:
                    String res14 = add(OperandA,OperandB);
                    int res42 = Integer.parseInt(res14,2)+1;
                    String res43 = Integer.toBinaryString(res42);
                    System.out.println(res43);
                    String res15 = Res(res43);
                    String REtenue3 = CarryOut(res43);
                    System.out.println("Resultat: "+res15);
                    System.out.println("Retenue: "+REtenue3);
                    break;
                case 10:
                    String res17 = add(res16,res11);
                    int res44 = Integer.parseInt(res17,2)+1;
                    String res45 = Integer.toBinaryString(res44);
                    System.out.println(res45);

                    String res18 = Res(res45);
                    String REtenue4 = CarryOut(res45);
                    System.out.println("Resultat: "+res18);
                    System.out.println("Retenue: "+REtenue4);
                    break;
                case 11:
                    System.out.println(res11);
                    break;
                case 12:
                    String res24 = ADD(OperandA,OperandA);
                    int res46 = Integer.parseInt(res24,2)+1;
                    String res47 = Integer.toBinaryString(res46);
                    System.out.println(res47);
                    break;
                case 13:
                    String res25 = ADD(res26,OperandA);
                    int res48 = Integer.parseInt(res25,2)+1;
                    String res49 = Integer.toBinaryString(res48);
                    System.out.println(res49);
                    String res61 = Res(res49);
                    String REtenue6 = CarryOut(res49);
                    System.out.println("Resultat: "+res61);
                    System.out.println("Retenue: "+REtenue6);
                    break;
                case 14:
                    String res27 = ADD(res16,OperandA);
                    int res50 = Integer.parseInt(res27,2)+1;
                    String res51 = Integer.toBinaryString(res50);

                    System.out.println(res51);
                    String res30 = Res(res51);
                    String REtenue5 = CarryOut(res51);
                    System.out.println("Resultat: "+res30);
                    System.out.println("Retenue: "+REtenue5);
                    break;
                case 15:

                    System.out.println(OperandA);
                    break;

            }
        }
        if((M1==0) && (Cn==0)){
            switch (intSelectionS) {
                case 0:
                    System.out.println(OperandA);
                    break;
                case 1:
                    System.out.println(res26);
                    break;
                case 2:
                    //String res = Complement(operandA);
                    //System.out.println(res);
                    System.out.println(res16);
                    break;
                case 3:
                    System.out.println("-1");
                    break;
                case 4:
                    String res= ADD(OperandA,ET(OperandA,Complement(OperandB)));
                    String res1 =Res(res);
                    String retenue = CarryOut(res);
                    System.out.println("Resultat: "+res1);
                    System.out.println("Retenue: "+retenue);
                    break;
                case 5:
                    String res2 = OU(OperandA,OperandB);

                    String res4 = ADD(res2,res3);
                    String res5 = Res(res4);
                    String REtenue1 = CarryOut(res4);
                    System.out.println("Resultat: "+res5);
                    System.out.println("Retenue: "+REtenue1);

                    break;
                case 6:
                    String res6 =subtract(OperandA ,OperandB);


                    System.out.println(res6);
                    break;
                case 7:
                    String res9 = ET(OperandA,Complement(OperandB));
                    int Res3 =Integer.parseInt(res9 , 2);
                    String res10 = Integer.toBinaryString(Res3 -1);
                    System.out.println(Bits(res10));
                    break;
                case 8:
                    String res12 = add(OperandA,res11);
                    System.out.println(res12);
                    String res13 = Res(res12);
                    String REtenue2 = CarryOut(res12);
                    System.out.println("Resultat: "+res13);
                    System.out.println("Retenue: "+REtenue2);
                    break;
                case 9:
                    String res14 = add(OperandA,OperandB);
                    String res15 = Res(res14);
                    String REtenue3 = CarryOut(res14);
                    System.out.println("Resultat: "+res15);
                    System.out.println("Retenue: "+REtenue3);
                    break;
                case 10:
                    String res17 = add(res16,res11);
                    System.out.println(res17);
                    String res18 = Res(res17);
                    String REtenue4 = CarryOut(res17);
                    System.out.println("Resultat: "+res18);
                    System.out.println("Retenue: "+REtenue4);
                    break;
                case 11:
                    int res19 = Integer.parseInt(res11,2);
                    int res20 = res19 - 1;
                    String res21 = Integer.toBinaryString(res20);
                    System.out.println(Bits(res21));
                    break;
                case 12:
                    int res22 = A <<1;
                    String res23 = Integer.toBinaryString(res22);
                    String res24 = ADD(OperandA,res23);
                    System.out.println(res24);
                    break;
                case 13:
                    String res25 = ADD(res26,OperandA);
                    System.out.println(res25);
                    String res31 = Res(res25);
                    String REtenue6 = CarryOut(res25);
                    System.out.println("Resultat: "+res31);
                    System.out.println("Retenue: "+REtenue6);
                    break;
                case 14:
                    String res27 = ADD(res16,OperandA);
                    System.out.println(res27);
                    String res30 = Res(res27);
                    String REtenue5 = CarryOut(res27);
                    System.out.println("Resultat: "+res30);
                    System.out.println("Retenue: "+REtenue5);
                    break;
                case 15:
                    int res28 =A -1 ;
                    String res29 = Integer.toBinaryString(res28);
                    System.out.println(res29);
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
        int sum = a1-b1;
        return Integer.toBinaryString(sum);
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

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // btn.setStyle("-fx-background-color: linear-gradient(to right,#00fffc,#fff600); -fx-background-radius: 25; -fx-border-radius: 25;");
        //btn.setStyle(" -fx-background-radius: 100; -fx-height:30px; -fx-width:30px; -fx-background-color:violet; ");
        //btn.setStyle("-fx-background-color:#dd0808;");
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