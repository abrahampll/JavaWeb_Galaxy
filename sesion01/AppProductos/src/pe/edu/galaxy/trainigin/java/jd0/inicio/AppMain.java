/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.galaxy.trainigin.java.jd0.inicio;

import pe.edu.galaxy.trainigin.java.jd0.presentacion.FrmProducto;

/**
 *
 * @author ARISTEDES
 */
public class AppMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProducto().setVisible(true);
            }
        });
        */
        FrmProducto frmProducto= new FrmProducto();
        frmProducto.setVisible(true);
    }
    
}
