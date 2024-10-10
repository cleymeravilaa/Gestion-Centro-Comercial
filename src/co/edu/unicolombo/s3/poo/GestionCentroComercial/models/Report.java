
package co.edu.unicolombo.s3.poo.GestionCentroComercial.models;

import java.util.Date;

/**
 *
 * @author PC
 */
public class Report {
    private String type;
    private Date issuDate;
    private String content;
    
    public Report(){
        
    }
    
    public Report(String type, Date issueDate, String content){
        this.type = type;
        this.issuDate = issueDate;
        this.content = content;
    }
    
    //Getters y Setters
    
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
    
    public Date getIssuDate(){
        return issuDate;
    }
    public void setIssueDate(Date issueDate){
        this.issuDate = issueDate;
    }
    
    public String getContent(){
        return content;
    }
    public void setContent(String content){
        this.content = content;
    }
}
