
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Queries.Payment;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Payment;

/**
 *
 * @author CLEYMER
 */
public interface IGetPaymentQuery {
    public Payment getPayment(int paymentId) throws Exception;
}
