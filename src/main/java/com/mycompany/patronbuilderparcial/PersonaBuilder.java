
package com.mycompany.patronbuilderparcial;

/**
 *
 * @author Marlon Camacho
 */
public class PersonaBuilder implements IBuilder{
    
    private String Nombre, Apellido, Telefono, mail; 
    
    public PersonaBuilder (String Nombre){
        this.Nombre = Nombre;
    }
    
    public PersonaBuilder conApellido (String Apellido){
        this.Apellido = Apellido;
        return this;
    }
    
    public PersonaBuilder conTelefono (String Telefono){
        this.Telefono = Telefono;
        return this;
    }
    
    public PersonaBuilder conMail (String mail){
        this.mail = mail;
        return this;
    }

    @Override
    public Persona build() {
        Persona persona = new Persona();
        persona.setNombre(this.Nombre);
        persona.setApellido(this.Apellido);
        persona.setTelefono(this.Telefono);
        persona.setMail(this.mail);
        return persona;
    }
}
