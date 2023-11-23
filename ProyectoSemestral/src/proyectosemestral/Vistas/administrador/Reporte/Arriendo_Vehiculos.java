/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectosemestral.Vistas.administrador.Reporte;

import Controlador.DibujarTabla;
import Modelo.Arriendo;
import Modelo.Empleado;
import java.util.Date;
import java.util.List;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import proyectosemestral.Vistas.VLogin;
import proyectosemestral.Vistas.administrador.Lista_Reporte;
import proyectosemestral.Vistas.Administrador.Lista_Vehiculos;
import proyectosemestral.Vistas.administrador.Lista_Vendedores;


/**
 *
 * @author cetecom
 */
public class Arriendo_Vehiculos extends javax.swing.JFrame {

    private List<Arriendo> listaArriendos;

    public void setListaArriendos(List<Arriendo> listaArriendos) {
        this.listaArriendos = listaArriendos;
        //Setea los Datos de la Tabla
        
    }
    
    //Customer
    private void actualizarTabla(){
        //Declaraciones Necesarias
        DefaultTableModel modelo = (DefaultTableModel) tblReporte.getModel();
        modelo.setRowCount(0);
        String id_vendedor;
        Date fecha_inicio;
        for (Arriendo arriendo : listaArriendos){
            id_vendedor = arriendo.getRutVendedor();
            fecha_inicio = arriendo.getFechaInicio();
            modelo.addRow(new Object[] {id_vendedor, fecha_inicio});
        }
        tblReporte.setModel(modelo);
    }
    
    public Arriendo_Vehiculos() {
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

        pnlTabla = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        lblContador = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReporte = new javax.swing.JTable();
        pane_parte_arriba = new javax.swing.JPanel();
        icon_auto = new javax.swing.JLabel();
        lbl_autto = new javax.swing.JLabel();
        lbl_listadeclientes = new javax.swing.JLabel();
        lbl_nombe_de = new javax.swing.JLabel();
        lbl_vendedor = new javax.swing.JLabel();
        lbl_icon_persona = new javax.swing.JLabel();
        pane_lado_izquierdo7 = new javax.swing.JPanel();
        btn_Vendedores7 = new javax.swing.JButton();
        btn_Vehiculo7 = new javax.swing.JButton();
        btn_Reporte7 = new javax.swing.JButton();
        btn_cerrar_session7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador - Reportes");

        pnlTabla.setBackground(new java.awt.Color(153, 153, 153));
        pnlTabla.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), " AA1234 ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        jPanel21.setBackground(new java.awt.Color(102, 102, 102));

        lblContador.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblContador.setForeground(new java.awt.Color(204, 204, 204));
        lblContador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblContador.setText("Total: 5");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lblContador, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lblContador, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        btnVolver.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        tblReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Identificación", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblReporte);
        if (tblReporte.getColumnModel().getColumnCount() > 0) {
            tblReporte.getColumnModel().getColumn(0).setResizable(false);
            tblReporte.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout pnlTablaLayout = new javax.swing.GroupLayout(pnlTabla);
        pnlTabla.setLayout(pnlTablaLayout);
        pnlTablaLayout.setHorizontalGroup(
            pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTablaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        pnlTablaLayout.setVerticalGroup(
            pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTablaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        pane_parte_arriba.setBackground(new java.awt.Color(204, 204, 204));

        icon_auto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/car-removebg-preview.png"))); // NOI18N

        lbl_autto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_autto.setText("AUTTO");

        lbl_listadeclientes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_listadeclientes.setText("ARRIENDO POR VEHICULOS");

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
                .addGap(181, 181, 181)
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

        pane_lado_izquierdo7.setBackground(new java.awt.Color(102, 102, 102));

        btn_Vendedores7.setBackground(new java.awt.Color(102, 102, 102));
        btn_Vendedores7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Vendedores7.setText("Vendedores");
        btn_Vendedores7.setBorder(null);
        btn_Vendedores7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Vendedores7ActionPerformed(evt);
            }
        });

        btn_Vehiculo7.setBackground(new java.awt.Color(102, 102, 102));
        btn_Vehiculo7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Vehiculo7.setText("Vehiculo");
        btn_Vehiculo7.setBorder(null);
        btn_Vehiculo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Vehiculo7ActionPerformed(evt);
            }
        });

        btn_Reporte7.setBackground(new java.awt.Color(102, 102, 102));
        btn_Reporte7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Reporte7.setText("Reporte");
        btn_Reporte7.setBorder(null);
        btn_Reporte7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Reporte7ActionPerformed(evt);
            }
        });

        btn_cerrar_session7.setBackground(new java.awt.Color(204, 204, 204));
        btn_cerrar_session7.setText("CERRAR SESION");
        btn_cerrar_session7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrar_session7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pane_lado_izquierdo7Layout = new javax.swing.GroupLayout(pane_lado_izquierdo7);
        pane_lado_izquierdo7.setLayout(pane_lado_izquierdo7Layout);
        pane_lado_izquierdo7Layout.setHorizontalGroup(
            pane_lado_izquierdo7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_lado_izquierdo7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pane_lado_izquierdo7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Vendedores7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Vehiculo7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(btn_Reporte7, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(btn_cerrar_session7, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        pane_lado_izquierdo7Layout.setVerticalGroup(
            pane_lado_izquierdo7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_lado_izquierdo7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Vendedores7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(btn_Vehiculo7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(btn_Reporte7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(btn_cerrar_session7, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pane_lado_izquierdo7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(208, 208, 208)
                        .addComponent(pnlTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 239, Short.MAX_VALUE))
                    .addComponent(pane_parte_arriba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pane_parte_arriba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pnlTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pane_lado_izquierdo7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        new Lista_Reporte().setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btn_Vendedores7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Vendedores7ActionPerformed
        // TODO add your handling code here:
        new Lista_Vendedores().setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btn_Vendedores7ActionPerformed

    private void btn_Vehiculo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Vehiculo7ActionPerformed
        // TODO add your handling code here:
        new Lista_Vehiculos().setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btn_Vehiculo7ActionPerformed

    private void btn_Reporte7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Reporte7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Reporte7ActionPerformed

    private void btn_cerrar_session7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrar_session7ActionPerformed
        // TODO add your handling code here:
        VLogin Ventana = new VLogin();

        Ventana.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btn_cerrar_session7ActionPerformed

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
            java.util.logging.Logger.getLogger(Arriendo_Vehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Arriendo_Vehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Arriendo_Vehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Arriendo_Vehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Arriendo_Vehiculos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btn_Reporte7;
    private javax.swing.JButton btn_Vehiculo7;
    private javax.swing.JButton btn_Vendedores7;
    private javax.swing.JButton btn_cerrar_session7;
    private javax.swing.JLabel icon_auto;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblContador;
    private javax.swing.JLabel lbl_autto;
    private javax.swing.JLabel lbl_icon_persona;
    private javax.swing.JLabel lbl_listadeclientes;
    private javax.swing.JLabel lbl_nombe_de;
    private javax.swing.JLabel lbl_vendedor;
    private javax.swing.JPanel pane_lado_izquierdo7;
    private javax.swing.JPanel pane_parte_arriba;
    private javax.swing.JPanel pnlTabla;
    private javax.swing.JTable tblReporte;
    // End of variables declaration//GEN-END:variables
}
