package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Queries.Renter;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Renter;
import java.util.List;

/**
 *
 * @author CLEYMER
 */
public interface IGetAllRenterQuery {
    public List<Renter> getAllRenter() throws Exception;
}
