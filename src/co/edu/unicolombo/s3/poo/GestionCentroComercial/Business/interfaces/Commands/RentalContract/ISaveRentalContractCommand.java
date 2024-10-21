
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Commands.RentalContract;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.RentalContract;

/**
 *
 * @author CLEYMER
 */
public interface ISaveRentalContractCommand {
    public RentalContract save(RentalContract rentalContract) throws Exception;
}
