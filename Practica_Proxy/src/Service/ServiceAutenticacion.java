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

//SERVICIO REAL QUE IMPLEMENTA LA INTERFACE
public class ServiceAutenticacion implements ServiceInterface {

    @Override
    public boolean LogIn(String usuario, String contrasena) {
        return true;
    }

}
