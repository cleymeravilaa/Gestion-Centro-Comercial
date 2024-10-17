
package co.edu.unicolombo.s3.poo.GestionCentroComercial.models;

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
        id = ++User.countsId;
    }

    public User(String name, String email, String phone, String address) {
        this();
        this.id = id;
        this.name = name;
        this.email = email;
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
