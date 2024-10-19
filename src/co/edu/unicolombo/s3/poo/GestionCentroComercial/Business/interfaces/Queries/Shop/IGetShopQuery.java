package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Queries.Shop;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Shop;

/**
 *
 * @author CLEYMER
 */
public interface IGetShopQuery {
    public Shop getShop(int shopId) throws Exception;
    public Shop getShop(String name) throws Exception;
}
