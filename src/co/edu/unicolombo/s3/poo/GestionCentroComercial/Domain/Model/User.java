
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model;

/**
 *
 * @author Daniel
 */
public class User {
    protected int id;
    protected static int countsId;
    protected String name;
    protected String phone;
    protected String email;
    protected String address;
    
    
    public User() {
        id = ++User.countsId;
    }

    public User(int id, String name, String phone, String email, String address) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }
    
    //Getters y Setters

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone(){
        return phone;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
}
