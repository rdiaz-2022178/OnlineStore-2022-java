package org.rodrigodiaz.controlador;

import org.rodrigodiaz.modelo.Usuario;
import java.sql.PreparedStatement;
import org.rodrigodiaz.db.Conexion;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author rodro
 */
public class ControlDeUsuario {
    
    public boolean iniciarSesionCliente(Usuario usuario){
               try {
                Usuario usuarioDB = new Usuario();
                PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_iniciarSesionCliente(?,?);");
                sentencia.setString(1, usuario.getUsuario());
                sentencia.setString(2, usuario.getContraseña());
                ResultSet resultado = sentencia.executeQuery();
                if (resultado.next()) {
                    usuarioDB.setUsuario(resultado.getNString(1));
                    usuarioDB.setContraseña(resultado.getNString(2));
                    if (usuario.getUsuario().equals(usuarioDB.getUsuario()) && String.valueOf(usuarioDB.getContraseña()).equals(usuario.getContraseña())) {
                        return true;
                        
                    }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
        
    }
    
    
    public boolean iniciarSesionAdmin(Usuario usuario){
               try {
                Usuario usuarioDB = new Usuario();
                PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_iniciarSesionAdmin(?,?);");
                sentencia.setString(1, usuario.getUsuario());
                sentencia.setString(2, usuario.getContraseña());
                ResultSet resultado = sentencia.executeQuery();
                if (resultado.next()) {
                    usuarioDB.setUsuario(resultado.getNString(1));
                    usuarioDB.setContraseña(resultado.getNString(2));
                    if (usuario.getUsuario().equals(usuarioDB.getUsuario()) && String.valueOf(usuarioDB.getContraseña()).equals(usuario.getContraseña())) {
                        return true;
                        
                    }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
        
    }
    
        public void agregarUsuario(Usuario usuario){
        try {
            PreparedStatement sentencia =   Conexion.getInstancia().getConexion().prepareCall("call sp_agregarUsuario(?,?,?);");
            sentencia.setString(1, usuario.getUsuario());
            sentencia.setString(2,usuario.getContraseña());
            sentencia.setBoolean(3, usuario.getRol());
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "A enviado un registro a la base de datos");
        } catch (Exception error) {
            error.printStackTrace();
        }
    }
    
}
