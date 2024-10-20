
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Queries.Invoice;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Invoice;
import java.util.List;

/**
 *
 * @author Daniel
 */
public interface IGetAllInvoicesQuery {
    public List<Invoice> getAllInvoices() throws Exception;
}
