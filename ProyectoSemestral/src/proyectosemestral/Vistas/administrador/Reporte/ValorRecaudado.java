/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectosemestral.Vistas.administrador.Reporte;

import proyectosemestral.Vistas.VLogin;
import proyectosemestral.Vistas.administrador.Lista_Reporte;
import proyectosemestral.Vistas.administrador.Lista_Vehiculos;
import proyectosemestral.Vistas.administrador.Lista_Vendedores;


/**
 *
 * @author cetecom
 */
public class ValorRecaudado extends javax.swing.JFrame {

    /**
     * Creates new form Lista_Clientes
     */
    public ValorRecaudado() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lblIdentificacion1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        lblIdentificacion2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        pane_parte_arriba = new javax.swing.JPanel();
        icon_auto = new javax.swing.JLabel();
        lbl_autto = new javax.swing.JLabel();
        lbl_listadeclientes = new javax.swing.JLabel();
        lbl_nombe_de = new javax.swing.JLabel();
        lbl_vendedor = new javax.swing.JLabel();
        lbl_icon_persona = new javax.swing.JLabel();
        pane_lado_izquierdo = new javax.swing.JPanel();
        btn_Vendedores = new javax.swing.JButton();
        btn_Vehiculo = new javax.swing.JButton();
        btn_Reporte = new javax.swing.JButton();
        btn_cerrar_session = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador - Reportes");

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Septiembre 2020", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));

        lblIdentificacion1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblIdentificacion1.setForeground(new java.awt.Color(204, 204, 204));
        lblIdentificacion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIdentificacion1.setText("Total Mensual:");

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField1.setText("$10.000,00");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lblIdentificacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 6, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lblIdentificacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));

        lblIdentificacion2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblIdentificacion2.setForeground(new java.awt.Color(204, 204, 204));
        lblIdentificacion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIdentificacion2.setText("Total Diario:");

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField2.setText("$1.000,00");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lblIdentificacion2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 6, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField2)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lblIdentificacion2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pane_parte_arriba.setBackground(new java.awt.Color(204, 204, 204));

        icon_auto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/car-removebg-preview.png"))); // NOI18N

        lbl_autto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_autto.setText("AUTTO");

        lbl_listadeclientes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_listadeclientes.setText("VALOR RECAUDADO");

        lbl_nombe_de.setText("Angel Perugini");

        lbl_vendedor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_vendedor.setText("Vendedor");

        lbl_icon_persona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon_person3.png"))); // NOI18N

        javax.swing.GroupLayout pane_parte_arribaLayout = new javax.swing.GroupLayout(pane_parte_arriba);
        pane_parte_arriba.setLayout(pane_parte_arribaLayout);
        pane_parte_arribaLayout.setHorizontalGroup(
            pane_parte_arribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_parte_arribaLayout.createSequentialGroup()
                .addComponent(icon_auto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_autto)
                .addGap(218, 218, 218)
                .addComponent(lbl_listadeclientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pane_parte_arribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_nombe_de, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(lbl_icon_persona)
                .addGap(41, 41, 41))
        );
        pane_parte_arribaLayout.setVerticalGroup(
            pane_parte_arribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane_parte_arribaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pane_parte_arribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icon_auto)
                    .addGroup(pane_parte_arribaLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lbl_nombe_de)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_vendedor))
                    .addGroup(pane_parte_arribaLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lbl_icon_persona)))
                .addGap(34, 34, 34))
            .addGroup(pane_parte_arribaLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(pane_parte_arribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_autto)
                    .addComponent(lbl_listadeclientes))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pane_lado_izquierdo.setBackground(new java.awt.Color(102, 102, 102));

        btn_Vendedores.setBackground(new java.awt.Color(102, 102, 102));
        btn_Vendedores.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Vendedores.setText("Vendedores");
        btn_Vendedores.setBorder(null);
        btn_Vendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VendedoresActionPerformed(evt);
            }
        });

        btn_Vehiculo.setBackground(new java.awt.Color(102, 102, 102));
        btn_Vehiculo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Vehiculo.setText("Vehiculo");
        btn_Vehiculo.setBorder(null);
        btn_Vehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VehiculoActionPerformed(evt);
            }
        });

        btn_Reporte.setBackground(new java.awt.Color(102, 102, 102));
        btn_Reporte.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Reporte.setText("Reporte");
        btn_Reporte.setBorder(null);
        btn_Reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReporteActionPerformed(evt);
            }
        });

        btn_cerrar_session.setBackground(new java.awt.Color(204, 204, 204));
        btn_cerrar_session.setText("CERRAR SESION");
        btn_cerrar_session.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrar_sessionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pane_lado_izquierdoLayout = new javax.swing.GroupLayout(pane_lado_izquierdo);
        pane_lado_izquierdo.setLayout(pane_lado_izquierdoLayout);
        pane_lado_izquierdoLayout.setHorizontalGroup(
            pane_lado_izquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_lado_izquierdoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pane_lado_izquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Vendedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Vehiculo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(btn_Reporte, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(btn_cerrar_session, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        pane_lado_izquierdoLayout.setVerticalGroup(
            pane_lado_izquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_lado_izquierdoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Vendedores, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(btn_Vehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(btn_Reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(btn_cerrar_session, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pane_lado_izquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(309, 309, 309)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 387, Short.MAX_VALUE))
                    .addComponent(pane_parte_arriba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pane_parte_arriba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pane_lado_izquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Lista_Reporte().setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_VendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VendedoresActionPerformed
        // TODO add your handling code here:
        new Lista_Vendedores().setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btn_VendedoresActionPerformed

    private void btn_VehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VehiculoActionPerformed
        // TODO add your handling code here:
        new Lista_Vehiculos().setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btn_VehiculoActionPerformed

    private void btn_ReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ReporteActionPerformed

    private void btn_cerrar_sessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrar_sessionActionPerformed
        // TODO add your handling code here:
        VLogin Ventana = new VLogin();

        Ventana.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btn_cerrar_sessionActionPerformed

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
            java.util.logging.Logger.getLogger(ValorRecaudado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ValorRecaudado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ValorRecaudado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ValorRecaudado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ValorRecaudado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Reporte;
    private javax.swing.JButton btn_Vehiculo;
    private javax.swing.JButton btn_Vendedores;
    private javax.swing.JButton btn_cerrar_session;
    private javax.swing.JLabel icon_auto;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblIdentificacion1;
    private javax.swing.JLabel lblIdentificacion2;
    private javax.swing.JLabel lbl_autto;
    private javax.swing.JLabel lbl_icon_persona;
    private javax.swing.JLabel lbl_listadeclientes;
    private javax.swing.JLabel lbl_nombe_de;
    private javax.swing.JLabel lbl_vendedor;
    private javax.swing.JPanel pane_lado_izquierdo;
    private javax.swing.JPanel pane_parte_arriba;
    // End of variables declaration//GEN-END:variables
}