/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ogame;

/**
 *
 * @author carlo_000
 */
public class Recursos {
    public static double capacidadAlmacenMetal(int nivel){
        double capacidad;
        capacidad=100000+50000*Math.pow(1.6, nivel);
        return capacidad;
    }
    public static double capacidadAlmacenCristal(int nivel){
        double capacidad;
        capacidad=100000+50000*Math.pow(1.6, nivel);
        return capacidad;
    }    public static double capacidadAlmacenDeuterio(int nivel){
        double capacidad;
        capacidad=100000+50000*Math.pow(1.6, nivel);
        return capacidad;
    }
    
    public static double nivelPlasmaMetal(int nivel){
        Double porcentaje;
        porcentaje=0.01*nivel;
        return porcentaje;
    }
        public static double nivelPlasmaCristal(int nivel){
        Double porcentaje;
        porcentaje=0.066*nivel;
        return porcentaje;
    }
}
