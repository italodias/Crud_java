package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoDAO {
   public Connection conectaDB(){
       Connection conn = null;
       
       try {
           String url = "jdbc:mysql://localhost/bancoteste?user=root&password=";
           conn = DriverManager.getConnection(url);
           
       } catch (SQLException erro) {
           JOptionPane.showMessageDialog(null, "ConexaoDAO" + erro.getMessage());
       }
       return conn;
   } 
    
}
