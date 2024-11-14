
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Commands.Admin;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Administrator;

/**
 *
 * @author Daniel
 */
public interface ISaveAdminCommand {
    public Administrator saveAdmin(Administrator admin) throws Exception;
}
