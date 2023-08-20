/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica_Factory_Method;

import Fabrica.Fabrica_Triangulos;
import Fabricas_Concretas.Fabrica_Concreta_Equilatero;
import Fabricas_Concretas.Fabrica_Concreta_Escaleno;
import Fabricas_Concretas.Fabrica_Concreta_Isosceles;
import Producto.Producto_Triangulo;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int op;
        do {
            op = Menu();
            switch (op) {
                case 1 -> {
                    System.out.println("\nIngrese el valor de los lados: ");
                    System.out.print("Lado 1: ");
                    double lado1 = sc.nextDouble();
                    System.out.print("Lado 2: ");
                    double lado2 = sc.nextDouble();
                    System.out.print("Lado 3: ");
                    double Lado3 = sc.nextDouble();
                    int Tipo = Tipo_Triangulo(lado1, lado2, Lado3);

                    switch (Tipo) {
                        case 1 -> {
                            Crear_Triangulo(new Fabrica_Concreta_Equilatero());
                        }
                        case 2 -> {
                            Crear_Triangulo(new Fabrica_Concreta_Isosceles());
                        }
                        case 3 -> {
                            Crear_Triangulo(new Fabrica_Concreta_Escaleno());
                        }
                    }
                }
            }

        } while (op != 2);

    }

    public static int Tipo_Triangulo(double Lado1, double Lado2, double Lado3) {
        if ((Lado1 == Lado2) || (Lado1 == Lado3) || (Lado2 == Lado3)) {
            if ((Lado1 == Lado2) && (Lado2 == Lado3)) {
                return 1;
            } else {
                return 2;
            }
        } else {
            return 3;
        }
    }

    public static void Crear_Triangulo(Fabrica_Triangulos Fabrica) {
        Producto_Triangulo Triangulo = Fabrica.Crear_Triangulo();
        Triangulo.Mostrar_Triangulo();
    }

    public static int Menu() {
        System.out.println("""
                         1. Ingresar triangulo
                         2. Salir""");
        int op = sc.nextInt();
        return op;
    }
}
