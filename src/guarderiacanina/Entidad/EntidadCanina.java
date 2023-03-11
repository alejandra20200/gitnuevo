/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guarderiacanina.Entidad;

/**
 *
 * @author Usuario
 */
public class EntidadCanina {
    private String nombre;
   private int edad;
   private String dueño;

    public EntidadCanina(String nombre, int edad, String dueño) {
        this.nombre = nombre;
        this.edad = edad;
        this.dueño = dueño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

   
    
}