/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Concrete_Builder;
import Builder.PcBuilder;
/**
 *
 * @author oscar
 */
public class PcHome extends PcBuilder{
    
    @Override
    public void buildProcesador(String procesador){
        pc.setProcesador(procesador);
    }

    @Override
    public void buildMarca(String marca) {
        pc.setMarca(marca);
    }

    @Override
    public void buildGPU(String GPU) {
        pc.setGPU(GPU);
    }

    @Override
    public void buildRAM(int cantidadRAM) {
        pc.setRAM(cantidadRAM);
    }
}
