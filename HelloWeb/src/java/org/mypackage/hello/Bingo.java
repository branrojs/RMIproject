
package org.mypackage.hello;


import RMIEJEMPLO.RMIEJEMPLO;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.simple.JSONObject;
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Bingo {
    
    private String bingo[]=new String[9];
    private String num_carton;
    private String idCliente;

    public String getNum_carton() {
        return num_carton;
    }
    
    public String getIdCliente() {
        
        return idCliente;
    }

    public void setIdCliente(String idCliente) throws RemoteException, NotBoundException {
        this.num_carton = num_carton=String.valueOf((int)(Math.random() * 300) + 1000);
        setCarton();
        this.idCliente = idCliente;
    }
   
    public String getsaveCarton() throws RemoteException, NotBoundException{
        Registry registro = LocateRegistry.getRegistry("127.0.0.1",7777);
        RMIEJEMPLO interfaz = (RMIEJEMPLO)registro.lookup("Ejemplo Matematicas");
        String serie= "";
        for (int i = 0; i < this.bingo.length; i++) {
            serie = serie+this.bingo[i]+" ";
        }
        System.out.println(this.idCliente + " " +this.num_carton +" " +serie );
        
        interfaz.guardar_carton(this.idCliente,this.num_carton, serie);
        return "Tu carton ha sido guardado en nuestra base de datos, si quieres jugar, ingresa tu numero de carton y ID registrado para jugar.";
    }
    public String getBingo1(){
        return bingo[0];
    }
    public String getBingo2(){
        return bingo[1];
    }
    public String getBingo3(){
        return bingo[2];
    }
    public String getBingo4(){
        return bingo[3];
    }
    public String getBingo5(){
        return bingo[4];
    }
    public String getBingo6(){
        return bingo[5];
    }
    public String getBingo7(){
        return bingo[6];
    }
    public String getBingo8(){
        return bingo[7];
    }
    public String getBingo9(){
        return bingo[8];
    }
    
    public void setCarton() throws RemoteException, NotBoundException{
        String serie = "";
        
                Registry registro = LocateRegistry.getRegistry("127.0.0.1",7777);
                RMIEJEMPLO interfaz = (RMIEJEMPLO)registro.lookup("Ejemplo Matematicas");
                serie = interfaz.crear_carton();
                System.out.println("aca------------->"+serie);
                bingo = serie.split(" ");
                this.bingo=serie.split(" ");

            
            
    }
    
    @WebServlet(name = "Servlet_Bingo", urlPatterns = {"/Servlet_Bingo"})
public class Servlet_Bingo extends HttpServlet{
    
    private String NOMBRE=null;
   
 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        
       
    } 
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        processRequest(request, response);
    } 
 
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        processRequest(request, response);
    }
 
 
    @Override
    public String getServletInfo() {
        return "Este servlet lee los datos de un formulario" +
                "y los muestra en pantalla";
    }
    }
        
        
        
    }

