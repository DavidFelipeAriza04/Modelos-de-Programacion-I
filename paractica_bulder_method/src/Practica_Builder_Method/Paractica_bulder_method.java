/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Practica_Builder_Method;

import Builder.PcBuilder;
import Concrete_Builder.PcHome;
import Concrete_Builder.PcOficina;
import Products.Pc;
import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class Paractica_bulder_method {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        PcDirector director = new PcDirector();
        int op;
        do {
            op = Menu();
            switch (op) {
                case 1:
                    PcBuilder builder = new PcHome();
                    builder.construirPc();
                    director.setPcBuilder(builder);
                    System.out.print("\nIngrese la marca: ");
                    String marca = sc.next();
                    System.out.print("Ingrese el procesador: ");
                    String procesador = sc.next();
                    System.out.print("Ingrese la GPU: ");
                    String GPU = sc.next();
                    System.out.print("Ingrese la RAM: ");
                    int cantidadRAM = sc.nextInt();
                    director.fabricaPc(procesador, marca, GPU, cantidadRAM);
                    Pc home = director.getPc();
                    System.out.println("\nSe creo un pc de hogar con las siguientes especificaciones\n"
                            + "Marca: " + home.getMarca()
                            + "\nProcesador: " + home.getProcesador()
                            + "\nGPU: " + home.getGPU()
                            + "\nRAM: " + home.getRAM() + "GB\n");
                    break;
                case 2:
                    builder = new PcOficina();
                    builder.construirPc();
                    director.setPcBuilder(builder);
                    System.out.print("\nIngrese la marca: ");
                    marca = sc.next();
                    System.out.print("Ingrese el procesador: ");
                    procesador = sc.next();
                    System.out.print("Ingrese la GPU: ");
                    GPU = sc.next();
                    System.out.print("Ingrese la RAM: ");
                    cantidadRAM = sc.nextInt();
                    director.fabricaPc(procesador, marca, GPU, cantidadRAM);
                    Pc oficina = director.getPc();
                    System.out.println("\nSe creo un pc de oficina con las siguientes especificaciones\n"
                            + "Marca: " + oficina.getMarca()
                            + "\nProcesador: " + oficina.getProcesador()
                            + "\nGPU: " + oficina.getGPU()
                            + "\nRAM: " + oficina.getRAM() + "GB\n");
                    break;
                case 3:
                    builder = new PcHome();
                    builder.construirPc();
                    director.setPcBuilder(builder);
                    System.out.print("\nIngrese la marca: ");
                    marca = sc.next();
                    System.out.print("Ingrese el procesador: ");
                    procesador = sc.next();
                    System.out.print("Ingrese la GPU: ");
                    GPU = sc.next();
                    System.out.print("Ingrese la RAM: ");
                    cantidadRAM = sc.nextInt();
                    director.fabricaPc(procesador, marca, GPU, cantidadRAM);
                    Pc gamer = director.getPc();
                    System.out.println("\nSe creo un pc gamer con las siguientes especificaciones\n"
                            + "Marca: " + gamer.getMarca()
                            + "\nProcesador: " + gamer.getProcesador()
                            + "\nGPU: " + gamer.getGPU()
                            + "\nRAM: " + gamer.getRAM() + "GB\n");
                    break;    
                case 4:
                    System.out.println("Adios");
                    System.exit(0);
                default:
                    System.out.println("Adios");
            }
        } while (op != 4);

    }

    public static int Menu() {
        int op;
        System.out.println("1. Pc home\n"
                + "2. Pc oficina\n"
                + "2. Pc gamer\n"
                + "4. Salir");
        op = sc.nextInt();
        return op;
    }
}
