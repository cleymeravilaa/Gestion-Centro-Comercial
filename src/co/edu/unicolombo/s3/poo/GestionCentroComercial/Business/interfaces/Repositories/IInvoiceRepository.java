
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Invoice;
import java.util.List;

/**
 *
 * @author Daniel
 */
public interface IInvoiceRepository {
    public Invoice saveInvoice(Invoice invoice) throws Exception;
    public Invoice findById(int invoiceId) throws Exception;
    public List<Invoice> findAll() throws Exception;
    public void deleteInvoice(int invoiceid) throws Exception;
    public Invoice updateInvoice(int invoiceId)throws Exception;
}
