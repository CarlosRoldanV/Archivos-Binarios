/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Persona;
import java.text.SimpleDateFormat;

/**
 *
 * @author Carlos
 */
public class ControladorPersona {
    private BaseDatos miBaseDatos;
    
    public ControladorPersona(){
        
    }
 public void create (Persona persona){
     SimpleDateFormat formato = new SimpleDateFormat("aa/mm/dd");
    String fechaBD = formato.format(persona.getFecha());
    String sql = "INSERT INTO \"PERSONA\""+"VALUES('"+persona.getCedula()+"',"+"'"+persona.getNombre()+"',"+"'"+persona.getApellido()+"',"+persona.getCelular()+"',"+persona.getSalario()+"):";
 miBaseDatos.conectar();
 try{
     Statement sta = miBaseDatos.getConexionBD().createStatement();
sta.execute(sql);
miBaseDatos.desconectar();
 }catch (SQLException ex){
     ex.printStackTrace();
 }
 }   
}
