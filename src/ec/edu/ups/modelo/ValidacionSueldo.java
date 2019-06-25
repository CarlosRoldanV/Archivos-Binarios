/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author Carlos
 */
public class ValidacionSueldo extends Exception {
    public ValidacionSueldo() {
    
        super("El sueldo debe ser diferente de 0");
        
    }
}
