/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Service.ServiceInterface.ServiceInterface;

/**
 *
 * @author david
 */

//SERVICIO PROXY QUE IMPLEMENTA LA INTEFACE
public class Proxy implements ServiceInterface {

    private ServiceInterface autenticacion;

    public Proxy(ServiceInterface autenticacion) {
        //EL PROXY SE COMPONE DEL SERVICIO REAL POR MEDIO DEL CONTRUCTOR
        this.autenticacion = autenticacion;
    }

    @Override
    public boolean LogIn(String usuario, String contrasena) {
        System.out.println("Validando datos...");
        //IF DE VALIDACION
        if (validarDatos(usuario, contrasena)) {
            //SE HACE USO DEL SERVICIO REAL Y SU METODO LogIn()
            return this.autenticacion.LogIn(usuario, contrasena);
        } else {
            return false;
        }
    }

    //METODO PARA VALIDAR DATOS INGRESADOS DEL USUSARIO
    public Boolean validarDatos(String usuario, String contrasena) {
        if (usuario.equals("admin") && contrasena.equals("admin")) {
            return true;
        }
        return false;
    }
}
