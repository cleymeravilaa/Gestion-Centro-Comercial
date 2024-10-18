
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model;

import java.util.ArrayList;

/**
 *
 * @author CLEYMER
 */
public class ShoppingCenter {
    private String openingTime = "6:00 AM";
    private String closingTime = "10:00 PM";
    private String name;
    private String address;
    private ParkingLot parkingLot;
    private ArrayList<Shop> shops;
    
    
    // Constructor 
    public ShoppingCenter(String name, String address, ParkingLot parkingLot){
        this.name = name;
        this.address = address;
        this.parkingLot = parkingLot;
        shops = new ArrayList<Shop>();
    }
    
    // Metodos Getters para obtener 
    public String getOpeningTime(){
        return openingTime;
    }
    
    public String getClosingTime(){
        return closingTime;
    }
    
    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public ArrayList<Shop> getShops(){
        return shops;
    }
    
    
    
    // Metodo setter para establecer
    public void setOpeningTime(String openingTime){
        this.openingTime = openingTime;
    }
    
    public void setClosingTime(String closingTime){
        this.closingTime = closingTime;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    // Agregar Local
    public void addShop(Shop shop){
        shops.add(shop);
    }
    
    // Eliminar Local 
    public void removeShop(Shop shop){
        shops.remove(shop);
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }
}
