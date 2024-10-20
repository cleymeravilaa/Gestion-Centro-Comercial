
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.Handlers.Queries.Invoice;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Queries.Invoice.IGetAllInvoicesQuery;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IInvoiceRepository;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Invoice;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class GetAllInvoiceQueryHandler implements IGetAllInvoicesQuery{
    private IInvoiceRepository repository;

    public GetAllInvoiceQueryHandler(IInvoiceRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Invoice> getAllInvoices() throws Exception {
        return this.repository.findAll();
    }
}
