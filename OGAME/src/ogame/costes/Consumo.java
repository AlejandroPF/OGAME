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
public class Consumo {
      public static double consumoMinaMetal(int nivel) {
            double energia;
            energia = 10 * nivel * Math.pow(1.1, nivel);
            return energia;
        }

        public static double consumoMinaCristal(int nivel) {
            double energia;
            energia = 10 * nivel * Math.pow(1.1, nivel);
            return energia;
        }

        public static double consumoSinteDeuterio(int nivel) {
            double energia;
            energia = 20 * nivel * Math.pow(1.1, nivel);
            return energia;
        }

        public static double consumoPlantaFusion(int nivel) {
            double deu;
            deu = 10 * nivel * Math.pow(1.1, nivel);
            return deu;
        }
}
