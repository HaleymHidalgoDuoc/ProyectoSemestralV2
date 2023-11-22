/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectosemestral.Vistas.administrador;

import proyectosemestral.Vistas.VLogin;
import proyectosemestral.Vistas.administrador.Reporte.Arriendo_Vehiculos;
import proyectosemestral.Vistas.administrador.Reporte.Top5;
import proyectosemestral.Vistas.administrador.Reporte.ValorRecaudado;
import proyectosemestral.Vistas.administrador.Reporte.Vehiculos_por_Vendedor;


/**
 *
 * @author cetecom
 */
public class Lista_Reporte extends javax.swing.JFrame {

    /**
     * Creates new form Lista_Clientes
     */
    public Lista_Reporte() {
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

        pane_Reporte3 = new javax.swing.JPanel();
        lblTitulo3 = new javax.swing.JLabel();
        btnGenerarReporte3 = new javax.swing.JButton();
        pane_Reporte1 = new javax.swing.JPanel();
        lblTitulo1 = new javax.swing.JLabel();
        btnGenerarReporte1 = new javax.swing.JButton();
        pane_Reporte4 = new javax.swing.JPanel();
        lblTitulo4 = new javax.swing.JLabel();
        btnGenerarReporte4 = new javax.swing.JButton();
        pane_Reporte2 = new javax.swing.JPanel();
        lblTitulo2 = new javax.swing.JLabel();
        btnGenerarReporte2 = new javax.swing.JButton();
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

        pane_Reporte3.setBackground(new java.awt.Color(153, 153, 153));
        pane_Reporte3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Reporte", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        pane_Reporte3.setPreferredSize(new java.awt.Dimension(250, 200));

        lblTitulo3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTitulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo3.setText("TOP 5 Vendedores");

        btnGenerarReporte3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnGenerarReporte3.setText("Generar Reporte");
        btnGenerarReporte3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarReporte3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pane_Reporte3Layout = new javax.swing.GroupLayout(pane_Reporte3);
        pane_Reporte3.setLayout(pane_Reporte3Layout);
        pane_Reporte3Layout.setHorizontalGroup(
            pane_Reporte3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_Reporte3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pane_Reporte3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnGenerarReporte3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        pane_Reporte3Layout.setVerticalGroup(
            pane_Reporte3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_Reporte3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(btnGenerarReporte3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        pane_Reporte1.setBackground(new java.awt.Color(153, 153, 153));
        pane_Reporte1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Reporte", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        pane_Reporte1.setPreferredSize(new java.awt.Dimension(250, 200));

        lblTitulo1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo1.setText("Arriendo Por Vehiculo");

        btnGenerarReporte1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnGenerarReporte1.setText("Generar Reporte");
        btnGenerarReporte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarReporte1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pane_Reporte1Layout = new javax.swing.GroupLayout(pane_Reporte1);
        pane_Reporte1.setLayout(pane_Reporte1Layout);
        pane_Reporte1Layout.setHorizontalGroup(
            pane_Reporte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_Reporte1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane_Reporte1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGenerarReporte1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        pane_Reporte1Layout.setVerticalGroup(
            pane_Reporte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_Reporte1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGenerarReporte1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pane_Reporte4.setBackground(new java.awt.Color(153, 153, 153));
        pane_Reporte4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Reporte", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        pane_Reporte4.setPreferredSize(new java.awt.Dimension(250, 200));

        lblTitulo4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTitulo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo4.setText("Valor Recaudado");

        btnGenerarReporte4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnGenerarReporte4.setText("Generar Reporte");
        btnGenerarReporte4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarReporte4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pane_Reporte4Layout = new javax.swing.GroupLayout(pane_Reporte4);
        pane_Reporte4.setLayout(pane_Reporte4Layout);
        pane_Reporte4Layout.setHorizontalGroup(
            pane_Reporte4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_Reporte4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pane_Reporte4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnGenerarReporte4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        pane_Reporte4Layout.setVerticalGroup(
            pane_Reporte4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_Reporte4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(btnGenerarReporte4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        pane_Reporte2.setBackground(new java.awt.Color(153, 153, 153));
        pane_Reporte2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Reporte", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        pane_Reporte2.setPreferredSize(new java.awt.Dimension(250, 200));

        lblTitulo2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo2.setText("Vehículos Arrendados por Vendedor");

        btnGenerarReporte2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnGenerarReporte2.setText("Generar Reporte");
        btnGenerarReporte2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarReporte2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pane_Reporte2Layout = new javax.swing.GroupLayout(pane_Reporte2);
        pane_Reporte2.setLayout(pane_Reporte2Layout);
        pane_Reporte2Layout.setHorizontalGroup(
            pane_Reporte2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_Reporte2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pane_Reporte2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnGenerarReporte2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        pane_Reporte2Layout.setVerticalGroup(
            pane_Reporte2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_Reporte2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(btnGenerarReporte2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        pane_parte_arriba.setBackground(new java.awt.Color(204, 204, 204));

        icon_auto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/car-removebg-preview.png"))); // NOI18N

        lbl_autto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_autto.setText("AUTTO");

        lbl_listadeclientes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_listadeclientes.setText("REPORTES");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_listadeclientes)
                .addGap(277, 277, 277)
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
                    .addGroup(pane_parte_arribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane_parte_arribaLayout.createSequentialGroup()
                            .addComponent(icon_auto)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane_parte_arribaLayout.createSequentialGroup()
                            .addComponent(lbl_autto)
                            .addGap(30, 30, 30)))
                    .addGroup(pane_parte_arribaLayout.createSequentialGroup()
                        .addGroup(pane_parte_arribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pane_parte_arribaLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(lbl_nombe_de)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pane_parte_arribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_vendedor)
                                    .addComponent(lbl_listadeclientes)))
                            .addGroup(pane_parte_arribaLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(lbl_icon_persona)))
                        .addGap(43, 43, 43))))
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
                .addComponent(pane_lado_izquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pane_Reporte1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pane_Reporte2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 234, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pane_Reporte3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pane_Reporte4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(150, 150, 150))
            .addGroup(layout.createSequentialGroup()
                .addComponent(pane_parte_arriba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pane_parte_arriba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pane_Reporte3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pane_Reporte1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pane_Reporte4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pane_Reporte2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pane_lado_izquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarReporte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarReporte1ActionPerformed
        // TODO add your handling code here:
        new Arriendo_Vehiculos().setVisible(true);
        
        this.dispose();

    }//GEN-LAST:event_btnGenerarReporte1ActionPerformed

    private void btnGenerarReporte2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarReporte2ActionPerformed
        // TODO add your handling code here:
        new Vehiculos_por_Vendedor().setVisible(true);
        
        this.dispose();

    }//GEN-LAST:event_btnGenerarReporte2ActionPerformed

    private void btnGenerarReporte3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarReporte3ActionPerformed
        // TODO add your handling code here:
        new Top5().setVisible(true);
        
        this.dispose();

    }//GEN-LAST:event_btnGenerarReporte3ActionPerformed

    private void btnGenerarReporte4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarReporte4ActionPerformed
        new ValorRecaudado().setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnGenerarReporte4ActionPerformed

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
            java.util.logging.Logger.getLogger(Lista_Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lista_Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lista_Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lista_Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lista_Reporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarReporte1;
    private javax.swing.JButton btnGenerarReporte2;
    private javax.swing.JButton btnGenerarReporte3;
    private javax.swing.JButton btnGenerarReporte4;
    private javax.swing.JButton btn_Reporte;
    private javax.swing.JButton btn_Vehiculo;
    private javax.swing.JButton btn_Vendedores;
    private javax.swing.JButton btn_cerrar_session;
    private javax.swing.JLabel icon_auto;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JLabel lblTitulo3;
    private javax.swing.JLabel lblTitulo4;
    private javax.swing.JLabel lbl_autto;
    private javax.swing.JLabel lbl_icon_persona;
    private javax.swing.JLabel lbl_listadeclientes;
    private javax.swing.JLabel lbl_nombe_de;
    private javax.swing.JLabel lbl_vendedor;
    private javax.swing.JPanel pane_Reporte1;
    private javax.swing.JPanel pane_Reporte2;
    private javax.swing.JPanel pane_Reporte3;
    private javax.swing.JPanel pane_Reporte4;
    private javax.swing.JPanel pane_lado_izquierdo;
    private javax.swing.JPanel pane_parte_arriba;
    // End of variables declaration//GEN-END:variables
}
