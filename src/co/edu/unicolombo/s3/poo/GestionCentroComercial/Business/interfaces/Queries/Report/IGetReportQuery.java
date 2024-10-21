package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Queries.Report;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Report;

/**
 *
 * @author CLEYMER
 */
public interface IGetReportQuery {
    public Report getReport(int reportId) throws Exception;
}
