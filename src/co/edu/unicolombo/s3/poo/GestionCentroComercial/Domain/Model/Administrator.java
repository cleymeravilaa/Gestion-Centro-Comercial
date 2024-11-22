
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model;

/**
 *
 * @author Daniel
 */
public class Administrator extends User{
    private String username;
    private String password;
    
    public Administrator() {
    }
    
    public Administrator(String name, String email,
            String username, String password,
            int phone, String address
        ){
        super(name, phone, email, address);
    }
    
    //Metodos

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
