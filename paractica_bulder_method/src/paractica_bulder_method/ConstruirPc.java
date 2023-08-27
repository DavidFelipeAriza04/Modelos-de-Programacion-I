/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paractica_bulder_method;
import concreto_builder.*;
import productos.*;
import abstraccion.*;
/**
 *
 * @author oscar
 */
public class ConstruirPc {
    
    private PcBuilder nuevoPc;
    
    public void setPcBuilder(PcBuilder pc){
        this.nuevoPc = pc;
    }
    
    public Pc getPc(){
        return nuevoPc.getPc();
    }
    
    public void fabricaPc(){
        this.nuevoPc.buildProcesador();
    }
    
}
