package casino;

import java.awt.Image;
import javax.swing.ImageIcon;

public class VentanaExtras extends javax.swing.JFrame {
    ImageIcon fcat = new ImageIcon("src\\casino\\img\\fondoExtra.jpg");
    ImageIcon cat1 = new ImageIcon("src\\casino\\img\\extras\\pain_1.jpg");
    ImageIcon cat2 = new ImageIcon("src\\casino\\img\\extras\\sadmoment_1.jpg");
    ImageIcon cat3 = new ImageIcon("src\\casino\\img\\extras\\robert.jpg");
    ImageIcon cat4 = new ImageIcon("src\\casino\\img\\extras\\huh.jpg");
    ImageIcon cat5 = new ImageIcon("src\\casino\\img\\extras\\she.jpg");
     Image imagef = fcat.getImage(); // Transforma el ImageIcon a Image
      Image catof = imagef.getScaledInstance(480, 410, java.awt.Image.SCALE_SMOOTH); // Escala la imagen
      ImageIcon caf = new ImageIcon(catof); 
    
    Image image1 = cat1.getImage(); // Transforma el ImageIcon a Image
      Image cato1 = image1.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH); // Escala la imagen
      ImageIcon ca1 = new ImageIcon(cato1);
 
     Image image2 = cat2.getImage(); // Transforma el ImageIcon a Image
      Image cato2 = image2.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH); // Escala la imagen
      ImageIcon ca2 = new ImageIcon(cato2);
 
     Image image3 = cat3.getImage(); // Transforma el ImageIcon a Image
      Image cato3 = image3.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH); // Escala la imagen
      ImageIcon ca3 = new ImageIcon(cato3);
  
     Image image4 = cat4.getImage(); // Transforma el ImageIcon a Image
      Image cato4 = image4.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH); // Escala la imagen
      ImageIcon ca4 = new ImageIcon(cato4);
  
     Image image5 = cat5.getImage(); // Transforma el ImageIcon a Image
      Image cato5 = image5.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH); // Escala la imagen
      ImageIcon ca5 = new ImageIcon(cato5);
      
    public VentanaExtras() {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        lblImg.setIcon(caf);
        img1.setIcon(ca1);
        img2.setIcon(ca2);
        img3.setIcon(ca3);
        img4.setIcon(ca4);
        img5.setIcon(ca5);
        this.setLocationRelativeTo(this);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        img1 = new javax.swing.JLabel();
        img2 = new javax.swing.JLabel();
        img3 = new javax.swing.JLabel();
        img4 = new javax.swing.JLabel();
        img5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        lblImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Nico.C");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Fede. A");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Robert.L");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Angel.C");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, -1));

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Meli.H");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        jLabel6.setBackground(new java.awt.Color(51, 51, 51));
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Gracias por ver");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 90, 30));
        getContentPane().add(img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 90, 90));
        getContentPane().add(img2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 90, 90));
        getContentPane().add(img3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 90, 90));
        getContentPane().add(img4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 90, 90));
        getContentPane().add(img5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 90, 90));

        jLabel7.setBackground(new java.awt.Color(51, 51, 51));
        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 255));
        jLabel7.setText("Creditos al equipo :");
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 240, 40));

        btnVolver.setBackground(new java.awt.Color(51, 51, 51));
        btnVolver.setForeground(new java.awt.Color(204, 204, 204));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 363, 80, 30));
        getContentPane().add(lblImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Program.vtnExtras.setVisible(false);
        Program.vtnMenu.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel img3;
    private javax.swing.JLabel img4;
    private javax.swing.JLabel img5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblImg;
    // End of variables declaration//GEN-END:variables
}
