/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import ConcreteIterableCollection.ConcreteIterableCollectionPersonas;
import IterableCollection.AbsIterableCollection;
import Iterator.AbsIterator;
import Persona.Persona;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author david
 */
public class Vista extends JFrame {

    private JButton BtnPrimero;
    private JButton BtnAnterior;
    private JButton BtnSiguiente;
    private JButton BtnSalir;
    private JButton BtnContar;
    private JLabel LblNombre;
    private JTextField TxtNombre;
    private JLabel LblEdad;
    private JTextField TxtEdad;
    private JLabel Imagen;
    private AbsIterator iteradorPersonas;

    public Vista() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            // handle exception
        }

        Persona persona1 = new Persona("David", "19", "/Images/Nino.png");
        Persona persona2 = new Persona("Andres", "20", "/Images/Nino.png");
        Persona persona3 = new Persona("Daniela", "18", "/Images/Nina.jpg");
        Persona persona4 = new Persona("Juan", "30", "/Images/Nino.png");
        Persona persona5 = new Persona("Lola", "40", "/Images/Nina.jpg");

        AbsIterableCollection personas = new ConcreteIterableCollectionPersonas();
        personas.Anadir(persona1);
        personas.Anadir(persona2);
        personas.Anadir(persona3);
        personas.Anadir(persona4);
        personas.Anadir(persona5);

        iteradorPersonas = personas.getIterador();

        initComponenents();
    }

    public void initComponenents() {

        JPanel contentPane = new JPanel();
        this.setContentPane(contentPane);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setTitle("Patron Iterator");

        BtnPrimero = new JButton("Primero");
        BtnPrimero.setBounds(200, 30, 100, 30);
        BtnPrimero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        BtnPrimero.setFocusable(false);
        getContentPane().add(BtnPrimero);

        BtnAnterior = new JButton("Anterior");
        BtnAnterior.setBounds(10, 30, 100, 30);
        BtnAnterior.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        BtnAnterior.setFocusable(false);
        getContentPane().add(BtnAnterior);

        BtnSiguiente = new JButton("Siguiente");
        BtnSiguiente.setBounds(this.getWidth() - 125, 30, 100, 30);
        BtnSiguiente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        BtnSiguiente.setFocusable(false);
        getContentPane().add(BtnSiguiente);

        BtnContar = new JButton("Contar");
        BtnContar.setBounds(10, this.getHeight() - 80, 100, 30);
        BtnContar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        BtnContar.setFocusable(false);
        getContentPane().add(BtnContar);

        BtnSalir = new JButton("Salir");
        BtnSalir.setBounds(this.getWidth() - 125, this.getHeight() - 80, 100, 30);
        BtnSalir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        BtnSalir.setFocusable(false);
        getContentPane().add(BtnSalir);

        LblNombre = new JLabel("Nombre:");
        LblNombre.setBounds(200, 100, 50, 20);
        getContentPane().add(LblNombre);

        TxtNombre = new JTextField();
        TxtNombre.setEditable(false);
        TxtNombre.setFocusable(false);
        TxtNombre.setBounds(250, 100, 60, 20);
        getContentPane().add(TxtNombre);

        LblEdad = new JLabel("Edad:");
        LblEdad.setBounds(200, 130, 50, 20);
        getContentPane().add(LblEdad);

        TxtEdad = new JTextField();
        TxtEdad.setEditable(false);
        TxtEdad.setFocusable(false);
        TxtEdad.setBounds(250, 130, 60, 20);
        getContentPane().add(TxtEdad);

        Imagen = new JLabel("Imagen:");
        LblEdad.setBounds(200, 160, 50, 20);
        getContentPane().add(LblEdad);

        Imagen = new JLabel();
        Imagen.setBounds(175, 200, 150, 150);
        Imagen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(Imagen);

        this.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);

        ActionListener salir = (ActionEvent e) -> {
            System.exit(0);
        };

        this.BtnSalir.addActionListener(salir);

        ActionListener reiniciar = (ActionEvent e) -> {
            Persona p = (Persona) iteradorPersonas.primeraPos();
            TxtNombre.setText(p.devolverDatos()[0]);
            TxtEdad.setText(p.devolverDatos()[1]);
            Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.devolverDatos()[2])));
        };

        this.BtnPrimero.addActionListener(reiniciar);

        ActionListener siguiente = (ActionEvent e) -> {
            Persona p = (Persona) iteradorPersonas.siguiente();
            if (p == null) {
                JOptionPane.showMessageDialog(null, "No hay mas personas");
 
            } else {
                TxtNombre.setText(p.devolverDatos()[0]);
                TxtEdad.setText(p.devolverDatos()[1]);
                Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.devolverDatos()[2])));
            }
        };

        this.BtnSiguiente.addActionListener(siguiente);

        ActionListener anterior = (ActionEvent e) -> {
            Persona p = (Persona) iteradorPersonas.anterior();
            if (p == null) {
                JOptionPane.showMessageDialog(null, "Esta es la primera persona");
            } else {
                TxtNombre.setText(p.devolverDatos()[0]);
                TxtEdad.setText(p.devolverDatos()[1]);
                Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.devolverDatos()[2]))); // NOI18N
            }
        };

        this.BtnAnterior.addActionListener(anterior);

        ActionListener contar = (ActionEvent e) -> {
            JOptionPane.showMessageDialog(null, "Hay "+iteradorPersonas.contar()+" personas");
        };

        this.BtnContar.addActionListener(contar);
    }
}
