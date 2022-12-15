package a2_1901040112;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DbConn {
    
    Connection conn = null;
    
    public static Connection ConnectDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:database.sqlite3");
            System.out.println("connected");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}
