package org.rodrigodiaz.controlador;

import java.math.BigDecimal;
import java.util.ArrayList;
import org.rodrigodiaz.db.Conexion;
import org.rodrigodiaz.modelo.Categoria;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author rodro
 */
public class ControlDeCategoria {
    private static ArrayList<Categoria> categorias;
    private static ControlDeCategoria instancia = null;
    
    /**
     * Declaramos los arrays 
     */
    public ControlDeCategoria(){
        categorias = new ArrayList<Categoria>();
        mostrarCategoria();
    }
    /**
     * verificamos si la instancia esta creada
     * @return instancia
     */
    public static ControlDeCategoria getInstancia(){
        if (instancia == null) {
            instancia = new ControlDeCategoria();
        }
        return  instancia;
    }
    /**
     * declaramos un metodo donde veremos la cantidad del elementos
     * @return la cantidad del elementos de array
     */
        public int cantidadDeCategorias(){
        return categorias.size();
    }
    /**
     * hacemos un metodo donde inicializamos el array
     * @return retornamos la variable dl array
     */
    public ArrayList<Categoria> listaDeCategorias(){
        return categorias;
    }
    
    
        /**
         * metodo para mostrar los datos 
         */
        public void mostrarCategoria(){
            try {
                PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_verCategoria();");
                ResultSet resultado = sentencia.executeQuery();
                while (resultado.next()) {                    
                    Categoria cate = new Categoria();
                    cate.setIdCategoria(resultado.getInt(1));
                    cate.setCategoria(resultado.getString(2));
                    cate.setEstadoActivo(resultado.getBoolean(3));
                    categorias.add(cate);
                }
          
            } catch (Exception e) {
                e.printStackTrace();
            }
      
        }
        
        /**
         * metodo para agregar datos a la DB
         * @param cate 
         */
       public void agregarCategoria(Categoria cate){
        try {
            PreparedStatement sentencia =   Conexion.getInstancia().getConexion().prepareCall("call sp_agregarCategoria(?,?);");
            sentencia.setString(1, cate.getCategoria());
            sentencia.setBoolean(2, cate.getEstadoActivo());

            sentencia.execute();
            JOptionPane.showMessageDialog(null, "A enviado un registro a la base de datos");
        } catch (Exception error) {
            error.printStackTrace();
        }
    }
       /**
        * metodo para buscar por id en l DB
        * @param cate
        * @return objeto de la clase
        */
    public Categoria buscarMarca(Categoria cate){
        try{
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_buscarCategoria(?);");
        sentencia.setInt(1, cate.getIdCategoria());        
        ResultSet resultado = sentencia.executeQuery();
        if(resultado.next()==true){
            cate.setCategoria(resultado.getNString(2));
            cate.setEstadoActivo(resultado.getBoolean(3));

        } else            
            cate = null;
        } catch(Exception error){
            error.printStackTrace();
        }
        return cate;
    }
        /**
         * Metodo para actualizar los elementos
         * @param cate 
         */
           public void actualizarCategoria(Categoria cate){
           try {
               PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_actualizarCategoria(?,?, ?);");
                sentencia.setInt(1, cate.getIdCategoria());
                sentencia.setString(2, cate.getCategoria());
                sentencia.setBoolean(3, cate.getEstadoActivo());

                sentencia.execute();
                JOptionPane.showMessageDialog(null, "Se ha actualizado el elemento");
           } catch (Exception e) {
           }          
       }
           /**
            * metodo para eliminar de la db
            * @param cate 
            */
           public void eliminarCategoria(Categoria cate){
           try {
               PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_ocultarCategoria(?);");
                sentencia.setInt(1, cate.getIdCategoria());
                sentencia.execute();
                JOptionPane.showMessageDialog(null, "Se ha eliminado el elemento");
           } catch (Exception e) {
           }          
       }
           

       

    
    

    
}
