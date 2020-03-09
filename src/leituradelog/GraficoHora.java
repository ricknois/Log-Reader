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
public class GraficoHora {
     public static void grafico(List<Dados>lista) throws FileNotFoundException{
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            
            dataset.addValue(CalculosHora.zeroum(lista),"Acessos", "0 - 1");
            dataset.addValue(CalculosHora.umdois(lista),"Acessos", "1 - 2");
            dataset.addValue(CalculosHora.doistres(lista),"Acessos", "2 - 3");
            dataset.addValue(CalculosHora.tresquatro(lista),"Acessos", "3 - 4");
            dataset.addValue(CalculosHora.quatrocinco(lista),"Acessos", "4 - 5");
            dataset.addValue(CalculosHora.cincoseis(lista),"Acessos", "5 - 6");
            dataset.addValue(CalculosHora.seissete(lista),"Acessos", "6 - 7");
            dataset.addValue(CalculosHora.seteoito(lista),"Acessos", "7 - 8 ");
            dataset.addValue(CalculosHora.oitonove(lista),"Acessos", "8 - 9");
            dataset.addValue(CalculosHora.novedez(lista),"Acessos", "9 - 10");
            dataset.addValue(CalculosHora.dezonze(lista),"Acessos", "10 - 11");
            dataset.addValue(CalculosHora.onzedoze(lista),"Acessos", "11 - 12");
            dataset.addValue(CalculosHora.dozetreze(lista),"Acessos", "12 - 13");
            dataset.addValue(CalculosHora.trezeca(lista),"Acessos", "13 - 14");
            dataset.addValue(CalculosHora.caqui(lista),"Acessos", "14 - 15");
            dataset.addValue(CalculosHora.quidezess(lista),"Acessos", "15 - 16");
            dataset.addValue(CalculosHora.dezzesdezsete(lista),"Acessos", "16 - 17");
            dataset.addValue(CalculosHora.dezsetdezoito(lista),"Acessos", "17 - 18");
            dataset.addValue(CalculosHora.dezoitonove(lista),"Acessos", "18 - 19");
            dataset.addValue(CalculosHora.deznovevinte(lista),"Acessos", "19 - 20");
            dataset.addValue(CalculosHora.vintevinteum(lista),"Acessos", "20 - 21");
            dataset.addValue(CalculosHora.vinteeumvintedois(lista),"Acessos", "21 - 22");
            dataset.addValue(CalculosHora.vinteedoisvintetres(lista),"Acessos", "22 - 23");
            dataset.addValue(CalculosHora.vintetreszero(lista),"Acessos", "23 - 0");

            
            
            
            

            
            
            JFreeChart criaGrafico = ChartFactory.createLineChart("Grafico de acessos por classes de horas", "Classes de horas", "Acessos", dataset, PlotOrientation.VERTICAL, true, true, true);
            try{
                JOptionPane.showMessageDialog(null, "Gerando Grafico...");            
                OutputStream png = new FileOutputStream("GraficoHoras.png");
                ChartUtilities.writeChartAsPNG(png, criaGrafico, 1000, 1000);
                png.close();
            }catch(IOException io){
            JOptionPane.showMessageDialog(null, "erro");            
            }
            JOptionPane.showMessageDialog(null, "Grafico Gerado");            
        }
}
    
    

