/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ogame;

/**
 *
 * @author ASUS
 */
public class planeta {

    private String nombre;
    private int galaxia;
    private int sistema;
    private int posicion;

    public int getGalaxia() {
        return galaxia;
    }

    public void setGalaxia(int galaxia) {
        this.galaxia = galaxia;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getSistema() {
        return sistema;
    }

    public void setSistema(int sistema) {
        this.sistema = sistema;
    }
    private boolean luna;
    private int campos;
    private int camposocupados;
    //camposocupados es la suma de todos los niveles de edificios +3 por terraformer
    //edificios
    private int minametal;
    private int minacristal;
    private int sintedeu;
    private int plantasolar;
    private int plantafusion;
    private int almacenmetal;
    private int almacencristal;
    private int contdeu;
    private int esconditemetal;
    private int esconditecristal;
    private int esconditedeu;
    private int fabrobots;
    private int hangar;
    private int labinves;
    private int depositoal;
    private int silo;
    private int nanos;
    private int terraformer;
    //defensas
    private int lanza;
    private int lp;
    private int lg;
    private int ionicos;
    private int gauss;
    private int plasma;
    private int cupulap;
    private int cupulag;
    private int pepinos;
    private int antipepinos;
    //satelites
    private int satelites;

    public int getAlmacencristal() {
        return almacencristal;
    }

    public void setAlmacencristal(int almacencristal) {
        this.almacencristal = almacencristal;
    }

    public int getAlmacenmetal() {
        return almacenmetal;
    }

    public void setAlmacenmetal(int almacenmetal) {
        this.almacenmetal = almacenmetal;
    }

    public int getAntipepinos() {
        return antipepinos;
    }

    public void setAntipepinos(int antipepinos) {
        this.antipepinos = antipepinos;
    }

    public int getCampos() {
        return campos;
    }

    public void setCampos(int campos) {
        this.campos = campos;
    }

    public int getCamposocupados() {
        return camposocupados;
    }

    public void setCamposocupados(int camposocupados) {
        this.camposocupados = camposocupados;
    }

    public int getContdeu() {
        return contdeu;
    }

    public void setContdeu(int contdeu) {
        this.contdeu = contdeu;
    }

   

    public int getCupulag() {
        return cupulag;
    }

    public void setCupulag(int cupulag) {
        this.cupulag = cupulag;
    }

    public int getCupulap() {
        return cupulap;
    }

    public void setCupulap(int cupulap) {
        this.cupulap = cupulap;
    }

    public int getDepositoal() {
        return depositoal;
    }

    public void setDepositoal(int depositoal) {
        this.depositoal = depositoal;
    }

    public int getEsconditecristal() {
        return esconditecristal;
    }

    public void setEsconditecristal(int esconditecristal) {
        this.esconditecristal = esconditecristal;
    }

    public int getEsconditedeu() {
        return esconditedeu;
    }

    public void setEsconditedeu(int esconditedeu) {
        this.esconditedeu = esconditedeu;
    }

    public int getEsconditemetal() {
        return esconditemetal;
    }

    public void setEsconditemetal(int esconditemetal) {
        this.esconditemetal = esconditemetal;
    }

    public int getFabrobots() {
        return fabrobots;
    }

    public void setFabrobots(int fabrobots) {
        this.fabrobots = fabrobots;
    }

    public int getGauss() {
        return gauss;
    }

    public void setGauss(int gauss) {
        this.gauss = gauss;
    }

    public int getHangar() {
        return hangar;
    }

    public void setHangar(int hangar) {
        this.hangar = hangar;
    }

    public int getIonicos() {
        return ionicos;
    }

    public void setIonicos(int ionicos) {
        this.ionicos = ionicos;
    }

    public int getLabinves() {
        return labinves;
    }

    public void setLabinves(int labinves) {
        this.labinves = labinves;
    }

    public int getLanza() {
        return lanza;
    }

    public void setLanza(int lanza) {
        this.lanza = lanza;
    }

    public int getLg() {
        return lg;
    }

    public void setLg(int lg) {
        this.lg = lg;
    }

    public int getLp() {
        return lp;
    }

    public void setLp(int lp) {
        this.lp = lp;
    }

    public boolean isLuna() {
        return luna;
    }

    public void setLuna(boolean luna) {
        this.luna = luna;
    }

    public int getMinacristal() {
        return minacristal;
    }

    public void setMinacristal(int minacristal) {
        this.minacristal = minacristal;
    }

    public int getMinametal() {
        return minametal;
    }

    public void setMinametal(int minametal) {
        this.minametal = minametal;
    }

    public int getNanos() {
        return nanos;
    }

    public void setNanos(int nanos) {
        this.nanos = nanos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPepinos() {
        return pepinos;
    }

    public void setPepinos(int pepinos) {
        this.pepinos = pepinos;
    }

    public int getPlantafusion() {
        return plantafusion;
    }

    public void setPlantafusion(int plantafusion) {
        this.plantafusion = plantafusion;
    }

    public int getPlantasolar() {
        return plantasolar;
    }

    public void setPlantasolar(int plantasolar) {
        this.plantasolar = plantasolar;
    }

    public int getPlasma() {
        return plasma;
    }

    public void setPlasma(int plasma) {
        this.plasma = plasma;
    }

    public int getSatelites() {
        return satelites;
    }

    public void setSatelites(int satelites) {
        this.satelites = satelites;
    }

    public int getSilo() {
        return silo;
    }

    public void setSilo(int silo) {
        this.silo = silo;
    }

    public int getSintedeu() {
        return sintedeu;
    }

    public void setSintedeu(int sintedeu) {
        this.sintedeu = sintedeu;
    }

    public int getTerraformer() {
        return terraformer;
    }

    public void setTerraformer(int terraformer) {
        this.terraformer = terraformer;
    }
    
}
