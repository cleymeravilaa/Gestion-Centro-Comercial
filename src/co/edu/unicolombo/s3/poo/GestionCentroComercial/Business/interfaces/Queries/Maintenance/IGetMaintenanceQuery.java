
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Queries.Maintenance;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Maintenance;

/**
 *
 * @author Daniel
 */
public interface IGetMaintenanceQuery {
    public Maintenance getMaintenance(int maintenanceId) throws Exception;
}
