
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Queries.Invoice;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Invoice;

/**
 *
 * @author Daniel
 */
public interface IGetInvoiceQuery {
    public Invoice getInvoice(int invoiceId) throws Exception;
}
