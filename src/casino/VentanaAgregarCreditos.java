package casino;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class VentanaAgregarCreditos extends javax.swing.JFrame {
        ImageIcon imag = new ImageIcon("src\\casino\\img\\fondoBack2.jpg");
    
        Image im = imag.getImage(); // Transforma el ImageIcon a Image
        Image back = im.getScaledInstance(555, 435, java.awt.Image.SCALE_SMOOTH); // Escala la imagen
        ImageIcon f1 = new ImageIcon(back);     
      
    int montoCred = 0; // Esta variable nos va a servir para almacenar el total en créditos que el usuario quiere agregar.
    int precioDolar = 0; // Esta variable nos va a servir para almacenar el total en dólares que el usuario tendrá que pagar. 

    public VentanaAgregarCreditos() {
          initComponents();
          lblImg.setIcon(f1);
          this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
          this.setLocationRelativeTo(this);
          this.setResizable(false); // Hacemos que la ventana no se pueda maximizar.
          
          buttonGroup1.add(rbtEfectivo); // Agrupamos el rbtEfectivo al butttonGroup1.
          buttonGroup1.add(rbtMercado); // Agrupamos el rbtMercado al butttonGroup1.
          buttonGroup1.add(rbtTarjeta);// Agrupamos el rbtTarjeta al butttonGroup1.     
          
          lblSaldoDolares.setText("Saldo disponible en dólares: $" + Integer.toString(Program.saldo)); // Indicamos que el lblTotalDolares tenga el valor actual de los dólares del usuario.          
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        rbtEfectivo = new javax.swing.JRadioButton();
        rbtTarjeta = new javax.swing.JRadioButton();
        rbtMercado = new javax.swing.JRadioButton();
        lblCantidadCreditos = new javax.swing.JLabel();
        txtCredito = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        lblSaldoDolares = new javax.swing.JLabel();
        lblCostoDolares = new javax.swing.JLabel();
        lblImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Metodos de Pago");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 18, -1, -1));

        rbtEfectivo.setBackground(new java.awt.Color(51, 51, 51));
        rbtEfectivo.setForeground(new java.awt.Color(255, 255, 255));
        rbtEfectivo.setText("Efectivo");
        rbtEfectivo.setContentAreaFilled(false);
        getContentPane().add(rbtEfectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 110, -1, -1));

        rbtTarjeta.setBackground(new java.awt.Color(51, 51, 51));
        rbtTarjeta.setForeground(new java.awt.Color(255, 255, 255));
        rbtTarjeta.setSelected(true);
        rbtTarjeta.setText("Tarjeta");
        rbtTarjeta.setContentAreaFilled(false);
        getContentPane().add(rbtTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 65, -1, -1));

        rbtMercado.setBackground(new java.awt.Color(51, 51, 51));
        rbtMercado.setForeground(new java.awt.Color(255, 255, 255));
        rbtMercado.setText("Mercado Pago");
        rbtMercado.setContentAreaFilled(false);
        getContentPane().add(rbtMercado, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 155, -1, -1));

        lblCantidadCreditos.setForeground(new java.awt.Color(255, 255, 255));
        lblCantidadCreditos.setText("Ingrese la cantidad de créditos a agregar:");
        getContentPane().add(lblCantidadCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 68, -1, -1));

        txtCredito.setBackground(new java.awt.Color(51, 51, 51));
        txtCredito.setForeground(new java.awt.Color(255, 255, 255));
        txtCredito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCreditoKeyReleased(evt);
            }
        });
        getContentPane().add(txtCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 65, 80, -1));

        btnAceptar.setBackground(new java.awt.Color(51, 51, 51));
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Agregar");
        btnAceptar.setBorder(null);
        btnAceptar.setFocusPainted(false);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 236, 96, 38));

        lblSaldoDolares.setForeground(new java.awt.Color(255, 255, 255));
        lblSaldoDolares.setText("Saldo disponible en dólares: $1000");
        getContentPane().add(lblSaldoDolares, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 155, -1, 21));

        lblCostoDolares.setForeground(new java.awt.Color(255, 255, 255));
        lblCostoDolares.setText("Costo en dólares: $0");
        getContentPane().add(lblCostoDolares, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 104, -1, 33));
        getContentPane().add(lblImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // El método txtCreditoKeyReleased se usa cada vez que el usuario suelta la tecla Enter
    private void txtCreditoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCreditoKeyReleased
        String strCred = txtCredito.getText(); // Se obtiene el valor del texto que el usuario ingresó en el txtCredito y se almacena en la variable strCred.
        
        if (strCred.isBlank()) { // si la variable strCred está vacía, entonces...
            strCred ="0"; // se setea el valor "0".
            lblCostoDolares.setText("Costo en dólares: $" + strCred); // se setea el texto "0" en el lblDolar
        }
        
        try {
            if(Integer.parseInt(strCred) < 0) {
                strCred ="0"; // se setea el valor "0".
                lblCostoDolares.setText("Costo en dólares: $" + strCred); // se setea el texto "0" en el lblDolar   
            }        
            montoCred = Integer.parseInt(strCred);  // Se convierte en entero el valor de strCred y se almacena en la variable montoCred.
            precioDolar = montoCred * 5; // Actualizamos el total de Dólares. (1 crédito  = 5 USD)
            strCred = Integer.toString(precioDolar); // Convertimos montoCred en String para colocarlo dentro del lblDolar.
            lblCostoDolares.setText("Costo en dólares: $" + strCred);
        } catch (NumberFormatException e) {
            
        }
        

        

        
    }//GEN-LAST:event_txtCreditoKeyReleased
    
    // El método limpiar sirve para hacer que el txtCredito se vacíe y para que el puntero del mouse se coloque para escribir dentro del área.
    private void limpiar() {
          txtCredito.setText(""); // Colocamos el txtCredito vacío para que el usuario vuelva a ingresar un valor.
          lblCostoDolares.setText("Costo en dólares: $0");
          precioDolar = 0; // Reiniciamos el precioDolar.
          montoCred = 0; // Reiniciamos el montoCred.
          txtCredito.requestFocus(); // Colocamos el puntero en el área.
    }

    // El método btnAceptarActionPerformed se llama cuando el usuario clickea en el botón [Aceptar].
                    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
                          if (Program.saldo < precioDolar) {
                                JOptionPane.showMessageDialog(this, "Saldo insuficiente.");
                          } else {
                              Program.saldo = Program.saldo - precioDolar; // Se le resta al usuario la cantidad de dólares.
                              Program.creditos = Program.creditos + montoCred; // Se le suma el total de créditos en la variable creditos de la ventanaJuego.
                              
                              Program.actualizarLabelCreditos();

                              lblSaldoDolares.setText("Saldo disponible en dólares: $" + Program.saldo);
                              limpiar(); // Se limpia el txtCredito y se coloca el puntero dentro del área para que el usuario vuelva a ingresar créditos.
                          }

                    }//GEN-LAST:event_btnAceptarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCantidadCreditos;
    private javax.swing.JLabel lblCostoDolares;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblSaldoDolares;
    private javax.swing.JRadioButton rbtEfectivo;
    private javax.swing.JRadioButton rbtMercado;
    private javax.swing.JRadioButton rbtTarjeta;
    private javax.swing.JTextField txtCredito;
    // End of variables declaration//GEN-END:variables
}
