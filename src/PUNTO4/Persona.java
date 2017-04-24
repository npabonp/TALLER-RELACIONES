/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PUNTO4;

/**
 *
 * @author USER
 */
public class Persona {

    private String nombre;
    private Fecha fecha_nacim;

    public Persona(String nombre, Fecha fecha_nacim) {
        this.nombre = nombre;
        this.fecha_nacim = fecha_nacim;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Fecha getFecha_nacim() {
        return fecha_nacim;
    }

    public void setFecha_nacim(Fecha fecha_nacim) {
        this.fecha_nacim = fecha_nacim;
    }

    public void ImprFechadeNacimiento() {
        System.out.println(this.getNombre() + " nació el ");
        System.out.println(this.fecha_nacim.ImprFecha());
    }
}
