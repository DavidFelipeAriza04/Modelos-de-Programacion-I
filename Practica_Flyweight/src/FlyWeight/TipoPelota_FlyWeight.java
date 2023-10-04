/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FlyWeight;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author david
 */
public class TipoPelota_FlyWeight {//Contiene el estado compartido por varias pelotas

    private String nombre;
    private Color color;
    private String descripcion;

    public String getNombre() {
        return nombre;
    }

    public TipoPelota_FlyWeight(String nombre, Color color, String descripcion) {
        this.nombre = nombre;
        this.color = color;
        this.descripcion = descripcion;
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(color);
//        g.fillRect(x, y, 10, 20);
//        g.fillRect(x, y - 25, 10, 25);
//        g.fillRect(x, y, 25, 5);
//        g.fillRect(x+25, y, 10, 20);
//        g.setColor(color);
//        g.fillRect(x+10, y-3, 25, 5);
        g.fillOval(x, y, 15, 15);
    }
}
