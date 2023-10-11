/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proxy;

import ServiceInterface.ServiceInterface;

/**
 *
 * @author david
 */
public class Proxy implements ServiceInterface {

    private ServiceInterface autenticacion;

    public Proxy(ServiceInterface autenticacion) {
        this.autenticacion = autenticacion;
    }

    @Override
    public boolean LogIn(String usuario, String contrasena) {
        System.out.println("Validando datos...");
        if (validarDatos(usuario, contrasena)) {
            return this.autenticacion.LogIn(usuario, contrasena);
        } else {
            return false;
        }
    }

    public Boolean validarDatos(String usuario, String contrasena) {
        if (usuario.equals("admin") && contrasena.equals("admin")) {
            return true;
        }
        return false;
    }
}
