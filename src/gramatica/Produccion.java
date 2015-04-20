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
public class Produccion implements Serializable{
    private NoTerminal parteIzquierda;
    private Conjunto definicion;
    int numero;

    public NoTerminal getParteIzquierda() {
        return parteIzquierda;
    }

    public Conjunto getDefinicion() {
        return definicion;
    }

    public void setParteIzquierda(NoTerminal izquierda) {
        this.parteIzquierda = izquierda;
    }

    public void setDefinicion(Conjunto definicion) {
        this.definicion = definicion;
    }
}
