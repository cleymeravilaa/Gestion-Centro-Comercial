
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.Handlers.Commands.RentalContract;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Commands.RentalContract.IDeleteRentalContractCommand;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IRentalContractRepository;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.RentalContract;

/**
 *
 * @author CLEYMER
 */
public class DeleteRentalContractCommandHandler implements IDeleteRentalContractCommand{
    private IRentalContractRepository repository;

    @Override
    public void delete(RentalContract rentalContract) throws Exception {
        this.repository.deleteRentalContract(rentalContract);
    }
    
    
    
}
