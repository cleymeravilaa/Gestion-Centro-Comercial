package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.Handlers.Commands.Renter;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Commands.Renter.IDeleteRenterCommand;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IRenterRepository;

/**
 *
 * @author CLEYMER
 */
public class DeleteRenterCommandHandler implements IDeleteRenterCommand{
    private IRenterRepository repository;

    @Override
    public void delete(int renterId) throws Exception {
        this.repository.deleteRenter(renterId);
    }
    
    
}
