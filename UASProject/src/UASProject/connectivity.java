/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UASProject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author ANNISA INTAN NURAINI
 */
public class connectivity {
    Connection connect;
    
    public static Connection connected(){
        try{
            //load connector database driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //connect to database
            String dbLocation = "jdbc:mysql://localhost:3306/employee";
            Connection connect = DriverManager.getConnection(dbLocation, "root", "");
            return connect;
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
