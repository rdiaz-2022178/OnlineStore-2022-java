package org.rodrigodiaz.controlador;

import java.util.ArrayList;
import org.rodrigodiaz.db.Conexion;
import org.rodrigodiaz.modelo.Marca;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author rodro
 */
public class ControlDeMarca {
    private static ArrayList<Marca> marcas;
    private static ControlDeMarca instancia = null;
      /**
     * Declaramos los arrays 
     */
    public ControlDeMarca(){
        marcas = new ArrayList<Marca>();
        mostrarMarca();
    }
        /**
     * verificamos si la instancia esta creada
     * @return instancia
     */
    public static ControlDeMarca getInstancia(){
        if (instancia == null) {
            instancia = new ControlDeMarca();
        }
        return  instancia;
    }
        /**
     * declaramos un metodo donde veremos la cantidad del elementos
     * @return la cantidad del elementos de array
     */
        public int cantidadDeMarcas(){
        return marcas.size();
    }
        /**
     * hacemos un metodo donde inicializamos el array
     * @return retornamos la variable dl array
     */
    public ArrayList<Marca> listaDeMarcas(){
        return marcas;
    }
    
    
                /**
         * metodo para mostrar los datos 
         */
        public void mostrarMarca(){
            try {
                PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_verMarcas();");
                ResultSet resultado = sentencia.executeQuery();
                while (resultado.next()) {                    
                    Marca marca = new Marca();
                    marca.setIdMarca(resultado.getInt(1));
                    marca.setMarca(resultado.getString(2));
                    marcas.add(marca);
                }
          
            } catch (Exception e) {
                e.printStackTrace();
            }
      
        }
                /**
         * metodo para agregar datos a la DB
         * @param marca 
         */
       public void agregarMarca(Marca marca){
        try {
            PreparedStatement sentencia =   Conexion.getInstancia().getConexion().prepareCall("call sp_agregarMarca(?);");
            sentencia.setString(1, marca.getMarca());

            sentencia.execute();
            JOptionPane.showMessageDialog(null, "A enviado un registro a la base de datos");
        } catch (Exception error) {
            error.printStackTrace();
        }
    }
              /**
        * metodo para buscar por id en l DB
        * @param marca
        * @return objeto de la clase
        */
    public Marca buscarMarca(Marca marca){
        try{
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_buscarMarca(?);");
        sentencia.setInt(1, marca.getIdMarca());        
        ResultSet resultado = sentencia.executeQuery();
        if(resultado.next()==true){
            marca.setMarca(resultado.getNString(2));

        } else            
            marca = null;
        } catch(Exception error){
            error.printStackTrace();
        }
        return marca;
    }
            /**
         * Metodo para actualizar los elementos
         * @param marca 
         */
           public void actualizarMarca(Marca marca){
           try {
               PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_actualizarMarca(?,?);");
                sentencia.setInt(1, marca.getIdMarca());
                sentencia.setString(2, marca.getMarca());

                sentencia.execute();
                JOptionPane.showMessageDialog(null, "Se ha actualizado el elemento");
           } catch (Exception e) {
           }          
       }
                     /**
            * metodo para eliminar de la db
            * @param marca 
            */ 
       public void eliminarMarca(Marca marca){
           try {
               PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_eliminarMarca(?);");
                sentencia.setInt(1, marca.getIdMarca());
                sentencia.execute();
                JOptionPane.showMessageDialog(null, "Se ha eliminado el elemento");
           } catch (Exception e) {
           }
       }
    
}
