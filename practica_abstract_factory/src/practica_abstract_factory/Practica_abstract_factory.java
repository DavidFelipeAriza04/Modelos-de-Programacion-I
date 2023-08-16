/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_abstract_factory;

import Fabrica_abstracta.*;
import FabricaConcreta.*;
import ProductosConcretos.*;
import java.util.Scanner;
public class Practica_abstract_factory {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       int op;
        do{
            op=menu();//pegunta por el periodo elegido
            switch(op){
                case 1:
                    Periodo(new primerConcreto());//llamado al metodo periodo
                    break; //se le pasa una factoria concreta
                case 2:
                    Periodo(new SegundoConcreto());
                    break;
                case 3:
                    Periodo(new TercerConcreto());
                    break;
                case 4:
                    System.out.println("Cerrando Programa");
                    System.exit(0);
                 default :
                    System.out.println(".....Opcion invalida....");
            }//cierra switchn\n
            //System.out.println("\n\n");
        }while(op!=4);
     
       
       
     }
    
    public static void Periodo(ServicioFactory Notas){
        ServicioNotas  servicio= Notas.crearNota();//Notas que es una referencia a la intefaz
        servicio.NotaParcial();   //ejecuta la fabrica de producto concreto seleccionada1
        servicio.NotaQuiz();
        servicio.NotaTrabajo();
        
    }//fin metodov Periodo
    
    public static int  menu(){
        System.out.println(
                "MENU DE OPCIONES\n"
                + "1.   Solicitar Notas Primer Perido. \n"
                + "2.   Solicitar Notas Segundo Perido. \n"
                + "3.   Solicitar Notas tercer periodo. \n"
                + "4.   Cerrar programa. \n\n"
                + "Seleccion opcion..."
        );
        return Integer.parseInt(sc.nextLine());
    }
}//cierra menu
