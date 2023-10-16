/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FlyWeight_Factory;

import Contexto.Pelota_Contexto;
import FlyWeight.TipoPelota_FlyWeight;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author david
 */
public class Fabrica_PelotaFlyWeight {//Fabrica para la creacion de el/los flyeweight
    
    static ArrayList<TipoPelota_FlyWeight> tipos_pelotas = new ArrayList();
    
    public static TipoPelota_FlyWeight getTipoPelota(String nombre,Color color, String descripcion){
        TipoPelota_FlyWeight tipo_pelota; 
        for (int i = 0; i < tipos_pelotas.size(); i++) {
            if(tipos_pelotas.get(i).getNombre().equals(nombre)){
                tipo_pelota = tipos_pelotas.get(i);
                return tipo_pelota;
            }
        }
        tipo_pelota = new TipoPelota_FlyWeight(nombre, color, descripcion);
        return tipo_pelota;
    }
}
