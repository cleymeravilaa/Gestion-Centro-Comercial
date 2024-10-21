package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.Handlers.Queries.Payment;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Queries.Payment.IGetAllPaymentQuery;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IPaymentRepository;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Payment;
import java.util.List;

/**
 *
 * @author CLEYMER
 */
public class GetAllPaymentQueryHandler implements IGetAllPaymentQuery {
    private IPaymentRepository repository;

    @Override
    public List<Payment> getAllPayment() throws Exception {
        return this.repository.findAll();
    }
}
