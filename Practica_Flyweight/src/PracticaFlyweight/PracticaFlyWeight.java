/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaFlyweight;

import java.awt.Color;

/**
 *
 * @author david
 */
public class PracticaFlyWeight {

    static int tam_canvas[] = {500, 600};
    static int cant_sillas = 1000000;
    static int tipos_sillas = 3;

    public static void main(String args[]) {
        MostrarSillas vista = new MostrarSillas();
        for (int i = 0; i < Math.floor(cant_sillas / tipos_sillas); i++) {
            vista.mostrarSilla((int) (Math.random() * tam_canvas[0]), (int) (Math.random() * tam_canvas[1]), "Silla de Madera", Color.YELLOW, "Es una silla de Madera");
            vista.mostrarSilla((int) (Math.random() * tam_canvas[0]), (int) (Math.random() * tam_canvas[1]), "Silla de Piedra", Color.gray, "Es una silla de Piedra");
            vista.mostrarSilla((int) (Math.random() * tam_canvas[0]), (int) (Math.random() * tam_canvas[1]), "Silla de Metal", Color.magenta, "Es una silla de Piedra");
        }
        vista.setSize(tam_canvas[0], tam_canvas[1]);
        vista.setVisible(true);

        System.out.println(cant_sillas + " Sillas dibujadas");
        System.out.println("---------------------");
        System.out.println("Uso de memoria:");
        System.out.println("Tamano silla (15 bytes) * " + cant_sillas);
        System.out.println("+ Tamano tipo de silla (~50 bytes) * " + tipos_sillas + "");
        System.out.println("---------------------");
        System.out.println("Total: " + (((cant_sillas * 15) + (tipos_sillas * 50)) / 1024 / 1024)
                + "MB (En vez de " + ((cant_sillas * 65) / 1024 / 1024) + "MB)");
    }

}
