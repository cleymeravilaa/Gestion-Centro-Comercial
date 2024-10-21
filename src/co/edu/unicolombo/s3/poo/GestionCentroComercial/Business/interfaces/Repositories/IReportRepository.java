package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Report;
import java.util.List;

/**
 *
 * @author CLEYMER
 */
public interface IReportRepository {
    public Report saveReport(Report report) throws Exception;
    public Report findById(int reportId) throws Exception;
    public List<Report> findAll() throws Exception;
    public void deleteReport(int reportId) throws Exception;
    public Report updateReport(int reportId)throws Exception;
}
