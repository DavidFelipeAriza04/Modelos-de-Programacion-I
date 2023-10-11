/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Proxy.Proxy;
import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ServiceInterface.ServiceInterface;
import Service.ServiceAutenticacion;

/**
 *
 * @author david
 */
public class Control implements ActionListener {

    private Vista vista;
    private ServiceInterface autenticacion;
    private ServiceInterface Proxy;

    public Control() {
        this.vista = new Vista();
        this.vista.jButtonLogIn.addActionListener(this);
        this.autenticacion = new ServiceAutenticacion();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String usuario = this.vista.jTextFieldUsuario.getText();
        String contrasena = String.valueOf(this.vista.jPasswordFieldContrasena.getPassword());
        this.Proxy = new Proxy(autenticacion);
        boolean respuesta = Proxy.LogIn(usuario, contrasena);
        this.vista.LogIn(respuesta,usuario);
    }

}
