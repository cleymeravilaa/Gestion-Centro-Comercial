
package co.edu.unicolombo.s3.poo.GestionCentroComercial.models;

/**
 *
 * @author CLEYMER
 */

class Cubicle {
    private int id;
    private static int idCounts = 0;
    private String type; // Moto, Carro, Bicicleta
    private String status;

    public Cubicle(String type, String status) {
        this.type = type;
        this.status = status;
        this.id = ++Cubicle.idCounts;
    }

    public int getId() {
        return id;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    
    
}
