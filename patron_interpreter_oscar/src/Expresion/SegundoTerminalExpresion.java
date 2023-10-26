/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Expresion;

import Contexto.Contexto;
import jdk.jfr.Experimental;

/**
 *
 * @author oscar
 */
public class SegundoTerminalExpresion extends AbstractExpresion {
    
    AbstractExpresion exp;

    public SegundoTerminalExpresion(AbstractExpresion exp) {
        this.exp = exp;
    }
    
    
    
    @Override
    public int base(){
        return (int) Math.pow(2, 1);
    }   
    
}
