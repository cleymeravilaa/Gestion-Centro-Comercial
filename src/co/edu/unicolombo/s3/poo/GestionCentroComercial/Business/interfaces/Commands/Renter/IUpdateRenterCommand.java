package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Commands.Renter;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Renter;

/**
 *
 * @author CLEYMER
 */
public interface IUpdateRenterCommand {
    public Renter update(int updateId) throws Exception;
}
    