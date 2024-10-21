
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.Handlers.Commands.RentalContract;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Commands.RentalContract.IUpdateRentalContractCommand;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IRentalContractRepository;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.RentalContract;

/**
 *
 * @author CLEYMER
 */
public class UpdateRentalContractCommandHandler implements IUpdateRentalContractCommand{
    private IRentalContractRepository repository;

    @Override
    public RentalContract update(int rentalContractId) throws Exception {
        return this.repository.updateRentalContract(rentalContractId);
    }
    
}
