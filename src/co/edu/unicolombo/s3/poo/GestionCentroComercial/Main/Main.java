package co.edu.unicolombo.s3.poo.GestionCentroComercial.Main;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.GUI.PrincipalAdminVentana;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.GUI.VentanaLoggin;
import java.awt.Dimension;
/**
 *
 * @author CLEYMER
 */
public class Main {
    public static void main(String []args){
        System.out.println("Testing the app");
        
//        VentanaLoggin ventanaLoggin = new VentanaLoggin();
//        ventanaLoggin.setTitle("SmartMall");
//        ventanaLoggin.setVisible(true);
//        ventanaLoggin.setLocationRelativeTo(null);
//        ventanaLoggin.setMinimumSize(new Dimension(700, 480));
//        ventanaLoggin.setMaximumSize(new Dimension(700, 480));
//        ventanaLoggin.setResizable(false);

        PrincipalAdminVentana ventana = new PrincipalAdminVentana();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);

          
    }
}
