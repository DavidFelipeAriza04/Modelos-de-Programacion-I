/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Service.Proxy;
import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Service.ServiceInterface.ServiceInterface;
import Service.ServiceAutenticacion;

/**
 *
 * @author david
 */
public class Control implements ActionListener {

    //DECLARACION DE ATRIUBUTOS Y RELACIONES
    private Vista vista;
    private ServiceInterface Proxy;

    public Control() {
        //CREA INSTANCIA DE LA VISTA Y AGREGAR EVENTOS
        this.vista = new Vista();
        this.vista.jButtonLogIn.addActionListener(this);
    }

    //EVENTOS
    @Override
    public void actionPerformed(ActionEvent e) {
        //OBTENCION DE DATOS DEL LOG IN
        String usuario = this.vista.jTextFieldUsuario.getText();
        String contrasena = String.valueOf(this.vista.jPasswordFieldContrasena.getPassword());
        
        //SE CREA LA RELACION A LA INTEFACE DEL PROXY Y SE ACCEDE AL METODO LogIn();
        this.Proxy = new Proxy(new ServiceAutenticacion());
        boolean respuesta = Proxy.LogIn(usuario, contrasena);
        
        //SE ACCEDE AL METODO LogIn() DE LA VISTA
        this.vista.LogIn(respuesta,usuario);
    }

}
