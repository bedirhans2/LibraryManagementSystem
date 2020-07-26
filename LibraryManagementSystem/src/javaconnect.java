/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bedirhan
 */
import java.sql.*;//sql library
import javax.swing.JOptionPane;//message box library
public class javaconnect {
    Connection conn;
    public static Connection ConnecrDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Bedirhan\\Documents\\NetBeansProjects\\LibraryManagementSystem\\lms.sqlite");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        return null;
        }
    }
    
}
