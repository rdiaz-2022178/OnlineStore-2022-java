package org.rodrigodiaz.modelo;

/**
 *
 * @author rodro
 */
public class Marca {
    private int idMarca;
    private String marca;
/**
 * 
 * @param idMarca
 * @param marca 
 */
    public Marca(int idMarca, String marca) {
        this.idMarca = idMarca;
        this.marca = marca;
    }
    
    public Marca(){
        
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    
}
