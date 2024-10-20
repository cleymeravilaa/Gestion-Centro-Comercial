
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.Handlers.Commands.Invoice;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Commands.Invoice.IUpdateInvoiceCommand;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IInvoiceRepository;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Invoice;

/**
 *
 * @author Daniel
 */
public class UpdateInvoiceCommandHandler implements IUpdateInvoiceCommand{
    private IInvoiceRepository repository;

    public UpdateInvoiceCommandHandler(IInvoiceRepository repository) {
        this.repository = repository;
    }

    @Override
    public Invoice updateInvoice(int invoiceId) throws Exception {
        return this.repository.updateInvoice(invoiceId);
    }
    
}
