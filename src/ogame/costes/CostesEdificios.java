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
public class CostesEdificios {

    public static double[] minaMetal(int nivel) {
        double[] recursos = new double[2];

        double metal = (60 * (1 - Math.pow(1.5, nivel)) / (-0.5));
        double cristal = (15 * (1 - Math.pow(1.5, nivel)) / (-0.5));
        recursos[0] = metal;
        recursos[1] = cristal;

        return recursos;
    }

    public static double[] minaCristal(int nivel) {
        double[] recursos = new double[2];

        double metal = (48 * (1 - Math.pow(1.6, nivel)) / (-0.6));
        double cristal = (24 * (1 - Math.pow(1.6, nivel)) / (-0.6));
        recursos[0] = metal;
        recursos[1] = cristal;

        return recursos;
    }

    public static double[] sinteDeuterio(int nivel) {
        double[] recursos = new double[2];

        double metal = (225 * (1 - Math.pow(1.5, nivel)) / (-0.5));
        double cristal = (75 * (1 - Math.pow(1.5, nivel)) / (-0.5));
        recursos[0] = metal;
        recursos[1] = cristal;

        return recursos;
    }

    public static double[] plantaEnergiaSolar(int nivel) {
        double[] recursos = new double[2];

        double metal = (75 * (1 - Math.pow(1.5, nivel)) / (-0.5));
        double cristal = (30 * (1 - Math.pow(1.5, nivel)) / (-0.5));
        recursos[0] = metal;
        recursos[1] = cristal;

        return recursos;
    }

    public static double[] plantaFusion(int nivel) {
        double[] recursos = new double[2];

        double metal = (900 * (1 - Math.pow(1.8, nivel)) / (-0.8));
        double cristal = (360 * (1 - Math.pow(1.8, nivel)) / (-0.8));
        recursos[0] = metal;
        recursos[1] = cristal;

        return recursos;
    }

    public static double[] otrosEdificiosMC(int nivel, int costeM, int costeC) {
        double[] recursos = new double[2];

        double metal = (costeM * (1 - Math.pow(2, nivel)) / (1 - 2));
        double cristal = (costeC * (1 - Math.pow(2, nivel)) / (1 - 2));
        recursos[0] = metal;
        recursos[1] = cristal;

        return recursos;
    }

    public static double[] otrosEdificiosMCD(int nivel, int costeM, int costeC, int costeD) {
        double[] recursos = new double[3];

        double metal = (costeM * (1 - Math.pow(2, nivel)) / (1 - 2));
        double cristal = (costeC * (1 - Math.pow(2, nivel)) / (1 - 2));
        double deuterio = (costeD * (1 - Math.pow(2, nivel)) / (1 - 2));
        recursos[0] = metal;
        recursos[1] = cristal;
        recursos[2] = deuterio;

        return recursos;
    }

    public static double[] fabRobots(int nivel) {
        double[] recursos = new double[3];

        double metal = (400 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double cristal = (120 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double deuterio = (200 * (1 - Math.pow(2, nivel)) / (1 - 2));
        recursos[0] = metal;
        recursos[1] = cristal;
        recursos[2] = deuterio;

        return recursos;
    }

    public static double[] nanos(int nivel) {
        double[] recursos = new double[3];

        double metal = (1000000 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double cristal = (500000 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double deuterio = (100000 * (1 - Math.pow(2, nivel)) / (1 - 2));
        recursos[0] = metal;
        recursos[1] = cristal;
        recursos[2] = deuterio;

        return recursos;
    }

    public static double[] hangar(int nivel) {
        double[] recursos = new double[3];

        double metal = (400 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double cristal = (200 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double deuterio = (100 * (1 - Math.pow(2, nivel)) / (1 - 2));
        recursos[0] = metal;
        recursos[1] = cristal;
        recursos[2] = deuterio;

        return recursos;
    }

    public static double[] almacenMetal(int nivel) {
        double[] recursos = new double[3];

        double metal = (1000 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double cristal = (0 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double deuterio = (0 * (1 - Math.pow(2, nivel)) / (1 - 2));
        recursos[0] = metal;
        recursos[1] = cristal;
        recursos[2] = deuterio;

        return recursos;
    }

    public static double[] alCristal(int nivel) {
        double[] recursos = new double[3];

        double metal = (1000 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double cristal = (500 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double deuterio = (0 * (1 - Math.pow(2, nivel)) / (1 - 2));
        recursos[0] = metal;
        recursos[1] = cristal;
        recursos[2] = deuterio;

        return recursos;
    }

    public static double[] contDeu(int nivel) {
        double[] recursos = new double[3];

        double metal = (1000 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double cristal = (1000 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double deuterio = (0 * (1 - Math.pow(2, nivel)) / (1 - 2));
        recursos[0] = metal;
        recursos[1] = cristal;
        recursos[2] = deuterio;

        return recursos;
    }

    public static double[] esconditeMetal(int nivel) {
        double[] recursos = new double[3];

        double metal = (2645 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double cristal = (0 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double deuterio = (0 * (1 - Math.pow(2, nivel)) / (1 - 2));
        recursos[0] = metal;
        recursos[1] = cristal;
        recursos[2] = deuterio;

        return recursos;
    }
      public static double[] esconditeCristal(int nivel) {
        double[] recursos = new double[3];

        double metal = (2645 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double cristal = (1322 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double deuterio = (0 * (1 - Math.pow(2, nivel)) / (1 - 2));
        recursos[0] = metal;
        recursos[1] = cristal;
        recursos[2] = deuterio;

        return recursos;
    }
      public static double[] esconditeDeu(int nivel) {
        double[] recursos = new double[3];

        double metal = (2645 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double cristal = (2645 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double deuterio = (0 * (1 - Math.pow(2, nivel)) / (1 - 2));
        recursos[0] = metal;
        recursos[1] = cristal;
        recursos[2] = deuterio;

        return recursos;
    }
            public static double[] laboratio(int nivel) {
        double[] recursos = new double[3];

        double metal = (200 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double cristal = (400 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double deuterio = (200 * (1 - Math.pow(2, nivel)) / (1 - 2));
        recursos[0] = metal;
        recursos[1] = cristal;
        recursos[2] = deuterio;

        return recursos;
    }
                  public static double[] terraformer(int nivel) {
        double[] recursos = new double[4];

        double metal = (0 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double cristal = (50000 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double deuterio = (100000 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double energia=(1000 * (1 - Math.pow(2, nivel)) / (1 - 2));
        recursos[0] = metal;
        recursos[1] = cristal;
        recursos[2] = deuterio;
        recursos[3]=energia;

        return recursos;
    }
                  
               public static double[] depositoAlianza(int nivel) {
        double[] recursos = new double[3];

        double metal = (20000 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double cristal = (40000 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double deuterio = (0 * (1 - Math.pow(2, nivel)) / (1 - 2));
        recursos[0] = metal;
        recursos[1] = cristal;
        recursos[2] = deuterio;

        return recursos;
    }       
                              public static double[] silo(int nivel) {
        double[] recursos = new double[3];

        double metal = (20000 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double cristal = (40000 * (1 - Math.pow(2, nivel)) / (1 - 2));
        double deuterio = (1000 * (1 - Math.pow(2, nivel)) / (1 - 2));
        recursos[0] = metal;
        recursos[1] = cristal;
        recursos[2] = deuterio;

        return recursos;
    }   
                              

}
