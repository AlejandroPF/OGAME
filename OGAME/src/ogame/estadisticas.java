/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ogame;
import org.jfree.chart.ChartFactory; 
    import org.jfree.chart.ChartFrame; 
    import org.jfree.chart.JFreeChart; 
    import org.jfree.chart.plot.PlotOrientation; 
    import org.jfree.data.category.DefaultCategoryDataset; 
    import org.jfree.data.general.DefaultPieDataset;
/**
 *
 * @author ASUS
 */
public class estadisticas {
    public static void produccion(){
        int metal=70;
        int cristal=50;
        int deuterio=10;
        DefaultPieDataset dataset = new DefaultPieDataset();
        
        dataset.setValue("Metal", metal); 
    dataset.setValue("Cristal", cristal); 
    dataset.setValue("Deuterio", deuterio);
    
    JFreeChart grafica = ChartFactory.createPieChart3D( 
    "Grafica pastel", // El nombre de la gráfica 
    dataset, // El arreglo de datos 
    true, // Indica si lleva leyenda 
    true, // Indica si lleva tooltips 
    false); // Indica si son URls 
    
    ChartFrame frame = new ChartFrame("Graficador", grafica); 
     frame.pack(); 
    frame.setVisible(true); 
    }
    public static void main(String[] args) {
        produccion();
    }
}
