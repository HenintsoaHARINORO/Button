package sample;

import java.io.*;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

import com.mysql.cj.result.Row;
import javafx.scene.control.Cell;
import org.apache.poi.hssf.model.Sheet;
import org.apache.poi.hssf.model.Workbook;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;


public class   Save {

    public static void Save1() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/GestionConcours", "root", "henintsoa123");
            PreparedStatement psmnt = null;
            Statement st = connection.createStatement();
              ResultSet rs = st.executeQuery("Select * from ALU");
            HSSFWorkbook wb = new HSSFWorkbook();
            HSSFSheet sheet = wb.createSheet("Excel Sheet");
            HSSFRow rowhead = sheet.createRow((short) 0);
            rowhead.createCell((short) 0).setCellValue("id");
            rowhead.createCell((short) 1).setCellValue("Date");
            rowhead.createCell((short) 2).setCellValue("OperandeA");
            rowhead.createCell((short) 3).setCellValue("OperandeB");
            rowhead.createCell((short) 4).setCellValue("Selection");
            rowhead.createCell((short) 5).setCellValue("M");
            rowhead.createCell((short) 6).setCellValue("Cn");
            rowhead.createCell((short) 7).setCellValue("Resultat");
            rowhead.createCell((short) 8).setCellValue("Carryout");

            int index = 1;

            while (rs.next()) {

                HSSFRow row = sheet.createRow((short) index);
                row.createCell((short) 0).setCellValue(rs.getInt(1));
                row.createCell((short) 1).setCellValue(rs.getString(2));
                row.createCell((short) 2).setCellValue(rs.getString(3));
                row.createCell((short) 3).setCellValue(rs.getString(4));
                row.createCell((short) 4).setCellValue(rs.getString(5));
                row.createCell((short) 5).setCellValue(rs.getString(6));
                row.createCell((short) 6).setCellValue(rs.getString(7));
                row.createCell((short) 7).setCellValue(rs.getString(8));
                row.createCell((short) 8).setCellValue(rs.getString(9));
                index++;

            }
            File file = new File("save.xls");
            FileOutputStream fileOut = null;
            fileOut = new FileOutputStream(file);
            wb.write(fileOut);
            fileOut.close();
            System.out.println("Data is saved in excel file.");
            rs.close();
            connection.close();
        } catch (Exception e) {
        }
    }



}
