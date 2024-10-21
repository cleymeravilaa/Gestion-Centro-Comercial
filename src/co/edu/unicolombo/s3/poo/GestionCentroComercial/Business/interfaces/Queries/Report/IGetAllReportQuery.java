package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Queries.Report;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Report;
import java.util.List;

/**
 *
 * @author CLEYMER
 */
public interface IGetAllReportQuery {
    public List<Report> getAllReport() throws Exception;
}
