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
public class ExpresionDecodificar extends AbstractExpression {

    @Override
    public String Interpretar(Contexto contexto) {
        // Metodo Decodificar
        String textoDecodificado = "";
        for (char letra : contexto.getExpresion().toCharArray()) {
            for (int i = 0; i < letras.length; i++) {
                if (letra == letras[i]) {
                    if (i - codigo < 0) {
                        textoDecodificado += Character.toString(letras[((i - codigo) + letras.length)]);
                    } else {
                        textoDecodificado += Character.toString(letras[(i - codigo)]);
                    }
                }
            }
            if (letra == ' ') {
                textoDecodificado += " ";
            }
        }
        return textoDecodificado;
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
