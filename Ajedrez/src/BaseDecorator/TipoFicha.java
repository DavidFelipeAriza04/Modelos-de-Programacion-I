/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDecorator;

import Product_Abstraccion.Ficha;

/**
 *
 * @author david
 */
public class TipoFicha extends Ficha {

    private Ficha ficha;
    protected String tipo;

    public TipoFicha(Ficha ficha) {
        super(ficha);
        this.ficha = ficha;
    }

    @Override
    public void mover(int row, int col) {
        this.row = row;
        this.col = col;
    }

    @Override
    public String getNombre() {
        return this.ficha.getNombre();
    }

    @Override
    public String getColor() {
        return this.ficha.getColor();
    }

    @Override
    public String getTipo() {
        return this.tipo;
    }

    @Override
    public String getImagen() {
        return this.ficha.getImagen();
    }
}
