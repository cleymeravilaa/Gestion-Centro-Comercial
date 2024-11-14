
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.Handlers.Queries.Admin;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Queries.Admin.IGetAllAdminQuery;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Administrator;
import java.util.List;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IAdminRepository;

/**
 *
 * @author Daniel
 */
public class GetAllAdminQueryHandler implements IGetAllAdminQuery{
    public IAdminRepository repository;
    
    public GetAllAdminQueryHandler(IAdminRepository repository){
        this.repository = repository;
    }

    @Override
    public List<Administrator> getAllAdministrator() throws Exception {
        return this.repository.findAll();
    }

}
