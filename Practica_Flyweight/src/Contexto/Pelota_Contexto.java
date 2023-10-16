/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contexto;

import FlyWeight.TipoPelota_FlyWeight;
import java.awt.Graphics;

/**
 *
 * @author david
 */
public class Pelota_Contexto {
    private int x;
    private int y;
    private TipoPelota_FlyWeight tipo;

    public Pelota_Contexto(int x, int y, TipoPelota_FlyWeight tipo) {
        this.x = x;
        this.y = y;
        this.tipo = tipo;
    }
    
    public void draw(Graphics g){
        tipo.draw(g, x, y);
    }
    
    
}
