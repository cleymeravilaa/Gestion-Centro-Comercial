
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Commands.Invoice;

/**
 *
 * @author Daniel
 */
public interface IDeleteInvoiceCommand {
        public void deleteInvoice(int invoiceId)throws Exception;
}
