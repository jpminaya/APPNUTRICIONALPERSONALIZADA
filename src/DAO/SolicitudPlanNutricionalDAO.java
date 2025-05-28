package DAO;

import Modelo.SolicitudPlanNutricional;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SolicitudPlanNutricionalDAO {
    private Connection conexion;

    public SolicitudPlanNutricionalDAO() {
        conexion = Conexion.getConexion();
    }

    public boolean insertarSolicitud(SolicitudPlanNutricional solicitud) {
        String sql = "INSERT INTO SolicitudPlanNutricionales (ID_USUARIO, OBJETIVO, ACTIVIDAD_FISICA, FRECUENCIA_EJERCICIO_SEMANA, CONDICIONES_MEDICAS, PREFERENCIAS_ALIMENTICIAS, ALERGIAS, ESTILO_ALIMENTACION_ACTUAL) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setInt(1, solicitud.getIdUsuario());
            ps.setString(2, solicitud.getObjetivo());
            ps.setString(3, solicitud.getActividadFisica());
            ps.setInt(4, solicitud.getFrecuenciaEjercicioSemana());
            ps.setString(5, solicitud.getCondicionesMedicas());
            ps.setString(6, solicitud.getPreferenciasAlimenticias());
            ps.setString(7, solicitud.getAlergias());
            ps.setString(8, solicitud.getEstiloAlimentacionActual());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean insertarPlan(SolicitudPlanNutricional modelo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}