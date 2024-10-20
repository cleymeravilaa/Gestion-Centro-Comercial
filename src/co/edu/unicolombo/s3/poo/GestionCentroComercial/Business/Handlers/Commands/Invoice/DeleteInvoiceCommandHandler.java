
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.Handlers.Commands.Invoice;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Commands.Invoice.IDeleteInvoiceCommand;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IInvoiceRepository;

/**
 *
 * @author Daniel
 */
public class DeleteInvoiceCommandHandler implements IDeleteInvoiceCommand{
    private IInvoiceRepository repository;

    public DeleteInvoiceCommandHandler(IInvoiceRepository repository) {
        this.repository = repository;
    }

    @Override
    public void deleteInvoice(int invoiceId) throws Exception {
        this.repository.deleteInvoice(invoiceId);
    }
}
