package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.Handlers.Commands.Payment;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Commands.Payment.IDeletePaymentCommand;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IPaymentRepository;

/**
 *
 * @author CLEYMER
 */
public class DeletePaymentCommandHandler implements IDeletePaymentCommand {
    public IPaymentRepository repository;

    @Override
    public void deletePayment(int paymentId) throws Exception {
        this.repository.delete(paymentId);
    }
}
