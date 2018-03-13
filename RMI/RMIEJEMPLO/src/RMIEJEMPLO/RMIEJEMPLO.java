package RMIEJEMPLO;


import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIEJEMPLO extends Remote {
   
     
     public String getnumero(String id) throws RemoteException;
     public String crear_carton() throws RemoteException;
     public void guardar_carton(String idd, String numd, String cartond) throws RemoteException;
     public String getcarton(String id) throws RemoteException;
}
