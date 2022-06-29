/*Hacer un método en JARVIS que agregue en radar objetos, hacer que la resistencia, las
coordenadas y la hostilidad sean aleatorios utilizando la clase random. Utilizar la clase
Random.
 */
package integradorironman.Entidades;

public class ObjetosVarios {

    protected String nombre;
    protected Float resistencia;
    protected Float hostilidad;
    protected boolean hostil;

    public ObjetosVarios() {
    }

    public ObjetosVarios(String nombre, Float resistencia, Float hostilidad, boolean hostil) {
        this.nombre = nombre;
        this.resistencia = resistencia;
        this.hostilidad = hostilidad;
        this.hostil = hostil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getResistencia() {
        return resistencia;
    }

    public void setResistencia(Float resistencia) {
        this.resistencia = resistencia;
    }

    public Float getHostilidad() {
        return hostilidad;
    }

    public void setHostilidad(Float hostilidad) {
        this.hostilidad = hostilidad;
    }

    public boolean isHostil() {
        return hostil;
    }

    public void setHostil(boolean hostil) {
        this.hostil = hostil;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
