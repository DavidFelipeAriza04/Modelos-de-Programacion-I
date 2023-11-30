/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConcreteStates;

import State.AbstraccionState;

/**
 *
 * @author david
 */
public class StateNegro extends AbstraccionState {

    @Override
    public String Turno() {
        this.Turno = "Negro";
        return this.Turno;
    }

}
