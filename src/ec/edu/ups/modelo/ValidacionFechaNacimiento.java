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
public class ValidacionFechaNacimiento extends Exception {
    public ValidacionFechaNacimiento(String su_fecha_es_incorrecta){        
        super("La fecha no es correcta \n"+"Por favor Verificar");        
    }
}
