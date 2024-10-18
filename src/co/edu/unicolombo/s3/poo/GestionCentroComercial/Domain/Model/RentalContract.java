
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model;

/**
 *
 * @author CLEYMER
 */

import java.util.*;

public class RentalContract {
    private int idContract;
    private static int countsId;
    private Shop renterShop;
    private Date startDate;
    private Date endDate;
    private Renter renter;
    private double monthlyPaidAmount;
    private ArrayList<Payment> payments;
    
    public RentalContract(){
        idContract = ++RentalContract.countsId;
    }
    
    public RentalContract(Shop renterShop, Date startDate, Date endDate, Renter renter
    , double montlyPaidAmount){
        this();
        this.renterShop = renterShop;
        this.startDate = startDate;
        this.endDate = endDate;
        this.renter = renter;
        this.monthlyPaidAmount = montlyPaidAmount;
        payments = new ArrayList<Payment>();
    }

    public int getIdContract() {
        return idContract;
    }

    public Shop getRenterShop() {
        return renterShop;
    }

    public void setRenterShop(Shop renterShop) {
        this.renterShop = renterShop;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Renter getRenter() {
        return renter;
    }

    public void setRenter(Renter renter) {
        this.renter = renter;
    }

    public double getMonthlyPaidAmount() {
        return monthlyPaidAmount;
    }

    public void setMonthlyPaidAmount(double monthlyPaidAmount) {
        this.monthlyPaidAmount = monthlyPaidAmount;
    }

    public ArrayList<Payment> getPayments() {
        return payments;
    }

    public void setPayments(ArrayList<Payment> payments) {
        this.payments = payments;
    }
    
    
    
    
}
