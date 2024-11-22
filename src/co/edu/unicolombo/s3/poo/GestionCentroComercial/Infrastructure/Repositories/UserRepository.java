
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Infrastructure.Repositories;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IUserRepository;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.User;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Infrastructure.Persistence.DatabaseConnection;

/**
 *
 * @author Daniel
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository extends DatabaseConnection implements IUserRepository{
    public static List<User> userDb;

    @Override
    public User saveUser(User user) throws Exception {
        connect();
        String sql = "INSERT INTO users (name, phone, email, address) VALUES (?, ?, ?, ?)";
        
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, user.getName());
            stmt.setInt(2, user.getPhone());
            stmt.setString(3, user.getEmail());
            stmt.setString(4, user.getAddress());
            stmt.executeUpdate();
            System.out.println("Usuario guardado correctamente.");
            return new User(user.getName(), user.getPhone(), user.getEmail(), user.getAddress());
        } catch (SQLException e) {
            System.err.println("Error al guardar el Shop: " + e.getMessage());
            return null;
        } finally {
            close();
        }
    }

    @Override
    public User findById(int UserId) {
        connect();
        String sql = "SELECT * FROM users WHERE user_id = ?";
        User user = null;
        
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, UserId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                user = new User(
                rs.getString("name"),
                rs.getInt("phone"),
                rs.getString("email"),
                rs.getString("address")
                );
                user.setId(rs.getInt("id"));
            }
        } catch (SQLException e) {
            System.err.println("Error al buscar el usuario por ID: " + e.getMessage());
        } finally {
            close();
        }
        return user;
    }

    @Override
    public User findByName(String userName) {
        connect();
        String sql = "SELECT * FROM users WHERE name = ?";
        User user = null;
        
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, userName);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                user = new User(
                    rs.getString("name"),
                    rs.getInt("phone"),
                    rs.getString("email"),
                    rs.getString("address")
                );
                user.setId(rs.getInt("user_id"));
            }
        } catch (SQLException e) {
            System.err.println("Error al buscar el Usuario por nombre: " + e.getMessage());
        } finally {
            close();
        }
        
        return user;
    }

    @Override
    public List<User> findAll() {
        connect();
        String sql = "SELECT * FROM users";
        List<User> users = new ArrayList<>();
        
        try (Connection conn = getConnection(); Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                User user = new User(
                    rs.getString("name"),
                    rs.getInt("phone"),
                    rs.getString("email"),
                    rs.getString("address")
                );
                user.setId(rs.getInt("user_id"));
                users.add(user);
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener todos los usuarios: " + e.getMessage());
        } finally {
            close();
        }
        
        return users;
    }

    @Override
    public void deleteUser(int userId) {
        connect();
        String sql = "DELETE FROM users WHERE user_id = ?";
        
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, userId);
            stmt.executeUpdate();
            System.out.println("Usuario eliminado correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al eliminar al usuario: " + e.getMessage());
        } finally {
            close();
        }
    }

    @Override
    public User updateUser(User user) {
        connect();
        String sql = "UPDATE users SET name = ?, phone = ?, email = ?, address = ? WHERE shop_id = ?";
        
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, user.getName());
            stmt.setInt(2, user.getPhone());
            stmt.setString(3, user.getEmail());
            stmt.setString(4, user.getAddress());
            stmt.setInt(7, user.getId());
            stmt.executeUpdate();
            System.out.println("Usuario actualizado correctamente.");
            return new User(user.getName(), user.getPhone(), user.getEmail(), user.getAddress());

        } catch (SQLException e) {
            System.err.println("Error al actualizar el usuario: " + e.getMessage());
            return null;
        } finally {
            close();
        }
    }
}
