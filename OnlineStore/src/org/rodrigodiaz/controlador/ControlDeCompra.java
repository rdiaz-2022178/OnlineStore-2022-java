/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.rodrigodiaz.controlador;

import org.rodrigodiaz.db.Conexion;
import org.rodrigodiaz.modelo.Compra;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author rodro
 */
public class ControlDeCompra {
    /**
     * metodo para agregar compras a la db
     * @param compra 
     */
       public void agregarCompra(Compra compra){
        try {
            PreparedStatement sentencia =   Conexion.getInstancia().getConexion().prepareCall("call sp_agregarCompra(?,?,?);");
            sentencia.setString(1, compra.getFechaEntrega());
            sentencia.setString(2,compra.getNit());
            sentencia.setDouble(3, compra.getPrecioTotal());

            sentencia.execute();
            JOptionPane.showMessageDialog(null, "A enviado un registro a la base de datos");
        } catch (Exception error) {
            error.printStackTrace();
        }
    }
    
}
