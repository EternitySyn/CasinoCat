    package casino;

import static casino.Program.clip;
import casino.VentanaMenu;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class VentanaContraseña extends javax.swing.JFrame {;
    
    ImageIcon imagl = new ImageIcon("src\\casino\\img\\loginback1.jpg");
        Image voll = imagl.getImage(); // Transforma el ImageIcon a Image
      Image backl = voll.getScaledInstance(420,320, java.awt.Image.SCALE_SMOOTH); // Escala la imagen
      ImageIcon fl = new ImageIcon(backl);     
     
  ImageIcon imagz = new ImageIcon("src\\casino\\img\\exit.png");
        Image volz = imagz.getImage(); // Transforma el ImageIcon a Image
      Image backz = volz.getScaledInstance(40,40, java.awt.Image.SCALE_SMOOTH); // Escala la imagen
      ImageIcon fz = new ImageIcon(backz);     
     
  ImageIcon imagi = new ImageIcon("src\\casino\\img\\head.png");
        Image voli = imagi.getImage(); // Transforma el ImageIcon a Image
      Image backi = voli.getScaledInstance(50,50, java.awt.Image.SCALE_SMOOTH); // Escala la imagen
      ImageIcon fi = new ImageIcon(backi);     
    
    ImageIcon imagv = new ImageIcon("src\\casino\\img\\musicoff.jpg");
        Image vol = imagv.getImage(); // Transforma el ImageIcon a Image
      Image backv = vol.getScaledInstance(70,70, java.awt.Image.SCALE_SMOOTH); // Escala la imagen
      ImageIcon fv = new ImageIcon(backv);     
     
      ImageIcon imag2 = new ImageIcon("src\\casino\\img\\OIP.jpg");
    Image im2 = imag2.getImage(); // Transforma el ImageIcon a Image
      Image back2 = im2.getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH); // Escala la imagen
      ImageIcon f2 = new ImageIcon(back2); 
      
    public VentanaContraseña() {
        initComponents();
        lblCat.setIcon(f2);
        btnSalir.setIcon(fz);
        lblFoto.setIcon(fi);
        jLabel4.setIcon(fl);
        this.setLocationRelativeTo(this);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
        public static boolean loggedIn = false; 
        
        private void checkCreditials ()
        {
        String nombreUsuario = txtUsuario.getText();
        String Contraseña = new String(txtContraseña.getPassword());
       
        if (nombreUsuario.equals("usuario")) {
            if (Contraseña.equals("contraseña")) 
            {
                loggedIn = true;
                lblIniciando.setText("INICIANDO");
            } else 
            {
                lblIniciando.setText("Contraseña Incorrecta");
                txtContraseña.setText("");
            }
            
        } 
        else 
        {
                lblIniciando.setText("Usuario incorrecto");
                txtUsuario.setText(" ");
                txtContraseña.setText("");
        }
            if (nombreUsuario.equals("robert")) {
                if (Contraseña.equals("12345")) {
                    loggedIn = true;
                    lblIniciando.setText("INICIANDO");
                    
                } else {
                    lblIniciando.setText("Contraseña Incorrecta");
                    txtContraseña.setText("");
                }
                
            } else {
                lblIniciando.setText("Usuario Incorrecto");
                txtUsuario.setText("");
                txtContraseña.setText("");
            }
               if (nombreUsuario.equals("nico")) {
                if (Contraseña.equals("1234")) {
                    loggedIn = true;
                    lblIniciando.setText("INICIANDO");
                    
                } else {
                    lblIniciando.setText("Contraseña Incorrecta");
                    txtContraseña.setText("");
                }
                
            } else {
                lblIniciando.setText("Usuario Incorrecto");
                txtUsuario.setText("");
                txtContraseña.setText("");
            }
                  if (nombreUsuario.equals("fede")) {
                if (Contraseña.equals("123456")) {
                    loggedIn = true;
                    lblIniciando.setText("INICIANDO");
                    
                } else {
                    lblIniciando.setText("Contraseña Incorrecta");
                    txtContraseña.setText("");
                }
                
            } else {
                lblIniciando.setText("Usuario Incorrecto");
                txtUsuario.setText("");
                txtContraseña.setText("");
            }
                     if (nombreUsuario.equals("angel")) {
                if (Contraseña.equals("12345678")) {
                    loggedIn = true;
                    lblIniciando.setText("INICIANDO");
                    
                } else {
                    lblIniciando.setText("Contraseña Incorrecta");
                    txtContraseña.setText("");
                }
                
            } else {
                lblIniciando.setText("Usuario Incorrecto");
                txtUsuario.setText("");
                txtContraseña.setText("");
            }
                        if (nombreUsuario.equals("meli")) {
                if (Contraseña.equals("123456789")) {
                    loggedIn = true;
                    lblIniciando.setText("INICIANDO");
                    
                } else {
                    lblIniciando.setText("Contraseña Incorrecta");
                    txtContraseña.setText("");
                }
                
            } else {
                lblIniciando.setText("Usuario Incorrecto");
                txtUsuario.setText("");
                txtContraseña.setText("");
            }
        if (loggedIn) {
            Program.vtnMenu.setVisible(true);
            this.dispose();
        }
        }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        btnAceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblIniciando = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        lblFoto = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        lblCat = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 85, 228, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 102));
        jLabel2.setText("Usuario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 85, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 102));
        jLabel3.setText("Contraseña");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 134, -1, -1));

        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 134, 228, -1));

        btnAceptar.setBackground(new java.awt.Color(255, 204, 102));
        btnAceptar.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(51, 51, 51));
        btnAceptar.setText("Log In");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 120, 38));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Log In");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 18, -1, -1));

        lblIniciando.setForeground(new java.awt.Color(255, 255, 102));
        jPanel1.add(lblIniciando, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 173, 141, 32));

        btnSalir.setBackground(new java.awt.Color(255, 51, 51));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 50, 40));

        lblFoto.setFocusCycleRoot(true);
        jPanel1.add(lblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 50, 61));

        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 60, 60));
        jPanel1.add(lblCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 60, 60));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
             
        checkCreditials();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        lblIniciando.setText(" ");
        txtUsuario.grabFocus();
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        lblIniciando.setText(" ");
        btnAceptarActionPerformed(evt);
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
            System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
if(Program.musicaActivada) {
            Program.musicaActivada = false;
            if (clip != null && clip.isOpen()) { // Si el Clip está abierto
        clip.stop(); // Detienes el Clip
        //clip.close(); // Cierras el Clip
    }
            lblCat.setIcon(fv);
            Program.vtnMenu.lblCat.setIcon(Program.vtnMenu.fv);
            
        }else {
            Program.musicaActivada = true;
            clip.start();
            
            lblCat.setIcon(f2);
            Program.vtnMenu.lblCat.setIcon(Program.vtnMenu.f2);
            
       }    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaContraseña().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCat;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblIniciando;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
