/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConcreteCreator;

import ConcreteProduct.FichaBlanca;
import Creator.FichaCreator;
import Implementation.Color;
import Product_Abstraccion.Ficha;

/**
 *
 * @author david
 */
public class ConcreteCreatorFichaBlanca extends FichaCreator {

    @Override
    public Ficha CrearFicha(Color color, String nombre, int row, int col, String imagen) {
        return new FichaBlanca(color, nombre, row, col, imagen);
    }

}
