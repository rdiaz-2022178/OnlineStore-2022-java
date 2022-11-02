package org.rodrigodiaz.controlador;

import java.util.ArrayList;
import org.rodrigodiaz.modelo.Producto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import org.rodrigodiaz.db.Conexion;

/**
 *
 * @author rodro
 */
public class ControlDeProducto {
    private static ArrayList<Producto> productos;
    private static ControlDeProducto instancia = null;
        /**
     * Declaramos los arrays 
     */
    public ControlDeProducto(){
        productos = new ArrayList<Producto>();
        mostrarProducto();
    }
        /**
     * verificamos si la instancia esta creada
     * @return instancia
     */
    public static ControlDeProducto getInstancia(){
        if (instancia == null) {
            instancia = new ControlDeProducto();
        }
        return  instancia;
    }
        /**
     * declaramos un metodo donde veremos la cantidad del elementos
     * @return la cantidad del elementos de array
     */
        public int cantidadDeProducto(){
        return productos.size();
    }
        /**
     * hacemos un metodo donde inicializamos el array
     * @return retornamos la variable dl array
     */
    public ArrayList<Producto> listaDeProductos(){
        return productos;
    }
    
    
                /**
         * metodo para mostrar los datos 
         */
        public void mostrarProducto(){
            try {
                PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_verProducto();");
                ResultSet resultado = sentencia.executeQuery();
                while (resultado.next()) {                    
                    Producto producto = new Producto();
                    producto.setIdProducto(resultado.getInt(1));
                    producto.setNombreProducto(resultado.getString(2));
                    producto.setIdProveedorProducto(resultado.getInt(3));
                    producto.setIdCategoriaProducto(resultado.getInt(4));
                    producto.setModelo(resultado.getString(5));
                    producto.setIdMarcaProducto(resultado.getInt(6));
                    producto.setPrecioProducto(resultado.getDouble(7));
                    
                    productos.add(producto);
                }
          
            } catch (Exception e) {
                e.printStackTrace();
            }
      
        }
                /**
         * metodo para agregar datos a la DB
         * @param producto 
         */
       public void agregarProducto(Producto producto){
        try {
            PreparedStatement sentencia =   Conexion.getInstancia().getConexion().prepareCall("call sp_agregarProducto(?,?,?,?,?,?);");
            sentencia.setString(1, producto.getNombreProducto());
            sentencia.setInt(2,producto.getIdProveedorProducto());
            sentencia.setInt(3, producto.getIdCategoriaProducto());
            sentencia.setString(4, producto.getModelo());
            sentencia.setInt(5, producto.getIdMarcaProducto());
            sentencia.setDouble(6, producto.getPrecioProducto());

            sentencia.execute();
            JOptionPane.showMessageDialog(null, "A enviado un registro a la base de datos");
        } catch (Exception error) {
            error.printStackTrace();
        }
    }
              /**
        * metodo para buscar por id en l DB
        * @param producto
        * @return objeto de la clase
        */
    public Producto buscarProducto(Producto producto){
        try{
        PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_buscarProducto(?);");
        sentencia.setInt(1, producto.getIdProducto());        
        ResultSet resultado = sentencia.executeQuery();
        if(resultado.next()==true){
            producto.setNombreProducto(resultado.getNString(2));
            producto.setIdProveedorProducto(resultado.getInt(3));
            producto.setIdCategoriaProducto(resultado.getInt(4));
            producto.setModelo(resultado.getNString(5));
            producto.setIdMarcaProducto(resultado.getInt(6));
            producto.setPrecioProducto(resultado.getDouble(7));
        } else            
            producto = null;
        } catch(Exception error){
            error.printStackTrace();
        }
        return producto;
    }
            /**
         * Metodo para actualizar los elementos
         * @param producto 
         */
           public void actualizarProducto(Producto producto){
           try {
               PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_actualizarCliente(?,?,?,?,?,?,?);");
                sentencia.setInt(1, producto.getIdProducto());
                sentencia.setString(2, producto.getNombreProducto());
                sentencia.setInt(3, producto.getIdProveedorProducto());
                sentencia.setInt(4, producto.getIdCategoriaProducto());
                sentencia.setString(5, producto.getModelo());
                sentencia.setInt(6, producto.getIdMarcaProducto());
                sentencia.setDouble(7, producto.getPrecioProducto());
                sentencia.execute();
                JOptionPane.showMessageDialog(null, "Se ha actualizado el elemento");
           } catch (Exception e) {
           }          
       }
                     /**
            * metodo para eliminar de la db
            * @param producto 
            */ 
       public void eliminarProducto(Producto producto){
           try {
               PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_eliminarProducto(?);");
                sentencia.setInt(1, producto.getIdProducto());
                sentencia.execute();
                JOptionPane.showMessageDialog(null, "Se ha eliminado el elemento");
           } catch (Exception e) {
           }
       }
    
}
