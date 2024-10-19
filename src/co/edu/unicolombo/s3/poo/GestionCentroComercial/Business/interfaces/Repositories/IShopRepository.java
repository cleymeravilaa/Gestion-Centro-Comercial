package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Shop;
import java.util.List;

/**
 *
 * @author CLEYMER
 */
public interface IShopRepository {
    public Shop saveShop(Shop shop) throws Exception;
    public Shop findById(int shopId) throws Exception;
    public Shop findByName(String name) throws Exception;
    public List<Shop> findAll() throws Exception;
    public void deleteShop(int id) throws Exception;
    public Shop updateShop(int shopId)throws Exception;
    
}
