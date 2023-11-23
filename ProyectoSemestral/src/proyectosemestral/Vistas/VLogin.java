package proyectosemestral.Vistas;

import Modelo.Empleado;
import javax.swing.JOptionPane;
import proyectosemestral.Vistas.administrador.Lista_Vendedores;
import proyectosemestral.Vistas.vendendor.Lista_Clientes;

public class VLogin extends javax.swing.JFrame {

    public VLogin() {
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

        lbl_AUTTO = new javax.swing.JLabel();
        lbl_Rent = new javax.swing.JLabel();
        lbl_te_ayudamos = new javax.swing.JLabel();
        lbl_tu_experiencia = new javax.swing.JLabel();
        pan_login = new javax.swing.JPanel();
        lbl_Identificacion = new javax.swing.JLabel();
        txt_identificacion = new javax.swing.JTextField();
        lbl_Contraseña = new javax.swing.JLabel();
        lbl_olvido_su_contraseña = new javax.swing.JLabel();
        btn_login = new javax.swing.JButton();
        pwdContraseña = new javax.swing.JPasswordField();
        icon_logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_AUTTO.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbl_AUTTO.setText("AUTTO");

        lbl_Rent.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_Rent.setText("Rent a car");

        lbl_te_ayudamos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_te_ayudamos.setText("\"Te ayudamos a mejorar   ");

        lbl_tu_experiencia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_tu_experiencia.setText("tu experiencia\"");

        pan_login.setBackground(new java.awt.Color(204, 204, 204));

        lbl_Identificacion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_Identificacion.setText("Identificación");
        lbl_Identificacion.setToolTipText("");

        txt_identificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_identificacionActionPerformed(evt);
            }
        });

        lbl_Contraseña.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_Contraseña.setText("Contraseña");
        lbl_Contraseña.setToolTipText("");

        lbl_olvido_su_contraseña.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lbl_olvido_su_contraseña.setText("Olvido su contraseña?");

        btn_login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        pwdContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdContraseñaActionPerformed(evt);
            }
        });

        icon_logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\car-removebg-preview.png")); // NOI18N

        javax.swing.GroupLayout pan_loginLayout = new javax.swing.GroupLayout(pan_login);
        pan_login.setLayout(pan_loginLayout);
        pan_loginLayout.setHorizontalGroup(
            pan_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan_loginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(pan_loginLayout.createSequentialGroup()
                .addGroup(pan_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pan_loginLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(pan_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_Contraseña)
                            .addComponent(txt_identificacion, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .addComponent(pwdContraseña)
                            .addComponent(lbl_Identificacion)))
                    .addGroup(pan_loginLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(lbl_olvido_su_contraseña))
                    .addGroup(pan_loginLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(icon_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        pan_loginLayout.setVerticalGroup(
            pan_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_loginLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(icon_logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Identificacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(lbl_Contraseña)
                .addGap(18, 18, 18)
                .addComponent(pwdContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(lbl_olvido_su_contraseña)
                .addGap(26, 26, 26)
                .addComponent(btn_login)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lbl_tu_experiencia))
                    .addComponent(lbl_te_ayudamos)
                    .addComponent(lbl_Rent)
                    .addComponent(lbl_AUTTO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
                .addComponent(pan_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(242, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(194, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl_AUTTO)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_Rent)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_te_ayudamos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_tu_experiencia)
                        .addGap(267, 267, 267))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pan_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(168, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_identificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_identificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_identificacionActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        //Login Funcional
        String identificacion = txt_identificacion.getText(); //Obtengo el ID
        String contrasenia = pwdContraseña.getText(); //Obtengo el Pass
        
        Empleado emp = new Empleado(); //Creo una "Conexion"
        emp = emp.buscarEmpleadoID(identificacion); //Creo una Instancia de objeto con los datos de la busqueda (devuelve Null si no encuntra)
        
        if(emp.getRutEmpleado() == null){
        JOptionPane.showMessageDialog(this, "USUARIO O CONTRASEÑA ","Validación", JOptionPane.WARNING_MESSAGE);
        }else
        
        try {
            if( emp.getRutEmpleado().equals(identificacion) &&
                emp.getContrasenia().equals(contrasenia) &&
                emp.getTipoEmpleado().equals("VENDEDOR")){
                
                //Inicia una instancia de la ventana Vendedor
                Lista_Clientes ventVendedor = new Lista_Clientes();
                ventVendedor.setEmpleado(emp);
                ventVendedor.setVisible(true);
                this.setVisible(false);
                
            }else if(emp.getRutEmpleado().equals(identificacion) &&
                emp.getContrasenia().equals(contrasenia) &&
                emp.getTipoEmpleado().equals("ADMINISTRADOR")){
                
                //Inicia una instancia de la ventana 
                Lista_Vendedores ventAdministrador = new Lista_Vendedores();
                ventAdministrador.setEmpleado(emp); 
                ventAdministrador.setVisible(true);
                this.setVisible(false);
                
            } else{
                JOptionPane.showMessageDialog(this, "USUARIO O CONTRASEÑA ","Validación", JOptionPane.WARNING_MESSAGE);
            }  
        } catch (Exception e) {
            System.out.println("Error al listar empleado por id" + e.getMessage());
        }
        
    }//GEN-LAST:event_btn_loginActionPerformed

    private void pwdContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdContraseñaActionPerformed
 // TODO add your handling code here:
    }//GEN-LAST:event_pwdContraseñaActionPerformed

    
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
            java.util.logging.Logger.getLogger(VLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel icon_logo;
    private javax.swing.JLabel lbl_AUTTO;
    private javax.swing.JLabel lbl_Contraseña;
    private javax.swing.JLabel lbl_Identificacion;
    private javax.swing.JLabel lbl_Rent;
    private javax.swing.JLabel lbl_olvido_su_contraseña;
    private javax.swing.JLabel lbl_te_ayudamos;
    private javax.swing.JLabel lbl_tu_experiencia;
    private javax.swing.JPanel pan_login;
    private javax.swing.JPasswordField pwdContraseña;
    private javax.swing.JTextField txt_identificacion;
    // End of variables declaration//GEN-END:variables
}
