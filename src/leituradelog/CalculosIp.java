package leituradelog;
import java.util.List;
public class CalculosIp {
        public static String modaIp(List<Dados>lista){
        int qtdeNav[] = new int[lista.size()];
        String ip, ipmais = null;
        String result;
        int ipmaior=0;
        for (int l = 0; l < lista.size(); l++) {
            ip = lista.get(l).getIp();
            for (int i = 0; i < lista.size(); i++) {
              
                if(ip.equalsIgnoreCase(lista.get(i).getIp())){ 
                    qtdeNav[l] = qtdeNav[l]+1;                   
                }
            }
            
        }
        for(int o = 0; o<lista.size(); o++){
            if(qtdeNav[o]>ipmaior){
                ipmaior = qtdeNav[o];
                ipmais = lista.get(o).getIp();
            }
        }
           result = "O ip com mais acessos é o "+ipmais+", ele possui "+ipmaior+ " acessos"+"\n";
        return result;

        
}
        public static double mediaIP(List<Dados>lista){
            int qtdeNav[] = new int[lista.size()];
        String ip, ipmais = null;
        double result;
        double ipmaior=0;
        for (int l = 0; l < lista.size(); l++) {
            ip = lista.get(l).getIp();
            for (int i = 0; i < lista.size(); i++) {
              
                if(ip.equalsIgnoreCase(lista.get(i).getIp())){ 
                    qtdeNav[l] = qtdeNav[l]+1;                   
                }
            }
            
        }
        for(int o = 0; o<lista.size(); o++){
            if(qtdeNav[o]>ipmaior){
                ipmaior = qtdeNav[o];
                ipmais = lista.get(o).getIp();
            }
        }
        result = lista.size()/ipmaior;
        return result;
            
        }
        public static double medianaIP(List<Dados>lista){
            float result = 0;
        for (Dados elem : lista) {
        int posicaoIP;

            if(lista.size() %2!= 0 ){
              posicaoIP = ((lista.size()+1) / 2) - 1;
            }
            else{
              posicaoIP = Math.round((lista.size()+1) / 2)-1;             
            result = (posicaoIP + posicaoIP+1)/2;
            }    
         
        } 
        return result;  
            
        }
        public static double auxIP(List<Dados>lista){
                    int qtdeNav[] = new int[lista.size()];
        String ip, ipmais = null;
        double result;
        double ipmaior=0;
        for (int l = 0; l < lista.size(); l++) {
            ip = lista.get(l).getIp();
            for (int i = 0; i < lista.size(); i++) {
              
                if(ip.equalsIgnoreCase(lista.get(i).getIp())){ 
                    qtdeNav[l] = qtdeNav[l]+1;                   
                }
            }
            
        }
        for(int o = 0; o<lista.size(); o++){
            if(qtdeNav[o]>ipmaior){
                ipmaior = qtdeNav[o];
                ipmais = lista.get(o).getIp();
            }
        }
           result = ipmaior;
        return result;
            
            
        }
        public static double varIP(List<Dados>lista){
            double xi = 0;
		double media;
		media = mediaIP(lista);

		for (Dados pais : lista) {
			xi += Math.pow((auxIP(lista) - media), 2);
		}
		return xi / lista.size();
        }
        public static double dpIP(List<Dados>lista){
         return  Math.sqrt(varIP(lista));
        }

        }
    

