
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.User;
import java.util.List;

/**
 *
 * @author PC
 */
public interface IUserRepository {
    public User saveUser(User user) throws Exception;
    public User findById(int UserId) throws Exception;
    public User findByName(String UserName) throws Exception;
    public List<User> findAll() throws Exception;
    public void deleteUser(int UserId) throws Exception;
    public User updateUser(int userId) throws Exception;
}
