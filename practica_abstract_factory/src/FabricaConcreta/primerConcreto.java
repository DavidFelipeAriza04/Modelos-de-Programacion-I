/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricaConcreta;








import Fabrica_abstracta.ServicioFactory;
import Producto_Abstracto.ServicioNotas;
import ProductosConcretos.PrimerPeriodo;
public class primerConcreto implements ServicioFactory{ //Fabrica concreta
    
    @Override //Metodo para crear el producto concreto
    public ServicioNotas crearNota(){
      return new PrimerPeriodo();  
    }
}
