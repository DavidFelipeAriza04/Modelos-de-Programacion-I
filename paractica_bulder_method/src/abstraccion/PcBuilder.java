/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstraccion;
import productos.*;
/**
 *
 * @author oscar
 */
public abstract class PcBuilder {
    protected Pc pc;
    
    public Pc getPc(){
        return pc;
    }
    
    public void construirPc(){
        pc = new Pc();
    }
    
    public abstract void buildProcesador(); 
}
