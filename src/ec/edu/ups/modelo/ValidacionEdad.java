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

    public ValidacionEdad(String la_edad_debe_estar_comprendida_entre_20_y) {
        super("La edad debe estar entre los 20 y 30 años");
    }
    
    
}
