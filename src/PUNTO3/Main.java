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
public class Main {

    public static void main(String[] args) {

        Segmento s1 = new Segmento("7:00 am", "9:00 am");
        Segmento s2 = new Segmento("9:00 am", "11:00 am");
        Segmento s3 = new Segmento("11:00 am", "1:00 pm");
        Segmento s4 = new Segmento("1:00 pm", "3:00 pm");
        Segmento s5 = new Segmento("3:00 pm", "5:00 pm");
        Segmento s6 = new Segmento("5:00 pm", "7:00 pm");
        Segmento s7 = new Segmento("7:00 pm", "9:00 pm");

        ArrayList<Segmento> ss = new ArrayList<>();
        ss.add(s1);
        ss.add(s2);
        ss.add(s3);
        ss.add(s4);

        ArrayList<Segmento> tt = new ArrayList<>();
        tt.add(s4);
        tt.add(s5);
        tt.add(s6);
        tt.add(s7);

        Dia d1 = new Dia("24/04/2017", "Lunes", ss);
        Dia d2 = new Dia("25/04/2017", "martes", tt);
        Dia d3 = new Dia("26/04/2017", "miercoles", ss);
        Dia d4 = new Dia("27/04/2017", "jueves", tt);
        Dia d5 = new Dia("28/04/2017", "viernes", ss);
        Dia d6 = new Dia("1/05/2017", "Lunes", ss);
        Dia d7 = new Dia("2/05/2017", "martes", tt);
        Dia d8 = new Dia("3/05/2017", "miercoles", ss);
        Dia d9 = new Dia("4/05/2017", "jueves", tt);
        Dia d10 = new Dia("5/05/2017", "viernes", ss);
        Dia d11 = new Dia("8/05/2017", "Lunes", ss);
        Dia d12 = new Dia("9/05/2017", "martes", tt);
        Dia d13 = new Dia("10/05/2017", "miercoles", ss);
        Dia d14 = new Dia("11/05/2017", "jueves", tt);
        Dia d15 = new Dia("12/05/2017", "viernes", ss);
        Dia d16 = new Dia("15/05/2017", "Lunes", ss);
        Dia d17 = new Dia("16/05/2017", "martes", tt);
        Dia d18 = new Dia("17/05/2017", "miercoles", ss);
        Dia d19 = new Dia("18/05/2017", "jueves", tt);
        Dia d20 = new Dia("19/05/2017", "viernes", ss);

        Dia dias1[] = {d1, d2, d3, d4, d5};
        Dia dias2[] = {d6, d7, d8, d9, d10};
        Dia dias3[] = {d11, d12, d13, d14, d15};
        Dia dias4[] = {d16, d17, d18, d19, d20};

        Semana se1 = new Semana(17, dias1);
        Semana se2 = new Semana(18, dias2);
        Semana se3 = new Semana(19, dias3);
        Semana se4 = new Semana(20, dias4);

        ArrayList<Semana> sem12 = new ArrayList<>();
        sem12.add(se1);
        sem12.add(se2);

        ArrayList<Semana> sem34 = new ArrayList<>();
        sem34.add(se3);
        sem34.add(se4);

        Sala sala1 = new Sala(1, sem12);
        Sala sala2 = new Sala(2, sem34);
        
        ArrayList<Sala> salas = new ArrayList<>();
        salas.add(sala1);
        salas.add(sala2);
        
        Programacion progeneral = new Programacion(salas);
        progeneral.ImprProgramacionGeneral();
    }
}
