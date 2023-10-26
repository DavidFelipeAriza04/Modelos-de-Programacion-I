/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraccion;

import Contexto.Contexto;

/**
 *
 * @author david
 */
public abstract class AbstractExpression {

    protected String palabra;
    protected char letras[];
    protected int codigo;

    public abstract String Interpretar(Contexto contexto);

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public abstract void setLetras(char[] letras);
}
