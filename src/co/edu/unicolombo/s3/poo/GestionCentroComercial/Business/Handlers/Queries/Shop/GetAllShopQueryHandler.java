package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.Handlers.Queries.Shop;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Queries.Shop.IGetAllShopQuery;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IShopRepository;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Shop;
import java.util.List;

/**
 *
 * @author CLEYMER
 */
public class GetAllShopQueryHandler implements IGetAllShopQuery{
    private IShopRepository repository;

    public GetAllShopQueryHandler(IShopRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Shop> getAllShop() throws Exception {
        return this.repository.findAll();
    }
    
   
}
