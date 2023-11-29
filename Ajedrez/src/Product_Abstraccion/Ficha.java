/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Product_Abstraccion;

import Implementation.Color;

/**
 *
 * @author david
 */
public abstract class Ficha {

    private Color color;
    protected int col;
    protected int row;
    protected String imagen;
    protected String nombre;

    public Ficha(Color color, String nombre, int row, int col, String imagen) {
        this.color = color;
        this.nombre = nombre;
        this.row = row;
        this.col = col;
        this.imagen = imagen;
    }

    public Ficha(Ficha ficha) {
    }

    public abstract void mover(int row, int col);

    public abstract String getNombre();

    public String getColor() {
        return this.color.getNombre();
    }

    public abstract String getTipo();

    public abstract String getImagen();
}
