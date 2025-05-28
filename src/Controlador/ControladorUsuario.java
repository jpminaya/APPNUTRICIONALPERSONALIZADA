package Controlador;

import Modelo.Usuario;
import Vista.FormUsuario;
import Vista.FormSolicitudPlan;
import DAO.usuarioDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorUsuario implements ActionListener {
    private final Usuario usuarioModel;
    private final FormUsuario usuarioView;
    private final FormSolicitudPlan solicitudPlanView;
    private final usuarioDAO usuarioDAO;

    public ControladorUsuario(Usuario usuarioModel,
                              FormUsuario usuarioView,
                              FormSolicitudPlan solicitudPlanView) {
        this.usuarioModel = usuarioModel;
        this.usuarioView = usuarioView;
        this.solicitudPlanView = solicitudPlanView;
        this.usuarioDAO = new usuarioDAO();

        // Registrar listeners
        this.usuarioView.getBtnRegistrar().addActionListener(this);
        this.usuarioView.getBtnContinuar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Botón Registrar → guarda en BD
        if (e.getSource() == usuarioView.getBtnRegistrar()) {
            try {
                // Leer datos del formulario
                usuarioModel.setNombreCompleto(usuarioView.getTxtNombreCompleto().getText());
                usuarioModel.setCorreoElectronico(usuarioView.getTxtCorreoElectronico().getText());
                usuarioModel.setSexo((String) usuarioView.getCbSexo().getSelectedItem());
                usuarioModel.setEdad((Integer) usuarioView.getSpEdad().getValue());
                usuarioModel.setPeso(Double.parseDouble(usuarioView.getTxtPeso().getText()));
                usuarioModel.setEstatura(Double.parseDouble(usuarioView.getTxtEstatura().getText()));
                usuarioModel.calcularIMC();

                // Insertar en BD
                boolean exito = usuarioDAO.insertarUsuario(usuarioModel);
                if (exito) {
                    JOptionPane.showMessageDialog(usuarioView,
                        "Usuario registrado con éxito.",
                        "Éxito",
                        JOptionPane.INFORMATION_MESSAGE);
                    // Limpia formulario tras registro
                    usuarioView.getTxtNombreCompleto().setText("");
                    usuarioView.getTxtCorreoElectronico().setText("");
                    usuarioView.getCbSexo().setSelectedIndex(0);
                    usuarioView.getSpEdad().setValue(18);
                    usuarioView.getTxtPeso().setText("");
                    usuarioView.getTxtEstatura().setText("");
                } else {
                    JOptionPane.showMessageDialog(usuarioView,
                        "Error al registrar usuario.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(usuarioView,
                    "Por favor ingresa valores válidos en los campos numéricos.",
                    "Formato inválido",
                    JOptionPane.WARNING_MESSAGE);
            }

        // Botón Continuar → navega al siguiente formulario
        } else if (e.getSource() == usuarioView.getBtnContinuar()) {
            solicitudPlanView.setVisible(true);
            usuarioView.dispose();
        }
    }
}