/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductosConcretos;


import Fabrica_abstracta.*;
public class PrimerPerido implements ServicioNotas{
    
    @Override
    public void NotaQuiz(){
       System.out.println("La nota del quiz primer periodo Es valida");
    }
    @Override
    public void NotaTrabajo(){
        System.out.println("La nota del trabajo primer period  Es valida");
    }
    
    @Override
    public void NotaParcial(){
        System.out.println("La nota del parcial primer periodo Es valida");
    }
}
