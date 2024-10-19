package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.Handlers.Commands.Shop;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Commands.Shop.IDeleteShopCommand;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IShopRepository;

/**
 *
 * @author CLEYMER
 */
public class DeleteShopCommandHandler implements IDeleteShopCommand{
    private IShopRepository repository;

    public DeleteShopCommandHandler(IShopRepository repository) {
        this.repository = repository;
    }

    @Override
    public void deleteShop(int shopId) throws Exception {
        this.repository.deleteShop(shopId);
    }
    
    
}
