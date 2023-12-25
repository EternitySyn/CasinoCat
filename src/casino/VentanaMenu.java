package casino;

import static casino.Program.clip;
import java.awt.Image;
import javax.swing.ImageIcon;



public class VentanaMenu extends javax.swing.JFrame {
    
  
    
    ImageIcon musica = new ImageIcon("src/casino/img/song/alto-volumen (1).png");
    
    
    ImageIcon imagv = new ImageIcon("src\\casino\\img\\musicoff.jpg");
        Image vol = imagv.getImage(); // Transforma el ImageIcon a Image
      Image backv = vol.getScaledInstance(115,115, java.awt.Image.SCALE_SMOOTH); // Escala la imagen
      ImageIcon fv = new ImageIcon(backv);     
     
    ImageIcon imag = new ImageIcon("src\\casino\\img\\menuBack.jpg");
    Image im = imag.getImage(); // Transforma el ImageIcon a Image
      Image back = im.getScaledInstance(555, 435, java.awt.Image.SCALE_SMOOTH); // Escala la imagen
      ImageIcon f1 = new ImageIcon(back);     
        
      ImageIcon imag2 = new ImageIcon("src\\casino\\img\\OIP.jpg");
    Image im2 = imag2.getImage(); // Transforma el ImageIcon a Image
      Image back2 = im2.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH); // Escala la imagen
      ImageIcon f2 = new ImageIcon(back2);   
      
      
      public VentanaMenu() {
             initComponents();
             lblCat.setIcon(f2);
             btnMusica.setIcon(musica);
             lblimagen.setIcon(f1);
//             this.setSize(537, 421); // Ponemos el tamaño de la ventanaJuego en 800x400
             this.setLocationRelativeTo(this); // Hacemos que la ventana quede en el medio
             this.setTitle("Casino"); // Le ponemos el nombre "Tragamonedas" a la ventana
             this.setResizable(false); // Hacemos que no se pueda Maximar la ventana
             lblCred.setText("Créditos: " + Integer.toString(Program.creditos));
      }

      @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        btnTragamonedas = new javax.swing.JButton();
        btnAgregarCreditos = new javax.swing.JButton();
        btnRuleta = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        lblCred = new javax.swing.JLabel();
        btnExtras = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblCat = new javax.swing.JLabel();
        btnMusica = new javax.swing.JButton();
        lblimagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 102));
        jLabel1.setText("Bienvenido al Casino Honesto");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        btnTragamonedas.setBackground(new java.awt.Color(51, 51, 51));
        btnTragamonedas.setForeground(new java.awt.Color(255, 255, 255));
        btnTragamonedas.setText("Tragamonedas");
        btnTragamonedas.setFocusPainted(false);
        btnTragamonedas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTragamonedasActionPerformed(evt);
            }
        });
        getContentPane().add(btnTragamonedas, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 130, 130));

        btnAgregarCreditos.setBackground(new java.awt.Color(51, 51, 51));
        btnAgregarCreditos.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCreditos.setText("Agregar créditos");
        btnAgregarCreditos.setFocusPainted(false);
        btnAgregarCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCreditosActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 130, 130));

        btnRuleta.setBackground(new java.awt.Color(51, 51, 51));
        btnRuleta.setForeground(new java.awt.Color(255, 255, 255));
        btnRuleta.setText("Ruleta");
        btnRuleta.setFocusPainted(false);
        btnRuleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRuletaActionPerformed(evt);
            }
        });
        getContentPane().add(btnRuleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 130, 130));

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Tienda");
        jButton4.setFocusPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 130, 130));

        lblCred.setBackground(new java.awt.Color(51, 51, 51));
        lblCred.setForeground(new java.awt.Color(204, 204, 204));
        lblCred.setText("Creditos: 0");
        lblCred.setOpaque(true);
        getContentPane().add(lblCred, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 381, -1, -1));

        btnExtras.setBackground(new java.awt.Color(51, 51, 51));
        btnExtras.setFont(new java.awt.Font("Segoe UI", 0, 5)); // NOI18N
        btnExtras.setText("creditos");
        btnExtras.setBorder(null);
        btnExtras.setBorderPainted(false);
        btnExtras.setContentAreaFilled(false);
        btnExtras.setFocusPainted(false);
        btnExtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnExtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 383, 60, 30));

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Segoe Script", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 102));
        jLabel2.setText("- THE CAT -");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 260, 35));
        getContentPane().add(lblCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 110, 110));

        btnMusica.setBorderPainted(false);
        btnMusica.setContentAreaFilled(false);
        btnMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusicaActionPerformed(evt);
            }
        });
        getContentPane().add(btnMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 110, 110));
        getContentPane().add(lblimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
      private void btnTragamonedasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTragamonedasActionPerformed
            this.setVisible(false);
            Program.vtnTragamonedas.setVisible(true);
      }//GEN-LAST:event_btnTragamonedasActionPerformed

      private void btnAgregarCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCreditosActionPerformed
            Program.vtnAgregar.setVisible(true);
      }//GEN-LAST:event_btnAgregarCreditosActionPerformed

    private void btnExtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExtrasActionPerformed
        Program.vtnExtras.setVisible(true);        
    }//GEN-LAST:event_btnExtrasActionPerformed

    private void btnRuletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRuletaActionPerformed
        Program.vtnRuleta.setVisible(true);
        Program.vtnMenu.setVisible(false);
    }//GEN-LAST:event_btnRuletaActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Program.vtnTienda.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusicaActionPerformed
        if(Program.musicaActivada) {
            Program.musicaActivada = false;
            if (clip != null && clip.isOpen()) { // Si el Clip está abierto
        clip.stop(); // Detienes el Clip
        //clip.close(); // Cierras el Clip
    }
            lblCat.setIcon(fv);
            
        }else {
            Program.musicaActivada = true;
            clip.start();
            
            lblCat.setIcon(f2);
       }
    }//GEN-LAST:event_btnMusicaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCreditos;
    private javax.swing.JButton btnExtras;
    private javax.swing.JButton btnMusica;
    private javax.swing.JButton btnRuleta;
    private javax.swing.JButton btnTragamonedas;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar1;
    public javax.swing.JLabel lblCat;
    public javax.swing.JLabel lblCred;
    private javax.swing.JLabel lblimagen;
    // End of variables declaration//GEN-END:variables
}
