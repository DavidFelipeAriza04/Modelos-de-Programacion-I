/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConcreteIterableCollection;

import ConcreteIterator.IteradorPersonas;
import IterableCollection.AbsIterableCollection;
import Iterator.AbsIterator;
import Persona.Persona;
import java.util.ArrayList;

/**
 *
 * @author david
 */
public class ConcreteIterableCollectionPersonas extends AbsIterableCollection {

    public ConcreteIterableCollectionPersonas() {
        this.lista = new ArrayList();
    }

    @Override
    public ArrayList<Object> getLista() {
        return lista;
    }

    @Override
    public AbsIterator getIterador() {
        return new IteradorPersonas(this);
    }

    @Override
    public void Anadir(Object objeto) {
        this.lista.add((Persona) objeto);
    }

}
