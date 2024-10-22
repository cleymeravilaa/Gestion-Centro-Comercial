
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.Handlers.Queries.Maintenance;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Queries.Maintenance.IGetAllMaintenanceQuery;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Maintenance;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class GetAllMaintenanceQueryHandler implements IGetAllMaintenanceQuery{
    private IGetAllMaintenanceQuery repository;

    public GetAllMaintenanceQueryHandler(IGetAllMaintenanceQuery repository) {
        this.repository = repository;
    }
    
    @Override
    public List<Maintenance> getAllMaintenance() throws Exception {
        return repository.getAllMaintenance();
    }
    
}
