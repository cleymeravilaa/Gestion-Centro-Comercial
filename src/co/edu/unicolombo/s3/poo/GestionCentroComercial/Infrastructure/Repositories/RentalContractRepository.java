package co.edu.unicolombo.s3.poo.GestionCentroComercial.Infrastructure.Repositories;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.RentalContract;
import java.util.List;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IRentalContractRepository;

/**
 *
 * @author CLEYMER
 */
public class RentalContractRepository implements IRentalContractRepository{

    private static List<RentalContract> rentalContractDb;
    
    @Override
    public RentalContract saveRentalContract(RentalContract rentalContract) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public RentalContract findById(int rentalContractId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    @Override
    public List<RentalContract> findAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public RentalContract updateRentalContract(int shopId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteRentalContract(RentalContract rentalContractId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
