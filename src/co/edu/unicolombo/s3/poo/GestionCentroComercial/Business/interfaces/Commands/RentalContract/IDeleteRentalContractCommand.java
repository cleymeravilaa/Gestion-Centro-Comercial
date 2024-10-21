package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Commands.RentalContract;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.RentalContract;

/**
 *
 * @author CLEYMER
 */
public interface IDeleteRentalContractCommand {
    public void delete(RentalContract rentalContract) throws Exception;
}
