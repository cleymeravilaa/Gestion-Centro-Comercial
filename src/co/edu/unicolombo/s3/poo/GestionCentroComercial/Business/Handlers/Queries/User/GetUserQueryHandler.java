
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.Handlers.Queries.User;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Queries.User.IGetUserQuery;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IUserRepository;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.User;

/**
 *
 * @author Daniel
 */
public class GetUserQueryHandler implements IGetUserQuery{
    public IUserRepository repository;
    
    public GetUserQueryHandler(IUserRepository repository){
        this.repository = repository;
    }

    @Override
    public User getUserById(int userId) throws Exception {
        return this.repository.findById(userId);
    }

    @Override
    public User getUserByName(String userName) throws Exception {
        return this.repository.findByName(userName);
    }
}
