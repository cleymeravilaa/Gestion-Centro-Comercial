package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.Handlers.Commands.Report;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Commands.Report.IDeleteReportCommand;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IReportRepository;

/**
 *
 * @author CLEYMER
 */
public class DeleteReportCommandHandler implements IDeleteReportCommand{
    private IReportRepository repository;

    @Override
    public void delete(int reportId) throws Exception {
        this.repository.deleteReport(reportId);
    }
}
