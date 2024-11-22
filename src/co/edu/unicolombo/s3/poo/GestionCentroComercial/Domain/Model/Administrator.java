
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model;

/**
 *
 * @author Daniel
 */
public class Administrator extends User{
    private String password;
    
    public Administrator() {
    }
    
    public Administrator(String name, String email,
            String password,
            int phone, String address
        ){
        super(name, phone, email, address);
    }
    
    //Metodos

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
