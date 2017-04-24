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
public class Segmento {
    private int hora_inicio;
    private int hora_fin;

    public Segmento(int hora_inicio, int hora_fin) {
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
    }

    public int getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(int hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public int getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(int hora_fin) {
        this.hora_fin = hora_fin;
    }
    
    
}
