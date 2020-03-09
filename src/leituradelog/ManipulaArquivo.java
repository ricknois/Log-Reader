package leituradelog;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ManipulaArquivo {
        public static List<Dados> lerDados(String caminho){
        Dados novo;
        String linha;
        String[] dados;
        List<Dados> lista = new ArrayList<>();
        File arquivo = new File(caminho);
            
        try{
            Scanner leia = new Scanner(new FileInputStream(arquivo));
            while(leia.hasNext()){
                novo = new Dados();
                linha = leia.nextLine();
                if (!linha.isEmpty()){
                dados = linha.split("-");
                novo.setIp(dados[0]);
                novo.setHora(Double.parseDouble(dados[1]));
                novo.setHoras(dados[1]);
                if (dados.length>=3){
                if(!dados[2].isEmpty()){
                novo.setNavegador(dados[2]);
                lista.add(novo);
                }else{
                novo.setNavegador("indefinido");
                }
                }
                }
            }
            return lista;
        }
        catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Arquivo nao encontrado");
            return null;
        }
    }

}
