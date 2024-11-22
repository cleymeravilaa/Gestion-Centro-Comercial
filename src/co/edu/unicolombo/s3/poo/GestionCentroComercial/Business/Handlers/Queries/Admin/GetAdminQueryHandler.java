
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.Handlers.Queries.Admin;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Queries.Admin.IGetAdminQuery;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Administrator;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IAdminRepository;

/**
 *
 * @author Daniel
 */
public class GetAdminQueryHandler implements IGetAdminQuery{
    public IAdminRepository repository;
    
    public GetAdminQueryHandler(IAdminRepository repository){
        this.repository = repository;
    }

    @Override
    public Administrator getAdminById(int AdminId) throws Exception {
        return this.repository.findAdminById(AdminId);
    }

    @Override
    public Administrator getAdminByEmail(String AdminName) throws Exception {
        return this.repository.findAdminByEmail(AdminName);
    }
}
