package DAO;

import Conexion.Conexion;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class usuarioDAO {

    private final Connection con;

    public usuarioDAO() {
        this.con = Conexion.getConexion();
    }

    /**
     * Inserta un nuevo usuario en la tabla UsuariosAplicativoss.
     * @param u El modelo Usuario con todos sus campos ya seteados.
     * @return true si se insertó correctamente, false en caso contrario.
     */
    public boolean insertarUsuario(Usuario u) {
        String sql = "INSERT INTO UsuariosAplicativoss "
                   + "(NOMBRE_COMPLETO, CORREO_ELECTRONICO, SEXO, EDAD, PESO, ESTATURA, IMC) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, u.getNombreCompleto());
            ps.setString(2, u.getCorreoElectronico());
            ps.setString(3, u.getSexo());
            ps.setInt(4, u.getEdad());
            ps.setDouble(5, u.getPeso());
            ps.setDouble(6, u.getEstatura());
            ps.setDouble(7, u.getImc());
            
            int filas = ps.executeUpdate();
            return filas > 0;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}