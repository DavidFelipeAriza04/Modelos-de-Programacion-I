/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contexto;

import FlyWeight.TipoSilla_FlyWeight;
import java.awt.Graphics;

/**
 *
 * @author david
 */
public class Silla {
    private int x;
    private int y;
    private TipoSilla_FlyWeight tipo;

    public Silla(int x, int y, TipoSilla_FlyWeight tipo) {
        this.x = x;
        this.y = y;
        this.tipo = tipo;
    }
    
    public void draw(Graphics g){
        tipo.draw(g, x, y);
    }
    
    
}
