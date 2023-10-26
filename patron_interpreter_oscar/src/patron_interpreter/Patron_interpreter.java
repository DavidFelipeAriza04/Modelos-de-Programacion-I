/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patron_interpreter;

import Contexto.Contexto;
import Expresion.*;
import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author oscar
 */
public class Patron_interpreter implements ActionListener {

    private Vista vista;

    public Patron_interpreter() {
        vista = new Vista();
        this.vista.jButtonConfirmar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.vista.jButtonConfirmar) {
            String numero = this.vista.jTextFieldBin.getText();
            System.out.println("Se convertira el número " + numero);
            StringBuilder stringBuilder = new StringBuilder(numero);
            String reverseNumero = stringBuilder.reverse().toString();
            Contexto contexto = new Contexto(reverseNumero);

            ArrayList<AbstractExpresion> arbolEx = new ArrayList();
            arbolEx.add(new TerminalExpresion());
            arbolEx.add(new SegundoTerminalExpresion());
            arbolEx.add(new TerceroTerminalExpresion());
            arbolEx.add(new CuartoTerminalExpression());

            Iterator<AbstractExpresion> it = arbolEx.iterator();
            while (it.hasNext()) {
                AbstractExpresion exp = it.next();
                exp.interpret(contexto);
            }

            System.out.println("en decimal es: " + contexto.getValor());
            this.vista.jTextFieldDec.setText(String.valueOf(contexto.getValor()));
        }
    }

}
