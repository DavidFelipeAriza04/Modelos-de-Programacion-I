/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConcreteIterator;

import IterableCollection.AbsIterableCollection;
import Iterator.AbsIterator;
import Persona.Persona;

/**
 *
 * @author david
 */
public class IteradorPersonas extends AbsIterator {

    private int posActual = 0;

    public IteradorPersonas(AbsIterableCollection coleccion) {
        super(coleccion);
    }

    @Override
    public Persona primeraPos() {
        this.posActual = 0;
        return (Persona) this.coleccion.getLista().get(0);
    }

    @Override
    public boolean hasNext() {
        if (this.posActual < this.coleccion.getLista().size()) {
            return true;
        }
        return false;
    }

    @Override
    public Persona siguiente() {
        if (this.hasNext()) {
            Persona p;
            this.posActual++;
            if (this.posActual < contar()) {
                p = (Persona) this.coleccion.getLista().get(posActual);
            } else {
                this.posActual--;
                p = null;
            }
            return p;
        }
        return null;
    }

    @Override
    public Object anterior() {
        if (posActual == 0) {
            return null;
        } else {
            Persona p;
            this.posActual--;
            p = (Persona) this.coleccion.getLista().get(posActual);
            return p;
        }
    }

    @Override
    public int contar() {
        return this.coleccion.lista.size();
    }
}
