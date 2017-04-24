/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PUNTO3;

/**
 *
 * @author USER
 */
public class Semana {

    private int numSemana;
    private Dia[] diasHabiles = new Dia[5];

    public Semana(int numSemana, Dia[] diasHabiles) {
        this.numSemana = numSemana;
        this.diasHabiles = diasHabiles;
    }

    public int SegmentosLibres() {
        int segocupados = 0;
        for (int i = 0; i < 5; i++) {
            segocupados = segocupados + diasHabiles[i].getSegmentod().size();
        }
        return 45 - segocupados;
    }

    public void ImprSemana() {
        System.out.println("En la semana numero "+this.getNumSemana()+"La programacion diaria es:");
        for (int i = 0; i < diasHabiles.length; i++) {
            diasHabiles[i].ImprDia();
        }
    }

    public int getNumSemana() {
        return numSemana;
    }

    public void setNumSemana(int numSemana) {
        this.numSemana = numSemana;
    }

    public Dia[] getDiasHabiles() {
        return diasHabiles;
    }

    public void setDiasHabiles(Dia[] diasHabiles) {
        this.diasHabiles = diasHabiles;
    }

}
