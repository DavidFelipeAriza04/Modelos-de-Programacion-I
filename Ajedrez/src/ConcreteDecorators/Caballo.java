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
public class Caballo extends TipoFicha {

    public Caballo(Ficha ficha) {
        super(ficha);
        this.tipo = "Caballo";
    }

    @Override
    public String getTipo() {
        return super.getTipo();
    }
}
