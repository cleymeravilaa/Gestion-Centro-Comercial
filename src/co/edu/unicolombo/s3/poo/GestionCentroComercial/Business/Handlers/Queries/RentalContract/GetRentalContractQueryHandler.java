
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.Handlers.Queries.RentalContract;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Queries.RentalContract.IGetRentalContractQuery;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IRentalContractRepository;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.RentalContract;

/**
 *
 * @author CLEYMER
 */
public class GetRentalContractQueryHandler implements IGetRentalContractQuery{
    private IRentalContractRepository repository;

    @Override
    public RentalContract getById(int rentalContractId) throws Exception {
        return this.repository.findById(rentalContractId);
    }
    
    
    
}
