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
public class ValidacionDeCedula extends Exception{
    public ValidacionDeCedula(){
        super("La cédula ingresa no es valida");
        
    }
}
