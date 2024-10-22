
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Maintenance;
import java.util.List;

/**
 *
 * @author Daniel
 */
public interface IMaintenanceRepository {
    public Maintenance saveMaintenance(int maintenanceId) throws Exception;
    public Maintenance findMaintenance(int maintenanceId) throws Exception;
    public List<Maintenance> findAll() throws Exception;
    public void deleteMaintenance(int maintenanceId) throws Exception;
    public Maintenance updaMaintenance(int maintenanceId) throws Exception;
}
