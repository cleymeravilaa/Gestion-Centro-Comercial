
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Commands.Payment;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Payment;

/**
 *
 * @author CLEYMER
 */
public interface IUpdatePaymentCommand {
    public Payment updatePayment(int paymentId) throws Exception;
}
