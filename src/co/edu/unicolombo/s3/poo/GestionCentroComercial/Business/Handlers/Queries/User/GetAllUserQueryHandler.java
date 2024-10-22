
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.Handlers.Queries.User;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Queries.User.IGetAllUserQuery;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IUserRepository;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.User;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class GetAllUserQueryHandler implements IGetAllUserQuery{
    public IUserRepository repository;
    
    public GetAllUserQueryHandler(IUserRepository repository){
        this.repository = repository;
    }

    @Override
    public List<User> getAllUsers() throws Exception {
        return this.repository.findAll();
    }

}
