package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Queries.Admin;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Administrator;

/**
 *
 * @author Daniel
 */
public interface IGetAdminQuery {
    public Administrator getAdminById(int adminId) throws Exception;
    public Administrator getAdminByName(String name) throws Exception;
}
