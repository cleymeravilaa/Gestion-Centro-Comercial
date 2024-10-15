
package co.edu.unicolombo.s3.poo.GestionCentroComercial.models;

/**
 *
 * @author CLEYMER
 */
public class ParkingFee {
    private int id;
    private static int idCount;
    private double amountPerHours;
    private String vehicleType;
    
    public ParkingFee(){
        id = ++ParkingFee.idCount;
    }
    
    public ParkingFee(double amountPerHours, String vehicleType){
        this();
        this.amountPerHours = amountPerHours;
        this.vehicleType = vehicleType;
    }

    public int getId() {
        return id;
    }


    public double getAmountPerHours() {
        return amountPerHours;
    }

    public void setAmountPerHours(double amountPerHours) {
        this.amountPerHours = amountPerHours;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    
    
}
