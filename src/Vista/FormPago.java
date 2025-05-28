
package Vista;

import Conexion.Conexion;
import java.sql.Connection;

public class FormPago extends javax.swing.JFrame {

    public FormPago() {
        initComponents();
        Connection conn = Conexion.getConexion(); // Conexión activa
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtFechaPago = new javax.swing.JTextField();
        txtMonto = new javax.swing.JFormattedTextField();
        cmbMetodoPago = new javax.swing.JComboBox<>();
        txtIdusuario = new javax.swing.JTextField();
        cmbEstado = new javax.swing.JComboBox<>();
        btnRegresar = new javax.swing.JButton();
        btnPagar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PAGO DE SOLICITUD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 3, 18), new java.awt.Color(0, 0, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtFechaPago.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FECHA DE PAGO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14), new java.awt.Color(0, 153, 153))); // NOI18N
        jPanel1.add(txtFechaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 190, 60));

        txtMonto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MONTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14), new java.awt.Color(0, 153, 153))); // NOI18N
        jPanel1.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 150, 70));

        cmbMetodoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tarjeta", "Yape", "Plin", "Efectivo" }));
        cmbMetodoPago.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "METODO DE PAGO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14), new java.awt.Color(0, 153, 153))); // NOI18N
        jPanel1.add(cmbMetodoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 190, 70));

        txtIdusuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID USUARIO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14), new java.awt.Color(0, 153, 153))); // NOI18N
        jPanel1.add(txtIdusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 200, 70));

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pagado", "Pendiente", "Fallido" }));
        cmbEstado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ESTADO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14), new java.awt.Color(0, 153, 153))); // NOI18N
        jPanel1.add(cmbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 130, 70));

        btnRegresar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnRegresar.setText("REGRESAR");
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 510, 140, 60));

        btnPagar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnPagar.setText("PAGAR");
        jPanel1.add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 140, 60));

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnCancelar.setText("CANCELAR");
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, 140, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
    public static void main(String args[]) {
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(FormPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new FormPago().setVisible(true));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCancelar;
    public javax.swing.JButton btnPagar;
    public javax.swing.JButton btnRegresar;
    public javax.swing.JComboBox<String> cmbEstado;
    public javax.swing.JComboBox<String> cmbMetodoPago;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txtFechaPago;
    public javax.swing.JTextField txtIdusuario;
    public javax.swing.JFormattedTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
