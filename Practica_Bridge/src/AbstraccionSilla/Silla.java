/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstraccionSilla;

import InterfaceMaterial.Material;

/**
 *
 * @author david
 */
public abstract class Silla {   //CLASE ABSTRACTA SILLA
    
    //ATRIBUTOS
    protected int valor;
    protected Material material;
    
    //METODO ABSTRACTO MOSTRARSILLA
    public abstract void MostrarSilla();
}
