
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Queries.User;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.User;
import java.util.List;

/**
 *
 * @author Daniel
 */
public interface IGetAllUserQuery {
    public List<User>getAllUsers()throws Exception;
}
