/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectosemestral.Vistas.vendendor;

import proyectosemestral.Vistas.VLogin;



/**
 *
 * @author cetecom
 */
public class Registrar_Arriendo extends javax.swing.JFrame {

    /**
     * Creates new form Lista_Clientes
     */
    public Registrar_Arriendo() {
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

        pane_fondo_superior = new javax.swing.JPanel();
        lbl_autto = new javax.swing.JLabel();
        lbl_listadeclientes = new javax.swing.JLabel();
        lbl_nombe_de = new javax.swing.JLabel();
        lbl_puesto = new javax.swing.JLabel();
        icon_auto = new javax.swing.JLabel();
        icon_person = new javax.swing.JLabel();
        pane_descripcion = new javax.swing.JPanel();
        pane_fondo_descripcion = new javax.swing.JPanel();
        lbl_descrpcion = new javax.swing.JLabel();
        scroll_descripcion = new javax.swing.JScrollPane();
        tat_descripcion = new javax.swing.JTextArea();
        pane_identificacion = new javax.swing.JPanel();
        lbl_identificacion = new javax.swing.JLabel();
        txt_identificacion = new javax.swing.JTextField();
        pabe_vehiculo = new javax.swing.JPanel();
        lbl_vehiculo = new javax.swing.JLabel();
        txt_vehiculo = new javax.swing.JTextField();
        pane_flechita = new javax.swing.JPanel();
        lbl_flechita = new javax.swing.JLabel();
        pane_fecha_entrega = new javax.swing.JPanel();
        lbl_fecha_entrega = new javax.swing.JLabel();
        txt_fecha = new javax.swing.JTextField();
        btn_confirmar = new javax.swing.JButton();
        pane_lado_izquierdo = new javax.swing.JPanel();
        btn_clientes = new javax.swing.JButton();
        btn_registrar = new javax.swing.JButton();
        btn_devolucion = new javax.swing.JButton();
        btn_cerrar_session = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pane_fondo_superior.setBackground(new java.awt.Color(204, 204, 204));

        lbl_autto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_autto.setText("AUTTO");

        lbl_listadeclientes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_listadeclientes.setText("Registrar Arriendo");

        lbl_nombe_de.setText("Angel Perugini");

        lbl_puesto.setText("Vendedor");

        icon_auto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/car-removebg-preview.png"))); // NOI18N

        icon_person.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon_person3.png"))); // NOI18N

        javax.swing.GroupLayout pane_fondo_superiorLayout = new javax.swing.GroupLayout(pane_fondo_superior);
        pane_fondo_superior.setLayout(pane_fondo_superiorLayout);
        pane_fondo_superiorLayout.setHorizontalGroup(
            pane_fondo_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_fondo_superiorLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(icon_auto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_autto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_listadeclientes)
                .addGap(259, 259, 259)
                .addGroup(pane_fondo_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_nombe_de)
                    .addComponent(lbl_puesto))
                .addGap(47, 47, 47)
                .addComponent(icon_person)
                .addGap(68, 68, 68))
        );
        pane_fondo_superiorLayout.setVerticalGroup(
            pane_fondo_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane_fondo_superiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(icon_auto)
                .addGap(37, 37, 37))
            .addGroup(pane_fondo_superiorLayout.createSequentialGroup()
                .addGroup(pane_fondo_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pane_fondo_superiorLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(pane_fondo_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_autto)
                            .addComponent(lbl_listadeclientes)))
                    .addGroup(pane_fondo_superiorLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lbl_nombe_de)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_puesto)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pane_fondo_superiorLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(icon_person)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pane_descripcion.setBackground(new java.awt.Color(204, 204, 204));

        pane_fondo_descripcion.setBackground(new java.awt.Color(102, 102, 102));

        lbl_descrpcion.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_descrpcion.setForeground(new java.awt.Color(255, 255, 255));
        lbl_descrpcion.setText("Descripcion");

        javax.swing.GroupLayout pane_fondo_descripcionLayout = new javax.swing.GroupLayout(pane_fondo_descripcion);
        pane_fondo_descripcion.setLayout(pane_fondo_descripcionLayout);
        pane_fondo_descripcionLayout.setHorizontalGroup(
            pane_fondo_descripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane_fondo_descripcionLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(lbl_descrpcion)
                .addGap(29, 29, 29))
        );
        pane_fondo_descripcionLayout.setVerticalGroup(
            pane_fondo_descripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_fondo_descripcionLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl_descrpcion)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        tat_descripcion.setColumns(20);
        tat_descripcion.setForeground(new java.awt.Color(153, 153, 153));
        tat_descripcion.setRows(5);
        tat_descripcion.setText("En este apartado se tiene quen añadir\nuna breve descripción del arriendo \ndel vehículo.");
        scroll_descripcion.setViewportView(tat_descripcion);

        javax.swing.GroupLayout pane_descripcionLayout = new javax.swing.GroupLayout(pane_descripcion);
        pane_descripcion.setLayout(pane_descripcionLayout);
        pane_descripcionLayout.setHorizontalGroup(
            pane_descripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_descripcionLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(pane_descripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pane_fondo_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scroll_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        pane_descripcionLayout.setVerticalGroup(
            pane_descripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_descripcionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pane_fondo_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scroll_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pane_identificacion.setBackground(new java.awt.Color(204, 204, 204));

        lbl_identificacion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_identificacion.setText("Identificacion");

        txt_identificacion.setForeground(new java.awt.Color(204, 204, 204));
        txt_identificacion.setText("RUT/PASAPORTE");

        javax.swing.GroupLayout pane_identificacionLayout = new javax.swing.GroupLayout(pane_identificacion);
        pane_identificacion.setLayout(pane_identificacionLayout);
        pane_identificacionLayout.setHorizontalGroup(
            pane_identificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_identificacionLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbl_identificacion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane_identificacionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pane_identificacionLayout.setVerticalGroup(
            pane_identificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_identificacionLayout.createSequentialGroup()
                .addComponent(lbl_identificacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pabe_vehiculo.setBackground(new java.awt.Color(204, 204, 204));

        lbl_vehiculo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_vehiculo.setText("Vehiculo");

        txt_vehiculo.setForeground(new java.awt.Color(204, 204, 204));
        txt_vehiculo.setText("Patente");

        pane_flechita.setBackground(new java.awt.Color(102, 102, 102));

        lbl_flechita.setForeground(new java.awt.Color(255, 255, 255));
        lbl_flechita.setText(">");

        javax.swing.GroupLayout pane_flechitaLayout = new javax.swing.GroupLayout(pane_flechita);
        pane_flechita.setLayout(pane_flechitaLayout);
        pane_flechitaLayout.setHorizontalGroup(
            pane_flechitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane_flechitaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_flechita)
                .addContainerGap())
        );
        pane_flechitaLayout.setVerticalGroup(
            pane_flechitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_flechitaLayout.createSequentialGroup()
                .addComponent(lbl_flechita)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pabe_vehiculoLayout = new javax.swing.GroupLayout(pabe_vehiculo);
        pabe_vehiculo.setLayout(pabe_vehiculoLayout);
        pabe_vehiculoLayout.setHorizontalGroup(
            pabe_vehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pabe_vehiculoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbl_vehiculo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pabe_vehiculoLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(txt_vehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pane_flechita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        pabe_vehiculoLayout.setVerticalGroup(
            pabe_vehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pabe_vehiculoLayout.createSequentialGroup()
                .addComponent(lbl_vehiculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pabe_vehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pane_flechita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_vehiculo))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pane_fecha_entrega.setBackground(new java.awt.Color(204, 204, 204));

        lbl_fecha_entrega.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_fecha_entrega.setText("Fecha de entrega");

        txt_fecha.setForeground(new java.awt.Color(204, 204, 204));
        txt_fecha.setText("DD/MM/YYYY");

        javax.swing.GroupLayout pane_fecha_entregaLayout = new javax.swing.GroupLayout(pane_fecha_entrega);
        pane_fecha_entrega.setLayout(pane_fecha_entregaLayout);
        pane_fecha_entregaLayout.setHorizontalGroup(
            pane_fecha_entregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_fecha_entregaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pane_fecha_entregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_fecha_entrega))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pane_fecha_entregaLayout.setVerticalGroup(
            pane_fecha_entregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_fecha_entregaLayout.createSequentialGroup()
                .addComponent(lbl_fecha_entrega)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        btn_confirmar.setBackground(new java.awt.Color(204, 204, 204));
        btn_confirmar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_confirmar.setText("Confirmar");
        btn_confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirmarActionPerformed(evt);
            }
        });

        pane_lado_izquierdo.setBackground(new java.awt.Color(102, 102, 102));

        btn_clientes.setBackground(new java.awt.Color(102, 102, 102));
        btn_clientes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_clientes.setText("Clientes");
        btn_clientes.setBorder(null);
        btn_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clientesActionPerformed(evt);
            }
        });

        btn_registrar.setBackground(new java.awt.Color(102, 102, 102));
        btn_registrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_registrar.setText("Registrar");
        btn_registrar.setBorder(null);
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        btn_devolucion.setBackground(new java.awt.Color(102, 102, 102));
        btn_devolucion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_devolucion.setText("Devolución");
        btn_devolucion.setBorder(null);
        btn_devolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_devolucionActionPerformed(evt);
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
                    .addComponent(btn_clientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_registrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(btn_devolucion, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(btn_cerrar_session, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        pane_lado_izquierdoLayout.setVerticalGroup(
            pane_lado_izquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_lado_izquierdoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(btn_devolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(btn_cerrar_session, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pane_fondo_superior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pane_lado_izquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(pane_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pane_identificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pabe_vehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pane_fecha_entrega, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(213, 213, 213))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pane_fondo_superior, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pane_lado_izquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pane_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(pabe_vehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(pane_fecha_entrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pane_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_confirmarActionPerformed

    private void btn_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clientesActionPerformed
        // TODO add your handling code here:
        new Lista_Clientes().setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btn_clientesActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btn_devolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_devolucionActionPerformed
        // TODO add your handling code here:
         new Devolucion_vehiculo().setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btn_devolucionActionPerformed

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
            java.util.logging.Logger.getLogger(Registrar_Arriendo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar_Arriendo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar_Arriendo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar_Arriendo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar_Arriendo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cerrar_session;
    private javax.swing.JButton btn_clientes;
    private javax.swing.JButton btn_confirmar;
    private javax.swing.JButton btn_devolucion;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JLabel icon_auto;
    private javax.swing.JLabel icon_person;
    private javax.swing.JLabel lbl_autto;
    private javax.swing.JLabel lbl_descrpcion;
    private javax.swing.JLabel lbl_fecha_entrega;
    private javax.swing.JLabel lbl_flechita;
    private javax.swing.JLabel lbl_identificacion;
    private javax.swing.JLabel lbl_listadeclientes;
    private javax.swing.JLabel lbl_nombe_de;
    private javax.swing.JLabel lbl_puesto;
    private javax.swing.JLabel lbl_vehiculo;
    private javax.swing.JPanel pabe_vehiculo;
    private javax.swing.JPanel pane_descripcion;
    private javax.swing.JPanel pane_fecha_entrega;
    private javax.swing.JPanel pane_flechita;
    private javax.swing.JPanel pane_fondo_descripcion;
    private javax.swing.JPanel pane_fondo_superior;
    private javax.swing.JPanel pane_identificacion;
    private javax.swing.JPanel pane_lado_izquierdo;
    private javax.swing.JScrollPane scroll_descripcion;
    private javax.swing.JTextArea tat_descripcion;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_identificacion;
    private javax.swing.JTextField txt_vehiculo;
    // End of variables declaration//GEN-END:variables
}
