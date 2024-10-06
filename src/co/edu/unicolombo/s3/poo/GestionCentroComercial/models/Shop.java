
package co.edu.unicolombo.s3.poo.GestionCentroComercial.models;

/**
 *
 * @author CLEYMER
 */
public class Shop {
    private int id;
    private static int idCouts = 0;
    private String name;
    private String category;
    private double area;
    private String location;
    private double rentPrice;
    private String status; // Arrendado, Libre
    
    
    public Shop(String name, String category, double area, String location,
            double rentPrice, String status){
        this.id = ++Shop.idCouts;
        this.name = name;
        this.category = category;
        this.area = area;
        this.location = location;
        this.rentPrice = rentPrice;
        this.status = status;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(double rentPrice) {
        this.rentPrice = rentPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
