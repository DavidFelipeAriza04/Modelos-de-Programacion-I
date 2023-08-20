/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fabricas_Concretas;

import Fabrica.Fabrica_Triangulos;
import Producto.Producto_Triangulo;
import Productos_Concretos.Producto_Concreto_Escaleno;

/**
 *
 * @author david
 */
public class Fabrica_Concreta_Escaleno extends Fabrica_Triangulos{
    
    @Override
    public Producto_Triangulo Crear_Triangulo(){
        return new Producto_Concreto_Escaleno();
    }
    
}
