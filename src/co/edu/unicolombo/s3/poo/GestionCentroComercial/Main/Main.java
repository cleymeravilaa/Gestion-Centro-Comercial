package co.edu.unicolombo.s3.poo.GestionCentroComercial.Main;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.GUI.VentanaLoggin;
import java.awt.Dimension;

/**
 *
 * @author CLEYMER
 */
public class Main {
    public static void main(String []args){
        System.out.println("Testing the app");
        
        VentanaLoggin VentanaLoggin = new VentanaLoggin();
        VentanaLoggin.setTitle("SmartMall");
        VentanaLoggin.setVisible(true);
        VentanaLoggin.setLocationRelativeTo(null);
        VentanaLoggin.setMinimumSize(new Dimension(700, 480));
        VentanaLoggin.setMaximumSize(new Dimension(700, 480));
    }
}
