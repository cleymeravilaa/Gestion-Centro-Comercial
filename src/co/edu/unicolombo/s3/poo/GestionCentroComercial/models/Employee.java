
package co.edu.unicolombo.s3.poo.GestionCentroComercial.models;

/**
 *
 * @author CLEYMER
 */
class Employee {
    private int id;
    private static int idCouts = 0;
    private String name;
    private String email;
    private String position;
    private double salary;
    
    public Employee(String name, String email, String position, double salary){
        this.name = name;
        this.email = email;
        this.position = position;
        this.salary = salary;
        this.id = ++Employee.idCouts;
    }

    
    // Metodos Getter y Setters
    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
}
