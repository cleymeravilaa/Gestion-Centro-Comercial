
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model;

/**
 *
 * @author Daniel
 */
public class User {
    protected int id;
    protected static int countsId;
    protected String name;
    protected int phone;
    protected String email;
    protected String address;
    
    
    public User() {
    }

    public User(String name, int phone, String email, String address) {
        this.id = ++User.countsId;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }
    
    //Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone(){
        return phone;
    }
    
    public void setPhone(int phone){
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
