
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
    
    public Administrator(int id, String name, String email,
            String username, String password,
            String phone, String address
        ){
        super(id, name, email, phone, address);
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
