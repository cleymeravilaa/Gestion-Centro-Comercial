
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.Handlers.Commands.Invoice;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Commands.Invoice.ISaveInvoiceCommand;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IInvoiceRepository;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Invoice;

/**
 *
 * @author Daniel
 */
public class SaveInvoiceCommandHandler implements ISaveInvoiceCommand{
    private IInvoiceRepository repository;

    public SaveInvoiceCommandHandler(IInvoiceRepository repository) {
        this.repository = repository;
    }

    @Override
    public Invoice save(Invoice invoice) throws Exception {
        return this.repository.saveInvoice(invoice);
    }
}
