/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Concrete_Builders;

import Builder.Builder;
import Products.Product_Pc_Gamer;

/**
 *
 * @author david
 */
public class Concrete_Builder_Gamer implements Builder{
    private Product_Pc_Gamer pc_Gamer;
    
    public Concrete_Builder_Gamer(){
        this.reset();
    }
    
    @Override
    public void reset(){
        this.pc_Gamer = new Product_Pc_Gamer();
    }
    
    @Override
    public void setProcesador(String procesador) {
        
    }

    @Override
    public void setMarca(String marca) {
        }

    @Override
    public void setModelo(String modelo) {
    }

    @Override
    public void setNucleos(int nucleos) {
    }

    @Override
    public void setTrajetaGrafica(String tarjetaGrafica) {
    }

    @Override
    public void setDiscoDuro(String nombre, int capacidad) {
    }
    
    @Override
    public void setRAM(int RAM){
        
    }
    
    public Product_Pc_Gamer getProduct(){
        Product_Pc_Gamer producto = this.pc_Gamer;
        this.reset();
        return producto;
    }
}
