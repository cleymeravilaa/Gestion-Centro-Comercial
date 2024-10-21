package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.Handlers.Commands.Report;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Commands.Report.ISaveReportCommand;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IReportRepository;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Report;

/**
 *
 * @author CLEYMER
 */
public class SaveReportCommandHandler implements ISaveReportCommand{
    private IReportRepository repository;

    @Override
    public Report save(Report report) throws Exception {
        return this.repository.saveReport(report);
    }
    
    
}
