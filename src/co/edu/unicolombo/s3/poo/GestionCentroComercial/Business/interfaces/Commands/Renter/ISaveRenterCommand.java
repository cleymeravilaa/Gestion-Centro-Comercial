package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Commands.Renter;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Renter;

/**
 *
 * @author CLEYMER
 */
public interface ISaveRenterCommand {
    public Renter save(Renter renter) throws Exception;
}
