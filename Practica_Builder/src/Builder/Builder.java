/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Builder;

/**
 *
 * @author david
 */
public interface Builder {
    public void reset();
    public void setMarca(String marca);
    public void setModelo(String modelo);
    public void setNucleos(int nucleos);
    public void setProcesador(String procesador);
    public void setTrajetaGrafica(String tarjetaGrafica);
    public void setDiscoDuro(String Nombre,int capacidad);
    public void setRAM(int RAM);
}
