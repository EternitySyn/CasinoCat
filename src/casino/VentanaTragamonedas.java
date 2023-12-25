package casino;

import static casino.Program.clip3;
import static casino.Program.clip4;
import java.awt.Image;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public final class VentanaTragamonedas extends javax.swing.JFrame {      
    ImageIcon imag2 = new ImageIcon("src\\casino\\img\\fondoBack1.jpg");
    
    Image im2 = imag2.getImage(); // Transforma el ImageIcon a Image
      Image back2 = im2.getScaledInstance(625, 415, java.awt.Image.SCALE_SMOOTH); // Escala la imagen
      ImageIcon f2 = new ImageIcon(back2);     
    
    boolean animacionActivada = false;           // Esta booleano se va a activar cada vez que la animación se esté ejecutando y se desactiva cuando no lo está.
      Random random = new Random();             // Este random se va a utilizar para poner las imagenes en cada uno de los paneles.   
      
      int multi;
      String reed;
      
      ImageIcon arepita = new ImageIcon("src/casino/img/arepa.png");
      ImageIcon empanada = new ImageIcon("src/casino/img/empana.png");
      ImageIcon hamburguer = new ImageIcon("src/casino/img/hamburger.png");
      ImageIcon medialuna = new ImageIcon("src/casino/img/medialuna.png");
      
      Timer timer = new Timer(20, (e) -> cambiarImagenes()); 
      
      Image image = arepita.getImage(); // Transforma el ImageIcon a Image
      Image arepa = image.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH); // Escala la imagen
      ImageIcon arep = new ImageIcon(arepa);
      
      Image image2 = empanada.getImage(); // Transforma el ImageIcon a Image
       Image empana = image2.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH); // Escala la imagen
      ImageIcon empa = new ImageIcon(empana);        
      
      Image image3 = hamburguer.getImage(); // Transforma el ImageIcon a Image
       Image borgar = image3.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH); // Escala la imagen
      ImageIcon hamb = new ImageIcon(borgar);
      
      Image image4 = medialuna.getImage(); // Transforma el ImageIcon a Image
      Image media = image4.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH); // Escala la imagen
      ImageIcon med = new ImageIcon(media);
     
      // Constructor de la VentanaTragamonedas
     public VentanaTragamonedas() { 
        initComponents(); // Inicialización de los componentes
        lblImg.setIcon(f2);
        this.setLocationRelativeTo(this); // Hacemos que la ventana quede en el medio
        this.setTitle("Tragamonedas"); // Le ponemos el nombre "Tragamonedas" a la ventana
        this.setResizable(false); // Hacemos que no se pueda Maximar la ventana
        lblCred.setText("Creditos: " + Integer.toString(Program.creditos)); // Indicamos que el lblCred tenga el valor actual de los creditos
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl1 = new javax.swing.JPanel();
        lblPnl1 = new javax.swing.JLabel();
        pnl2 = new javax.swing.JPanel();
        lblPnl2 = new javax.swing.JLabel();
        pnl3 = new javax.swing.JPanel();
        lblPnl3 = new javax.swing.JLabel();
        btnSpin = new javax.swing.JButton();
        lblCred = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        cmbApu = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        lblImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 0, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl1.setBackground(new java.awt.Color(102, 102, 102));
        pnl1.setOpaque(false);

        javax.swing.GroupLayout pnl1Layout = new javax.swing.GroupLayout(pnl1);
        pnl1.setLayout(pnl1Layout);
        pnl1Layout.setHorizontalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1Layout.createSequentialGroup()
                .addComponent(lblPnl1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnl1Layout.setVerticalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPnl1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );

        getContentPane().add(pnl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 120, 120));

        pnl2.setBackground(new java.awt.Color(102, 102, 102));
        pnl2.setForeground(new java.awt.Color(255, 0, 204));
        pnl2.setOpaque(false);

        lblPnl2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnl2Layout = new javax.swing.GroupLayout(pnl2);
        pnl2.setLayout(pnl2Layout);
        pnl2Layout.setHorizontalGroup(
            pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl2Layout.createSequentialGroup()
                .addComponent(lblPnl2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnl2Layout.setVerticalGroup(
            pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPnl2, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );

        getContentPane().add(pnl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 120, 120));

        pnl3.setBackground(new java.awt.Color(102, 102, 102));
        pnl3.setOpaque(false);

        lblPnl3.setName(""); // NOI18N

        javax.swing.GroupLayout pnl3Layout = new javax.swing.GroupLayout(pnl3);
        pnl3.setLayout(pnl3Layout);
        pnl3Layout.setHorizontalGroup(
            pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl3Layout.createSequentialGroup()
                .addComponent(lblPnl3, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl3Layout.setVerticalGroup(
            pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPnl3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );

        getContentPane().add(pnl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 120, 120));

        btnSpin.setBackground(new java.awt.Color(51, 51, 51));
        btnSpin.setForeground(new java.awt.Color(204, 204, 204));
        btnSpin.setText("Spin");
        btnSpin.setBorder(null);
        btnSpin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpinActionPerformed(evt);
            }
        });
        getContentPane().add(btnSpin, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 327, 116, 46));

        lblCred.setBackground(new java.awt.Color(51, 51, 51));
        lblCred.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblCred.setForeground(new java.awt.Color(204, 204, 204));
        lblCred.setText("Creditos: 0");
        lblCred.setOpaque(true);
        getContentPane().add(lblCred, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 105, -1));

        btnVolver.setBackground(new java.awt.Color(51, 51, 51));
        btnVolver.setForeground(new java.awt.Color(204, 204, 204));
        btnVolver.setText("Volver");
        btnVolver.setBorder(null);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 327, 135, 46));

        cmbApu.setBackground(new java.awt.Color(51, 51, 51));
        cmbApu.setForeground(new java.awt.Color(204, 204, 204));
        cmbApu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "10", "25", "50", "100", "250", "500", "1000", "5000" }));
        getContentPane().add(cmbApu, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 337, -1, 20));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Apuesta :");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));
        getContentPane().add(lblImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 620, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cambiarImagen(javax.swing.JLabel label, ImageIcon[] imagenes, int indice) {
          label.setIcon(imagenes[indice]);
    }
    
    private void cambiarImagenes() {
          cambiarImagen(lblPnl1, new ImageIcon[] {arep, empa, hamb, med}, random.nextInt(4));
          cambiarImagen(lblPnl2, new ImageIcon[] {arep, empa, hamb, med}, random.nextInt(4));
          cambiarImagen(lblPnl3, new ImageIcon[] {arep, empa, hamb, med}, random.nextInt(4));
    }
      
     // El método btnSpinActionPerformed se llama cada vez que el usuario presiona el botón [Spin]
    // La idea de este método es que actualice la imagen de cada uno de los 3 paneles con una comida al azar (las comidas pueden ser: 
    // arepa, empanada, hamburguesa o medialuna).
    
    private void btnSpinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpinActionPerformed
          reed = (String) cmbApu.getSelectedItem();
        multi = Integer.parseInt(reed);  
        if(!animacionActivada) { // Si la animación no está activada, es decir, si la animacionActivada está en estado false.
                  if(Program.creditos > (multi-1)) { // Si la cantidad de créditos es superior a 4
                      Program.clip4.start();
                      clip4.setFramePosition(0);
                      
                      
                      Program.creditos = Program.creditos - multi;                                                           // Restamos 5 créditos al usuario cada vez que presione el botón.

                    Program.actualizarLabelCreditos();

                    timer.setRepeats(true); // Seteamos la repetición del timer a true para que se repita la animación.
                    timer.start(); // Encendemos el timer para que se comience a ejecutar la animación. 
                    animacionActivada = true; // Colocamos en true la animación para que el usuario no pueda presionar el botón [Spin] mientras se ejecuta la animación.
                    
                     Timer detenerTimer = new Timer(1000, (e) -> { // creamos un timer detenerTimer que va a activarse luego de 2 segundos.
                         
                         clip4.stop();
                         timer.stop();                                                   // Detenemos el timer de animación.
                          animacionActivada = false;                           // Desactivamos el booleano de animacionActivada así el usuario puede volver a presionar el botón [Spin].
                          int rand1 = random.nextInt(4);                       // Definimos la variable rand1 para crear un random del 0 al 3.
                          int rand2 = random.nextInt(4);                       // Definimos la variable rand2 para crear un random del 0 al 3.
                          int rand3 = random.nextInt(4);                       // Definimos la variable rand3 para crear un random del 0 al 3.
                          cambiarImagen(lblPnl1, new ImageIcon[] {arep, empa, hamb, med}, rand1); // Se coloca una imagen random en el panel1.
                          cambiarImagen(lblPnl2, new ImageIcon[] {arep, empa, hamb, med}, rand2); // Se coloca una imagen random en el panel2.
                          cambiarImagen(lblPnl3, new ImageIcon[] {arep, empa, hamb, med}, rand3); // Se coloca una imagen random en el panel3. 
                          
                        if(rand1 == rand2 && rand2 == rand3) { // Si los 3 valores random son iguales (osea si coinciden las 3 imagenes en los paneles)
                              // Avisamos por un mensaje que ganó 100 créditos.
                             Program.creditos += 20* multi;
                             Program.actualizarLabelCreditos();
                             clip3.start();
                             clip3.setFramePosition(0);
                             JOptionPane.showMessageDialog(this, "Ganaste " + (20*multi) + " Creditos");
                             clip3.loop(Clip.LOOP_CONTINUOUSLY);
                             
                             clip3.stop();
                         }
                    });
                     
//              
                    detenerTimer.setRepeats(false); // Seteamos la repetición del detenerTimer a false.
                    detenerTimer.start(); // Encendemos el detenerTimer.
                    
                }
                else {
                      JOptionPane.showMessageDialog(this, "No tienes suficientes coins!\nAñade más desde la ventana Agregar Creditos.");
                }
          }

    }//GEN-LAST:event_btnSpinActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.setVisible(false);
        Program.vtnMenu.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSpin;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbApu;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel lblCred;
    private javax.swing.JLabel lblImg;
    public javax.swing.JLabel lblPnl1;
    private javax.swing.JLabel lblPnl2;
    private javax.swing.JLabel lblPnl3;
    private javax.swing.JPanel pnl1;
    private javax.swing.JPanel pnl2;
    private javax.swing.JPanel pnl3;
    // End of variables declaration//GEN-END:variables
}
