/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author Byron PC
 */
public class ValidacionEdad extends Exception{

    public ValidacionEdad() {
        super("La edad debe estar entre los 20 y 30 años");
    }
    
    
}
