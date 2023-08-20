/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Productos_Concretos;

import Producto.Producto_Triangulo;

/**
 *
 * @author david
 */
public class Producto_Concreto_Equilatero implements Producto_Triangulo{
    
    @Override
    public void Mostrar_Triangulo(){
        System.out.println("\nEl triangulo es un triangulo equilatero\n");
    }
}
