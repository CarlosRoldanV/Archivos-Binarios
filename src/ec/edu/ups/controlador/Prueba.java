/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Persona;
import java.util.Date;

/**
 *
 * @author Carlos
 */
public class Prueba {
    public void  main(String [] args){
        Persona p = new Persona("0101010101", "Carlos ", "ROLEROT", 30, new java.util.Date(), "0962984814", 235.67);
    ControladorPersona controlador = new ControladorPersona();
    controlador.create(p);
    }
}
