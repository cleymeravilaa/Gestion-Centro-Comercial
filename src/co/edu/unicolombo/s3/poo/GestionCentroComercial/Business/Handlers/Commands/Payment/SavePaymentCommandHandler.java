
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.Handlers.Commands.Payment;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Commands.Payment.ISavePaymentCommand;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IPaymentRepository;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Payment;

/**
 *
 * @author CLEYMER
 */
public class SavePaymentCommandHandler implements ISavePaymentCommand {
    private IPaymentRepository repository;

    @Override
    public Payment savePayment(Payment payment) throws Exception {
        return this.repository.save(payment);
    }
    
    
}
