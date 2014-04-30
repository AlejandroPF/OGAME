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
public class Energia {
    
            public static double plantaEnergiaSolar(int nivel) {
            double energia;
            energia = 20 * nivel * Math.pow(1.1, nivel);
            return energia;
        }

        public static double plantaFusion(int nivel, int lvlenergia) {
            double energia;
            energia = 30 * nivel * Math.pow((1.05 + lvlenergia * 0.01), nivel);
            return energia;

        }

        public static double satelitesSolares(int tempmax) {
            //rendodear

            double energia;
            energia = ((tempmax + 140) / 6);
            return energia;
        }
}
