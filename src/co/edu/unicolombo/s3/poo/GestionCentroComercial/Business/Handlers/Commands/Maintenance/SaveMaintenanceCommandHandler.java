
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.Handlers.Commands.Maintenance;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Commands.Maintenance.ISaveMaintenanceCommand;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Maintenance;

/**
 *
 * @author Daniel
 */
public class SaveMaintenanceCommandHandler implements ISaveMaintenanceCommand{
    private ISaveMaintenanceCommand repository;

    public SaveMaintenanceCommandHandler(ISaveMaintenanceCommand repository) {
        this.repository = repository;
    }
    
    @Override
    public Maintenance saveMaintenance(Maintenance maintenance) throws Exception {
        return repository.saveMaintenance(maintenance);
    }
    
}
