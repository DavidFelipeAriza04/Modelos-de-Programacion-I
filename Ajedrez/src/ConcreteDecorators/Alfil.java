/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConcreteDecorators;

import BaseDecorator.TipoFicha;
import Product_Abstraccion.Ficha;

/**
 *
 * @author david
 */
public class Alfil extends TipoFicha {

    public Alfil(Ficha ficha) {
        super(ficha);
    }

    @Override
    public void setTipo(String tipo) {
        super.setTipo(tipo);
    }

    @Override
    public String getTipo() {
        return super.getTipo();
    }
}
