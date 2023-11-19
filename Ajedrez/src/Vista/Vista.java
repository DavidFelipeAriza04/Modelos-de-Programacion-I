/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Product_Abstraccion.Ficha;
import Singleton.Tablero;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author david
 */
public class Vista extends javax.swing.JFrame {

    private String turno;
    private Tablero tablero;
    private ArrayList<JLabel> Casillas = new ArrayList();
    private ArrayList<Component> CasillasSel = new ArrayList();

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Vista(Tablero tablero) {
        this.turno = "Blanco";
        this.tablero = tablero;
        initComponents();
        setLocationRelativeTo(null);
        anadirCasillas();
        this.setVisible(true);
        for (JLabel Casilla : Casillas) {
            for (Ficha ficha : tablero.getFichasNegras()) {
                if (Casilla.getName().equals(ficha.getNombre())) {
                    Casilla.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
//                            System.out.println(Casilla.getName());
                            for (JLabel Casilla1 : Casillas) {
                                Casilla1.setBorder(null);
                            }
                            Casilla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 41)));
                            Component casilla = Casilla;
                            CasillasSel.clear();
                            CasillasSel.add(casilla);
                        }
                    });
                    Casilla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                }
            }
        }
        for (int i = 16; i < 48; i++) {
            Component casilla2 = jPanelCasillas.getComponent(i);
            casilla2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            casilla2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent ev) {
//                    System.out.println("Hola");
                    CasillasSel.add(casilla2);
                    if (CasillasSel.size() == 2) {
                        System.out.println("2");
                        for (int i = 0; i < jPanelCasillas.getComponents().length; i++) {
                            if (jPanelCasillas.getComponent(i) == CasillasSel.get(0)) {
                                System.out.println(jPanelCasillas.getComponent(i).getName());
                                for (int j = 0; j < jPanelCasillas.getComponents().length; j++) {
                                    if (jPanelCasillas.getComponent(j) == CasillasSel.get(1)) {
                                        System.out.println(jPanelCasillas.getComponent(j).getName());
                                        jPanelCasillas.add(CasillasSel.get(0),j);
                                        jPanelCasillas.add(CasillasSel.get(1),i);
                                        jPanelCasillas.updateUI();
                                    }
                                }
                            }
                        }
//                        CasillasSel.get(0);
//                        CasillasSel.get(1);
                        CasillasSel.clear();
                    }
                }
            });
        }
        ;
//        Component casilla = jPanelCasillas.getComponent(20);
//        Component casilla2 = jPanelCasillas.getComponent(0);
//        jPanelCasillas.add(casilla,0);
//        jPanelCasillas.add(casilla2, 20);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCasillas = new javax.swing.JPanel();
        jLabelTablero = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelCasillas.setBackground(new java.awt.Color(0, 0, 0));
        jPanelCasillas.setOpaque(false);
        jPanelCasillas.setLayout(new java.awt.GridLayout());
        getContentPane().add(jPanelCasillas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 400, 400));

        jLabelTablero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Tablero.png"))); // NOI18N
        getContentPane().add(jLabelTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabelTablero;
    public javax.swing.JPanel jPanelCasillas;
    // End of variables declaration//GEN-END:variables

    public void anadirCasillas() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                JLabel casilla = new JLabel();
                casilla.setSize(50, 50);
                casilla.setFocusable(false);
                if (i == 0) {
                    switch (j) {
                        case 0:
                            casilla.setName("TorreNegro1");
                            casilla.setIcon(new ImageIcon(getClass().getResource("/images/TorreNegro.png")));
                            break;
                        case 7:
                            casilla.setName("TorreNegro2");
                            casilla.setIcon(new ImageIcon(getClass().getResource("/images/TorreNegro.png")));
                            break;
                        case 1:
                            casilla.setName("CaballoNegro1");
                            casilla.setIcon(new ImageIcon(getClass().getResource("/images/CaballoNegro.png")));
                            break;
                        case 6:
                            casilla.setName("CaballoNegro2");
                            casilla.setIcon(new ImageIcon(getClass().getResource("/images/CaballoNegro.png")));
                            break;
                        case 2:
                            casilla.setName("AlfilNegro1");
                            casilla.setIcon(new ImageIcon(getClass().getResource("/images/AlfilNegro.png")));
                            break;
                        case 5:
                            casilla.setName("AlfilNegro2");
                            casilla.setIcon(new ImageIcon(getClass().getResource("/images/AlfilNegro.png")));
                            break;
                        case 3:
                            casilla.setName("ReinaNegro");
                            casilla.setIcon(new ImageIcon(getClass().getResource("/images/ReinaNegro.png")));
                            break;
                        case 4:
                            casilla.setName("ReyNegro");
                            casilla.setIcon(new ImageIcon(getClass().getResource("/images/ReyNegro.png")));
                            break;
                    }
                } else if (i == 1) {
                    casilla.setName("PeonNegro" + (j + 1));
                    casilla.setIcon(new ImageIcon(getClass().getResource("/images/PeonNegro.png")));
                } else if (i == 7) {
                    switch (j) {
                        case 0:
                            casilla.setName("TorreBlanco1");
                            casilla.setIcon(new ImageIcon(getClass().getResource("/images/TorreBlanco.png")));
                            break;
                        case 7:
                            casilla.setName("TorreBlanco2");
                            casilla.setIcon(new ImageIcon(getClass().getResource("/images/TorreBlanco.png")));
                            break;
                        case 1:
                            casilla.setName("CaballoBlanco1");
                            casilla.setIcon(new ImageIcon(getClass().getResource("/images/CaballoBlanco.png")));
                            break;
                        case 6:
                            casilla.setName("CaballoBlanco2");
                            casilla.setIcon(new ImageIcon(getClass().getResource("/images/CaballoBlanco.png")));
                            break;
                        case 2:
                            casilla.setName("AlfilBlanco1");
                            casilla.setIcon(new ImageIcon(getClass().getResource("/images/AlfilBlanco.png")));
                            break;
                        case 5:
                            casilla.setName("AlfilBlanco2");
                            casilla.setIcon(new ImageIcon(getClass().getResource("/images/AlfilBlanco.png")));
                            break;
                        case 3:
                            casilla.setName("ReinaBlanco");
                            casilla.setIcon(new ImageIcon(getClass().getResource("/images/ReinaBlanco.png")));
                            break;
                        case 4:
                            casilla.setName("ReyBlanco");
                            casilla.setIcon(new ImageIcon(getClass().getResource("/images/ReyBlanco.png")));
                            break;
                    }
                } else if (i == 6) {
                    casilla.setName("PeonBlanco" + (j + 1));
                    casilla.setIcon(new ImageIcon(getClass().getResource("/images/PeonBlanco.png")));
                }
                if (casilla.getIcon() == null) {

                } else {
                    Casillas.add(casilla);
                }
                this.jPanelCasillas.add(casilla);
            }
        }
    }
}
