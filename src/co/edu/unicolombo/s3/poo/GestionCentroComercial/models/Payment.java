
package co.edu.unicolombo.s3.poo.GestionCentroComercial.models;

import java.util.Date;

/**
 *
 * @author CLEYMER
 */
public class Payment {
    private int idPayment;
    private static int countsId;
    private Date issueDate;
    private double amount;
    private String paymentMethod;
    private RentalContract rentalContract;
    private Invoice invoice;
    
    public Payment(){
        idPayment = ++Payment.countsId;
    }
    
    public Payment(Date issueDate, double amount, String paymentMethod,
            RentalContract rentalContract, Invoice invoice){
        this();
        this.issueDate = issueDate;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.rentalContract = rentalContract;
        this.invoice = invoice;
    }

    public int getIdPayment() {
        return idPayment;
    }


    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public RentalContract getRentalContract() {
        return rentalContract;
    }

    public void setRentalContract(RentalContract rentalContract) {
        this.rentalContract = rentalContract;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
    
    
}
