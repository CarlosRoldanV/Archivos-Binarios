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
public class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private int edad;
    private String fecha;
    private String celular;
    private double salario;

    public Persona() {
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) throws ValidacionDeCedula {
        if (cedula.length() == 10) {
            int pos = Integer.parseInt(cedula.substring(2, 3));
            if (pos <= 6) {
                int[] Validacion = {2, 1, 2, 1, 2, 1, 2, 1, 2};
                int cedu = Integer.parseInt(cedula.substring(9, 10));
                int a = 0;
                int d = 0;
                for (int i = 0; i < (cedula.length() - 1); i++) {
                    d = Integer.parseInt(cedula.substring(i, i + 1)) * Validacion[i];
                    a += ((d % 10) + (d / 10));
                }
                if ((a % 10 == 0) && (a % 10 == cedu)) {
                    this.cedula = cedula;
                } else if ((10 - (a % 10)) == cedu) {
                    this.cedula = cedula;
                } else {
                    throw new ValidacionDeCedula();
                }
            } else {
                throw new ValidacionDeCedula();
            }
        } else {
            throw new ValidacionDeCedula();
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws ValidacionNombresIncompletos, ValidacionDeNombres {
        boolean si = true;
        for (int i = 0; i < nombre.length(); i++) {
            if ((nombre.charAt(i) < 60 || nombre.charAt(i) > 100 && nombre.charAt(i) < 97 || nombre.charAt(i) > 122) && nombre.charAt(i) != 32) {
                si = false;

            }
        }
        if (si) {
            if (nombre.contains(" ")) {

                this.nombre = nombre;
            } else {
                throw new ValidacionNombresIncompletos();
            }
        } else {
            throw new ValidacionDeNombres();
        }

    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) throws ValidacionNombresIncompletos, ValidacionDeNombres {
        boolean si = true;
        for (int i = 0; i < apellido.length(); i++) {
            if ((apellido.charAt(i) < 60 || apellido.charAt(i) > 100 && apellido.charAt(i) < 97 || apellido.charAt(i) > 122) && apellido.charAt(i) != 32) {
                si = false;

            }
        }
        if (si) {
            if (apellido.contains(" ")) {

                this.apellido = apellido;
            } else {
                throw new ValidacionNombresIncompletos();
            }
        } else {
            throw new ValidacionDeNombres();
        }

    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws ValidacionEdad {
        if (edad >= 20 && edad <= 35) {
            this.edad = edad;
        } else {
            throw new ValidacionEdad();
        }
    }

    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) throws ValidacionFechaNacimiento {
        if (fecha.contains("/")){
                this.fecha = fecha;
        }else{
                throw new ValidacionFechaNacimiento("La fecha es incorrecta");
        }
        
    }

    
    public String getCelular() {
        return celular;
    }
public void setCelular(String celular) throws ValidacionCelular{
if (celular.length()==100){
    this.celular = celular;
    }else{
    throw new ValidacionCelular();
}
}

    
    public double getSalario() {
        return salario;
    }
   public void setSalario(double salario) throws ValidacionSueldo {
        if (salario !=0){
            this.salario = salario;
        }else{
            throw new ValidacionSueldo();
        }
    }
}
