/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConcreteProduct;

import Implementation.Color;
import Product_Abstraccion.Ficha;

/**
 *
 * @author david
 */
public class FichaNegra extends Ficha {

    public FichaNegra(Color color, String nombre, int row, int col, String imagen) {
        super(color, nombre, row, col, imagen);
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void mover(int row, int col) {
        this.row = row;
        this.col = col;
    }

    @Override
    public void setTipo(String tipo) {
    }

    @Override
    public String getTipo() {
        return "";
    }
}
