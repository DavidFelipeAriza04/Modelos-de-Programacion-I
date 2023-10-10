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
public class Peon extends TipoFicha {

    public Peon(Ficha ficha) {
        super(ficha);
        this.tipo = "Peon";
    }

    @Override
    public String getTipo() {
        return super.getTipo();
    }

}
