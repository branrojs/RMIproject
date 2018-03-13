package SERVIDOR;

import RMIEJEMPLO.RMIEJEMPLO;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import SERVIDOR.Mysqlmetods;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;
import java.sql.Statement;


public class RMISERVIDOR extends UnicastRemoteObject implements RMIEJEMPLO{
   
 public RMISERVIDOR() throws RemoteException{
        
        super();
    }
 
     Connection conn = null;
    String myDriver = "org.gjt.mm.mysql.Driver";
    String myUrl = "jdbc:mysql://localhost:3306/bingo";
    String user = "root";
    String pass = "luisfernando";
    @Override
  public String crear_carton() throws RemoteException{
      //update para carton nuevo guardado en mysicual y  enviado al cliente :V
      
      //aca se crea el nuevo carton
      String serie = "";
      
      int [] fila1 = new int[3];
      int [] fila3 = new int[3];
      int [] fila2 = new int[3];
      
      for (int i = 0; i < 2; i++) {
           fila1[i] = 0;
           fila2[i] = 0;
           fila3[i] = 0;
     }
      
      while(true){
          if (fila1[0]==0 && fila1[1]== 0 && fila1[2]==0) {
               
             fila1[0]=  (int)(Math.random() * 4) + 1;
             fila1[1]=  (int)(Math.random() * 4) + 1;
             fila1[2]=  (int)(Math.random() * 4) + 1;
          }
          if (fila1[0]==fila1[1]) {
              fila1[1]=(int)(Math.random() * 4) + 1;
          }
          if (fila1[0]==fila1[2]) {
              fila1[2]=(int)(Math.random() * 4) + 1;
          }
          if (fila1[1]==fila1[2]) {
              fila1[2]=(int)(Math.random() * 4) + 1;
          }
          if (fila1[0]!=fila1[1] && fila1[0]!=fila1[2] && fila1[1]!=fila1[2] ) {
              break;
          }
        }
          while(true){
          if (fila2[0]==0 && fila2[1]== 0 && fila2[2]==0) {
               
             fila2[0]=  (int)(Math.random() * 4) + 6;
             fila2[1]=  (int)(Math.random() * 4) + 6;
             fila2[2]=  (int)(Math.random() * 4) + 6;
          }
          if (fila2[0]==fila2[1]) {
              fila2[1]=(int)(Math.random() * 4) + 6;
          }
          if (fila2[0]==fila2[2]) {
              fila2[2]=(int)(Math.random() * 4) + 6;
          }
          if (fila2[1]==fila2[2]) {
              fila2[2]=(int)(Math.random() * 4) + 6;
          }
          if (fila2[0]!=fila2[1] && fila2[0]!=fila2[2] && fila2[1]!=fila2[2] ) {
              break;
          }   
        }
           while(true){
          if (fila3[0]==0 && fila3[1]== 0 && fila3[2]==0) {
               
             fila3[0]=  (int)(Math.random() * 4) + 11;
             fila3[1]=  (int)(Math.random() * 4) + 11;
             fila3[2]=  (int)(Math.random() * 4) + 11;
          }
          if (fila3[0]==fila3[1]) {
              fila3[1]=(int)(Math.random() * 4) + 11;
          }
          if (fila3[0]==fila3[2]) {
              fila3[2]=(int)(Math.random() * 4) + 11;
          }
          if (fila3[1]==fila3[2]) {
              fila3[2]=(int)(Math.random() * 4) + 11;
          }
          if (fila3[0]!=fila3[1] && fila3[0]!=fila3[2] && fila3[1]!=fila3[2] ) {
              break;
          }   
        }
          
       for (int i = 0; i < 3; i++) {
           serie=serie+String.valueOf(fila1[i])+" "+String.valueOf(fila2[i])+" "+String.valueOf(fila3[i])+" ";
       }
       
       //aca se actualizaria el carton
       
        System.out.println(serie);
       
      return serie;
  }
  
 @Override
   public String getnumero(String id) throws RemoteException{
     String num_carton="";
       try {
         //conecto con base de datos y agarro el numero creado arriba
         Mysqlmetods mysql = new Mysqlmetods();
         
         num_carton= mysql.get_num_carton(id);
         
         
         
     } catch (SQLException ex) {
         Logger.getLogger(RMISERVIDOR.class.getName()).log(Level.SEVERE, null, ex);
     }
     return num_carton;
   }
   
    @Override
    public void guardar_carton(String idd, String numd, String cartond) throws RemoteException {
        Mysqlmetods mysql = new Mysqlmetods();
        mysql.guardar_carton_bd(idd, numd, cartond);
        //si no inserta, probar con pasar el metodo de mysql aca
    }   
    
    @Override
    public String getcarton(String id) throws RemoteException  {
       String carton="";
        try{
        conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/bingo","root","luisfernando");
        Statement s = conn.createStatement();
        ResultSet rs = s.executeQuery ("SELECT carton FROM bingo.carton_bingo WHERE id_jugador ='"+id+"';");
        while (rs.next())
        {
             carton = rs.getString("carton");
        }
        conn.close();
        }catch(SQLException e){
            
        }
        return carton;
    }
    
    public static void main(String[] args) {
     
        try {
              Registry registro = LocateRegistry.createRegistry(7777);
            //7777 cadena para enlazar el cliente-server
    //registry : registro de objetos remotos. almacenar-recuperar            
            registro.rebind("Ejemplo Matematicas", new RMISERVIDOR());
            //rebind se usa para acceder al rmi
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }finally{
            System.out.println("Servidor Iniciado");
        }
        
        }

    

    
    }
    

