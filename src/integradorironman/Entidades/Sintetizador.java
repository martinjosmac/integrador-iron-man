/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integradorironman.Entidades;

/**
 *
 * @author marti
 */
public class Sintetizador {

    public String nombre;
    public boolean dañado;
    public int consumo;

    public Sintetizador() {
    }

    public Sintetizador(String nombre, boolean dañado, int consumo) {
        this.nombre = nombre;
        this.dañado = dañado;
        this.consumo = consumo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isDañado() {
        return dañado;
    }

    public void setDañado(boolean dañado) {
        this.dañado = dañado;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

}
