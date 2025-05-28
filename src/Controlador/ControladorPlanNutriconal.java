package Controlador;

import Modelo.SolicitudPlanNutricional;
import Vista.FormSolicitudPlan;
import Vista.FormPago;
import DAO.SolicitudPlanNutricionalDAO;
import Vista.FormUsuario;
import java.awt.event.*;
import javax.swing.*;

public class ControladorPlanNutriconal implements ActionListener {
    private SolicitudPlanNutricional modelo;
    private FormSolicitudPlan vista;
    private FormPago vistaPago;
    private SolicitudPlanNutricionalDAO planDAO;

    public ControladorPlanNutriconal(SolicitudPlanNutricional modelo, FormSolicitudPlan vista, FormPago vistaPago) {
        this.modelo = modelo;
        this.vista = vista;
        this.vistaPago = vistaPago;
        this.planDAO = new SolicitudPlanNutricionalDAO();

        this.vista.btnSolicitarPlan.addActionListener(this);
        this.vista.btnContinuar.addActionListener(this);
        this.vista.btnRegresar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnSolicitarPlan) {
            try {
                modelo.setIdUsuario(Integer.parseInt(vista.txtIdusuario.getText()));
                modelo.setObjetivo((String) vista.cmbObjetivo.getSelectedItem());
                modelo.setActividadFisica((String) vista.cmbActividadFisica.getSelectedItem());
                modelo.setFrecuenciaEjercicioSemana((Integer) vista.spnFrecuenciaEjercicio.getValue());
                modelo.setCondicionesMedicas(vista.txtCondicionMedica.getText());
                modelo.setPreferenciasAlimenticias((String) vista.cmbPreferenciasAlimenticias.getSelectedItem());
                modelo.setAlergias(vista.txtAlergias.getText());
                modelo.setEstiloAlimentacionActual((String) vista.cmbEstiloAlimentacion.getSelectedItem());

                if (planDAO.insertarPlan(modelo)) {
                    JOptionPane.showMessageDialog(vista, "Datos del plan nutricional guardados correctamente.");
                } else {
                    JOptionPane.showMessageDialog(vista, "Error al guardar datos del plan.");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(vista, "Error: " + ex.getMessage());
            }
        } else if (e.getSource() == vista.btnContinuar) {
            vistaPago.setVisible(true);
            vista.dispose();
        } else if (e.getSource() == vista.btnRegresar) {
            FormUsuario formUsuario = new FormUsuario();
            formUsuario.setVisible(true);
            vista.dispose();
        }
    }
}