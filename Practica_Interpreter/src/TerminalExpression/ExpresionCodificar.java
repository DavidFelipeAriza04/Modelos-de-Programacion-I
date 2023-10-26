/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TerminalExpression;

import Abstraccion.AbstractExpression;
import Contexto.Contexto;

/**
 *
 * @author david
 */
public class ExpresionCodificar extends AbstractExpression {

    @Override
    public String Interpretar(Contexto contexto) {
        // Metodo Codificar
        String textoCodificado = "";
        for (char letra : contexto.getExpresion().toCharArray()) {
            for (int i = 0; i < this.letras.length; i++) {
                if (letra == this.letras[i]) {
                    if (i + codigo >= this.letras.length) {
                        textoCodificado += Character.toString(letras[((i + codigo) - letras.length)]);
                    } else {
                        textoCodificado += Character.toString(letras[(i + codigo)]);
                    }

                }
            }
            if (letra == ' ') {
                textoCodificado += Character.toString(' ');
            }
        }
        return textoCodificado;
    }

    @Override
    public void setLetras(char[] letras) {
        this.letras = letras;
    }

    @Override
    public int getCodigo() {
        return super.getCodigo();
    }

    @Override
    public void setCodigo(int codigo) {
        super.setCodigo(codigo);
    }
}
