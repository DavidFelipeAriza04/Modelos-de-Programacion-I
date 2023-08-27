/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica_Builder_Method;
import Products.Pc;
import Builder.PcBuilder;
/**
 *
 * @author oscar
 */
public class PcDirector {
    
    private PcBuilder nuevoPc;
    
    public void setPcBuilder(PcBuilder pc){
        this.nuevoPc = pc;
    }
    
    public Pc getPc(){
        return nuevoPc.getPc();
    }
    
    public void fabricaPc(String procesador, String marca,String GPU, int cantidadRAM){
        this.nuevoPc.buildProcesador(procesador);
        this.nuevoPc.buildGPU(GPU);
        this.nuevoPc.buildMarca(marca);
        this.nuevoPc.buildRAM(cantidadRAM);
    }
    
}
