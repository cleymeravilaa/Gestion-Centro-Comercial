
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.Handlers.Queries.RentalContract;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Queries.RentalContract.IGetAllRentalContractQuery;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IRentalContractRepository;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.RentalContract;
import java.util.List;

/**
 *
 * @author CLEYMER
 */
public class GetAllRentalContractQueryHandler implements IGetAllRentalContractQuery{
    private IRentalContractRepository repository;

    @Override
    public List<RentalContract> getAllRentalContract() throws Exception {
        return this.repository.findAll();
    }
    
    
    
}
