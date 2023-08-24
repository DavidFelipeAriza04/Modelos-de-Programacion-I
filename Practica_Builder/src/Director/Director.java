/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Director;

import Builder.Builder;

/**
 *
 * @author david
 */
public class Director {
    public void crearPcGamer(Builder builder){
        builder.setDiscoDuro("Samsung", 256);
        builder.setMarca("No tiene marca");
        builder.setModelo("No hay modelo");
        builder.setNucleos(10);
        builder.setProcesador("AMD Ryzen 7 5700g");
        builder.setRAM(16);
        builder.setTrajetaGrafica("Integrada AMD RADEON");
    };
    
    public void crearPcHogar(Builder builder){
        
    }
    
    public void crearPcOficina(Builder builder){
        builder.setModelo("All in One HP dd2020la");
    }
}
