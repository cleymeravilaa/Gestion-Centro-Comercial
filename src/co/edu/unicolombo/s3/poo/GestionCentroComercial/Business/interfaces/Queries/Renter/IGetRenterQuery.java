package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Queries.Renter;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Renter;

/**
 *
 * @author CLEYMER
 */
public interface IGetRenterQuery {
    public Renter getRenter(int renterId)throws Exception;
}
