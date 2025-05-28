package Main;

import Conexion.Conexion; // Asegúrate de importar tu clase de conexión
import Controlador.ControladorPago;
import Controlador.ControladorPlanNutriconal;
import Controlador.ControladorUsuario;
import Modelo.Pago;
import Modelo.SolicitudPlanNutricional;
import Modelo.Usuario;
import Vista.FormPago;
import Vista.FormSolicitudPlan;
import Vista.FormUsuario;
import java.sql.Connection; // Importar para verificar conexión

public class Main {
    public static void main(String[] args) {
        // Verificar conexión a la base de datos al inicio
        Connection con = Conexion.getConexion();
        if (con == null) {
            System.out.println("❌ Error: No se pudo establecer la conexión. El sistema no continuará.");
            return; // Salir si no hay conexión
        }

        // MODELOS
        Usuario modeloUsuario = new Usuario();
        SolicitudPlanNutricional modeloPlan = new SolicitudPlanNutricional();
        Pago modeloPago = new Pago();

        // VISTAS
        FormUsuario vistaUsuario = new FormUsuario();
        FormSolicitudPlan vistaPlan = new FormSolicitudPlan();
        FormPago vistaPago = new FormPago();

        // CONTROLADORES
        ControladorUsuario controladorUsuario = new ControladorUsuario(modeloUsuario, vistaUsuario, vistaPlan);
        ControladorPlanNutriconal controladorPlan = new ControladorPlanNutriconal(modeloPlan, vistaPlan, vistaPago);
        ControladorPago controladorPago = new ControladorPago(modeloPago, vistaPago, vistaPlan);

        // MOSTRAR LA PRIMERA VISTA
        vistaUsuario.setVisible(true);
    }
}