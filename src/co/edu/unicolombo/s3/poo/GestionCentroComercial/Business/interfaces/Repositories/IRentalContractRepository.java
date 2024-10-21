
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.RentalContract;
import java.util.List;

/**
 *
 * @author CLEYMER
 */
public interface IRentalContractRepository {
    public RentalContract saveRentalContract(RentalContract rentalContract) throws Exception;
    public RentalContract findById(int rentalContractId) throws Exception;
    public List<RentalContract> findAll() throws Exception;
    public void deleteRentalContract(RentalContract rentalContractId) throws Exception;
    public RentalContract updateRentalContract(int rentalContractId)throws Exception;
}
