/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Expresion;

/**
 *
 * @author oscar
 */
public class TerceroTerminalExpresion extends AbstractExpresion{
    
    AbstractExpresion exp;

    public TerceroTerminalExpresion(AbstractExpresion exp) {
        this.exp = exp;
    }
    
    @Override
    public int base(){
        return (int) Math.pow(2, 2);
    }
    
}
