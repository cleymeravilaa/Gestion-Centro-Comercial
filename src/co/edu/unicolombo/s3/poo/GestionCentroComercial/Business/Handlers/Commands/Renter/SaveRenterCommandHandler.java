package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.Handlers.Commands.Renter;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Commands.Renter.ISaveRenterCommand;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IRenterRepository;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Renter;

/**
 *
 * @author CLEYMER
 */
public class SaveRenterCommandHandler  implements ISaveRenterCommand{
    private IRenterRepository repository;

    @Override
    public Renter save(Renter renter) throws Exception {
        return this.repository.saveRenter(renter);
    }
}
