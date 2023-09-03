
package Figuras;

/**
 *
 * @author David Ariza
 */
import Interface.Figuras_geometricas;

public class Rectangulo implements Figuras_geometricas {
	private String color;
	private String Nombre;
	private int pos_x, pos_y;

	public Rectangulo() {
	}


	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void setNombre(String n) {
		this.Nombre = n;
	}

	public String getNombre() {
		return Nombre;
	}

	@Override
	public void tamaño(int x, int y) {
		this.pos_x = x;
		this.pos_y = y;

	}

	@Override
	public void getposicion() {
		System.out.println("Altura del rectangulo .." + this.pos_y);
		System.out.println("Ancho del rectangulo...." + this.pos_x);
	}

	@Override
	public Figuras_geometricas clonar() {

		Figuras_geometricas geometrica = new Rectangulo();
		geometrica.setNombre(this.Nombre);
		geometrica.tamaño(this.pos_x, this.pos_y);
		geometrica.color(this.color);
		return geometrica;
	}

	@Override
	public void color(String n) {
		this.color = n;
	}

	@Override
	public String getColor() {
		return this.color;
	}

	@Override
	public double getArea() {
		return this.pos_x * this.pos_y;
	}
}
