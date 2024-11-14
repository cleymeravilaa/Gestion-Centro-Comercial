
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.Handlers.Commands.Admin;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Commands.Admin.ISaveAdminCommand;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IAdminRepository;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Administrator;

/**
 *
 * @author Daniel
 */
public class SaveAdminCommandHandler implements ISaveAdminCommand{
    public IAdminRepository repository;

    public SaveAdminCommandHandler(IAdminRepository repository) {
        this.repository = repository;
    }

    @Override
    public Administrator saveAdmin(Administrator admin) throws Exception {
        return repository.saveAdmin(admin);
    }
    
    
}
