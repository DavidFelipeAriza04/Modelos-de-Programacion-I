/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author david
 */
public class Vista extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    public Vista() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            // handle exception
        }
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelBin = new javax.swing.JLabel();
        jTextFieldDec = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldBin = new javax.swing.JTextField();
        jButtonConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(310, 220));
        setPreferredSize(new java.awt.Dimension(310, 220));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelBin.setText("Numero Binario:");
        getContentPane().add(jLabelBin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jTextFieldDec.setEditable(false);
        jTextFieldDec.setFocusable(false);
        getContentPane().add(jTextFieldDec, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 100, -1));

        jLabel1.setText("Numero Decimal:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));
        getContentPane().add(jTextFieldBin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 100, -1));

        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jButtonConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonConfirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBin;
    public javax.swing.JTextField jTextFieldBin;
    public javax.swing.JTextField jTextFieldDec;
    // End of variables declaration//GEN-END:variables
}