package Services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author amelb
 */
public class connection {
    static {
        try {
            // Charger le pilote JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Erreur lors du chargement du pilote MySQL JDBC", e);
        }
    }

    public static Connection getConnection() throws SQLException {
        String jdbcUrl = "jdbc:mysql://localhost:3306/SOC_DB?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String username = "root";
        String password = "root";

        return DriverManager.getConnection(jdbcUrl, username, password);
    }

    public static PreparedStatement prepareStatement(String sql) throws SQLException {
        Connection connection = getConnection();
        return connection.prepareStatement(sql);
    }
}
