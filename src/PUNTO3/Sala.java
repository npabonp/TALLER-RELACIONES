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
public class Sala {
    private int num_Sala;
    private ArrayList <Semana> semanas; 

    public Sala(int num_Sala, ArrayList<Semana> semanas) {
        this.num_Sala = num_Sala;
        this.semanas = semanas;
    }
    public void ImprSala(){
        System.out.println("En la sala numero "+ this.getNum_Sala()+" La programacion semanal es:");
        for (int i = 0; i <semanas.size(); i++) {
            semanas.get(i).ImprSemana();
        }
    }

    public int getNum_Sala() {
        return num_Sala;
    }

    public void setNum_Sala(int num_Sala) {
        this.num_Sala = num_Sala;
    }

    public ArrayList<Semana> getSemanas() {
        return semanas;
    }

    public void setSemanas(ArrayList<Semana> semanas) {
        this.semanas = semanas;
    }
    
    
}
