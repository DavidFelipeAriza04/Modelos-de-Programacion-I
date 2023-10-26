/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Expresion;

import Contexto.Contexto;

/**
 *
 * @author oscar
 */
public abstract class AbstractExpresion {

    public String uno(){
        return "1";
    }

    public String cero(){
        return "0";
    }

    public abstract int base();

    public void interpret(Contexto contexto) {
        if (contexto.getExpresion().startsWith(cero())) {
            contexto.setValor(contexto.getValor() + (int) 0 * base());
            contexto.setExpresion(contexto.getExpresion().substring(1));
        }
        else if (contexto.getExpresion().startsWith(uno())) {
            contexto.setValor(contexto.getValor() + (int) 1 * base());
            contexto.setExpresion(contexto.getExpresion().substring(1));
        }
    }

}
