package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.Handlers.Commands.Report;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Commands.Report.IUpdateReportCommand;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IReportRepository;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Report;

/**
 *
 * @author CLEYMER
 */
public class UpdateReportCommandHandler implements IUpdateReportCommand{
    private IReportRepository repository;

    @Override
    public Report update(int reportId) throws Exception {
        return this.repository.updateReport(reportId);
    }
}
