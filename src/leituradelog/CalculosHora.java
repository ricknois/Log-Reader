package leituradelog;
import java.util.ArrayList;
import java.util.List;
public class CalculosHora {
    
    
    public static String moda(List<Dados>lista){
        int qtdeNav[] = new int[lista.size()];
        String hr, hrmais = null;
        String result;
        int hrmaior=0;
        for (int l = 0; l < lista.size(); l++) {
            hr = lista.get(l).getHoras();
            for (int i = 0; i < lista.size(); i++) {
              
                if(hr.equalsIgnoreCase(lista.get(i).getHoras())){ 
                    qtdeNav[l] = qtdeNav[l]+1;                   
                }
            }
            
        }
        for(int o = 0; o<lista.size(); o++){
            if(qtdeNav[o]>hrmaior){
                hrmaior = qtdeNav[o];
                hrmais = lista.get(o).getHoras();
            }
        }
           result = "A hora de maior acesso é: "+hrmais+", possuindo "+hrmaior+ " acessos"+"\n";
        return result;
    }

    public static int zeroum(List<Dados>lista){
       int qtde = 0;
        for (Dados elem : lista) {
            if(elem.getHora()==0 | elem.getHora()==1 )
                qtde++;
                
            
        }
        return qtde;
       
        
    }
    public static int umdois(List<Dados>lista){
       int qtde = 0;
        for (Dados elem : lista) {
            if(elem.getHora()==1 | elem.getHora()==2 )
                qtde++;
                
            
        }
        return qtde;
       
        
    }    
    public static int doistres(List<Dados>lista){
      int qtde = 0;
        for (Dados elem : lista) {
            if(elem.getHora()==2 | elem.getHora()==3 )
                qtde++;
                
            
        }
        return qtde;
       
        
    }
    public static int tresquatro(List<Dados>lista){
       int qtde = 0;
        for (Dados elem : lista) {
            if(elem.getHora()==3 | elem.getHora()==4 )
                qtde++;
                
            
        }
        return qtde;
       
        
    }
        
    
        
    
    public static int quatrocinco(List<Dados>lista){
      int qtde = 0;
        for (Dados elem : lista) {
            if(elem.getHora()==4 | elem.getHora()==5 )
                qtde++;
                
            
        }
        return qtde;
       
        
    }
    public static int cincoseis(List<Dados>lista){
       int qtde = 0;
        for (Dados elem : lista) {
            if(elem.getHora()==5 | elem.getHora()==6 )
                qtde++;
                
            
        }
        return qtde;
       
        
    }
    public static int seissete(List<Dados>lista){
      int qtde = 0;
        for (Dados elem : lista) {
            if(elem.getHora()==6 | elem.getHora()==7 )
                qtde++;
                
            
        }
        return qtde;
       
        
    }
    public static int seteoito(List<Dados>lista){
       int qtde = 0;
        for (Dados elem : lista) {
            if(elem.getHora()==7 | elem.getHora()==8 )
                qtde++;
                
            
        }
        return qtde;
       
        
    }
    public static int oitonove(List<Dados>lista){
       int qtde = 0;
        for (Dados elem : lista) {
            if(elem.getHora()==8 | elem.getHora()==9 )
                qtde++;
                
            
        }
        return qtde;
       
        
    }
    public static int novedez(List<Dados>lista){
       int qtde = 0;
        for (Dados elem : lista) {
            if(elem.getHora()==9 | elem.getHora()==10 )
                qtde++;
                
            
        }
        return qtde;
       
        
    }
    public static int dezonze(List<Dados>lista){
       int qtde = 0;
        for (Dados elem : lista) {
            if(elem.getHora()==10 | elem.getHora()==11 )
                qtde++;
                
            
        }
        return qtde;
       
        
    }
    public static int onzedoze(List<Dados>lista){
      int qtde = 0;
        for (Dados elem : lista) {
            if(elem.getHora()==11 | elem.getHora()==12 )
                qtde++;
                
            
        }
        return qtde;
       
        
    }
    public static int dozetreze(List<Dados>lista){
      int qtde = 0;
        for (Dados elem : lista) {
            if(elem.getHora()==12 | elem.getHora()==13 )
                qtde++;
                
            
        }
        return qtde;
       
        
    }
    public static int trezeca(List<Dados>lista){
      int qtde = 0;
        for (Dados elem : lista) {
            if(elem.getHora()==13 | elem.getHora()==14 )
                qtde++;
                
            
        }
        return qtde;
       
        
    }
    public static int caqui(List<Dados>lista){
      int qtde = 0;
        for (Dados elem : lista) {
            if(elem.getHora()==14 | elem.getHora()==15 )
                qtde++;
                
            
        }
        return qtde;
       
        
    }
    public static int quidezess(List<Dados>lista){
      int qtde = 0;
        for (Dados elem : lista) {
            if(elem.getHora()==15 | elem.getHora()==16 )
                qtde++;
                
            
        }
        return qtde;
       
        
    }
    public static int dezzesdezsete(List<Dados>lista){
      int qtde = 0;
        for (Dados elem : lista) {
            if(elem.getHora()==16 | elem.getHora()==17 )
                qtde++;
                
            
        }
        return qtde;
       
        
    }
    public static int dezsetdezoito(List<Dados>lista){
      int qtde = 0;
        for (Dados elem : lista) {
            if(elem.getHora()==17 | elem.getHora()==18 )
                qtde++;
                
            
        }
        return qtde;
       
        
    }
    public static int dezoitonove(List<Dados>lista){
      int qtde = 0;
        for (Dados elem : lista) {
            if(elem.getHora()==18 | elem.getHora()==19 )
                qtde++;
                
            
        }
        return qtde;
       
        
    }public static int deznovevinte(List<Dados>lista){
      int qtde = 0;
        for (Dados elem : lista) {
            if(elem.getHora()==19 | elem.getHora()==20 )
                qtde++;
                
            
        }
        return qtde;
       
        
    }
    public static int vintevinteum(List<Dados>lista){
      int qtde = 0;
        for (Dados elem : lista) {
            if(elem.getHora()==20 | elem.getHora()==21 )
                qtde++;
                
            
        }
        return qtde;
       
        
    }
    public static int vinteeumvintedois(List<Dados>lista){
      int qtde = 0;
        for (Dados elem : lista) {
            if(elem.getHora()==21 | elem.getHora()==22 )
                qtde++;
                
            
        }
        return qtde;
       
        
    }
    public static int vinteedoisvintetres(List<Dados>lista){
      int qtde = 0;
        for (Dados elem : lista) {
            if(elem.getHora()==22 | elem.getHora()==23 )
                qtde++;
                
            
        }
        return qtde;
       
        
    }
    public static int vintetreszero(List<Dados>lista){
      int qtde = 0;
        for (Dados elem : lista) {
            if(elem.getHora()==23 | elem.getHora()==20 )
                qtde++;
                
            
        }
        return qtde;
       
        
    }
    
    
    public static double mediaHr(List<Dados>lista){
        int qtdeNav[] = new int[lista.size()];
        String hr, hrmais = null;
        String result;
        int hrmaior=0;
        for (int l = 0; l < lista.size(); l++) {
            hr = lista.get(l).getHoras();
            for (int i = 0; i < lista.size(); i++) {
              
                if(hr.equalsIgnoreCase(lista.get(i).getHoras())){ 
                    qtdeNav[l] = qtdeNav[l]+1;                   
                }
            }
            
        }
        for(int o = 0; o<lista.size(); o++){
            if(qtdeNav[o]>hrmaior){
                hrmaior = qtdeNav[o];
                hrmais = lista.get(o).getHoras();
            }
        }
           
        return lista.size()/hrmaior;
    }
    public static float medianaHr(List<Dados>lista){
        float result = 0;
        for (Dados elem : lista) {
        int posicaohora;

            if(lista.size() %2!= 0 ){
              posicaohora = ((lista.size()+1) / 2) - 1;
            }
            else{
              posicaohora = Math.round((lista.size()+1) / 2)-1;             
            result = (posicaohora + posicaohora+1)/2;
            }    
         
        } 
        return result;  
        
    }
    public static double varHr(List<Dados>lista){
        double xi = 0;
		double media;
		media = mediaHr(lista);

		for (Dados dados : lista) {
			xi += Math.pow((dados.getHora()- media), 2);
		}
		return xi / lista.size();
    }
       
      
           
        
    public static double dpHr(List<Dados>lista){
         return Math.sqrt(varHr(lista));
    }    
    public static double ttHr(List<Dados>lista){
         return lista.size();
    }  































}
    

