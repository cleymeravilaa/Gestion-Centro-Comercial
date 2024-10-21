
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Queries.RentalContract;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.RentalContract;

/**
 *
 * @author CLEYMER
 */
public interface IGetRentalContractQuery {
    public RentalContract getById(int rentalContractId) throws Exception;
}
