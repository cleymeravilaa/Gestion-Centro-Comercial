package co.edu.unicolombo.s3.poo.GestionCentroComercial.Infrastructure.Repositories;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IShopRepository;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Shop;
import java.util.List;

/**
 *
 * @author CLEYMER
 */
public class ShopRepository implements IShopRepository{
    private static List<Shop> ShopDb;
    
    @Override
    public Shop saveShop(Shop shop) throws Exception {
        return null;
    }

    @Override
    public Shop findById(int shopId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Shop> findAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteShop(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Shop findByName(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Shop updateShop(int shopId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
