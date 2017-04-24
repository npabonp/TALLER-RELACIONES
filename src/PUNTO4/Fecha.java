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
public class Fecha {

    private int dia;
    private int mes;
    private int año;
    private String nombreDia;
    private String nombreMes;

    public Fecha(int dia, int mes, int año, String nombreDia, String nombreMes) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.nombreDia = nombreDia;
        this.nombreMes = nombreMes;
    }

    public boolean Año_Bisiesto() {
        if ((this.año % 4 == 0) && ((this.año % 100 != 0) || (this.año % 400 == 0))) {
            return true;
        }
        return false;
    }

    public void ImprBisiesto() {
        if (Año_Bisiesto() == true) {
            System.out.println("Este año es bisiesto");
        }
    }
    
    public void ImprFecha(){
        System.out.println(this.nombreDia+" "+this.getDia()+" de "+this.getNombreMes()+" del "+this.getAño());
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getNombreDia() {
        return nombreDia;
    }

    public void setNombreDia(String nombreDia) {
        this.nombreDia = nombreDia;
    }

    public String getNombreMes() {
        return nombreMes;
    }

    public void setNombreMes(String nombreMes) {
        this.nombreMes = nombreMes;
    }

}
