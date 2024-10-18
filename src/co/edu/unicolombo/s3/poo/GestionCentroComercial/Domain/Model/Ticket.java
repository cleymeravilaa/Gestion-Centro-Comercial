
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model;

/**
 *
 * @author CLEYMER
 */
public class Ticket {
    private int id;
    private static int idCounts;
    private String entryTime;
    private String departureTime;
    private double totalAmount;
    private String paymentStatus;
    
    public Ticket(){
        id = ++Ticket.idCounts;
    }
    
    public Ticket(String entryTime, String departureTime, double totalAmount, 
            String paymentStatus){
        this.entryTime = entryTime;
        this.departureTime = departureTime;
        this.totalAmount = totalAmount;
        this.paymentStatus = paymentStatus;
    }

    public int getId() {
        return id;
    }

    public String getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
    
    
}
