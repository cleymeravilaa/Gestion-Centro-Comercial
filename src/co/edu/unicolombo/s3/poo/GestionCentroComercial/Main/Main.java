package co.edu.unicolombo.s3.poo.GestionCentroComercial.Main;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.GUI.PrincipalAdminVentana;

/**
 *
 * @author CLEYMER
 */
public class Main {
    public static void main(String []args){
        System.out.println("Testing the app");
        
        PrincipalAdminVentana principalAdminVentana = new PrincipalAdminVentana();
        principalAdminVentana.setTitle("Ventana Principal de administración");
        principalAdminVentana.setVisible(true);
        principalAdminVentana.setLocationRelativeTo(null);
    }
}
