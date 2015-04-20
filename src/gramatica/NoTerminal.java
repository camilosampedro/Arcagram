/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gramatica;

import lista.Conjunto;
import java.io.Serializable;

/**
 *
 * @author CamiloAndrés
 */
public class NoTerminal implements Serializable{
    private Conjunto producciones;
    private String nombre;

    public NoTerminal(String nombre) {
        producciones = new Conjunto();
        this.nombre = nombre;
    }
    
    public void agregarProduccion(Conjunto produccion){
        producciones.agregar(produccion);
    }

    public Conjunto getProducciones() {
        return producciones;
    }

    @Override
    public String toString() {
        return "<" + nombre + ">";
    }

    public void setProducciones(Conjunto producciones) {
        this.producciones = producciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }  
}
