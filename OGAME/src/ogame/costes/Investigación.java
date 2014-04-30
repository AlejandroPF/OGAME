/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ogame.costes;

/**
 *
 * @author carlo_000
 */
public class Investigación {

    //  recursos[0]=metal;
    //      recursos[1]=cristal;
    //       recursos[3]=deuterio;
    
    public static double[] energia(int nivel) {
        double[] recursos = new double[3];
        double metal = (0 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double cristal = (800 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double deuterio = (400 * (1 - Math.pow(2, nivel)) / (1 - 2));
        recursos[0] = metal;
        recursos[1] = cristal;
        recursos[2] = deuterio;
        return recursos;
    }

    public static double[] espionaje(int nivel) {
        double[] recursos = new double[3];
        double metal = (200 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double cristal = (1000 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double deuterio = (200 * (1 - Math.pow(2, nivel)) / (1 - 2));
        recursos[0] = metal;
        recursos[1] = cristal;
        recursos[2] = deuterio;
        return recursos;
    }

    public static double[] computacion(int nivel) {
        double[] recursos = new double[3];
        double metal = (0 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double cristal = (400 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double deuterio = (600 * (1 - Math.pow(2, nivel)) / (1 - 2));
        recursos[0] = metal;
        recursos[1] = cristal;
        recursos[2] = deuterio;
        return recursos;
    }

    public static double[] tecMilitar(int nivel) {
        double[] recursos = new double[3];
        double metal = (800 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double cristal = (200 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double deuterio = (0 * (1 - Math.pow(2, nivel)) / (1 - 2));
        recursos[0] = metal;
        recursos[1] = cristal;
        recursos[2] = deuterio;
        return recursos;
    }

    public static double[] tecDefensa(int nivel) {
        double[] recursos = new double[3];
        double metal = (200 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double cristal = (600* (1 - Math.pow(2, nivel)) / (1 - 2));
        double deuterio = (0 * (1 - Math.pow(2, nivel)) / (1 - 2));
        recursos[0] = metal;
        recursos[1] = cristal;
        recursos[2] = deuterio;
        return recursos;
    }

    public static double[] Blindaje(int nivel) {
        double[] recursos = new double[3];
        double metal = (1000 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double cristal = (0 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double deuterio = (0 * (1 - Math.pow(2, nivel)) / (1 - 2));
        recursos[0] = metal;
        recursos[1] = cristal;
        recursos[2] = deuterio;
        return recursos;
    }

    public static double[] hiperespacio(int nivel) {
        double[] recursos = new double[3];
        double metal = (0 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double cristal = (4000 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double deuterio = (2000 * (1 - Math.pow(2, nivel)) / (1 - 2));
        recursos[0] = metal;
        recursos[1] = cristal;
        recursos[2] = deuterio;
        return recursos;
    }

    public static double[] combustion(int nivel) {
        double[] recursos = new double[3];
        double metal = (400 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double cristal = (0 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double deuterio = (600 * (1 - Math.pow(2, nivel)) / (1 - 2));
        recursos[0] = metal;
        recursos[1] = cristal;
        recursos[2] = deuterio;
        return recursos;
    }

    public static double[] impulso(int nivel) {
        double[] recursos = new double[3];
        double metal = (2000 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double cristal = (4000 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double deuterio = (600 * (1 - Math.pow(2, nivel)) / (1 - 2));
        recursos[0] = metal;
        recursos[1] = cristal;
        recursos[2] = deuterio;
        return recursos;
    }

    public static double[] propHiperespacial(int nivel) {
        double[] recursos = new double[3];
        double metal = (10000 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double cristal = (20000 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double deuterio = (6000 * (1 - Math.pow(2, nivel)) / (1 - 2));
        recursos[0] = metal;
        recursos[1] = cristal;
        recursos[2] = deuterio;
        return recursos;
    }

    public static double[] laser(int nivel) {
        double[] recursos = new double[3];
        double metal = (200 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double cristal = (100 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double deuterio = (0 * (1 - Math.pow(2, nivel)) / (1 - 2));
        recursos[0] = metal;
        recursos[1] = cristal;
        recursos[2] = deuterio;
        return recursos;
    }

    public static double[] ionica(int nivel) {
        double[] recursos = new double[3];
        double metal = (1000 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double cristal = (300 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double deuterio = (100 * (1 - Math.pow(2, nivel)) / (1 - 2));
        recursos[0] = metal;
        recursos[1] = cristal;
        recursos[2] = deuterio;
        return recursos;
    }

    public static double[] plasma(int nivel) {
        double[] recursos = new double[3];
        double metal = (2000 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double cristal = (4000 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double deuterio = (1000 * (1 - Math.pow(2, nivel)) / (1 - 2));
        recursos[0] = metal;
        recursos[1] = cristal;
        recursos[2] = deuterio;
        return recursos;
    }

    public static double[] redInvestigacionIntergalactica(int nivel) {
        double[] recursos = new double[3];
        double metal = (240000 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double cristal = (400000 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double deuterio = (160000 * (1 - Math.pow(2, nivel)) / (1 - 2));
        recursos[0] = metal;
        recursos[1] = cristal;
        recursos[2] = deuterio;
        return recursos;
    }

    public static double[] astrofisica(int nivel) {
        double[] recursos = new double[3];
        double metal = (4000 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double cristal = (8000 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double deuterio = (4000 * (1 - Math.pow(2, nivel)) / (1 - 2));
        recursos[0] = metal;
        recursos[1] = cristal;
        recursos[2] = deuterio;
        return recursos;
    }

    public static double graviton(int nivel) {
        double energia = 300000;
        for (int i = 0; i < nivel; i++) {
            energia=energia*3;
        }
        return energia;
    }
}
