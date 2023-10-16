/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creator;

import Implementation.Color;
import Product_Abstraccion.Ficha;

/**
 *
 * @author david
 */
public abstract class FichaCreator {

    public abstract Ficha CrearFicha(Color color, String Nombre, int row, int col, String imagen);
}
