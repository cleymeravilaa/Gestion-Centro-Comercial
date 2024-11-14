
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.Handlers.Commands.Admin;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Commands.Admin.IDeleteAdminCommand;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IAdminRepository;

/**
 *
 * @author Daniel
 */
public class DeleteAdminCommandHandler implements IDeleteAdminCommand{
    public IAdminRepository repository;
    
    public DeleteAdminCommandHandler(IAdminRepository repository){
        this.repository = repository;
    }

    @Override
    public void deleteAdmin(int adminId) throws Exception {
        this.repository.deleteAdmin(adminId);
    }
}
