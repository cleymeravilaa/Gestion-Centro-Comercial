package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.Handlers.Queries.Shop;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Queries.Shop.IGetShopQuery;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IShopRepository;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Shop;

/**
 *
 * @author CLEYMER
 */
public class GetShopQueryHandler implements IGetShopQuery{
    private IShopRepository repository;

    public GetShopQueryHandler(IShopRepository repository) {
        this.repository = repository;
    }

    @Override
    public Shop getShop(int shopId) throws Exception {
        return this.repository.findById(shopId);
    }

    @Override
    public Shop getShop(String name) throws Exception {
        return this.repository.findByName(name);
    }
    
    
}
