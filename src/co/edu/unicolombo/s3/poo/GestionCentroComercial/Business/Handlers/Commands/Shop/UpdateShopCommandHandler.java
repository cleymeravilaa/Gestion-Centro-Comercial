package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.Handlers.Commands.Shop;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Commands.Shop.IUpdateShopCommand;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IShopRepository;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Shop;

/**
 *
 * @author CLEYMER
 */
public class UpdateShopCommandHandler implements IUpdateShopCommand{
    private IShopRepository repository;

    public UpdateShopCommandHandler(IShopRepository repository) {
        this.repository = repository;
    }

    @Override
    public Shop updateShop(int shopId) throws Exception {
        return this.repository.updateShop(shopId);
    }
    
    
}
