/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.)
 */

package ogame;

import com.db4o.*;
import javax.swing.UIManager;
/**
 *
 * @author carlo_000
 */
public class OGAME {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      
   // ObjectContainer bd = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"ogame.db4o");
    try{
        
//         cambio de aparencia
         try {
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (Exception e) {

    }
   Menu tx = new Menu();
 
}finally{
   // bd.close();
}}
}
