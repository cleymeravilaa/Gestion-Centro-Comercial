
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.Handlers.Commands.User;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Commands.User.IDeleteUserCommand;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IUserRepository;

/**
 *
 * @author Daniel
 */
public class DeleteUserCommandHandler implements IDeleteUserCommand{
    public IUserRepository repository;
    
    public DeleteUserCommandHandler(IUserRepository repository){
        this.repository = repository;
    }

    @Override
    public void deleteUser(int userId) throws Exception {
        this.repository.deleteUser(userId);
    }
}
