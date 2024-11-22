
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Commands.User;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.User;

/**
 *
 * @author Daniel
 */
public interface IUpdateUserCommand {
    public User updateUser(User user) throws Exception;
}
