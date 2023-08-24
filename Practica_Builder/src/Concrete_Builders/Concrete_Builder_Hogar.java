/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Concrete_Builders;

import Builder.Builder;
import Products.Product_Pc_Hogar;

/**
 *
 * @author david
 */
public class Concrete_Builder_Hogar implements Builder{
    private Product_Pc_Hogar pc_Hogar;
    
    public Concrete_Builder_Hogar(){
        this.reset();
    }
    
    @Override
    public void reset(){
        this.pc_Hogar = new Product_Pc_Hogar();
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
    
    public Product_Pc_Hogar getProduct(){
        Product_Pc_Hogar producto = this.pc_Hogar;
        this.reset();
        return producto;
    }
}
