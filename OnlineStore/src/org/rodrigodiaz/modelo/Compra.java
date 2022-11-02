/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.rodrigodiaz.modelo;

/**
 *
 * @author rodro
 */
public class Compra {
    
    private String fechaEntrega;
    private String nit;
    private double precioTotal;
/**
 * 
 * @param fechaEntrega
 * @param nit
 * @param precioTotal 
 */
    public Compra(String fechaEntrega, String nit, double precioTotal) {
        this.fechaEntrega = fechaEntrega;
        this.nit = nit;
        this.precioTotal = precioTotal;
    }
    
    public Compra(){
        
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
    
    
}
