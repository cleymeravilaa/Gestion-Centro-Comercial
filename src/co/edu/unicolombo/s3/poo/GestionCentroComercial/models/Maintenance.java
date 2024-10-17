package co.edu.unicolombo.s3.poo.GestionCentroComercial.models;

import java.util.Date;
/**
 *
 * @author CLEYMER
 */

public class Maintenance {
    private int idMaintenance;
    private static int idCounts;
    private String type;
    private Date scheduledDate;
    private Shop shop;
    private double costAmount;
    
    
    public Maintenance(){
        idMaintenance = ++Maintenance.idCounts;
    }
    
    public Maintenance(String type, Date scheduledDate, Shop shop, double costAmount){
        this();
        this.type = type;
        this.scheduledDate = scheduledDate;
        this.shop = shop;
        this.costAmount = costAmount; 
    }

    public int getIdMaintenance() {
        return idMaintenance;
    }

    public void setIdMaintenance(int idMaintenance) {
        this.idMaintenance = idMaintenance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getScheduledDate() {
        return scheduledDate;
    }

    public void setScheduledDate(Date scheduledDate) {
        this.scheduledDate = scheduledDate;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public double getCostAmount() {
        return costAmount;
    }

    public void setCostAmount(double costAmount) {
        this.costAmount = costAmount;
    }
    
    
}
