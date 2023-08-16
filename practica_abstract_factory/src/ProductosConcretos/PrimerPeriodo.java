/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductosConcretos;


import Producto_Abstracto.ServicioNotas;
public class PrimerPeriodo implements ServicioNotas{ //Producto concreto
    
    
    //Metodos del producto  concreto
    @Override
    public void NotaQuiz(float nota){
       System.out.println("La nota del quiz del primer periodo es: "+nota);
    }
    @Override
    public void NotaTrabajo(float nota){
        System.out.println("La nota del trabajo del primer periodo  es: "+nota);
    }
    
    @Override
    public void NotaParcial(float nota){
        System.out.println("La nota del parcial del primer periodo es: "+nota);
    }
}
