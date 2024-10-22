
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Commands.Maintenance;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Maintenance;

/**
 *
 * @author Daniel
 */
public interface ISaveMaintenanceCommand {
    public Maintenance saveMaintenance(Maintenance maintenance) throws Exception;
}
