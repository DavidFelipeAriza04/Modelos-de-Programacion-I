/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_bridge;

import AbstraccionSilla.Silla;
import InterfaceMaterial.Material;
import Materiales.Madera;
import Materiales.Metal;
import Materiales.Piedra;
import Sillas.SillaAntigua;
import Sillas.SillaClasica;
import Sillas.SillaModerna;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practica_Bridge {

    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int op;
        int op_material;

        //REFERENCIA INTERFACE MATERIAL
        Material material = null;

        //REFERENCIA CLASE ABSTRACTA SILLA
        Silla silla = null;
        do {
            op = MenuSilla();   //ELECCION DE LA SILLA
            if (op == 4) {
                System.out.print("Gracias\n");
                System.exit(0);
            }
            op_material = MenuMaterial();   //ELECCION DEL MATERIAL
            switch (op_material) {
                case 1 ->
                    material = new Madera();
                case 2 ->
                    material = new Piedra();
                case 3 ->
                    material = new Metal();
            }
            
            switch(op){
                case 1 ->
                    silla = new SillaAntigua(material);
                case 2 ->
                    silla = new SillaClasica(material);
                case 3 ->
                    silla = new SillaModerna(material);
            }
            
            silla.MostrarSilla();
        } while (op != 4);
    }

    public static int MenuSilla() throws IOException {
        System.out.println("1. Silla Antigua"
                + "\n2. Silla Clasica"
                + "\n3. Silla Moderna"
                + "\n4. Salir\n");
        return Integer.parseInt(in.readLine());
    }

    public static int MenuMaterial() throws IOException {
        System.out.println("1. Madera"
                + "\n2. Piedra"
                + "\n3. Metal");
        return Integer.parseInt(in.readLine());
    }

}
