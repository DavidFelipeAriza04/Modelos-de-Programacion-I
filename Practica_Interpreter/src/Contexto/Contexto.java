/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contexto;

/**
 *
 * @author david
 */
public class Contexto {

    public String expresion;

    public Contexto(String expresion) {
        this.expresion = expresion;
        System.out.println("Se evaluara la expresion: " + this.expresion);
    }

    public String getExpresion() {
        return expresion;
    }

    public void setExpresion(String expresion) {
        this.expresion = expresion;
    }

}
