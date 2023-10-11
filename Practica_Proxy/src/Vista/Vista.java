/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Vista extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    public Vista() {
        initComponents();
        this.setResizable(false);
        this.jPanelValidandoDatos.setVisible(false);
        this.jPanelSesionIniciada.setVisible(false);
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

        jPanelSesionIniciada = new javax.swing.JPanel();
        jLabelSesionIniciada = new javax.swing.JLabel();
        jLabelBienvenido = new javax.swing.JLabel();
        jPanelValidandoDatos = new javax.swing.JPanel();
        jLabelValidandoDatos = new javax.swing.JLabel();
        jProgressBarValidacion = new javax.swing.JProgressBar();
        jPanelLogIn = new javax.swing.JPanel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelContrasena = new javax.swing.JLabel();
        jPasswordFieldContrasena = new javax.swing.JPasswordField();
        jTextFieldUsuario = new javax.swing.JTextField();
        jButtonLogIn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelSesionIniciada.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelSesionIniciada.setText("Sesion Iniciada");
        jPanelSesionIniciada.add(jLabelSesionIniciada, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));
        jPanelSesionIniciada.add(jLabelBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 80, -1, -1));

        getContentPane().add(jPanelSesionIniciada, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 190));

        jPanelValidandoDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelValidandoDatos.setText("Validando datos...");
        jPanelValidandoDatos.add(jLabelValidandoDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));
        jPanelValidandoDatos.add(jProgressBarValidacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, 20));

        getContentPane().add(jPanelValidandoDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 190));

        jPanelLogIn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelUsuario.setText("Usuario:");
        jPanelLogIn.add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jLabelContrasena.setText("Contrasena:");
        jPanelLogIn.add(jLabelContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));
        jPanelLogIn.add(jPasswordFieldContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 100, -1));
        jPanelLogIn.add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 100, -1));

        jButtonLogIn.setText("Iniciar Sesion");
        jPanelLogIn.add(jButtonLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        getContentPane().add(jPanelLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonLogIn;
    public javax.swing.JLabel jLabelBienvenido;
    private javax.swing.JLabel jLabelContrasena;
    private javax.swing.JLabel jLabelSesionIniciada;
    private javax.swing.JLabel jLabelUsuario;
    public javax.swing.JLabel jLabelValidandoDatos;
    public javax.swing.JPanel jPanelLogIn;
    public javax.swing.JPanel jPanelSesionIniciada;
    public javax.swing.JPanel jPanelValidandoDatos;
    public javax.swing.JPasswordField jPasswordFieldContrasena;
    public javax.swing.JProgressBar jProgressBarValidacion;
    public javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables

    public void LogIn(Boolean validacion, String usuario) {
        Thread hilo = new Thread() {
            @Override
            public void run() {
                jPanelLogIn.setVisible(false);
                jPanelValidandoDatos.setVisible(true);
                jProgressBarValidacion.setMinimum(0);
                jProgressBarValidacion.setMaximum(100);
                int porcentaje = 0;
                while (porcentaje <= 100) {
                    int random = (int) (Math.random() * 10);
                    try {
                        Thread.sleep((int) (Math.random() * 300));
                        jProgressBarValidacion.setValue(porcentaje);
                    } catch (Exception ex) {
                        System.out.println("Error");
                    }
                    porcentaje += random;
                }
                jProgressBarValidacion.setValue(100);
                if (validacion) {
                    JOptionPane.showMessageDialog(null, "Inicio de sesion correcto");
                    jPanelValidandoDatos.setVisible(false);
                    jPanelSesionIniciada.setVisible(true);
                    jLabelBienvenido.setText("Bienvenido " + usuario);
                } else {
                    JOptionPane.showMessageDialog(null, "Datos invalidos");
                    jPanelValidandoDatos.setVisible(false);
                    jPanelSesionIniciada.setVisible(false);
                    jPanelLogIn.setVisible(true);
                }

            }
        };
        hilo.start();
    }
}