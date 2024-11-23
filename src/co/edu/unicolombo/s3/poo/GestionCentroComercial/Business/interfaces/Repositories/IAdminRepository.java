
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Administrator;
import java.util.List;

/**
 *
 * @author Daniel
 */
public interface IAdminRepository {
    public Administrator login(String email, String password) throws Exception;
    public Administrator saveAdmin(Administrator admin) throws Exception;
    public Administrator findAdminById(int adminId) throws Exception;
    public Administrator findAdminByEmail(String adminName) throws Exception;
    public List<Administrator> findAll() throws Exception;
    public void deleteAdmin(int adminId) throws Exception;
    public Administrator updateAdmin(Administrator admin) throws Exception;
}
