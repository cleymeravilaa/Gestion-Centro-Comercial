
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Commands.Payment;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Payment;

/**
 *
 * @author CLEYMER
 */
public interface ISavePaymentCommand {
    public Payment savePayment(Payment payment) throws Exception;
}
