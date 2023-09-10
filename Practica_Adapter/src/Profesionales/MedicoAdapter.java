/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Profesionales;
/**
 *
 * @author jorge malaver
 */
public class MedicoAdapter  extends Target_Profesionales{   //Clase medico adpater extiende de la clase abstracta Traget_Profesionales
    //Se utiliza para que la clase medico se adapte a la estructura de la clase abstracta Traget_Profesionales
     Medico medico;// referencia a laclase adaptada medico
    
     //Constructor MedicoAdapter
     public MedicoAdapter(){
         super();
         
         //Instanciacion clase medico
         this.medico = new Medico();
     }
     
     
    //Sobreescritura adaptada del metodo Leer_planos
    @Override
    public void Leer_planos(){
        
        System.out.println("Especialidades de medicas");
        
        //Llamado a los metodos especialidad y Entidades de la clase medico
        this.medico.especialidad();
        this.medico.Entidades();
    }
    
    //Sobreescritura adaptada del metodo contratos
    @Override
    public void contratos(){
        System.out.println("Nacionalidades");
        
        //Llamado al metodo nacionalidad de la clase medico
        this.medico.nacionalidad();
    }
    
    //Sobreescritura adaptada del metodo supervision
    @Override
    public void supervision(){
        System.out.println("Campos de investigacion");
        //Llamado al metodo investigacion de la clase medico
        this.medico.Investigacion();
    }
    
    private String nombre;
    
    
}
