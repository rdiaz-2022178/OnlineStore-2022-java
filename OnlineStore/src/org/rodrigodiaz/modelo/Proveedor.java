package org.rodrigodiaz.modelo;

/**
 *
 * @author rodro
 */
public class Proveedor {
    
    private int idProveedor;
    private String proveedor;
    private boolean estadoActivo;
/**
 * 
 * @param idProveedor
 * @param proveedor
 * @param estadoActivo 
 */
    public Proveedor(int idProveedor, String proveedor, boolean estadoActivo) {
        this.idProveedor = idProveedor;
        this.proveedor = proveedor;
        this.estadoActivo = estadoActivo;
    }
    
    public Proveedor(){
        
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public boolean getEstadoActivo() {
        return estadoActivo;
    }

    public void setEstadoActivo(boolean estadoActivo) {
        this.estadoActivo = estadoActivo;
    }
    
    
}
