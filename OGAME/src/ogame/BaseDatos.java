/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ogame;

import com.db4o.ObjectContainer;

/**
 *
 * @author ASUS
 */
public class BaseDatos {
  public static void meterPlanetas(ObjectContainer bd,int galaxia,int sistema,int posicion) {
        planeta a1 = new planeta();
        bd.store(a1);
        System.out.println(a1.getNombre() + " Almacenado");

  }
}
