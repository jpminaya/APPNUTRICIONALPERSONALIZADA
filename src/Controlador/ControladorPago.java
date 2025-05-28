package Controlador;

import Modelo.Pago;
import Vista.FormPago;
import Vista.FormSolicitudPlan;
import DAO.PagoDAO;
import java.awt.event.*;
import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ControladorPago implements ActionListener {
    private Pago modelo;
    private FormPago vista;
    private FormSolicitudPlan vistaAnterior;
    private PagoDAO pagoDAO;

    public ControladorPago(Pago modelo, FormPago vista, FormSolicitudPlan vistaAnterior) {
        this.modelo = modelo;
        this.vista = vista;
        this.vistaAnterior = vistaAnterior;
        this.pagoDAO = new PagoDAO();

        this.vista.btnPagar.addActionListener(this);
        this.vista.btnCancelar.addActionListener(this);
        this.vista.btnRegresar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnPagar) {
            try {
                int idUsuario = Integer.parseInt(vista.txtIdusuario.getText());
                double monto = Double.parseDouble(vista.txtMonto.getText());
                String metodoPago = (String) vista.cmbMetodoPago.getSelectedItem();
                String fechaTexto = vista.txtFechaPago.getText();
                String estado = (String) vista.cmbEstado.getSelectedItem();

                SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
                Date fechaPago = formatoFecha.parse(fechaTexto);

                modelo.setIdUsuario(idUsuario);
                modelo.setMonto(monto);
                modelo.setMetodoPago(metodoPago);
                modelo.setFechaPago(fechaPago);
                modelo.setEstado(estado);

                if (pagoDAO.insertarPago(modelo)) {
                    JOptionPane.showMessageDialog(vista, "Pago registrado con éxito.");
                } else {
                    JOptionPane.showMessageDialog(vista, "Error al registrar el pago.");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(vista, "Error: Datos numéricos inválidos.");
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(vista, "Error: Formato de fecha inválido. Use yyyy-MM-dd.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(vista, "Error: " + ex.getMessage());
            }
        } else if (e.getSource() == vista.btnCancelar) {
            System.exit(0);
        } else if (e.getSource() == vista.btnRegresar) {
            vistaAnterior.setVisible(true);
            vista.dispose();
        }
    }
}