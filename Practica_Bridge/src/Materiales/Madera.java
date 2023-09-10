/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Materiales;

import InterfaceMaterial.Material;

/**
 *
 * @author david
 */
public class Madera implements Material{
    
    //ATRIBUTOS
    private String nombre = "Madera";

    
    //SOBREESCRITURA METODO GET NOMBRE
    @Override
    public String getNombre() {
        return nombre;
    }
    
    //SOBREESCRITURA METODO MOSTRAR MATERIAL
    @Override
    public void MostrarMaterial() {
        System.out.println("Material: "+this.nombre);
    }
    
}
