/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concreto_builder;
import abstraccion.PcBuilder;
import productos.*;
/**
 *
 * @author oscar
 */
public class PcHome extends PcBuilder{
    
    @Override
    public void buildProcesador(){
        pc.setProcesador("raysen 7");
    }
}
