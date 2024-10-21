
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Commands.Payment;

/**
 *
 * @author CLEYMER
 */
public interface IDeletePaymentCommand {
    public void deletePayment(int paymentId) throws Exception;
}
