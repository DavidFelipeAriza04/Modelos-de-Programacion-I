/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patron_interpreter;

import Contexto.Contexto;
import Expresion.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author oscar
 */
public class Patron_interpreter_binario2decimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String numero = "111";
        System.out.println("Se convertira el número " + numero);
        StringBuilder stringBuilder = new StringBuilder(numero);
        String reverseNumero = stringBuilder.reverse().toString();
        Contexto contexto = new Contexto(reverseNumero);

        ArrayList<AbstractExpresion> arbolEx = new ArrayList<AbstractExpresion>();
        AbstractExpresion primero = new TerminalExpresion();
        arbolEx.add(primero);
        arbolEx.add(new SegundoTerminalExpresion(primero));
        arbolEx.add(new TerceroTerminalExpresion(primero));

        Iterator<AbstractExpresion> it = arbolEx.iterator();
        while (it.hasNext()) {
            AbstractExpresion exp = it.next();
            exp.interpret(contexto);
        }

        System.out.println("en decimal es: " + contexto.getValor());
    }

}
