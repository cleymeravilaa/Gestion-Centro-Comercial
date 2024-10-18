
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
            String phone, String address
        ){
        super(name, email, phone, address);
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

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
