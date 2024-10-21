
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Queries.Payment;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Payment;
import java.util.List;

/**
 *
 * @author CLEYMER
 */
public interface IGetAllPaymentQuery {
    public List<Payment> getAllPayment() throws Exception;
}
