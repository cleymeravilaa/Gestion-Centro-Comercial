
package co.edu.unicolombo.s3.poo.GestionCentroComercial.models;

import java.util.ArrayList;

/**
 *
 * @author CLEYMER
 */
class ParkingLot {
    private String location;
    private int totalCapacity;
    private ArrayList<Cubicle> cubicles;
    private ArrayList<ParkingFee> parkingFees;
    
    
    public ParkingLot(String location, int totalCapacity){
        this.location = location;
        this.totalCapacity = totalCapacity;
        this.cubicles = new ArrayList<Cubicle>(totalCapacity);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(int totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public ArrayList<Cubicle> getCubicles() {
        return cubicles;
    }

    public void setCubicles(ArrayList<Cubicle> cubicles) {
        this.cubicles = cubicles;
    }

    public ArrayList<ParkingFee> getParkingFees() {
        return parkingFees;
    }

    public void setParkingFees(ArrayList<ParkingFee> parkingFees) {
        this.parkingFees = parkingFees;
    }
    
}
