
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.Handlers.Commands.User;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Commands.User.ISaveUserCommand;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IUserRepository;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.User;

/**
 *
 * @author Daniel
 */
public class SaveUserCommandHandler implements ISaveUserCommand{
    public IUserRepository repository;

    public SaveUserCommandHandler(IUserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User saveUser(User user) throws Exception {
        return repository.saveUser(user);
    }
    
    
}
