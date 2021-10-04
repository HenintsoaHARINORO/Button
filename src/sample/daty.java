package sample;

import java.text.SimpleDateFormat;
import java.util.Date;

public class daty {
    public static void main(String[] args) {
        Date daty = new Date();
        //System.out.println(daty);
        String DateDuJour = "Nous sommes le ";
        String strDate = daty.toString();
        String jour[] = {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"};
        String jourAnglais[] = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        String J = strDate.substring(0, 3);
        for (int i = 0; i < jourAnglais.length; i++) {
            if (J.equals(jourAnglais[i])) {
                DateDuJour = DateDuJour + jour[i] + " ";
                break;
            }
        }
        String Hour=strDate.substring(11,19);
        //System.out.println(DateDuJour);
        String D = strDate.substring(8, 10);
        DateDuJour = DateDuJour + D + " ";
        String M = strDate.substring(4, 7);
       // System.out.println(M);
        String mois[] = {"Janvier", "Fevrier", "Mars", "Avril", "Mai", "Juin", "Juillet", "Aout", "Septembre", "Octobre", "Novembre", "Decembre"};
        String moisAnglais[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        for (int i = 0; i < moisAnglais.length; i++) {
            if (M.equals(moisAnglais[i])) {
                DateDuJour = DateDuJour + mois[i] + " ";
                break;
            }
        }

        String A = strDate.substring(strDate.length() - 4);
        DateDuJour = DateDuJour + A +"  "+",  " +Hour;
        System.out.println(DateDuJour);
        SimpleDateFormat formater = new SimpleDateFormat("'Soutenu le' EEEE dd MMMM 'a' HH:mm:ss");
        //System.out.println(formater.format(daty));
    }
    public  static String Day(){
        Date daty = new Date();
        //System.out.println(daty);
        String DateDuJour = " ";
        String strDate = daty.toString();
        String jour[] = {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"};
        String jourAnglais[] = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        String J = strDate.substring(0, 3);
        for (int i = 0; i < jourAnglais.length; i++) {
            if (J.equals(jourAnglais[i])) {
                DateDuJour = DateDuJour + jour[i] + " ";
                break;
            }
        }
        String Hour=strDate.substring(11,19);
        //System.out.println(DateDuJour);
        String D = strDate.substring(8, 10);
        DateDuJour = DateDuJour + D + " ";
        String M = strDate.substring(4, 7);
        String mois[] = {"Janvier", "Fevrier", "Mars", "Avril", "Mai", "Juin", "Juillet", "Aout", "Septembre", "Octobre", "Novembre", "Decembre"};
        String moisAnglais[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        for (int i = 0; i < moisAnglais.length; i++) {
            if (M.equals(moisAnglais[i])) {
                DateDuJour = DateDuJour + mois[i] + " ";
                break;
            }
        }

        String A = strDate.substring(strDate.length() - 4);
        DateDuJour = DateDuJour + A ;
        System.out.println(DateDuJour);
        return  DateDuJour;
    }
    public  static String Ora(){
        Date daty = new Date();
        //System.out.println(daty);
        String DateDuJour = " ";
        String strDate = daty.toString();
        String jour[] = {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"};
        String jourAnglais[] = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        String J = strDate.substring(0, 3);
        for (int i = 0; i < jourAnglais.length; i++) {
            if (J.equals(jourAnglais[i])) {
                DateDuJour = DateDuJour + jour[i] + " ";
                break;
            }
        }
        String Hour=strDate.substring(11,16);
        //System.out.println(DateDuJour);
        String D = strDate.substring(8, 10);
        DateDuJour = DateDuJour + D + " ";
        String M = strDate.substring(4, 7);
        String mois[] = {"Janvier", "Fevrier", "Mars", "Avril", "Mai", "Juin", "Juillet", "Aout", "Septembre", "Octobre", "Novembre", "Decembre"};
        String moisAnglais[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        for (int i = 0; i < moisAnglais.length; i++) {
            if (M.equals(moisAnglais[i])) {
                DateDuJour = DateDuJour + mois[i] + " ";
                break;
            }
        }

        String A = strDate.substring(strDate.length() - 4);
        DateDuJour = DateDuJour + A ;
        System.out.println(DateDuJour);
        return  Hour;
    }
}
