/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton_Context;

import ConcreteStates.StateBlanco;
import Product_Abstraccion.Ficha;
import State.AbstraccionState;
import java.util.ArrayList;

/**
 *
 * @author david
 */
public class Tablero {

    private AbstraccionState Turno;
    private static Tablero tablero;
    private ArrayList<Ficha> FichasBlancas;
    private ArrayList<Ficha> FichasNegras;

    public ArrayList<Ficha> getFichasBlancas() {
        return FichasBlancas;
    }

    public ArrayList<Ficha> getFichasNegras() {
        return FichasNegras;
    }

    private Tablero(ArrayList FichasBlancas, ArrayList FichasNegras, AbstraccionState Turno) {
        this.FichasBlancas = FichasBlancas;
        this.FichasNegras = FichasNegras;
        this.Turno = Turno;
    }

    public static Tablero getTablero(ArrayList FichasBlancas, ArrayList FichasNegras, AbstraccionState Turno) {
        if (tablero == null) {
            tablero = new Tablero(FichasBlancas, FichasNegras, Turno);
        }
        return tablero;
    }

    public void CambiarTurno(AbstraccionState Turno) {
        this.Turno = Turno;
    }

    public String getTurno() {
        return this.Turno.Turno();
    }
}
