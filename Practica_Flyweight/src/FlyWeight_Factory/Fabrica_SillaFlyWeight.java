/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FlyWeight_Factory;

import Contexto.Silla;
import FlyWeight.TipoSilla_FlyWeight;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author david
 */
public class Fabrica_SillaFlyWeight {//Fabrica para la creacion de el/los flyeweight
    
    static ArrayList<TipoSilla_FlyWeight> tipos_sillas = new ArrayList();
    
    public static TipoSilla_FlyWeight getTipoSilla(String nombre,Color color, String descripcion){
        TipoSilla_FlyWeight tipo_silla; 
        for (int i = 0; i < tipos_sillas.size(); i++) {
            if(tipos_sillas.get(i).getNombre().equals(nombre)){
                tipo_silla = tipos_sillas.get(i);
                return tipo_silla;
            }
        }
        tipo_silla = new TipoSilla_FlyWeight(nombre, color, descripcion);
        return tipo_silla;
    }
}
