package leituradelog;
import java.io.FileNotFoundException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;

public class Grafico {
        public static void grafico(List<Dados>lista) throws FileNotFoundException{
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            
            dataset.addValue(CalculosNavegador.mozilaNav(lista),"uso", "Firefox");
            dataset.addValue(CalculosNavegador.edgeNav(lista),"uso", "Edge");
            dataset.addValue(CalculosNavegador.chromeNav(lista),"uso", "Chrome");
            dataset.addValue(CalculosNavegador.operaNav(lista),"uso", "Opera");
            dataset.addValue(CalculosNavegador.safariNav(lista),"uso", "Safari");
            
            JFreeChart criaGrafico = ChartFactory.createLineChart("Grafico de uso de nagadores", "Navegador", "Uso", dataset, PlotOrientation.VERTICAL, true, true, true);
            try{
                JOptionPane.showMessageDialog(null, "Gerando Grafico");            
                OutputStream png = new FileOutputStream("GraficoNavegadores.png");
                ChartUtilities.writeChartAsPNG(png, criaGrafico, 1000, 1000);
                png.close();
            }catch(IOException io){
            JOptionPane.showMessageDialog(null, "erro");            
            }
            JOptionPane.showMessageDialog(null, "Grafico Gerado");            
        }
}
