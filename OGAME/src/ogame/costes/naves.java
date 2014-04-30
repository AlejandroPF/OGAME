/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ogame.costes;

/**
 *
 * @author ASUS
 */
public class naves {

    private int cligero;
    private int cpesado;
    private int crucero;
    private int nb;
    private int bombardero;
    private int destructor;
    private int pelotas;
    private int zodiacs;
    private int ngc;
    private int colonizador;
    private int reciclador;
    private int sondadelamuerte;
    private int satelite;

    public int getBombardero() {
        return bombardero;
    }

    public void setBombardero(int bombardero) {
        this.bombardero = bombardero;
    }

    public int getCligero() {
        return cligero;
    }

    public void setCligero(int cligero) {
        this.cligero = cligero;
    }

    public int getColonizador() {
        return colonizador;
    }

    public void setColonizador(int colonizador) {
        this.colonizador = colonizador;
    }

    public int getCpesado() {
        return cpesado;
    }

    public void setCpesado(int cpesado) {
        this.cpesado = cpesado;
    }

    public int getCrucero() {
        return crucero;
    }

    public void setCrucero(int crucero) {
        this.crucero = crucero;
    }

    public int getDestructor() {
        return destructor;
    }

    public void setDestructor(int destructor) {
        this.destructor = destructor;
    }

    public int getNb() {
        return nb;
    }

    public void setNb(int nb) {
        this.nb = nb;
    }

    public int getNgc() {
        return ngc;
    }

    public void setNgc(int ngc) {
        this.ngc = ngc;
    }

    public int getPelotas() {
        return pelotas;
    }

    public void setPelotas(int pelotas) {
        this.pelotas = pelotas;
    }

    public int getReciclador() {
        return reciclador;
    }

    public void setReciclador(int reciclador) {
        this.reciclador = reciclador;
    }

    public int getSatelite() {
        return satelite;
    }

    public void setSatelite(int satelite) {
        this.satelite = satelite;
    }

    public int getSondadelamuerte() {
        return sondadelamuerte;
    }

    public void setSondadelamuerte(int sondadelamuerte) {
        this.sondadelamuerte = sondadelamuerte;
    }

    public int getZodiacs() {
        return zodiacs;
    }

    public void setZodiacs(int zodiacs) {
        this.zodiacs = zodiacs;
    }

    public static double[] cligero(int cantidad) {
        double[] recursos = new double[3];
        double metal = (3000 * cantidad);
        double cristal = (1000 * cantidad);
        double deuterio = (0 * cantidad);
        double capacidad = 800;
        recursos[0] = metal;
        recursos[1] = cristal;
        recursos[2] = deuterio;
        recursos[3] = capacidad;
        return recursos;
    }

    public static double[] cpesado(int cantidad) {
        double[] recursos = new double[3];
        double metal = (6000 * cantidad);
        double cristal = (4000 * cantidad);
        double deuterio = (0 * cantidad);
        double capacidad = 100;
        recursos[0] = metal;
        recursos[1] = cristal;
        recursos[2] = deuterio;
        recursos[3] = capacidad;
        return recursos;
    }

    public static double[] crucero(int cantidad) {
        double[] recursos = new double[3];
        double metal = (20000 * cantidad);
        double cristal = (7000 * cantidad);
        double deuterio = (2000 * cantidad);
        double capacidad = 800;
        recursos[0] = metal;
        recursos[1] = cristal;
        recursos[2] = deuterio;
        recursos[3] = capacidad;
        return recursos;
    }

    public static double[] nb(int cantidad) {
        double[] recursos = new double[3];
        double metal = (45000 * cantidad);
        double cristal = (15000 * cantidad);
        double deuterio = (0 * cantidad);
        double capacidad = 1500;
        recursos[0] = metal;
        recursos[1] = cristal;
        recursos[2] = deuterio;
        return recursos;
    }

    public static double[] bombardero(int cantidad) {
        double[] recursos = new double[3];
        double metal = (50000 * cantidad);
        double cristal = (25000 * cantidad);
        double deuterio = (15000 * cantidad);
        double capacidad = 500;
        recursos[0] = metal;
        recursos[1] = cristal;
        recursos[2] = deuterio;
        recursos[3] = capacidad;
        return recursos;
    }

    public static double[] destructor(int cantidad) {
        double[] recursos = new double[3];
        double metal = (60000 * cantidad);
        double cristal = (50000 * cantidad);
        double deuterio = (15000 * cantidad);
        double capacidad = 2000;
        recursos[0] = metal;
        recursos[1] = cristal;
        recursos[2] = deuterio;
        recursos[3] = capacidad;
        return recursos;
    }

    public static double[] pelotas(int cantidad) {
        double[] recursos = new double[3];
        double metal = (5000000 * cantidad);
        double cristal = (4000000 * cantidad);
        double deuterio = (1000000 * cantidad);
        double capacidad = 1000000;
        recursos[0] = metal;
        recursos[1] = cristal;
        recursos[2] = deuterio;
        recursos[3] = capacidad;
        return recursos;
    }

    public static double[] zodiacs(int cantidad) {
        double[] recursos = new double[3];
        double metal = (2000 * cantidad);
        double cristal = (2000 * cantidad);
        double deuterio = (0 * cantidad);
        double capacidad = 5000;
        recursos[0] = metal;
        recursos[1] = cristal;
        recursos[2] = deuterio;
        recursos[3] = capacidad;
        return recursos;
    }

    public static double[] ngc(int cantidad) {
        double[] recursos = new double[3];
        double metal = (6000 * cantidad);
        double cristal = (6000 * cantidad);
        double deuterio = (0 * cantidad);
        double capacidad = 25000;
        recursos[0] = metal;
        recursos[1] = cristal;
        recursos[2] = deuterio;
        recursos[3] = capacidad;
        return recursos;
    }

    public static double[] colonizador(int cantidad) {
        double[] recursos = new double[3];
        double metal = (10000 * cantidad);
        double cristal = (20000 * cantidad);
        double deuterio = (10000 * cantidad);
        double capacidad = 7500;
        recursos[0] = metal;
        recursos[1] = cristal;
        recursos[2] = deuterio;
        recursos[3] = capacidad;
        return recursos;
    }

    public static double[] reciclador(int cantidad) {
        double[] recursos = new double[3];
        double metal = (10000 * cantidad);
        double cristal = (6000 * cantidad);
        double deuterio = (2000 * cantidad);
        double capacidad = 20000;
        recursos[0] = metal;
        recursos[1] = cristal;
        recursos[2] = deuterio;
        recursos[3] = capacidad;
        return recursos;
    }

    public static double[] sondaDeLaMuerte(int cantidad) {
        double[] recursos = new double[3];
        double metal = (0 * cantidad);
        double cristal = (1000 * cantidad);
        double deuterio = (0 * cantidad);
        double capacidad = 0;
        recursos[0] = metal;
        recursos[1] = cristal;
        recursos[2] = deuterio;
        recursos[3] = capacidad;
        return recursos;
    }

    public static double[] satelite(int cantidad) {
        double[] recursos = new double[3];
        double metal = (0 * cantidad);
        double cristal = (2000 * cantidad);
        double deuterio = (500 * cantidad);
        double capacidad = 0;
        recursos[0] = metal;
        recursos[1] = cristal;
        recursos[2] = deuterio;
        recursos[3] = capacidad;
        return recursos;
    }
}