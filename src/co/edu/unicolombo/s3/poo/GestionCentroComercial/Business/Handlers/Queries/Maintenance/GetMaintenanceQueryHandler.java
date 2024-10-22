
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.Handlers.Queries.Maintenance;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Queries.Maintenance.IGetMaintenanceQuery;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Maintenance;

/**
 *
 * @author Daniel
 */
public class GetMaintenanceQueryHandler implements IGetMaintenanceQuery{
    private IGetMaintenanceQuery repository;

    public GetMaintenanceQueryHandler(IGetMaintenanceQuery repository) {
        this.repository = repository;
    }
    
    @Override
    public Maintenance getMaintenance(int maintenanceId) throws Exception {
        return repository.getMaintenance(maintenanceId);
    }
    
}
