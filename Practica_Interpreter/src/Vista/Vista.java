/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import javax.swing.JOptionPane;
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabelCodigo = new javax.swing.JLabel();
        jLabelExpresion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaExpresion = new javax.swing.JTextArea();
        jRadioButtonCodificar = new javax.swing.JRadioButton();
        jRadioButtonDecodificar = new javax.swing.JRadioButton();
        jButtonConfirmar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaResultado = new javax.swing.JTextArea();
        jSpinnerCodigo = new javax.swing.JSpinner();
        jLabelExpresion1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Julio Cesar");
        setMinimumSize(new java.awt.Dimension(400, 390));
        setPreferredSize(new java.awt.Dimension(340, 390));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCodigo.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelCodigo.setText("Codigo:");
        getContentPane().add(jLabelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        jLabelExpresion.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelExpresion.setText("Expresion:");
        getContentPane().add(jLabelExpresion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jTextAreaExpresion.setColumns(20);
        jTextAreaExpresion.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTextAreaExpresion.setLineWrap(true);
        jTextAreaExpresion.setRows(5);
        jTextAreaExpresion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPane1.setViewportView(jTextAreaExpresion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 240, -1));

        buttonGroup1.add(jRadioButtonCodificar);
        jRadioButtonCodificar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jRadioButtonCodificar.setText("Codificar");
        getContentPane().add(jRadioButtonCodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        buttonGroup1.add(jRadioButtonDecodificar);
        jRadioButtonDecodificar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jRadioButtonDecodificar.setText("Decodificar");
        getContentPane().add(jRadioButtonDecodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        jButtonConfirmar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jButtonConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 90, 30));

        jTextAreaResultado.setColumns(20);
        jTextAreaResultado.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTextAreaResultado.setLineWrap(true);
        jTextAreaResultado.setRows(5);
        jTextAreaResultado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPane2.setViewportView(jTextAreaResultado);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 240, -1));

        jSpinnerCodigo.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        getContentPane().add(jSpinnerCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        jLabelExpresion1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelExpresion1.setText("Expresion:");
        getContentPane().add(jLabelExpresion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JButton jButtonConfirmar;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelExpresion;
    private javax.swing.JLabel jLabelExpresion1;
    public javax.swing.JRadioButton jRadioButtonCodificar;
    public javax.swing.JRadioButton jRadioButtonDecodificar;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JSpinner jSpinnerCodigo;
    public javax.swing.JTextArea jTextAreaExpresion;
    public javax.swing.JTextArea jTextAreaResultado;
    // End of variables declaration//GEN-END:variables
    public void Mensaje(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
}
