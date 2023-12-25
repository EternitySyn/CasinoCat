package casino;

import static casino.Program.clip;
import static casino.Program.clip2;
import static casino.Program.clip3;
import java.awt.Color;
import java.awt.Image;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class VentanaRuleta extends javax.swing.JFrame {
     ImageIcon imag2 = new ImageIcon("src\\casino\\img\\fondoBack5.jpg");
     
     int selec=0;
    
    Image im2 = imag2.getImage(); // Transforma el ImageIcon a Image
      Image back2 = im2.getScaledInstance(675, 430, java.awt.Image.SCALE_SMOOTH); // Escala la imagen
      ImageIcon f2 = new ImageIcon(back2);     
      
    Random random = new Random();
        int rojos [] = {1,16,7,24,31,18,11,26,21,8,29,3,15,32,14,22,27,34};
        int negros [] = {25,2,10,20,13,5,35,9,19,33,12,4,30,6,17,23,28,36};
        String apuesta;
        int num;
        String reed;
        boolean animacionActivada = false;
        ImageIcon[] imagenes; 
        int indice = 0;
        int delayRuleta = 10; // Delay en milisengundos de la ruleta, cuánto más bajo sea más rápido girará.
        int multi;
        int rand;
        int oldCred;
        
        boolean  black,red,green,odd,even  = false;
        
        
        // Cargo las imagenes
      ImageIcon ruleta1 = new ImageIcon("src\\casino\\img\\ruleta\\1.png");
      ImageIcon ruleta2 = new ImageIcon("src\\casino\\img\\ruleta\\2.png");
      ImageIcon ruleta3 = new ImageIcon("src\\casino\\img\\ruleta\\3.png");
      ImageIcon ruleta4 = new ImageIcon("src\\casino\\img\\ruleta\\4.png");        
      ImageIcon ruleta5 = new ImageIcon("src\\casino\\img\\ruleta\\5.png");
      ImageIcon ruleta6 = new ImageIcon("src\\casino\\img\\ruleta\\6.png");        

      Image image1 = ruleta1.getImage(); // Transforma el ImageIcon a Image
      Image rule1 = image1.getScaledInstance(240, 240, java.awt.Image.SCALE_SMOOTH); // Escala la imagen
      ImageIcon r1 = new ImageIcon(rule1);      
      
      Image image2 = ruleta2.getImage(); // Transforma el ImageIcon a Image
      Image rule2 = image2.getScaledInstance(240, 240, java.awt.Image.SCALE_SMOOTH); // Escala la imagen
      ImageIcon r2 = new ImageIcon(rule2);     
      
      Image image3 = ruleta3.getImage(); // Transforma el ImageIcon a Image
      Image rule3 = image3.getScaledInstance(240, 240, java.awt.Image.SCALE_SMOOTH); // Escala la imagen
      ImageIcon r3 = new ImageIcon(rule3);    
      
      Image image4 = ruleta4.getImage(); // Transforma el ImageIcon a Image
      Image rule4 = image4.getScaledInstance(240, 240, java.awt.Image.SCALE_SMOOTH); // Escala la imagen
      ImageIcon r4 = new ImageIcon(rule4);    
      
      Image image5 = ruleta5.getImage(); // Transforma el ImageIcon a Image
      Image rule5 = image5.getScaledInstance(240, 240, java.awt.Image.SCALE_SMOOTH); // Escala la imagen
      ImageIcon r5 = new ImageIcon(rule5);    
      
      Image image6 = ruleta6.getImage(); // Transforma el ImageIcon a Image
      Image rule6 = image6.getScaledInstance(240, 240, java.awt.Image.SCALE_SMOOTH); // Escala la imagen
      ImageIcon r6 = new ImageIcon(rule6);     
      
       Timer timer = new Timer(delayRuleta, (e) -> cambiarImagenes()); 
       
       
       
      public VentanaRuleta() {
            initComponents();
            lblBack.setIcon(f2);
        //this.setSize(530,420); // Ponemos el tamaño de la ventanaJuego en 800x400
        this.setLocationRelativeTo(this); // Hacemos que la ventana quede en el medio
        this.setTitle("Ruleta"); // Le ponemos el nombre "no" a la ventana
        this.setResizable(false); // Hacemos que no se pueda Maximar la ventana
       lblCred.setText("Creditos: " + Integer.toString(Program.creditos));
       lblImg.setIcon(r1);
       buttonGroup1.add(chkN);
       buttonGroup1.add(chkR);
       buttonGroup1.add(chkV);
       buttonGroup2.add(chkPar);
       buttonGroup2.add(chkImPar);
       
      }

      @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        btnSpin = new javax.swing.JButton();
        lblTest = new javax.swing.JLabel();
        lblTest2 = new javax.swing.JLabel();
        lblImg = new javax.swing.JLabel();
        lblCred = new javax.swing.JLabel();
        chkN = new javax.swing.JCheckBox();
        chkR = new javax.swing.JCheckBox();
        chkV = new javax.swing.JCheckBox();
        txtNum = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        chkPar = new javax.swing.JCheckBox();
        chkImPar = new javax.swing.JCheckBox();
        btnVolver = new javax.swing.JButton();
        cmbApu = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSpin.setBackground(new java.awt.Color(51, 51, 51));
        btnSpin.setForeground(new java.awt.Color(204, 204, 204));
        btnSpin.setText("Spin");
        btnSpin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpinActionPerformed(evt);
            }
        });
        getContentPane().add(btnSpin, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 150, 60));

        lblTest.setBackground(new java.awt.Color(153, 153, 153));
        lblTest.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblTest.setForeground(new java.awt.Color(255, 255, 255));
        lblTest.setText("Numero");
        getContentPane().add(lblTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 90, 30));

        lblTest2.setBackground(new java.awt.Color(153, 153, 153));
        lblTest2.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblTest2.setForeground(new java.awt.Color(255, 255, 255));
        lblTest2.setText("Color");
        getContentPane().add(lblTest2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 130, 30));
        getContentPane().add(lblImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 240, 240));

        lblCred.setBackground(new java.awt.Color(51, 51, 51));
        lblCred.setForeground(new java.awt.Color(204, 204, 204));
        lblCred.setText("Creditos : 0");
        lblCred.setOpaque(true);
        getContentPane().add(lblCred, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        chkN.setBackground(new java.awt.Color(51, 51, 51));
        chkN.setForeground(new java.awt.Color(204, 204, 204));
        chkN.setText("Negro");
        chkN.setContentAreaFilled(false);
        getContentPane().add(chkN, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 221, -1, -1));

        chkR.setBackground(new java.awt.Color(51, 51, 51));
        chkR.setForeground(new java.awt.Color(204, 204, 204));
        chkR.setText("Rojo");
        chkR.setContentAreaFilled(false);
        getContentPane().add(chkR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 253, -1, -1));

        chkV.setBackground(new java.awt.Color(51, 51, 51));
        chkV.setForeground(new java.awt.Color(204, 204, 204));
        chkV.setText("Verde");
        chkV.setContentAreaFilled(false);
        getContentPane().add(chkV, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 285, -1, -1));

        txtNum.setBackground(new java.awt.Color(51, 51, 51));
        txtNum.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(txtNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 163, 56, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 199, 71, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 141, 71, 10));

        chkPar.setBackground(new java.awt.Color(51, 51, 51));
        chkPar.setForeground(new java.awt.Color(204, 204, 204));
        chkPar.setText("Par");
        chkPar.setContentAreaFilled(false);
        getContentPane().add(chkPar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 89, -1, -1));

        chkImPar.setBackground(new java.awt.Color(51, 51, 51));
        chkImPar.setForeground(new java.awt.Color(204, 204, 204));
        chkImPar.setText("Impar");
        chkImPar.setContentAreaFilled(false);
        getContentPane().add(chkImPar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 115, -1, -1));

        btnVolver.setBackground(new java.awt.Color(51, 51, 51));
        btnVolver.setForeground(new java.awt.Color(204, 204, 204));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        cmbApu.setBackground(new java.awt.Color(51, 51, 51));
        cmbApu.setForeground(new java.awt.Color(204, 204, 204));
        cmbApu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "10", "25", "50", "100", "250", "500", "1000", "5000" }));
        getContentPane().add(cmbApu, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, -1, -1));

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Apuestas :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 60, 20));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Ruleta Casino");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 6, 240, 40));

        jButton1.setText("Ninguno");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 63, 80, 20));

        jButton2.setText("Ninguno");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 313, 80, 20));
        getContentPane().add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 670, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generarColores() {
        rand = random.nextInt(37);
       lblTest.setText(Integer.toString(rand));
        for (int i = 0; i < rojos.length; i++) {
            if (rojos[i] == rand) {
                System.out.println("Es Roja : " + rojos[i]);
                lblTest2.setText("Roja");
                lblTest.setForeground(Color.red);
                lblTest2.setForeground(Color.red);
                red = true;
                break;
            }
        }
        for (int i = 0; i < negros.length; i++) {
            if (negros[i] == rand) {
                System.out.println("Es Negra : " + negros[i]);
                lblTest2.setText("Negra");
                lblTest.setForeground(Color.black);
                lblTest2.setForeground(Color.black);
                black = true;
                break;
            }
        }
        if (rand == 0) {
            lblTest2.setText("Verde");
                lblTest.setForeground(Color.green);
                lblTest2.setForeground(Color.green);
            green = true;
           }
        if (rand%2==0) {
            even=true;
        }else{
            odd=true;
        }
    }
    
    private void cambiarImagen(JLabel lblImg, ImageIcon[] imagenes) {
          lblImg.setIcon(imagenes[indice]);
            indice = (indice + 1) % imagenes.length;
    }
    
    private void cambiarImagenes() {
         girarRuleta();
         cambiarImagen(lblImg, new ImageIcon[] {r1, r2, r3, r4, r5, r6});
       
    }
    
    
    private void select() {
        selec = 0; 
        if (chkImPar.isSelected() || chkPar.isSelected()) {
            selec = selec + 1;
        }
         if (!txtNum.getText().isEmpty()) {
            selec = selec + 1;
        }
        if (chkN.isSelected() || chkR.isSelected() || chkV.isSelected()) {
            selec = selec + 1;
        }
    }
    
    private void girarRuleta() {
          if(timer.getDelay() < 40) {
                  timer.setDelay(timer.getDelay() + 2);
                  //System.out.println(timer.getDelay());
          }
          else {
                  timer.setDelay(timer.getDelay() + 6);
                  //System.out.println(timer.getDelay());
          }
    }
    
    
    private void btnSpinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpinActionPerformed
        // Aca va el codigo de la animacion
        reed = (String) cmbApu.getSelectedItem();
        multi = Integer.parseInt(reed);
        select();
        if(!animacionActivada) { // Si la animación no está activada, es decir, si la animacionActivada está en estado false.
            if (selec == 0) {
                JOptionPane.showMessageDialog(this, "No elegiste nada para apostar.");
            }else{
      
            if(Program.creditos > (multi*selec)-1) { // Si la cantidad de créditos es superior a 4
                if(num < 0 || num >= 37) {
                    System.out.println("TEST");
                }
                
                oldCred= Program.creditos;
                      Program.creditos = Program.creditos - (multi*selec);  
                      try {
                          num = Integer.parseInt(txtNum.getText());
                } catch (NumberFormatException e) {
                }
// Restamos 5 créditos al usuario cada vez que presione el botón.
                      
                      
                    Program.actualizarLabelCreditos();
                    clip2.setFramePosition(0);
                    clip2.start();
                    clip2.loop(Clip.LOOP_CONTINUOUSLY);
                    // Reiniciamos variables
                    black = false;
                    red= false;
                    green=false;
                    even=false;
                    odd=false;
                    
                   
                    cambiarImagenes();
                    
                    timer.setRepeats(true); // Seteamos la repetición del timer a true para que se repita la animación.
                    timer.start(); // Encendemos el timer para que se comience a ejecutar la animación. 
                    animacionActivada = true; // Colocamos en true la animación para que el usuario no pueda presionar el botón [Spin] mientras se ejecuta la animación.
                    
                     Timer detenerTimer = new Timer(2500, (e) -> { // creamos un timer detenerTimer que va a activarse luego de 2 segundos.
                          timer.stop();                                                   // Detenemos el timer de animación.
                          animacionActivada = false;                           // Desactivamos el booleano de animacionActivada así el usuario puede volver a presionar el botón [Spin].
                          clip2.stop();
                          generarColores();
                          
                         
                         if (chkR.isSelected() && red) {
                             Program.creditos += 5*multi; // Sumamos 25 a la variable créditos.
                             Program.actualizarLabelCreditos();
                         }
                         if (chkN.isSelected() && black) {
                             Program.creditos += 5*multi; // Sumamos 25 a la variable créditos.
                             Program.actualizarLabelCreditos();
                         }
                         if (chkV.isSelected() && green) {
                             Program.creditos += 50*multi; // Sumamos 500 a la variable créditos.
                             Program.actualizarLabelCreditos();
                         }
                         if (chkImPar.isSelected() && odd) {
                             Program.creditos += 5*multi; // Sumamos 25 a la variable créditos.
                             Program.actualizarLabelCreditos();
                         }
                         if (chkPar.isSelected() && even) {
                             Program.creditos += 5*multi; // Sumamos 25 a la variable créditos.
                             Program.actualizarLabelCreditos();
                         }
                         if (num ==(rand)) {
                             Program.creditos += 25*multi; // Sumamos 250 a la variable créditos.
                             Program.actualizarLabelCreditos();
                         }
                         if (Program.creditos > oldCred+multi) {
                             
                             clip3.start();
                             clip3.setFramePosition(0);
                             JOptionPane.showMessageDialog(this, "Ganaste "+ ((Program.creditos)-oldCred+(multi*selec))+" Creditos Total");
                             clip3.loop(Clip.LOOP_CONTINUOUSLY);

                             clip3.stop();
                         }
                     });
                    
                    
                    detenerTimer.setRepeats(false); // Seteamos la repetición del detenerTimer a false.
                    detenerTimer.start(); // Encendemos el detenerTimer.
                    
                    delayRuleta = 10;
                    timer.setDelay(delayRuleta);
                    
                }
                else {
                      JOptionPane.showMessageDialog(this, "No tienes suficientes coins!\nAñade más desde la ventana Agregar Creditos.");
                }
          }
        }
        
    }//GEN-LAST:event_btnSpinActionPerformed
    
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Program.vtnRuleta.setVisible(false);
        Program.vtnMenu.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        buttonGroup2.clearSelection();
    }//GEN-LAST:event_jButton1ActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSpin;
    private javax.swing.JButton btnVolver;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox chkImPar;
    private javax.swing.JCheckBox chkN;
    private javax.swing.JCheckBox chkPar;
    private javax.swing.JCheckBox chkR;
    private javax.swing.JCheckBox chkV;
    private javax.swing.JComboBox<String> cmbApu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblBack;
    public javax.swing.JLabel lblCred;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblTest;
    private javax.swing.JLabel lblTest2;
    private javax.swing.JTextField txtNum;
    // End of variables declaration//GEN-END:variables
}
