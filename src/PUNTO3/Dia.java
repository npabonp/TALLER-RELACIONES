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
public class Dia {
    private String fecha;
    private String nomDia;
    private ArrayList <Segmento> segmentod;

    public Dia(String fecha, String nomDia, ArrayList<Segmento> segmentod) {
        this.fecha = fecha;
        this.nomDia = nomDia;
        this.segmentod = segmentod;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNomDia() {
        return nomDia;
    }

    public void setNomDia(String nomDia) {
        this.nomDia = nomDia;
    }

    public ArrayList<Segmento> getSegmentod() {
        return segmentod;
    }

    public void setSegmentod(ArrayList<Segmento> segmentod) {
        this.segmentod = segmentod;
    }
    
    

   
    
    
}
