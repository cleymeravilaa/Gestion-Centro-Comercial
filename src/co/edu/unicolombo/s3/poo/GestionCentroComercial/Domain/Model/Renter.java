
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model;

import java.util.ArrayList;

/**
 *
 * @author CLEYMER
 */
public class Renter {
    private int id;
    private String name;
    private static int idCounts;
    private String phone;
    private String email;
    private ArrayList<RentalContract> rentalcontracts;
    private ArrayList<Payment> payments;
    private ArrayList<Invoice> invoices;
    
    public Renter(){
        id = ++Renter.idCounts;
    }
    
    public Renter(String name, String phone, String email){
        this();
        this.name = name;
        this.phone = phone;
        this.email = email;
        rentalcontracts = new ArrayList<RentalContract>();
        payments = new ArrayList<Payment>();
        invoices = new ArrayList<Invoice>();
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<RentalContract> getRentalcontracts() {
        return rentalcontracts;
    }

    public void setRentalcontracts(ArrayList<RentalContract> rentalcontracts) {
        this.rentalcontracts = rentalcontracts;
    }

    public ArrayList<Payment> getPayments() {
        return payments;
    }

    public void setPayments(ArrayList<Payment> payments) {
        this.payments = payments;
    }

    public ArrayList<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(ArrayList<Invoice> invoices) {
        this.invoices = invoices;
    }
    
    
}
