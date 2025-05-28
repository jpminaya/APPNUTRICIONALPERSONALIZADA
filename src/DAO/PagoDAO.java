package DAO;

import Modelo.Pago;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;

public class PagoDAO {
    private Connection conexion;

    public PagoDAO() {
        conexion = Conexion.getConexion();
    }

    public boolean insertarPago(Pago pago) {
        String sql = "INSERT INTO PagoSolicitud (ID_USUARIO, MONTO, METODO_PAGO, FECHA_PAGO, ESTADO) " +
                     "VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setInt(1, pago.getIdUsuario());
            ps.setDouble(2, pago.getMonto());
            ps.setString(3, pago.getMetodoPago());
            ps.setDate(4, new Date(pago.getFechaPago().getTime())); // java.sql.Date
            ps.setString(5, pago.getEstado());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}