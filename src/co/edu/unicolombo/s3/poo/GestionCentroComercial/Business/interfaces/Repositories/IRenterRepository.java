package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Renter;
import java.util.List;

/**
 *
 * @author CLEYMER
 */
public interface IRenterRepository {
    public Renter saveRenter(Renter renter) throws Exception;
    public Renter findById(int renterId) throws Exception;
    public List<Renter> findAll() throws Exception;
    public void deleteRenter(int renterId) throws Exception;
    public Renter updateRenter(int renterId)throws Exception;
}
