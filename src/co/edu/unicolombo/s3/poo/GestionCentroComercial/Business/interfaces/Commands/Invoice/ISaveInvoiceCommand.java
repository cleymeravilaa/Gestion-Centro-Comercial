
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Commands.Invoice;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Invoice;

/**
 *
 * @author Daniel
 */
public interface ISaveInvoiceCommand {
    public Invoice save(Invoice invoice) throws Exception;
}
