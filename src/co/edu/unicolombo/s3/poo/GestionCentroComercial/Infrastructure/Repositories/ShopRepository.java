package co.edu.unicolombo.s3.poo.GestionCentroComercial.Infrastructure.Repositories;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IShopRepository;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Shop;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Infrastructure.Persistence.DatabaseConnection;
/**
 *
 * @author CLEYMER
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ShopRepository extends DatabaseConnection implements IShopRepository {

    // Método para guardar un nuevo Shop
    @Override
    public Shop save(Shop shop) {
        connect();
        String sql = "INSERT INTO shops (name, category, area, location, rent_price, status) VALUES (?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, shop.getName());
            stmt.setString(2, shop.getCategory());
            stmt.setDouble(3, shop.getArea());
            stmt.setString(4, shop.getLocation());
            stmt.setDouble(5, shop.getRentPrice());
            stmt.setString(6, shop.getStatus());
            stmt.executeUpdate();
            System.out.println("Tienda guardada correctamente.");
            return new Shop(shop.getName(), shop.getCategory(), shop.getArea(), shop.getLocation(), shop.getRentPrice(), shop.getStatus());
        } catch (SQLException e) {
            System.err.println("Error al guardar el Shop: " + e.getMessage());
            return null;
            
        } finally {
            close();
        }
    }

    // Método para buscar un Shop por ID
    @Override
    public Shop findById(int id) {
        connect();
        String sql = "SELECT * FROM shops WHERE shop_id = ?";
        Shop shop = null;
        
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                shop = new Shop(
                    rs.getString("name"),
                    rs.getString("category"),
                    rs.getDouble("area"),
                    rs.getString("location"),
                    rs.getDouble("rent_price"),
                    rs.getString("status")
                );
                shop.setId(rs.getInt("id"));
            }
        } catch (SQLException e) {
            System.err.println("Error al buscar el Shop por ID: " + e.getMessage());
        } finally {
            close();
        }
        
        return shop;
    }
    
    @Override
    public Shop findByName(String name) {
        connect();
        String sql = "SELECT * FROM shops WHERE name = ?";
        Shop shop = null;
        
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, name);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                shop = new Shop(
                    rs.getString("name"),
                    rs.getString("category"),
                    rs.getDouble("area"),
                    rs.getString("location"),
                    rs.getDouble("rent_price"),
                    rs.getString("status")
                );
                shop.setId(rs.getInt("shop_id"));
            }
        } catch (SQLException e) {
            System.err.println("Error al buscar el Shop por nombre: " + e.getMessage());
        } finally {
            close();
        }
        
        return shop;
    }

    // Método para obtener todos los Shops
    @Override
    public List<Shop> findAll() {
        connect();
        String sql = "SELECT * FROM shops";
        List<Shop> shops = new ArrayList<>();
        
        try (Connection conn = getConnection(); Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                Shop shop = new Shop(
                    rs.getString("name"),
                    rs.getString("category"),
                    rs.getDouble("area"),
                    rs.getString("location"),
                    rs.getDouble("rent_price"),
                    rs.getString("status")
                );
                shop.setId(rs.getInt("shop_id"));
                shops.add(shop);
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener todos los Shops: " + e.getMessage());
        } finally {
            close();
        }
        
        return shops;
    }

    // Método para actualizar un Shop
    @Override
    public Shop update(Shop shop) {
        connect();
        String sql = "UPDATE shops SET name = ?, category = ?, area = ?, location = ?, rent_price = ?, status = ? WHERE shop_id = ?";
        
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, shop.getName());
            stmt.setString(2, shop.getCategory());
            stmt.setDouble(3, shop.getArea());
            stmt.setString(4, shop.getLocation());
            stmt.setDouble(5, shop.getRentPrice());
            stmt.setString(6, shop.getStatus());
            stmt.setInt(7, shop.getId());
            stmt.executeUpdate();
            System.out.println("Tienda actualizada correctamente.");
            return new Shop(shop.getName(), shop.getCategory(), shop.getArea(), shop.getLocation(), shop.getRentPrice(), shop.getStatus());

        } catch (SQLException e) {
            System.err.println("Error al actualizar el Shop: " + e.getMessage());
            return null;
        } finally {
            close();
        }
        
    }

    // Método para eliminar un Shop por ID
    @Override
    public void delete(int id) {
        connect();
        String sql = "DELETE FROM shops WHERE shop_id = ?";
        
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Tienda eliminada correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al eliminar el Shop: " + e.getMessage());
        } finally {
            close();
        }
    }


}
