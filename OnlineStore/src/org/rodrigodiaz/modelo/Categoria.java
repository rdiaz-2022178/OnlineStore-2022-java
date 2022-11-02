
package org.rodrigodiaz.modelo;

/**
 *
 * @author rodro
 */
public class Categoria {
    
    private int idCategoria;
    private String categoria;
    private boolean estadoActivo;
/**
 * 
 * @param idCategoria
 * @param categoria
 * @param estadoActivo 
 */
    public Categoria(int idCategoria, String categoria, boolean estadoActivo) {
        this.idCategoria = idCategoria;
        this.categoria = categoria;
        this.estadoActivo = estadoActivo;
    }
    
    public Categoria(){
        
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean getEstadoActivo() {
        return estadoActivo;
    }

    public void setEstadoActivo(boolean estadoActivo) {
        this.estadoActivo = estadoActivo;
    }
    
    
}
