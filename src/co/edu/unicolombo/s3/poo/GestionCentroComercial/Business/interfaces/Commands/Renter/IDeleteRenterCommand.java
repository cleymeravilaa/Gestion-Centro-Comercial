package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Commands.Renter;

/**
 *
 * @author CLEYMER
 */
public interface IDeleteRenterCommand {
    public void delete(int renterId) throws Exception;
}
