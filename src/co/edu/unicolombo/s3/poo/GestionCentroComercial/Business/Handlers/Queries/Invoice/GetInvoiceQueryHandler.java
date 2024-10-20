
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.Handlers.Queries.Invoice;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Queries.Invoice.IGetInvoiceQuery;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IInvoiceRepository;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Invoice;

/**
 *
 * @author Daniel
 */
public class GetInvoiceQueryHandler implements IGetInvoiceQuery{
    
    private IInvoiceRepository repository;

    public GetInvoiceQueryHandler(IInvoiceRepository repository) {
        this.repository = repository;
    }

    @Override
    public Invoice getInvoice(int invoiceId) throws Exception {
        return this.repository.findById(invoiceId);
    }
    
}
