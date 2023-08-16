/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import abstract_classes.Animal;
import clases.Aguila;
import clases.Ballena;
import clases.Perro;

/**
 *
 * @author david
 */
public class Practica_Abierto_Cerrado {

    public static void main(String[] args) {
        Animal ballena = new Ballena();
        Animal perro = new Perro();
        Animal aguila = new Aguila();
        System.out.print("Perro: ");
        perro.Moverse();
        System.out.print("Ballena: ");
        ballena.Moverse();
        System.out.print("Aguila: ");
        aguila.Moverse();
    }
}
