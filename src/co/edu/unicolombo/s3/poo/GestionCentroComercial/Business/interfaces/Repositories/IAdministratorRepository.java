
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Administrator;
import java.util.List;

/**
 *
 * @author PC
 */
public interface IAdministratorRepository {
    public Administrator saveAdmimistrator(Administrator administrator) throws Exception;
    public Administrator findById(int administratorId) throws Exception;
    public Administrator findById(String administratorName) throws Exception;
    public List<Administrator> findAll() throws Exception;
    public void deleteAdministrator(int adminstratorId) throws Exception;
    public Administrator updateAdministrator(int adminstratorId) throws Exception;
}
