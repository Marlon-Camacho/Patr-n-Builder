
package com.mycompany.patronbuilderparcial;

/**
 *
 * @author Marlon Camacho
 */
public class Persona {
    
    private String Nombre, Apellido, Telefono, mail; 
    
    public Persona(){
        
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }


    
    @Override
    public String toString() {
        return "Persona { " +
                " Nombre= " + Nombre +
                ", Apellido= " + Apellido + '\'' +
                ", Telefono= " + Telefono +
                ", E-mail= " + mail +
                '}';
    }
}


