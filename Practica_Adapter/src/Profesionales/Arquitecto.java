/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Profesionales;

/**
 *
 * @author jorge malaver
 */
public class Arquitecto extends Target_Profesionales {  //Clase arquitecto que extiende de la clase abstracta Target_Profesionales
    
    //Sobreescritura metodo Leer_planos
    @Override
    public void Leer_planos(){
        System.out.println("Planos de todo tipo");
    }
    
    //Sobreescritura metodo contratos
    @Override
    public void contratos(){
        System.out.println("Contratos dibujantes");
    }
    
    //Sobreescritura metodo supervision
    @Override
    public void supervision(){
        System.out.println("Auditoria diseño ");
    }
}
