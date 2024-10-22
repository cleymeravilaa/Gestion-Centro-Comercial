
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Commands.Maintenance;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Maintenance;

/**
 *
 * @author Daniel
 */
public interface IUpdateMaintenanceCommand {
    public Maintenance updaMaintenance(int maintenanceId) throws Exception;
}
