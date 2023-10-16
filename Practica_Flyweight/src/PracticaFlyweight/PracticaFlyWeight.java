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
    static int cant_pelotas = 1000000;
    static int tipos_pelotas = 3;

    public static void main(String args[]) {
        MostrarPelotas vista = new MostrarPelotas();
        for (int i = 0; i < Math.floor(cant_pelotas / tipos_pelotas); i++) {
            vista.mostrarPelota((int) (Math.random() * tam_canvas[0]), (int) (Math.random() * tam_canvas[1]), "Pelota amarilla", Color.YELLOW, "Es una pelota amarilla");
            vista.mostrarPelota((int) (Math.random() * tam_canvas[0]), (int) (Math.random() * tam_canvas[1]), "Pelota gris", Color.gray, "Es una pelota amarilla");
            vista.mostrarPelota((int) (Math.random() * tam_canvas[0]), (int) (Math.random() * tam_canvas[1]), "Pelota magenta", Color.magenta, "Es una pelota amarilla");
        }
        vista.setSize(tam_canvas[0], tam_canvas[1]);
        vista.setVisible(true);

        System.out.println(cant_pelotas + " Pelotas dibujadas");
        System.out.println("---------------------");
        System.out.println("Uso de memoria:");
        System.out.println("Tamano pelota (15 bytes) * " + cant_pelotas);
        System.out.println("+ Tamano tipo de pelota (~50 bytes) * " + tipos_pelotas + "");
        System.out.println("---------------------");
        System.out.println("Total: " + (((cant_pelotas * 15) + (tipos_pelotas * 50)) / 1024 / 1024)
                + "MB (En vez de " + ((cant_pelotas * 65) / 1024 / 1024) + "MB)");
    }

}
