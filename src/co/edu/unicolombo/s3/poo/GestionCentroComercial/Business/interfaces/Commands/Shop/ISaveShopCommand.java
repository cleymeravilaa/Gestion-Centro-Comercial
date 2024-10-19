package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Commands.Shop;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Shop;

/**
 *
 * @author CLEYMER
 */
public interface ISaveShopCommand {
    public Shop save(Shop shop) throws Exception;
}
