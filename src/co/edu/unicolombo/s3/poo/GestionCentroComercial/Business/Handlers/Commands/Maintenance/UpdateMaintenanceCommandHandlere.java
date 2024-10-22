
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.Handlers.Commands.Maintenance;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Commands.Maintenance.IUpdateMaintenanceCommand;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Maintenance;

/**
 *
 * @author Daniel
 */
public class UpdateMaintenanceCommandHandlere implements IUpdateMaintenanceCommand{
    private IUpdateMaintenanceCommand repository;

    public UpdateMaintenanceCommandHandlere(IUpdateMaintenanceCommand repository) {
        this.repository = repository;
    }

    @Override
    public Maintenance updaMaintenance(int maintenanceId) throws Exception {
        return repository.updaMaintenance(maintenanceId);
    }
}
