/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import lista.NodoSimple;
import lista.Conjunto;
import gramatica.Gramatica;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.help.HelpSetException;
import principal.Sistema;

/**
 *
 * @author camilo
 */
public class GUISeleccion extends javax.swing.JFrame {

    private Gramatica gramatica;
    private Conjunto conjuntoSelecciones;
    private int numeroSelecciones;
    private GUIGramatica anterior;

    /**
     * Creates new form GUISeleccion
     */
    private GUISeleccion() {
        initComponents();
    }

    public GUISeleccion(Gramatica gramatica) {
        initComponents();
        this.gramatica = gramatica;
        conjuntoSelecciones = new Conjunto();
        construirSelecciones();
        
        //<editor-fold defaultstate="collapsed" desc="Creación de ayuda">
        try {
            URL hsURL = this.getClass().getResource("/ayuda/ayuda.hs");
            HelpSet helpset = new HelpSet(null, hsURL);
            HelpSet.Presentation hsp = helpset.getPresentation("MainWin");

            HelpBroker help_browser = helpset.createHelpBroker();
            help_browser.setHelpSetPresentation(hsp);

            help_browser.enableHelpOnButton(btnAyuda, "introduction", helpset);
        } catch (HelpSetException ex) {
            Logger.getLogger(GUIGramatica.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jpSelecciones = new javax.swing.JPanel();
        menu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        btnAyuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Conjunto selecciones - Arcagram");
        setIconImage(getIconImage());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jpSelecciones.setBackground(java.awt.Color.lightGray);
        jpSelecciones.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));
        jpSelecciones.setLayout(new java.awt.GridLayout(0, 1, 0, 2));
        jScrollPane1.setViewportView(jpSelecciones);

        jMenu1.setText("Selecciones");
        menu.add(jMenu1);

        jMenu2.setText("Edición");
        menu.add(jMenu2);

        jMenu3.setText("Ayuda");

        btnAyuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        btnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/ayuda.png"))); // NOI18N
        btnAyuda.setText("Ayuda");
        jMenu3.add(btnAyuda);

        menu.add(jMenu3);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        anterior.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(GUISeleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUISeleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUISeleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUISeleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUISeleccion().setVisible(true);
            }
        });
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("src/Icono.png"));

        return retValue;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnAyuda;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpSelecciones;
    private javax.swing.JMenuBar menu;
    // End of variables declaration//GEN-END:variables

    private void construirSelecciones() {
        NodoSimple p = gramatica.getProducciones().getPrimero();
        int i = 1;
        while (p != null) {
            PanelSeleccion proxima = new PanelSeleccion(i);
            agregarSeleccion(proxima);
            i = i + 1;
            p = p.retornaLiga();
        }
        reescribirComponentes();
    }

    private void agregarSeleccion(PanelSeleccion seleccion) {
        seleccion.setVisible(true);
        conjuntoSelecciones.agregar(seleccion);
    }

    private void reescribirComponentes() {
        PanelSeleccion seleccionActual;
        for (NodoSimple p = conjuntoSelecciones.getPrimero(); p != null;
                p = p.retornaLiga()) {
            seleccionActual = (PanelSeleccion) p.retornaDato();
            jpSelecciones.add(seleccionActual);
        }
        //jpProducciones.setMinimumSize(new Dimension(jpProducciones.getSize().width, 23 * numeroProducciones));
        asignarTamañoVentana();
        paintAll(this.getGraphics());
    }

    private void asignarTamañoVentana() {
        setMinimumSize(new Dimension(400, 136 + 81));
        int alturaDeseada = 156 + 27 * numeroSelecciones;
        if (alturaDeseada < Sistema.obtenerTamañoPantalla().height - 40) {
            setSize(new Dimension(this.getWidth(), 136 + 27 * numeroSelecciones));
        } else {
            setSize(new Dimension(this.getWidth(), Sistema.obtenerTamañoPantalla().height - 40));
        }
    }

    public void setAnterior(GUIGramatica anterior) {
        this.anterior = anterior;
    }
}
