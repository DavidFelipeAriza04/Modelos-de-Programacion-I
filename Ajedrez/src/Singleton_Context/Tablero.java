/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton_Context;

import ConcreteStates.StateBlanco;
import Product_Abstraccion.Ficha;
import State.InterfaceState;
import java.util.ArrayList;

/**
 *
 * @author david
 */
public class Tablero {

    private InterfaceState Turno;
    private static Tablero tablero;
    private ArrayList<Ficha> FichasBlancas;
    private ArrayList<Ficha> FichasNegras;

    public ArrayList<Ficha> getFichasBlancas() {
        return FichasBlancas;
    }

    public ArrayList<Ficha> getFichasNegras() {
        return FichasNegras;
    }

    private Tablero(ArrayList FichasBlancas, ArrayList FichasNegras) {
        this.FichasBlancas = FichasBlancas;
        this.FichasNegras = FichasNegras;
        this.Turno = new StateBlanco();
    }

    public static Tablero getTablero(ArrayList FichasBlancas, ArrayList FichasNegras) {
        if (tablero == null) {
            tablero = new Tablero(FichasBlancas, FichasNegras);
        }
        return tablero;
    }

    public void CambiarTurno(InterfaceState Turno) {
        this.Turno = Turno;
    }

    public String getTurno() {
        return this.Turno.Turno();
    }
}
