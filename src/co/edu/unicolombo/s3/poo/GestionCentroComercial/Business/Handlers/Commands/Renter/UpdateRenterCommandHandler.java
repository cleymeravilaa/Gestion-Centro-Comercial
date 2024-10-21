package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.Handlers.Commands.Renter;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Commands.Renter.IUpdateRenterCommand;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IRenterRepository;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Renter;

/**
 *
 * @author CLEYMER
 */
public class UpdateRenterCommandHandler implements IUpdateRenterCommand{
    private IRenterRepository repository;

    @Override
    public Renter update(int updateId) throws Exception {
        return this.repository.updateRenter(updateId);
    }
    
    
}
