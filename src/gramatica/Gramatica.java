/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gramatica;

import lista.Conjunto;
import lista.NodoSimple;
import java.io.Serializable;

/**
 *
 * @author CamiloAndrés
 */
public class Gramatica implements Serializable {

    private Conjunto producciones;
    private Conjunto seleccion;
    private static Gramatica gramatica;

    private Gramatica() {
        producciones = new Conjunto();
        seleccion = new Conjunto();
    }

    public boolean esVacia() {
        return producciones.esVacia();
    }

    public Conjunto getProducciones() {
        return producciones;
    }

    public static Gramatica getInstance() {
        if (gramatica == null) {
            gramatica = new Gramatica();
        }
        return gramatica;
    }

    public static Gramatica nuevaGramatica() {
        gramatica = new Gramatica();
        return gramatica;
    }

    public Conjunto getSeleccion() {
        return seleccion;
    }

    public void setProducciones(Conjunto producciones) {
        this.producciones = producciones;
    }

    public void setSeleccion(Conjunto seleccion) {
        this.seleccion = seleccion;
    }

    public void agregarProduccion(Produccion produccionNueva) {
        producciones.agregar(produccionNueva);
    }

    public void organizarProducciones() {
        for (NodoSimple p = producciones.getPrimero(); p != null; p = p.retornaLiga()) {
        }
    }
}
