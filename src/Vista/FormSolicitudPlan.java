package Vista;

import Conexion.Conexion;
import java.sql.Connection;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class FormSolicitudPlan extends javax.swing.JFrame {

    public FormSolicitudPlan() {
        initComponents();
        Connection conn = Conexion.getConexion(); // Conexión activa
    }

    // TODO: Agrega tu método initComponents aquí, igual que en tu plantilla de NetBeans.

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtIdusuario = new javax.swing.JTextField();
        cmbPreferenciasAlimenticias = new javax.swing.JComboBox<>();
        cmbObjetivo = new javax.swing.JComboBox<>();
        spnFrecuenciaEjercicio = new javax.swing.JSpinner();
        txtAlergias = new javax.swing.JTextField();
        txtCondicionMedica = new javax.swing.JTextField();
        cmbActividadFisica = new javax.swing.JComboBox<>();
        cmbEstiloAlimentacion = new javax.swing.JComboBox<>();
        btnRegresar = new javax.swing.JButton();
        btnSolicitarPlan = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SOLICITUD PLAN NUTRICIONAL ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 18), new java.awt.Color(0, 153, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIdusuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID USUARIO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14), new java.awt.Color(0, 153, 153))); // NOI18N
        jPanel1.add(txtIdusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 190, 50));

        cmbPreferenciasAlimenticias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vegetariana", "Alta en proteínas", "Sin gluten", "Baja en carbohidratos", "Alta en calorías", "Sin azúcar", "Sin lácteos", " " }));
        cmbPreferenciasAlimenticias.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PREFERENCIAS ALIMENTICIAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14), new java.awt.Color(0, 153, 153))); // NOI18N
        jPanel1.add(cmbPreferenciasAlimenticias, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 220, 70));

        cmbObjetivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bajar de peso", "Aumentar masa muscular", "Mantener peso" }));
        cmbObjetivo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OBJETIVO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14), new java.awt.Color(0, 153, 153))); // NOI18N
        jPanel1.add(cmbObjetivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 170, 70));

        spnFrecuenciaEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FRECUENCIA EJERCICIO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14), new java.awt.Color(0, 153, 153))); // NOI18N
        jPanel1.add(spnFrecuenciaEjercicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 190, 70));

        txtAlergias.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ALERGIAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14), new java.awt.Color(0, 153, 153))); // NOI18N
        jPanel1.add(txtAlergias, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 200, 60));

        txtCondicionMedica.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONDICION MEDICA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14), new java.awt.Color(0, 153, 153))); // NOI18N
        jPanel1.add(txtCondicionMedica, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 200, 60));

        cmbActividadFisica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sedentario", "Ligero", "Moderado", "Intenso" }));
        cmbActividadFisica.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ACTIVIDAD FISICA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14), new java.awt.Color(0, 153, 153))); // NOI18N
        cmbActividadFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbActividadFisicaActionPerformed(evt);
            }
        });
        jPanel1.add(cmbActividadFisica, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 220, 70));

        cmbEstiloAlimentacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comida rápida frecuente", "Dieta balanceada", "Vegetariana", "Alta en azúcares", "Dieta casera tradicional", "Desorganizada", "Alta en carbohidratos" }));
        cmbEstiloAlimentacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ESTILO DE ALIMENTACION ACTUAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14), new java.awt.Color(0, 153, 153))); // NOI18N
        jPanel1.add(cmbEstiloAlimentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 280, 70));

        btnRegresar.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        btnRegresar.setText("REGRESAR");
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 520, 140, 60));

        btnSolicitarPlan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSolicitarPlan.setText("SOLICITAR PLAN");
        jPanel1.add(btnSolicitarPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 150, 60));

        btnContinuar.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        btnContinuar.setText("CONTINUAR");
        jPanel1.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, 140, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbActividadFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbActividadFisicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbActividadFisicaActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSolicitudPlan().setVisible(true);
            }
        });
    }
    
    public JTextField getTxtIdusuario() {
        return txtIdusuario;
    }

    public JComboBox<String> getCmbPreferenciasAlimenticias() {
        return cmbPreferenciasAlimenticias;
    }

    public JComboBox<String> getCmbObjetivo() {
        return cmbObjetivo;
    }

    public JSpinner getSpnFrecuenciaEjercicio() {
        return spnFrecuenciaEjercicio;
    }

    public JTextField getTxtAlergias() {
        return txtAlergias;
    }

    public JTextField getTxtCondicionMedica() {
        return txtCondicionMedica;
    }

    public JComboBox<String> getCmbActividadFisica() {
        return cmbActividadFisica;
    }

    public JComboBox<String> getCmbEstiloAlimentacion() {
        return cmbEstiloAlimentacion;
    }

    public JButton getBtnSolicitarPlan() {
        return btnSolicitarPlan;
    }

    public JButton getBtnContinuar() {
        return btnContinuar;
    }

    public JButton getBtnRegresar() {
        return btnRegresar;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnContinuar;
    public javax.swing.JButton btnRegresar;
    public javax.swing.JButton btnSolicitarPlan;
    public javax.swing.JComboBox<String> cmbActividadFisica;
    public javax.swing.JComboBox<String> cmbEstiloAlimentacion;
    public javax.swing.JComboBox<String> cmbObjetivo;
    public javax.swing.JComboBox<String> cmbPreferenciasAlimenticias;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JSpinner spnFrecuenciaEjercicio;
    public javax.swing.JTextField txtAlergias;
    public javax.swing.JTextField txtCondicionMedica;
    public javax.swing.JTextField txtIdusuario;
    // End of variables declaration//GEN-END:variables
}

