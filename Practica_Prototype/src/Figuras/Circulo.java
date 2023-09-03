/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

import Interface.Figuras_geometricas;

/**
 *
 * @author David Ariza
 */
public class Circulo implements Figuras_geometricas{
    private String color;
    private String nombre;
    private int radio;

    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public void setNombre(String n) {
        this.nombre=n;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void tamaño(int x, int y) {
       this.radio = x;
    }

    @Override
    public void getposicion() {
        System.out.println("Radio: "+this.radio);
    }

    @Override
    public Figuras_geometricas clonar() {
        Figuras_geometricas circulo_clonado = new Circulo();
        circulo_clonado.setNombre(this.nombre);
        circulo_clonado.tamaño(this.radio,0);
        return circulo_clonado;
    }

    @Override
    public void color(String n) {
        this.color = n;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public double getArea() {
        return Math.pow(this.radio,2) * Math.PI;
    }
    
}
