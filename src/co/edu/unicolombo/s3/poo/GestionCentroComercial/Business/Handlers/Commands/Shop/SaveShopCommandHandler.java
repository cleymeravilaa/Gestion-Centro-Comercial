package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.Handlers.Commands.Shop;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Commands.Shop.ISaveShopCommand;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IShopRepository;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Shop;

/**
 *
 * @author CLEYMER
 */
public class SaveShopCommandHandler implements ISaveShopCommand {
    private IShopRepository repository;
    
    public SaveShopCommandHandler(IShopRepository repository){
        this.repository = repository;
    }

    @Override
    public Shop save(Shop shop) throws Exception {
        return repository.save(shop);
    }
    
    
}
