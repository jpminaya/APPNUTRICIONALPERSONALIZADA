package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    // Variable de conexión compartida
    private static Connection conexion = null;

    // Parámetros de conexión (modifícalos según tus datos)
    private static final String usuario = "aplicacion";
    private static final String contrasena = "123";
    private static final String db = "jp";
    private static final String ip = "localhost";
    private static final String puerto = "1433";

    // Método para obtener la conexión
    public static Connection getConexion() {
        if (conexion == null) {
            try {
                // Cargar el driver JDBC (opcional desde Java 6+, pero recomendable)
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

                // Cadena de conexión
                String url = "jdbc:sqlserver://" + ip + ":" + puerto + ";databaseName=" + db + ";encrypt=true;trustServerCertificate=true";

                // Establecer conexión
                conexion = DriverManager.getConnection(url, usuario, contrasena);
                JOptionPane.showMessageDialog(null, "✅ Conexión exitosa a SQL Server");

            } catch (ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, "❌ Error: Driver JDBC no encontrado.\n" + e.toString());
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "❌ Error: Fallo en la conexión a la base de datos.\n" + e.toString());
            }
        }
        return conexion;
    }
}