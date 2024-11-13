package co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Shop;
import java.util.List;

/**
 *
 * @author CLEYMER
 */
public interface IShopRepository {
    Shop save(Shop shop);  // Guardar un nuevo Shop
    Shop findById(int id); // Buscar un Shop por ID
    List<Shop> findAll();  // Obtener todos los Shops
    Shop update(Shop shop); // Actualizar un Shop existente
    void delete(int id);
    Shop findByName(String name);
}
