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
        return 0;
    }

}
