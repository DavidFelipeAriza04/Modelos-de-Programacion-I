/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;

/**
 *
 * @author david
 */
public class Persona {

    private String nombre;
    private String edad;
    private String imagen;

    public Persona(String nombre, String edad, String Imagen) {
        this.nombre = nombre;
        this.edad = edad;
        this.imagen = Imagen;
    }
    
    public String[] devolverDatos(){
        String datos[] = {nombre,edad,imagen};
        return datos;
    }

}
