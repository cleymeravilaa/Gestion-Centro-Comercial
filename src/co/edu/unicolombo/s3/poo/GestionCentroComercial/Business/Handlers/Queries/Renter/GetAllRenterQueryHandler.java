package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.Handlers.Queries.Renter;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Queries.Renter.IGetAllRenterQuery;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IRenterRepository;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Renter;
import java.util.List;

/**
 *
 * @author CLEYMER
 */
public class GetAllRenterQueryHandler implements IGetAllRenterQuery{
    private IRenterRepository repository;

    @Override
    public List<Renter> getAllRenter() throws Exception {
        return this.repository.findAll();
    }
    
    
}
