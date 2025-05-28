
package Vista;

import Conexion.Conexion;
import java.sql.Connection;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class FormUsuario extends javax.swing.JFrame {

    public FormUsuario() {
        initComponents();
        Connection conn = Conexion.getConexion(); // Conexión activa
    }
                            
    @SuppressWarnings("unchecked")
     
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCorreoElectronico = new javax.swing.JTextField();
        cbSexo = new javax.swing.JComboBox<>();
        spEdad = new javax.swing.JSpinner();
        txtEstatura = new javax.swing.JFormattedTextField();
        txtPeso = new javax.swing.JFormattedTextField();
        btnContinuar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        txtNombreCompleto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRO DE USUARIO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 3, 18), new java.awt.Color(0, 102, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCorreoElectronico.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CORREO ELECTRONICO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14), new java.awt.Color(0, 153, 153))); // NOI18N
        jPanel1.add(txtCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 250, 60));

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Otro" }));
        cbSexo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SEXO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14), new java.awt.Color(0, 153, 153))); // NOI18N
        cbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSexoActionPerformed(evt);
            }
        });
        jPanel1.add(cbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 150, 70));

        spEdad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EDAD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14), new java.awt.Color(0, 153, 153))); // NOI18N
        jPanel1.add(spEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 110, 80));

        txtEstatura.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ESTATURA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14), new java.awt.Color(0, 153, 153))); // NOI18N
        jPanel1.add(txtEstatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 100, 60));

        txtPeso.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PESO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14), new java.awt.Color(0, 153, 153))); // NOI18N
        jPanel1.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 100, 60));

        btnContinuar.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        btnContinuar.setText("CONTINUAR");
        jPanel1.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 130, 60));

        btnRegistrar.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        btnRegistrar.setText("REGISTRAR");
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 130, 60));

        txtNombreCompleto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOMBRE COMPLETO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14), new java.awt.Color(0, 153, 153))); // NOI18N
        jPanel1.add(txtNombreCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 250, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSexoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormUsuario().setVisible(true);
            }
        });
    }
    // Declaración de componentes accesibles desde el controlador
    public JButton getBtnRegistrar() {
        return btnRegistrar;
    }

    public JButton getBtnContinuar() {
        return btnContinuar;
    }

    public JTextField getTxtNombreCompleto() {
        return txtNombreCompleto;
    }

    public JTextField getTxtCorreoElectronico() {
        return txtCorreoElectronico;
    }

    public JComboBox<String> getCbSexo() {
        return cbSexo;
    }

    public JSpinner getSpEdad() {
        return spEdad;
    }

    public JFormattedTextField getTxtPeso() {
        return txtPeso;
    }

    public JFormattedTextField getTxtEstatura() {
        return txtEstatura;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnContinuar;
    public javax.swing.JButton btnRegistrar;
    public javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JSpinner spEdad;
    public javax.swing.JTextField txtCorreoElectronico;
    public javax.swing.JFormattedTextField txtEstatura;
    public javax.swing.JTextField txtNombreCompleto;
    public javax.swing.JFormattedTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}
