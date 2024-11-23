
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Infrastructure.Repositories;

import co.edu.unicolombo.s3.poo.GestionCentroComercial.Domain.Model.Administrator;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Business.interfaces.Repositories.IAdminRepository;
import co.edu.unicolombo.s3.poo.GestionCentroComercial.Infrastructure.Persistence.DatabaseConnection;

/**
 *
 * @author Daniel
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AdministratorRepository extends DatabaseConnection implements IAdminRepository{
    public static List<Administrator> administratorDb;
    
    @Override
    public Administrator login(String email, String password) throws Exception {
    connect();
    String sql = "SELECT * FROM administrators WHERE email = ? AND password = ?";
    Administrator admin = null;

    try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setString(1, email);
        stmt.setString(2, password);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            admin = new Administrator(
                rs.getString("name"),
                rs.getString("email"),
                rs.getString("password"),
                rs.getInt("phone"),
                rs.getString("address")
            );
            admin.setId(rs.getInt("admin_id"));
        }
    } catch (SQLException e) {
        System.err.println("Error al intentar iniciar sesión: " + e.getMessage());
    } finally {
        close();
    }

    return admin;
}


    @Override
    public Administrator saveAdmin(Administrator admin) throws Exception {
        connect();
        String sql = "INSERT INTO administrators (name, phone, email, address, password) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, admin.getName());
            stmt.setInt(2, admin.getPhone());
            stmt.setString(3, admin.getEmail());
            stmt.setString(4, admin.getAddress());
            stmt.setString(5, admin.getPassword());
            stmt.executeUpdate();
            System.out.println("Administrador guardado correctamente.");
            return admin;
        } catch (SQLException e) {
            System.err.println("Error al guardar el Administrador: " + e.getMessage());
            return null;
        } finally {
            close();
        }
    }

    @Override
    public Administrator findAdminById(int adminId) throws Exception {
        connect();
        String sql = "SELECT * FROM administrators WHERE admin_id = ?";
        Administrator admin = null;

        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, adminId);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                admin = new Administrator(
                    rs.getString("name"),
                    rs.getString("email"),
                    rs.getString("password"),
                    rs.getInt("phone"),
                    rs.getString("address")
                );
                admin.setId(rs.getInt("admin_id"));
            }
        } catch (SQLException e) {
            System.err.println("Error al buscar el Administrador por ID: " + e.getMessage());
        } finally {
            close();
        }

        return admin;
    }

    @Override
    public Administrator findAdminByEmail(String adminEmail) throws Exception {
        connect();
        String sql = "SELECT * FROM administrators WHERE email = ?";
        Administrator admin = null;

        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, adminEmail);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                admin = new Administrator(
                    rs.getString("name"),
                    rs.getString("email"),
                    rs.getString("password"),
                    rs.getInt("phone"),
                    rs.getString("address")
                );
                admin.setId(rs.getInt("admin_id"));
            }
        } catch (SQLException e) {
            System.err.println("Error al buscar el Administrador por email: " + e.getMessage());
        } finally {
            close();
        }

        return admin;
    }

    @Override
    public List<Administrator> findAll() throws Exception {
        connect();
        String sql = "SELECT * FROM administrators";
        List<Administrator> admins = new ArrayList<>();

        try (Connection conn = getConnection(); Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Administrator admin = new Administrator(
                    rs.getString("name"),
                    rs.getString("email"),
                    rs.getString("password"),
                    rs.getInt("phone"),
                    rs.getString("address")
                );
                admin.setId(rs.getInt("admin_id"));
                admins.add(admin);
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener todos los Administradores: " + e.getMessage());
        } finally {
            close();
        }

        return admins;
    }

    @Override
    public void deleteAdmin(int adminId) throws Exception {
        connect();
        String sql = "DELETE FROM administrators WHERE admin_id = ?";

        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, adminId);
            stmt.executeUpdate();
            System.out.println("Administrador eliminado correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al eliminar el Administrador: " + e.getMessage());
        } finally {
            close();
        }
    }

    @Override
    public Administrator updateAdmin(Administrator admin) throws Exception {
        connect();
        String sql = "UPDATE administrators SET name = ?, phone = ?, email = ?, address = ?, password = ? WHERE admin_id = ?";

        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, admin.getName());
            stmt.setInt(2, admin.getPhone());
            stmt.setString(3, admin.getEmail());
            stmt.setString(4, admin.getAddress());
            stmt.setString(5, admin.getPassword());
            stmt.setInt(6, admin.getId());
            stmt.executeUpdate();
            System.out.println("Administrador actualizado correctamente.");
            return admin;
        } catch (SQLException e) {
            System.err.println("Error al actualizar el Administrador: " + e.getMessage());
            return null;
        } finally {
            close();
        }
    }
    
}
