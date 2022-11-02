package org.rodrigodiaz.modelo;

/**
 *
 * @author rodro
 */
public class Cliente {
    
    private int idCliente;
    private String nombreCliente;
    private String apellidoCliente;
    private String telefonoCLietne;
    private String emailCliente;
    private String direccionCLiente;
    private int idDepartamentoCliente;
    private String dpiCLiente;
    private String usuario;
    private String contraseña;
    private boolean rol;
    private boolean estadoActivo;
/**
 * 
 * @param idCliente
 * @param nombreCliente
 * @param apellidoCliente
 * @param telefonoCLietne
 * @param emailCliente
 * @param direccionCLiente
 * @param idDepartamentoCliente
 * @param dpiCLiente
 * @param usuario
 * @param contraseña
 * @param rol
 * @param estadoActivo 
 */
    public Cliente(int idCliente, String nombreCliente, String apellidoCliente, String telefonoCLietne, String emailCliente, String direccionCLiente, int idDepartamentoCliente, String dpiCLiente, String usuario, String contraseña, boolean rol, boolean estadoActivo) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.telefonoCLietne = telefonoCLietne;
        this.emailCliente = emailCliente;
        this.direccionCLiente = direccionCLiente;
        this.idDepartamentoCliente = idDepartamentoCliente;
        this.dpiCLiente = dpiCLiente;
        this.estadoActivo = estadoActivo;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.rol = rol;
    }
    
    public Cliente(){
        
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getTelefonoCLietne() {
        return telefonoCLietne;
    }

    public void setTelefonoCLietne(String telefonoCLietne) {
        this.telefonoCLietne = telefonoCLietne;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getDireccionCLiente() {
        return direccionCLiente;
    }

    public void setDireccionCLiente(String direccionCLiente) {
        this.direccionCLiente = direccionCLiente;
    }

    public int getIdDepartamentoCliente() {
        return idDepartamentoCliente;
    }

    public void setIdDepartamentoCliente(int idDepartamentoCliente) {
        this.idDepartamentoCliente = idDepartamentoCliente;
    }

    public String getDpiCLiente() {
        return dpiCLiente;
    }

    public void setDpiCLiente(String dpiCLiente) {
        this.dpiCLiente = dpiCLiente;
    }
    
    public String getUsuario(){
        return usuario;
    }
    
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    
    public String getContraseña(){
        return contraseña;
    }
    
    public void setContraseña(String contraseña){
        this.contraseña = contraseña;
    }
    
    public boolean getRol(){
        return rol;
    }
    
    public void setRol(boolean rol){
        this.rol = rol;
    }

    public boolean getEstadoActivo() {
        return estadoActivo;
    }

    public void setEstadoActivo(boolean estadoActivo) {
        this.estadoActivo = estadoActivo;
    }
    
    
    
}
