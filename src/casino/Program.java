package casino;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
public class Program {
      public static int creditos = 25;
      public static int saldo = 1000;
      
      public static boolean musicaActivada = true;
      
      public static VentanaMenu vtnMenu = new VentanaMenu();
      public static VentanaContraseña vtnLog = new VentanaContraseña();
      public static VentanaTragamonedas vtnTragamonedas = new VentanaTragamonedas();
      public static VentanaAgregarCreditos vtnAgregar = new VentanaAgregarCreditos();
      public static  VentanaRuleta vtnRuleta = new VentanaRuleta();
      public static VentanaExtras vtnExtras = new VentanaExtras();
      public static VentanaTienda vtnTienda = new VentanaTienda();
      public static Clip clip;
      public static Clip clip2;
      public static Clip clip3;
      public static Clip clip4;
      public static File audioFile;
      public static File audioFile2;
      public static File audioFile3;
      public static File audioFile4;
       
      public static void main(String[] args) throws IOException {
          try {
              // vtnLogin.setVisible(true);
              vtnLog.setVisible(true);
              
              audioFile = new File("src\\casino\\song\\Casicat.wav");
              audioFile2 = new File("src\\casino\\song\\rulet2.wav");
              audioFile3 = new File("src\\casino\\song\\win2.wav");
              audioFile4 = new File("src\\casino\\song\\coin.wav");
              clip = AudioSystem.getClip();
              clip2 = AudioSystem.getClip();
              clip3 = AudioSystem.getClip();
              clip4 = AudioSystem.getClip();
              AudioInputStream ais = AudioSystem.getAudioInputStream(audioFile);
              AudioInputStream ais2 = AudioSystem.getAudioInputStream(audioFile2);
              AudioInputStream ais3 = AudioSystem.getAudioInputStream(audioFile3);
              AudioInputStream ais4 = AudioSystem.getAudioInputStream(audioFile4);
              clip.open(ais);
              clip2.open(ais2);
              clip3.open(ais3);
              clip4.open(ais4);
              clip.loop(Clip.LOOP_CONTINUOUSLY);
              SwingUtilities.invokeLater(new Runnable() {
                  public void run() {
                  }   
              });
          } catch (LineUnavailableException ex) {
              Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
          } catch (UnsupportedAudioFileException ex) {
              Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
          }
          
    }

    
      public static void actualizarLabelCreditos() {
           vtnTragamonedas.lblCred.setText("Creditos: " + (Program.creditos));
           vtnMenu.lblCred.setText("Creditos: " + (Program.creditos));
           vtnTienda.lblCred.setText("Creditos: " + (Program.creditos));
           vtnRuleta.lblCred.setText("Creditos: " + (Program.creditos));  
      }    
}
