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
public class Minas {
            public static double minaMetal(int nivel) {
            double produccion;
            produccion = 30 * nivel * Math.pow(1.1, nivel);
            return produccion;
        }

        public static double minaCristal(int nivel) {
            double produccion;
            produccion = 20 * nivel * Math.pow(1.1, nivel);
            return produccion;
        }

        public static double sinteDeuterio(int nivel, int tempmax) {
          //rendodear

            double produccion;
            produccion = (10 * nivel * Math.pow(1.1, nivel)) * (1.44 - 0.004 * tempmax);
            return produccion;
        }
}
