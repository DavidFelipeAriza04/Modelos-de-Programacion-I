/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductosConcretos;

/**
 *
 * @author jorge malaver
 */
import Fabrica_abstracta.*;
public class SegundoPeriodo implements ServicioNotas{
   
       @Override
    public void NotaQuiz(){
       System.out.println("La nota del segundo periodo del quiz Es valida");
    }
    @Override
    public void NotaTrabajo(){
        System.out.println("La nota del  del segundo periodo Es valida");
    }
    
    @Override
    public void NotaParcial(){
        System.out.println("La nota del proyecto Es valida");
    }
}
