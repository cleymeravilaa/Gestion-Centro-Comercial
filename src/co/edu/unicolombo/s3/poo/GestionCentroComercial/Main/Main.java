package co.edu.unicolombo.s3.poo.GestionCentroComercial.Main;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.GUI.VentanaLoggin;
/**
 *
 * @author CLEYMER
 */

public class Main {
    public static void main(String []args){
        System.out.println("Testing app");
        
        VentanaLoggin ventanaLoggin = new VentanaLoggin();
        ventanaLoggin.setTitle("SmartMall");
        ventanaLoggin.setVisible(true);
        ventanaLoggin.setLocationRelativeTo(null);
    }
}
