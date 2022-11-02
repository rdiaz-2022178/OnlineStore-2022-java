
package org.rodrigodiaz.modelo;

/**
 *
 * @author rodro
 */
public class Producto {
    
    private int idProducto;
    private String nombreProducto;
    private int idProveedorProducto;
    private int idCategoriaProducto;
    private String modelo;
    private int idMarcaProducto;
    private double precioProducto;
/**
 * 
 * @param idProducto
 * @param nombreProducto
 * @param idProveedorProducto
 * @param idCategoriaProducto
 * @param modelo
 * @param idMarcaProducto
 * @param precioProducto 
 */
    public Producto(int idProducto, String nombreProducto, int idProveedorProducto, int idCategoriaProducto, String modelo, int idMarcaProducto, double precioProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.idProveedorProducto = idProveedorProducto;
        this.idCategoriaProducto = idCategoriaProducto;
        this.modelo = modelo;
        this.idMarcaProducto = idMarcaProducto;
        this.precioProducto = precioProducto;
    }
    
    public Producto(){
        
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getIdProveedorProducto() {
        return idProveedorProducto;
    }

    public void setIdProveedorProducto(int idProveedorProducto) {
        this.idProveedorProducto = idProveedorProducto;
    }

    public int getIdCategoriaProducto() {
        return idCategoriaProducto;
    }

    public void setIdCategoriaProducto(int idCategoriaProducto) {
        this.idCategoriaProducto = idCategoriaProducto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getIdMarcaProducto() {
        return idMarcaProducto;
    }

    public void setIdMarcaProducto(int idMarcaProducto) {
        this.idMarcaProducto = idMarcaProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }
    
    
}
