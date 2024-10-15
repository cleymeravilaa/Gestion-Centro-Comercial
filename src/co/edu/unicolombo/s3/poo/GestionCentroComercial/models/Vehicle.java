package co.edu.unicolombo.s3.poo.GestionCentroComercial.models;



import java.util.Date;
/**
 *
 * @author CLEYMER
 */
public class Vehicle {
    private String licensePlate;
    private String type;
    private String ownerName;
    private String description;
    private Date entryTime;
    private Date departureTime;
    
    public Vehicle(String licensePlate, String type, String ownerName
    , String description){
        this.licensePlate = licensePlate;
        this.type = type;
        this.ownerName = ownerName;
        this.description = description;
        entryTime = new Date();
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }
    
    
}
