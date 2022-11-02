package org.rodrigodiaz.modelo;

/**
 *
 * @author rodro
 */
public class Usuario {
    private int idUsuario;
    private String usuario;
    private String contraseña;
    private boolean rol;
/**
 * 
 * @param idUsuario
 * @param usuario
 * @param contraseña
 * @param rol 
 */
    public Usuario(int idUsuario, String usuario, String contraseña, boolean rol) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.rol = rol;
    }
    
    public Usuario(){
        
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean getRol() {
        return rol;
    }

    public void setRol(boolean rol) {
        this.rol = rol;
    }
    
    
    
}
