/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDatos;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.*;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author cesar
 */
public class Conexion {
    
    private final String base ="seguridad";
    private final String user ="root";
    private final String password ="abelbustamante24";
    private final String url = "jdbc:mysql://localhost:3306/"+base;
    private Connection con = null;
    
    
   public Connection getConexion(){
       
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                con =(Connection) DriverManager.getConnection(url,user,password);
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
       
       
   
   
   }
    
}
