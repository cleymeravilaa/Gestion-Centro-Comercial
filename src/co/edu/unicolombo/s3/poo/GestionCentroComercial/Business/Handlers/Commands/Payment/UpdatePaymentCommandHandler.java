package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.Handlers.Commands.Payment;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Commands.Payment.IUpdatePaymentCommand;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IPaymentRepository;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Payment;

/**
 *
 * @author CLEYMER
 */
public class UpdatePaymentCommandHandler implements IUpdatePaymentCommand{
    IPaymentRepository repository;

    @Override
    public Payment updatePayment(int paymentId) throws Exception {
        return this.repository.update(paymentId);
    }
}
