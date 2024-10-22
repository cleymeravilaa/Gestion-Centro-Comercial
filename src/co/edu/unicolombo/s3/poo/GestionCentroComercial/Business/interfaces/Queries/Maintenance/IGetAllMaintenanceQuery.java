
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Queries.Maintenance;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Maintenance;
import java.util.List;

/**
 *
 * @author daniel
 */
public interface IGetAllMaintenanceQuery {
    public List<Maintenance> getAllMaintenance()throws Exception;
}
