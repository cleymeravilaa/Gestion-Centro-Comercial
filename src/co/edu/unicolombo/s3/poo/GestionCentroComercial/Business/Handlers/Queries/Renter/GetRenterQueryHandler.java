package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.Handlers.Queries.Renter;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Queries.Renter.IGetRenterQuery;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IRenterRepository;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Renter;

/**
 *
 * @author CLEYMER
 */
public class GetRenterQueryHandler implements IGetRenterQuery{
    private IRenterRepository repository;

    @Override
    public Renter getRenter(int renterId) throws Exception {
        return this.repository.findById(renterId);
    }
    
    
}
