package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.Handlers.Queries.Payment;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Queries.Payment.IGetPaymentQuery;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IPaymentRepository;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Payment;

/**
 *
 * @author CLEYMER
 */
public class GetPaymentQueryHandler implements IGetPaymentQuery{
    private IPaymentRepository repository;

    @Override
    public Payment getPayment(int paymentId) throws Exception {
        return this.repository.findById(paymentId);
    }
    
    
}
