
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Payment;
import java.util.List;

/**
 *
 * @author CLEYMER
 */
public interface IPaymentRepository {
    public Payment save(Payment payment) throws Exception;
    public Payment  findById(int paymentId) throws Exception;
    public List<Payment> findAll() throws Exception;
    public void delete(int paymentId) throws Exception;
    public Payment update(int paymentId)throws Exception;
}
