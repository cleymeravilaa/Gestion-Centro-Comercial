
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Queries.User;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.User;

/**
 *
 * @author Daniel
 */
public interface IGetUserQuery {
    public User getUserById(int userId) throws Exception;
    public User getUserByName(String userName) throws Exception;
}
