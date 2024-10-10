
package co.edu.unicolombo.s3.poo.GestionCentroComercial.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class Owner {
    private List<Shop> shops = new ArrayList<>();
    
    public Owner(){
    }
    
    public Owner(List<Shop> shops){
        this.shops = shops;
    }
    
    public void manageShops(){
        
    }
    
    //Getters y Setters

    public List<Shop> getShops() {
        return shops;
    }

    public void setShops(List<Shop> shops) {
        this.shops = shops;
    }
    
}
