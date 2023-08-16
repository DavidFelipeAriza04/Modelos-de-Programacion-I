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
       float nota1=0;
       float nota2=0;
       float nota3=0;
        do{
            op=menu();//pegunta por el periodo elegido
            switch(op){
                case 1:
                    System.out.println("Ingrese la nota del quiz: ");
                    nota1 = Float.parseFloat(sc.nextLine());
                    System.out.println("Ingrese la nota del trabajo: ");
                    nota2 = Float.parseFloat(sc.nextLine());
                    System.out.println("Ingrese la nota del parcial: ");
                    nota3 = Float.parseFloat(sc.nextLine());
                    Periodo(new primerConcreto(),nota1,nota2,nota3);//llamado al metodo periodo
                    break; //se le pasa una factoria concreta
                case 2:
                    System.out.println("Ingrese la nota del quiz: ");
                    nota1 = Float.parseFloat(sc.nextLine());
                    System.out.println("Ingrese la nota del trabajo: ");
                    nota2 = Float.parseFloat(sc.nextLine());
                    System.out.println("Ingrese la nota del parcial: ");
                    nota3 = Float.parseFloat(sc.nextLine());
                    Periodo(new SegundoConcreto(),nota1,nota2,nota3);
                    break;
                case 3:
                    System.out.println("Ingrese la nota del quiz: ");
                    nota1 = Float.parseFloat(sc.nextLine());
                    System.out.println("Ingrese la nota del trabajo: ");
                    nota2 = Float.parseFloat(sc.nextLine());
                    System.out.println("Ingrese la nota del parcial: ");
                    nota3 = Float.parseFloat(sc.nextLine());
                    Periodo(new TercerConcreto(),nota1,nota2,nota3);
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
    
    public static void Periodo(ServicioFactory Notas, float nota1, float nota2, float nota3){
        ServicioNotas  servicio = Notas.crearNota();//Notas que es una referencia a la intefaz
        servicio.NotaQuiz(nota1);
        servicio.NotaTrabajo(nota2);
        servicio.NotaParcial(nota3);   //ejecuta la fabrica de producto concreto seleccionada1
        
    }//fin metodov Periodo
    
    public static int  menu(){
        System.out.println(
                "MENU DE OPCIONES\n"
                + "1.   Solicitar Notas Primer Periodo. \n"
                + "2.   Solicitar Notas Segundo Periodo. \n"
                + "3.   Solicitar Notas tercer periodo. \n"
                + "4.   Cerrar programa. \n\n"
                + "Seleccion opcion..."
        );
        return Integer.parseInt(sc.nextLine());
    }
}//cierra menu
