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
public class TercerPeriodo implements ServicioNotas {
 
        @Override
    public void NotaQuiz(float nota){
       System.out.println("La nota del quiz del tercer periodo es: "+nota);
    }
    @Override
    public void NotaTrabajo(float nota){
       System.out.println("La nota del trabajo del tercer periodo es: "+nota);
    }
    
    @Override
    public void NotaParcial(float nota){
       System.out.println("La nota del proyecto del tercer periodo es: "+nota);
    }
}
