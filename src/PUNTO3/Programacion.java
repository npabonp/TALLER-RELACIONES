/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PUNTO3;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Programacion {
    private ArrayList <Sala> salas;

    public Programacion(ArrayList<Sala> salas) {
        this.salas = salas;
    }
    
    public void ImprProgramacionGeneral (){
        System.out.println("La programacion general es ");
        for (int i = 0; i < salas.size(); i++) {
            salas.get(i).ImprSala();
        }
    }
}
