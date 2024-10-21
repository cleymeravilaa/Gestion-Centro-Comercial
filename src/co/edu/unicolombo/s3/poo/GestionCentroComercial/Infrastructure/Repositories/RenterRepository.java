package co.edu.unicolombo.s3.poo.GestionCentroComercial.Infrastructure.Repositories;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IRenterRepository;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Renter;
import java.util.List;

/**
 *
 * @author CLEYMER
 */
public class RenterRepository implements IRenterRepository{
    private static List<Renter> renterDb;

    @Override
    public Renter saveRenter(Renter renter) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Renter findById(int renterId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Renter> findAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteRenter(int renterId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Renter updateRenter(int renterId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
