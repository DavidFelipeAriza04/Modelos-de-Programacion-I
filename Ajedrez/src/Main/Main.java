/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Colores.Blanco;
import Colores.Negro;
import ConcreteCreator.ConcreteCreatorFichaBlanca;
import ConcreteCreator.ConcreteCreatorFichaNegra;
import ConcreteDecorators.Alfil;
import ConcreteDecorators.Caballo;
import ConcreteDecorators.Peon;
import ConcreteDecorators.Reina;
import ConcreteDecorators.Rey;
import ConcreteDecorators.Torre;
import Creator.FichaCreator;
import Implementation.Color;
import Product_Abstraccion.Ficha;
import java.util.ArrayList;

/**
 *
 * @author david
 */
public class Main {

    public static void main(String args[]) {
        FichaCreator CreatorFichasBlancas = new ConcreteCreatorFichaBlanca();
        FichaCreator CreatorFichasNegras = new ConcreteCreatorFichaNegra();

        ArrayList<Ficha> FichasBlancas = new ArrayList();
        ArrayList<Ficha> FichasNegras = new ArrayList();

        Color Blanco = new Blanco();
        Color Negro = new Negro();

        for (int i = 1; i < 9; i++) {
            Ficha FichaBlanca = CreatorFichasBlancas.CrearFicha(Blanco, "PeonBlanco" + i, 0, 0, "");
            Ficha FichaNegra = CreatorFichasNegras.CrearFicha(Negro, "PeonNegro" + i, 0, 0, "");
            FichasNegras.add(FichaNegra);
            FichasBlancas.add(FichaBlanca);
        }

        for (int i = 1; i < 3; i++) {
            Ficha FichaBlanca = CreatorFichasBlancas.CrearFicha(Blanco, "TorreBlanca" + i, 0, 0, "");
            Ficha FichaNegra = CreatorFichasNegras.CrearFicha(Negro, "TorreNegra" + i, 0, 0, "");
            FichasNegras.add(FichaNegra);
            FichasBlancas.add(FichaBlanca);
        }

        for (int i = 1; i < 3; i++) {
            Ficha FichaBlanca = CreatorFichasBlancas.CrearFicha(Blanco, "AlfilBlanco" + i, 0, 0, "");
            Ficha FichaNegra = CreatorFichasNegras.CrearFicha(Negro, "AlfilNegro" + i, 0, 0, "");
            FichasNegras.add(FichaNegra);
            FichasBlancas.add(FichaBlanca);
        }

        for (int i = 1; i < 3; i++) {
            Ficha FichaBlanca = CreatorFichasBlancas.CrearFicha(Blanco, "CaballoBlanco" + i, 0, 0, "");
            Ficha FichaNegra = CreatorFichasNegras.CrearFicha(Negro, "CaballoNegro" + i, 0, 0, "");
            FichasNegras.add(FichaNegra);
            FichasBlancas.add(FichaBlanca);
        }

        Ficha FichaBlanca = CreatorFichasBlancas.CrearFicha(Blanco, "ReinaBlanca", 0, 0, "");
        Ficha FichaNegra = CreatorFichasNegras.CrearFicha(Negro, "ReinaNegra", 0, 0, "");
        FichasNegras.add(FichaNegra);
        FichasBlancas.add(FichaBlanca);

        FichaBlanca = CreatorFichasBlancas.CrearFicha(Blanco, "ReyBlanco", 0, 0, "");
        FichaNegra = CreatorFichasNegras.CrearFicha(Negro, "ReyNegro", 0, 0, "");
        FichasNegras.add(FichaNegra);
        FichasBlancas.add(FichaBlanca);

        for (int i = 0; i < FichasBlancas.size(); i++) {
            if (i < 8) {
                Ficha PeonBlanco = new Peon(FichasBlancas.get(i));
                PeonBlanco.setTipo("Peon");
                FichasBlancas.set(i, PeonBlanco);
                Ficha PeonNegro = new Peon(FichasNegras.get(i));
                PeonNegro.setTipo("Peon");
                FichasNegras.set(i, PeonNegro);
            } else if (i < 10) {
                Ficha TorreBlanca = new Torre(FichasBlancas.get(i));
                TorreBlanca.setTipo("Torre");
                FichasBlancas.set(i, TorreBlanca);
                Ficha TorreNegro = new Torre(FichasNegras.get(i));
                TorreNegro.setTipo("Torre");
                FichasNegras.set(i, TorreNegro);
            } else if (i < 12) {
                Ficha AlfilBlanco = new Alfil(FichasBlancas.get(i));
                AlfilBlanco.setTipo("Alfil");
                FichasBlancas.set(i, AlfilBlanco);
                Ficha AlfilNegro = new Alfil(FichasNegras.get(i));
                AlfilNegro.setTipo("Alfil");
                FichasNegras.set(i, AlfilNegro);
            } else if (i < 14) {
                Ficha CaballoBlanco = new Caballo(FichasBlancas.get(i));
                CaballoBlanco.setTipo("Caballo");
                FichasBlancas.set(i, CaballoBlanco);
                Ficha CaballoNegro = new Caballo(FichasNegras.get(i));
                CaballoNegro.setTipo("Caballo");
                FichasNegras.set(i, CaballoNegro);
            } else if (i == 14) {
                Ficha ReinaBlanca = new Reina(FichasBlancas.get(i));
                ReinaBlanca.setTipo("Reina");
                FichasBlancas.set(i, ReinaBlanca);
                Ficha ReinaNegra = new Reina(FichasNegras.get(i));
                ReinaNegra.setTipo("Reina");
                FichasNegras.set(i, ReinaNegra);
            } else if (i == 15) {
                Ficha ReyBlanco = new Rey(FichasBlancas.get(i));
                ReyBlanco.setTipo("Rey");
                FichasBlancas.set(i, ReyBlanco);
                Ficha ReyNegro = new Rey(FichasNegras.get(i));
                ReyNegro.setTipo("Rey");
                FichasNegras.set(i, ReyNegro);
            }
        }

        System.out.println("\n\n*****************************");
        for (Ficha ficha : FichasBlancas) {
            System.out.println(ficha.getNombre());
            System.out.println(ficha.getColor());
            System.out.println(ficha.getTipo() + "\n");
        }
        
        System.out.println("\n\n*****************************");
        for (Ficha ficha : FichasNegras) {
            System.out.println(ficha.getNombre());
            System.out.println(ficha.getColor());
            System.out.println(ficha.getTipo() + "\n");
        }
    }
}
