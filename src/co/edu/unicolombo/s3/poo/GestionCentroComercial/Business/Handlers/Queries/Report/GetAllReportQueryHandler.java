package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.Handlers.Queries.Report;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Queries.Report.IGetAllReportQuery;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IReportRepository;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Report;
import java.util.List;

/**
 *
 * @author CLEYMER
 */
public class GetAllReportQueryHandler implements IGetAllReportQuery{
    private IReportRepository repository;

    @Override
    public List<Report> getAllReport() throws Exception {
        return this.getAllReport();
    }
    
}
