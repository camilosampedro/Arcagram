/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author CamiloAndrés
 */
public class Sistema {
    public static Dimension obtenerTamañoPantalla() {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension tamaño = tk.getScreenSize();
        return tamaño;
    }
}
