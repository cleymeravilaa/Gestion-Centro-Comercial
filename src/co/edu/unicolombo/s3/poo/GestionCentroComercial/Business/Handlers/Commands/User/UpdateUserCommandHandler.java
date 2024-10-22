
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.Handlers.Commands.User;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Commands.User.IUpdateUserCommand;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IUserRepository;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.User;

/**
 *
 * @author Daniel
 */
public class UpdateUserCommandHandler implements IUpdateUserCommand{
    private IUserRepository repository;

    public UpdateUserCommandHandler(IUserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User updateUser(int userId) throws Exception {
        return repository.updateUser(userId);
    }
    
}
