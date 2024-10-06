
package co.edu.unicolombo.s3.poo.GestionCentroComercial.models;

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
    private ArrayList<ParkingLot> parkingLots;
    private ArrayList<Shop> shops;
    private ArrayList<Employee> employees;
    
    
    // Constructor 
    public ShoppingCenter(String name, String address){
        this.name = name;
        this.address = address;
        parkingLots  = new ArrayList<ParkingLot>();
        shops = new ArrayList<Shop>();
        employees = new ArrayList<Employee>();
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
    
    public ArrayList<ParkingLot> getParkingLots(){
        return parkingLots;
    }
    
    public ArrayList<Employee> getEmployees(){
        return employees;
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
    
    // Metodo Agregar Parqueadero
    public void addParkingLot(ParkingLot parkingLot){
        parkingLots.add(parkingLot);
    }
    
    // Metodo eliminar Parqueadero
    public void removeParkinglot(ParkingLot parkinglot){
        parkingLots.remove(parkinglot);
    }
    
    // Agregar Local
    public void addShop(Shop shop){
        shops.add(shop);
    }
    
    // Eliminar Local 
    public void removeShop(Shop shop){
        shops.remove(shop);
    }
    
    // Agregar empleado
    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    
    public void removeEmployee(Employee employee){
        employees.remove(employee);
    }
}
