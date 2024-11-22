
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.Handlers.Commands.Admin;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Commands.Admin.IUpdateAdminCommand;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IAdminRepository;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Administrator;

/**
 *
 * @author Daniel
 */
public class UpdateAdminCommandHandler implements IUpdateAdminCommand{
    private IAdminRepository repository;

    public UpdateAdminCommandHandler(IAdminRepository repository) {
        this.repository = repository;
    }

    @Override
    public Administrator updateAdmin(Administrator admin) throws Exception {
        return repository.updateAdmin(admin);
    }
    
}
