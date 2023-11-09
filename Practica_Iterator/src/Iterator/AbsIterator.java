/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Iterator;

import IterableCollection.AbsIterableCollection;

/**
 *
 * @author david
 */
public abstract class AbsIterator {

    protected AbsIterableCollection coleccion;

    public AbsIterator(AbsIterableCollection coleccion) {
        this.coleccion = coleccion;
    }

    public abstract Object primeraPos();

    public abstract boolean hasNext();

    public abstract Object siguiente();

    public abstract Object anterior();
    
    public abstract int contar();
}
