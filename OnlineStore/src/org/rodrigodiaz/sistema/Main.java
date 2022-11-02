package org.rodrigodiaz.sistema;

import org.rodrigodiaz.vista.VentanaLoginStore;

/**
 *
 * @author rodro
 */
public class Main {
    /**
     * Metodo main donde iniciamos el programa
     * @param args 
     */
    public static void main(String[] args) {
        VentanaLoginStore miVentana = new VentanaLoginStore();
       
        miVentana.setVisible(true);
    }
    
}
