/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDatos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
/**
 *
 * @author cesar
 */
public class sqlUsuarios extends Conexion{

    
    public boolean registrar(usuarios usr){
        
        PreparedStatement ps = null;
        
        Connection con = (Connection) getConexion();
        
        String sql ="INSERT INTO usuarios (Usuario,password,nombre,correo,IDTipo) VALUES (?,?,?,?,?)";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            ps.setString(2, usr.getPassword());
            ps.setString(3, usr.getNombre());
            ps.setString(4, usr.getCorreo());
            ps.setInt(5, usr.getId_tipo());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(sqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    public int UsuarioExistente(String usr){
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        Connection con = (Connection) getConexion();
        
        String sql ="SELECT count(idUSUARIOS) FROM usuarios WHERE Usuario=?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,usr);
            rs=ps.executeQuery();
            if(rs.next()){
                
                return rs.getInt(1);
            
            }
            return 1;
            
        } catch (SQLException ex) {
            Logger.getLogger(sqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }
        
    }
    
    public boolean Login(usuarios usr){
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        Connection con = (Connection) getConexion();
        
        String sql ="SELECT idUSUARIOS,Usuario,password,IDTipo FROM usuarios where Usuario=?"  ;
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,usr.getUsuario());
            rs=ps.executeQuery();
            if(rs.next()){
                
                if(usr.getPassword().equals(rs.getString(3))){
                
                    usr.setId(rs.getInt(1));
                    usr.setNombre(rs.getString(2));
                    usr.setId_tipo(rs.getInt(4));
                    return true;
                }else{
                
                    return false;
                }
                
            
            }
            return false;
            
        } catch (SQLException ex) {
            Logger.getLogger(sqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    
    
}
