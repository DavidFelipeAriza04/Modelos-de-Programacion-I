/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sillas;

import AbstraccionSilla.Silla;
import InterfaceMaterial.Material;

/**
 *
 * @author david
 */
public class SillaModerna extends Silla {

    //CONSTRUCTOR
    public SillaModerna(Material material) {
        this.material = material;
        switch (this.material.getNombre()) {
            case "Madera" ->
                this.valor = 30000;
            case "Piedra" ->
                this.valor = 40000;
            case "Metal" ->
                this.valor = 50000;
        }
    }

    //SOBREESCIRUTA METODO MOSTRAR SILLA
    @Override
    public void MostrarSilla() {
        System.out.println("\nEsta es una silla Moderna");
        this.material.MostrarMaterial();
        System.out.println("Valor: " + this.valor + "\n");
    }
}
