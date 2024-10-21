package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.Handlers.Queries.Report;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Queries.Report.IGetReportQuery;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IReportRepository;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Report;

/**
 *
 * @author CLEYMER
 */
public class GetReportQueryHandler implements IGetReportQuery {
    private IReportRepository repository;

    @Override
    public Report getReport(int reportId) throws Exception {
        return this.repository.findById(reportId);
    }
    
    
    
}
