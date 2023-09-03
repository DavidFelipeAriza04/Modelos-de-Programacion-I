
package Interface;

/**
 *
 * @author David Ariza
 */
public interface Figuras_geometricas {
    
    public void setNombre(String n);
    public String getNombre();
    public void tamaño(int x, int y);
    public void getposicion();
    public Figuras_geometricas clonar();
    public void color(String n);
    public String getColor();
    public double getArea();
}
