package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Commands.RentalContract;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.RentalContract;

/**
 *
 * @author CLEYMER
 */
public interface IUpdateRentalContractCommand {
    public RentalContract update(int  rentalContractId) throws Exception;
}
