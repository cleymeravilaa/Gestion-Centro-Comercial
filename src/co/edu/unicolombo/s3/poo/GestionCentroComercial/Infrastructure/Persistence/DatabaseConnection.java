
package co.edu.unicolombo.s3.poo.GestionCentroComercial.Infrastructure.Persistence;

/**
 *
 * @author CLEYMER
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class DatabaseConnection {
    private Connection connection;

    // Método para conectarse a la base de datos
    public void connect() {
        try {
            // Cargar el driver de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // URL de conexión a la base de datos
            String url = System.getenv("jdbc:mysql://localhost:3306/parqueaderobd"); // Cambia esto según tu configuración
            String username = System.getenv("root"); // Cambia esto con tu usuario de MySQL
            String password = System.getenv("12345");// Cambia esto con tu contraseña de MySQL

            // Conectarse a la base de datos
            this.connection = DriverManager.getConnection(url, username, password);
            System.out.println("Conexión establecida correctamente.");
        } catch (SQLException | ClassNotFoundException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }

    // Método para cerrar la conexión
    public void close() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Conexión cerrada correctamente.");
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }

    // Método para obtener el objeto Connection
    public Connection getConnection() {
        return connection;
    }
}
