
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Queries.Admin;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Administrator;
import java.util.List;

/**
 *
 * @author Daniel
 */
public interface IGetAllAdminQuery {
    public List<Administrator>getAllAdministrator()throws Exception;
}
