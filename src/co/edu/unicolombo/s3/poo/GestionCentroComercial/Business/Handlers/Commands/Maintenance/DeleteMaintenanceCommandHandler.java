
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.Handlers.Commands.Maintenance;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Commands.Maintenance.IDeleteMaintenanceCommand;

/**
 *
 * @author Daniel
 */
public class DeleteMaintenanceCommandHandler implements IDeleteMaintenanceCommand{
    private IDeleteMaintenanceCommand repository;

    public DeleteMaintenanceCommandHandler(IDeleteMaintenanceCommand repository) {
        this.repository = repository;
    }
    
    @Override
    public void deleteMaintenance(int maintenanceId) throws Exception {
        repository.deleteMaintenance(maintenanceId);
    }
    
}
