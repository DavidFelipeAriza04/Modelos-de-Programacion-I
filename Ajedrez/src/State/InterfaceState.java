/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package State;

import Singleton_Context.Tablero;

/**
 *
 * @author david
 */
public abstract class InterfaceState {
    protected Tablero tablero;
    protected String Turno;

    public abstract String Turno();
}
