/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrica_abstracta;

// factoria Abstracta, contiene el metodo de instanciacion

import Producto_Abstracto.ServicioNotas;

public interface ServicioFactory {// Fabrica abstracta
    public ServicioNotas crearNota();//crearNota es el metodo de instanciacion
    //devuelve el metodo ServicioNotas, crea el producto abstracto
}
