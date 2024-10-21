package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Commands.Report;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Report;

/**
 *
 * @author CLEYMER
 */
public interface IUpdateReportCommand {
    public Report update(int reportId) throws Exception;
}
