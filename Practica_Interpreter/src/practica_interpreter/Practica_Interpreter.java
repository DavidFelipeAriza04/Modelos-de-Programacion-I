/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_interpreter;

import Abstraccion.AbstractExpression;
import Contexto.Contexto;
import TerminalExpression.ExpresionCodificar;
import TerminalExpression.ExpresionDecodificar;
import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author david
 */
public class Practica_Interpreter implements ActionListener {

    private Vista vista;
    private char letras[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'O', 'P', 'Q', 'R',
        'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r',
        's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private Contexto contexto;
    private AbstractExpression codificar;
    private AbstractExpression decodificar;

    public Practica_Interpreter() {
        this.vista = new Vista();
        this.vista.jButtonConfirmar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.vista.jButtonConfirmar) {
            this.contexto = new Contexto(this.vista.jTextAreaExpresion.getText());
            while (!contexto.getExpresion().matches("[A-Za-z ]+")) {
                this.vista.Mensaje("\nLo que ingresó no es una palabra, ingrese una palabra: ");
                contexto.setExpresion(this.vista.jTextAreaExpresion.getText());
            }
            if (this.vista.jRadioButtonCodificar.isSelected()) {
                // Codificar
                codificar = new ExpresionCodificar();
                codificar.setLetras(this.letras);
                codificar.setCodigo((Integer) this.vista.jSpinnerCodigo.getValue());
                this.vista.jTextAreaResultado.setText(codificar.Interpretar(contexto));
            } else if (this.vista.jRadioButtonDecodificar.isSelected()) {
                // Decodificar
                decodificar = new ExpresionDecodificar();
                decodificar.setLetras(this.letras);
                decodificar.setCodigo((Integer) this.vista.jSpinnerCodigo.getValue());
                decodificar.Interpretar(contexto);
                this.vista.jTextAreaResultado.setText(decodificar.Interpretar(contexto));
            }
        }
    }
}
