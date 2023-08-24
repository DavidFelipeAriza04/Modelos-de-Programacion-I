/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica_Builder;

import Concrete_Builders.Concrete_Builder_Gamer;
import Director.Director;
import Products.Product_Pc_Gamer;
import Products.Product_Pc_Hogar;
import Products.Product_Pc_Oficina;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class Practica_Builder_Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int op;
        Director director = new Director();
        Concrete_Builder_Gamer builder = new Concrete_Builder_Gamer();
        do {
            System.out.println("Desea un:\n"
                    + "PC Gamer 1\n"
                    + "PC Hogar 2\n"
                    + "PC Oficina 3\n"
                    + "Salir 4");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    director.crearPcGamer(builder);
                    Product_Pc_Gamer pc_Gamer = builder.getProduct();

                    pc_Gamer.pc_Gamer();
                    break;

                case 2:
                    director.crearPcHogar(builder);
                    Product_Pc_Hogar pc_Hogar = new Product_Pc_Hogar();

                    pc_Hogar.pc_Hogar();
                    break;

                case 3:
                    director.crearPcOficina(builder);
                    Product_Pc_Oficina pc_Oficina = new Product_Pc_Oficina();

                    pc_Oficina.pc_Oficina();
                    break;
                case 4:
                    System.out.println("Cerrando programa");
                    System.exit(0);
                    
                default:
                    System.out.print("Opcion non valida");
                    break;
            }
        } while (op != 4);
        
    }
}
