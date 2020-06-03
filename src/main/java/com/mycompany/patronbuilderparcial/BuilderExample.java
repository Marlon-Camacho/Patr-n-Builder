
package com.mycompany.patronbuilderparcial;

/**
 *
 * @author Marlon Camacho
 */
public class BuilderExample {
    
    public static void main(String[] args) {
        
        PersonaBuilder builder = new PersonaBuilder("Marlon");
        PersonaBuilder builder1 = new PersonaBuilder("Karen");
        
        Persona p1 = 
                builder.conApellido("Camacho")
                .conTelefono("3007540727")
                .conMail("marloncamacho6@gmail.com")
                .build();
        
        Persona p2 = 
                builder1.conApellido("Peña")
                .conTelefono("3002255895")
                .conMail("tatisred@gmail.com")
                .build();
        
        System.out.println(p1);
        
        System.out.println(p2);
    }
    
}
