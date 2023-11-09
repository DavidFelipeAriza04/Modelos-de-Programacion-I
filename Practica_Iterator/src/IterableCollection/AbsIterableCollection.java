/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package IterableCollection;

import Iterator.AbsIterator;
import java.util.ArrayList;

/**
 *
 * @author david
 */
public abstract class AbsIterableCollection {

    public abstract AbsIterator getIterador();
    public ArrayList<Object> lista;

    public abstract ArrayList<Object> getLista();

    public abstract void Anadir(Object objeto);
}
