package Cliente;


import RMIEJEMPLO.RMIEJEMPLO;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Cliente {
    
     public static void main(String[] args) {
         Cliente client = new Cliente();
         client.connectserver();
     }
    
    private void connectserver(){
        try {
            
            Registry registro = LocateRegistry.getRegistry("127.0.0.1",7777);
            RMIEJEMPLO interfaz = (RMIEJEMPLO)registro.lookup("Ejemplo Matematicas");
            String series="";
            String bingo[]=new String[10];
            series = interfaz.crear_carton();
            bingo = series.split(" ");
            for (int i = 0; i < 9; i++) {
                System.out.print("|"+bingo[i]+"| ");
                if ((i+1)%3==0) {
                   System.out.println(""); 
                }
            }
            
            
        
        }catch (Exception ex){
              System.out.println(ex);
        }
    }
}
