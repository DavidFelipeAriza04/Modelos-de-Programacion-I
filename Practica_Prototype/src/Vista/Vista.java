package Vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Figuras.Circulo;
import Figuras.Rectangulo;
import Interface.Figuras_geometricas;

public class Vista extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int posx, posy, radio;
	private Color color;
	private boolean rect=false , circ=false;
	private String color_s;
	private JTextField textFieldAlto;
	private JTextField textFieldAncho;
	private JTextField textFieldRadio;
	private Rectangulo rectangulo;
	private Circulo circulo;
	private Figuras_geometricas rectangulo_clon;
	private Figuras_geometricas circulo_clon;
	

	/**
	 * Create the frame.
	 */
	public Vista() {
		rectangulo = new Rectangulo();
        circulo = new Circulo();
        rectangulo_clon = null;
        circulo_clon = null;
        
        circulo.setNombre("Circulo");
        circulo.tamaño(50, 0);
        circulo.setColor("Azul");
        rectangulo.setNombre("Rectangulo");
        rectangulo.tamaño(50, 35);
        rectangulo.setColor("Rojo");
        
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 600);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		JButton btnClonarRectangulo = new JButton("Clonar Rectangulo");
		btnClonarRectangulo.setBounds(46, 183, 160, 25);
		contentPane.add(btnClonarRectangulo);
		JButton btnClonarCirculo = new JButton("Clonar Circulo");
		btnClonarCirculo.setBounds(260, 183, 160, 25);
		contentPane.add(btnClonarCirculo);
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(360, 520, 60, 25);
		contentPane.add(btnSalir);
		
		ButtonGroup colores = new ButtonGroup();
		
		JButton btnClonar = new JButton("Clonar");
		btnClonar.setActionCommand("Clonar");
		btnClonar.setBounds(155, 368, 160, 25);
		contentPane.add(btnClonar);
		
		JLabel lblAlto = new JLabel("Alto:");
		lblAlto.setBounds(130, 229, 48, 14);
		contentPane.add(lblAlto);
		
		JLabel lblAncho = new JLabel("Ancho:");
		lblAncho.setBounds(130, 254, 48, 14);
		contentPane.add(lblAncho);
		
		JRadioButton rdbtnGris = new JRadioButton("Gris");
		rdbtnGris.setBounds(178, 289, 109, 23);
		contentPane.add(rdbtnGris);
		
		JRadioButton rdbtnAmarillo = new JRadioButton("Amarillo");
		rdbtnAmarillo.setBounds(178, 315, 109, 23);
		contentPane.add(rdbtnAmarillo);
		
		JRadioButton rdbtnVerde = new JRadioButton("Verde");
		rdbtnVerde.setBounds(178, 341, 109, 23);
		contentPane.add(rdbtnVerde);
		
		JLabel lblRectAncho = new JLabel("Ancho Original: 50");
		lblRectAncho.setBounds(46, 11, 160, 14);
		contentPane.add(lblRectAncho);
		
		JLabel lblRectAlto = new JLabel("Alto Original: 35");
		lblRectAlto.setBounds(46, 36, 160, 14);
		contentPane.add(lblRectAlto);
		
		colores.add(rdbtnVerde);
		colores.add(rdbtnAmarillo);
		colores.add(rdbtnGris);
		
		JLabel lblRectColor = new JLabel("Color Original: "+rectangulo.getColor());
		lblRectColor.setBounds(46, 61, 160, 14);
		contentPane.add(lblRectColor);
		
		textFieldAlto = new JTextField();
		textFieldAlto.setBounds(178, 226, 96, 20);
		contentPane.add(textFieldAlto);
		textFieldAlto.setColumns(10);
		
		textFieldAncho = new JTextField();
		textFieldAncho.setColumns(10);
		textFieldAncho.setBounds(178, 254, 96, 20);
		contentPane.add(textFieldAncho);
		
		JLabel lblRadio = new JLabel("Radio");
		lblRadio.setBounds(119, 254, 48, 14);
		contentPane.add(lblRadio);
		
		textFieldRadio = new JTextField();
		textFieldRadio.setColumns(10);
		textFieldRadio.setBounds(178, 254, 96, 20);
		contentPane.add(textFieldRadio);
		
		JLabel lblCircRadio = new JLabel("Radio Original: 50");
		lblCircRadio.setBounds(260, 36, 160, 14);
		contentPane.add(lblCircRadio);
		
		JLabel lblCircColor = new JLabel("Color Original: "+circulo.getColor());
		lblCircColor.setBounds(260, 61, 160, 14);
		contentPane.add(lblCircColor);
		
		JLabel lblNuevoAlto = new JLabel("");
		lblNuevoAlto.setBounds(155, 485, 160, 14);
		contentPane.add(lblNuevoAlto);
		
		JLabel lblNuevoAncho = new JLabel("");
		lblNuevoAncho.setBounds(155, 460, 160, 14);
		contentPane.add(lblNuevoAncho);
		
		JLabel lblNuevoColor = new JLabel("");
		lblNuevoColor.setBounds(155, 508, 160, 14);
		contentPane.add(lblNuevoColor);
		
		JLabel lblNuevoRadio = new JLabel("");
		lblNuevoRadio.setBounds(155, 485, 160, 14);
		contentPane.add(lblNuevoRadio);
		
		JLabel lblNuevoArea = new JLabel("");
		lblNuevoArea.setBounds(155, 533, 160, 14);
		contentPane.add(lblNuevoArea);
		
		lblAlto.setVisible(false);
		lblAncho.setVisible(false);
		lblRadio.setVisible(false);
		textFieldAlto.setVisible(false);
		textFieldAncho.setVisible(false);
		textFieldRadio.setVisible(false);
		rdbtnAmarillo.setVisible(false);
		rdbtnGris.setVisible(false);
		rdbtnVerde.setVisible(false);
		btnClonar.setVisible(false);
		
		
		ActionListener clonar_rectangulo = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				rect = true;
				circ = false;
				lblAlto.setVisible(true);
				lblAncho.setVisible(true);
				textFieldAlto.setVisible(true);
				textFieldAncho.setVisible(true);
				rdbtnAmarillo.setVisible(true);
				rdbtnGris.setVisible(true);
				rdbtnVerde.setVisible(true);
				btnClonar.setVisible(true);
				lblRadio.setVisible(false);
				textFieldRadio.setVisible(false);
				lblNuevoRadio.setVisible(false);
				lblNuevoColor.setVisible(false);
				lblNuevoArea.setVisible(false);
				repaint();
			}
		};
		
		ActionListener clonar_circulo = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				circ = true;
				rect = false;
				lblAlto.setVisible(false);
				lblAncho.setVisible(false);
				textFieldAlto.setVisible(false);
				textFieldAncho.setVisible(false);
				lblRadio.setVisible(true);
				textFieldRadio.setVisible(true);
				rdbtnAmarillo.setVisible(true);
				rdbtnGris.setVisible(true);
				rdbtnVerde.setVisible(true);
				btnClonar.setVisible(true);
				lblNuevoAlto.setVisible(false);
				lblNuevoAncho.setVisible(false);
				lblNuevoColor.setVisible(false);
				lblNuevoArea.setVisible(false);
			}
		};
		
		ActionListener clonar_figura = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(rdbtnAmarillo.isSelected()) {
					color_s = "Amarillo";
					color = Color.yellow;
				}
				if(rdbtnGris.isSelected()) {
					color_s = "Gris";
					color = Color.gray;
				}
				if(rdbtnVerde.isSelected()) {
					color_s = "Verde";
					color = Color.green;
				}
				if(!textFieldAlto.getText().equals("")&&!textFieldAncho.getText().equals("")&&rect) {
					rectangulo_clon = rectangulo.clonar();
					posx = Integer.parseInt(textFieldAncho.getText());
					posy = Integer.parseInt(textFieldAlto.getText());
					rectangulo_clon.tamaño(posx, posy);
					rectangulo_clon.color(color_s);
					lblNuevoAlto.setVisible(true);
					lblNuevoAncho.setVisible(true);
					lblNuevoColor.setVisible(true);
					lblNuevoArea.setVisible(true);
					lblNuevoAlto.setText("Nuevo Alto: "+posy);
					lblNuevoAncho.setText("Nuevo Ancho: "+posx);
					lblNuevoColor.setText("Nuevo Color: "+rectangulo_clon.getColor());
					lblNuevoArea.setText("Nuevo Area: "+rectangulo_clon.getArea());
					lblNuevoRadio.setVisible(false);
				}
				if(!textFieldRadio.getText().equals("")&&circ) {
					radio = Integer.parseInt(textFieldRadio.getText());
					circulo_clon = circulo.clonar();
					circulo_clon.tamaño(radio, 0);
					circulo_clon.color(color_s);
					lblNuevoArea.setVisible(true);
					lblNuevoRadio.setVisible(true);
					lblNuevoColor.setVisible(true);
					lblNuevoRadio.setText("Nuevo Radio: "+radio);
					lblNuevoColor.setText("Nuevo Color: "+circulo.getColor());
					lblNuevoArea.setText("Nuevo Area: "+circulo.getArea());
					lblNuevoAlto.setVisible(false);
					lblNuevoAncho.setVisible(false);
				}
				repaint();
			}
		};
		
		ActionListener salir = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		};
		
		btnClonarRectangulo.addActionListener(clonar_rectangulo);
		btnClonarCirculo.addActionListener(clonar_circulo);
		btnClonar.addActionListener(clonar_figura);
		btnSalir.addActionListener(salir);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.black);
		g.drawRect(110, 150, 50, 35);
		g.drawOval(320, 140, 50, 50);
		g.setColor(Color.red);
		g.fillRect(110, 150, 50, 35);
		g.setColor(Color.blue);
		g.fillOval(320, 140, 50, 50);
		if(rect) {
			g.setColor(Color.black);
			g.drawRect(200, 440, this.posx, this.posy);
			g.setColor(this.color);
			g.fillRect(200, 440, this.posx, this.posy);
		}
		if(circ) {
			g.setColor(Color.black);
			g.drawOval(200, 440, this.radio, this.radio);
			g.setColor(this.color);
			g.fillOval(200, 440, this.radio, this.radio);
		}
	}
}
