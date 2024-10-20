
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model;

import java.util.Date;
/**
 *
 * @author Daniel
 */
public class Invoice {
    private int idInvoice;
    private static int countsId;
    private Date issueDate;
    private String content;

    public Invoice() {
        idInvoice = ++Invoice.countsId;
    }
    
    public Invoice(Date issueDate, String content){
        this();
        this.issueDate = issueDate;
        this.content = content;
    }

    public int getIdInvoice() {
        return idInvoice;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    
    
    
}
