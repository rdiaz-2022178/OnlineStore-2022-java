/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.rodrigodiaz.controlador;

import org.rodrigodiaz.modelo.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.rodrigodiaz.db.Conexion;

/**
 *
 * @author rodro
 */
public class ControlDeCliente {
    private static ArrayList<Cliente> clientes;
    private static ControlDeCliente instancia = null;
        /**
     * Declaramos los arrays 
     */
    public ControlDeCliente(){
        clientes = new ArrayList<Cliente>();
        mostrarCliente();
    }
        /**
     * verificamos si la instancia esta creada
     * @return instancia
     */
    public static ControlDeCliente getInstancia(){
        if (instancia == null) {
            instancia = new ControlDeCliente();
        }
        return  instancia;
    }
        /**
     * declaramos un metodo donde veremos la cantidad del elementos
     * @return la cantidad del elementos de array
     */
        public int cantidadDeClientes(){
        return clientes.size();
    }
        /**
     * hacemos un metodo donde inicializamos el array
     * @return retornamos la variable dl array
     */
    public ArrayList<Cliente> listaDeClientes(){
        return clientes;
    }
    
    
    
            
        /**
         * metodo para mostrar los datos 
         */
        public void mostrarCliente(){
            try {
                PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_verCLiente();");
                ResultSet resultado = sentencia.executeQuery();
                while (resultado.next()) {                    
                    Cliente cliente = new Cliente();
                    cliente.setIdCliente(resultado.getInt(1));
                    cliente.setNombreCliente(resultado.getString(2));
                    cliente.setApellidoCliente(resultado.getString(3));
                    cliente.setTelefonoCLietne(resultado.getString(4));
                    cliente.setEmailCliente(resultado.getString(5));
                    cliente.setDireccionCLiente(resultado.getString(6));
                    cliente.setIdDepartamentoCliente(resultado.getInt(7));
                    cliente.setDpiCLiente(resultado.getString(8));
                    cliente.setEstadoActivo(resultado.getBoolean(9));
                    cliente.setUsuario(resultado.getString(10));
                    cliente.setContraseña(resultado.getString(11));
                    cliente.setRol(resultado.getBoolean(12));
                    clientes.add(cliente);
                }
          
            } catch (Exception e) {
                e.printStackTrace();
            }
      
        }

            /**
         * metodo para agregar datos a la DB
         * @param cliente 
         */
    public boolean iniciarSesionCliente2(Cliente cliente){
               try {
                Cliente clienteDB = new Cliente();
                PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_iniciarSesionC2(?,?);");
                sentencia.setString(1, cliente.getUsuario());
                sentencia.setString(2, cliente.getContraseña());
                ResultSet resultado = sentencia.executeQuery();
                if (resultado.next()) {
                    clienteDB.setUsuario(resultado.getNString(1));
                    clienteDB.setContraseña(resultado.getNString(2));
                    if (cliente.getUsuario().equals(clienteDB.getUsuario()) && String.valueOf(clienteDB.getContraseña()).equals(cliente.getContraseña())) {
                        return true;
                        
                    }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
        
    }
           /**
        * metodo para buscar por id en l DB
        * @param cliente
        * @return objeto de la clase
        */
        public boolean iniciarSesionAdmin2(Cliente cliente){
               try {
                Cliente clienteDB = new Cliente();
                PreparedStatement sentencia = Conexion.getInstancia().getConexion().prepareCall("call sp_iniciarSesionA2(?,?);");
                sentencia.setString(1, cliente.getUsuario());
                sentencia.setString(2, cliente.getContraseña());
                ResultSet resultado = sentencia.executeQuery();
                if (resultado.next()) {
                    clienteDB.setUsuario(resultado.getNString(1));
                    clienteDB.setContraseña(resultado.getNString(2));
                    if (cliente.getUsuario().equals(clienteDB.getUsuario()) && String.valueOf(clienteDB.getContraseña()).equals(cliente.getContraseña())) {
                        return true;
                        
                    }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
        
    }
        
       public void agregarCliente(Cliente cliente){
        try {
            PreparedStatement sentencia =   Conexion.getInstancia().getConexion().prepareCall("call sp_agregarCliente(?,?,?,?,?,?,?,?,?,?,?);");
            sentencia.setString(1, cliente.getNombreCliente());
            sentencia.setString(2,cliente.getApellidoCliente());
            sentencia.setString(3, cliente.getTelefonoCLietne());
            sentencia.setString(4, cliente.getEmailCliente());
            sentencia.setString(5, cliente.getDireccionCLiente());
            sentencia.setInt(6, cliente.getIdDepartamentoCliente());
            sentencia.setString(7, cliente.getDpiCLiente());
            sentencia.setBoolean(8, cliente.getEstadoActivo());
            sentencia.setString(9, cliente.getUsuario());
            sentencia.setString(10, cliente.getContraseña());
            sentencia.setBoolean(11, cliente.getRol());
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "A enviado un registro a la base de datos");
        } catch (Exception error) {
            error.printStackTrace();
        }
    }
    
}

