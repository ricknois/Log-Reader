package leituradelog;
import java.util.List;
public class CalculosNavegador {
    public static String modaNav(List<Dados>lista){

            
        
        int qtdeNav[] = new int[lista.size()];
        String nav, navmais = null;
        String result;
        int navmaior=0;
        for (int l = 0; l < lista.size(); l++) {
            nav = lista.get(l).getNavegador();  
            for (int i = 0; i < lista.size(); i++) {
                
                if(nav.equalsIgnoreCase(lista.get(i).getNavegador())){ 
                    qtdeNav[l] = qtdeNav[l]+1;                   
                }
            }
        }
        for(int o = 0; o<lista.size(); o++){
            if(qtdeNav[o]>navmaior){
                navmaior = qtdeNav[o];
                navmais = lista.get(o).getNavegador();
            }
        }
           result = "O navegador mais usado é o "+navmais+", ele foi utilizado "+navmaior+ " vezes"+"\n";
        return result;

        
    }
     public static int mozilaNav(List<Dados>lista){
       int qtde = 0;
        for (Dados elem : lista) {
            if(elem.getNavegador().equalsIgnoreCase("mozilla")|| elem.getNavegador().equalsIgnoreCase("firefox"))
                qtde++;
                
            
        }
        return qtde;
            
}
     public static int operaNav(List<Dados>lista){
       int qtde = 0;
        for (Dados elem : lista) {
            if(elem.getNavegador().equalsIgnoreCase("opera"))
                qtde++;
                
            
        }
        return qtde;
            
}
     public static int safariNav(List<Dados>lista){
       int qtde = 0;
        for (Dados elem : lista) {
            if(elem.getNavegador().equalsIgnoreCase("safari"))
                qtde++;
                
            
        }
        return qtde;
            
}
     public static int chromeNav(List<Dados>lista){
       int qtde = 0;
        for (Dados elem : lista) {
            if(elem.getNavegador().equalsIgnoreCase("chrome")|| elem.getNavegador().equalsIgnoreCase("google"))
                qtde++;
                
            
        }
        return qtde;
            
}
   public static int edgeNav(List<Dados>lista){
       int qtde = 0;
        for (Dados elem : lista) {
            if(elem.getNavegador().equalsIgnoreCase("edge")|| elem.getNavegador().equalsIgnoreCase("microsoft"))
                qtde++;
                
            
        }
        return qtde;
            
} 
       public static double ttNav(List<Dados>lista){
         return lista.size();
    }  

}
       
