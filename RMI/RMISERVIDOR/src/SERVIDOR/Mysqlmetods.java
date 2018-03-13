
package SERVIDOR;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Mysqlmetods {
    Connection conn = null;
    String myDriver = "org.gjt.mm.mysql.Driver";
    String myUrl = "jdbc:mysql://localhost:3306/bingo";
    String user = "root";
    String pass = "luisfernando";
    public void guardar_carton_bd(String id, String num, String carton){
        try
            {
              //conn
              Class.forName(myDriver);
              conn = DriverManager.getConnection(myUrl,user,pass);
              //query
              String query = " insert into carton_bingo (idcarton_bingo,id_jugador,carton) values (?, ?, ?)";

              // create the mysql insert preparedstatement
              PreparedStatement preparedStmt = conn.prepareStatement(query);
              preparedStmt.setString(1,num);
              preparedStmt.setString(2,id);
              preparedStmt.setString(3, carton);

              // execute the preparedstatement
              preparedStmt.execute();
                
              conn.close();
            }
            catch (Exception e)
            {
              System.err.println("Got an exception!");
              System.err.println(e.getMessage());
            }
        System.out.println("Insertado exitoso");
    }
    
    public String get_num_carton(String idd) throws SQLException{
        String carton="";
        
        conn =DriverManager.getConnection("jdbc:mysql://localhost:3307/bingo","root","oveja");
        Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery ("SELECT idcarton_bingo FROM bingo.carton_bingo WHERE id_jugador ='"+idd+"';");
            while (rs.next())
            {
                 carton = rs.getString("idcarton_bingo");
            }
            conn.close();
        
        return carton;
    }
    
    public String get_carton(String idd){
        String carton="";
        try{
        conn =DriverManager.getConnection("jdbc:mysql://localhost:3307/bingo","root","oveja");
        Statement s = conn.createStatement();
        ResultSet rs = s.executeQuery ("SELECT carton FROM bingo.carton_bingo WHERE id_jugador ='"+idd+"';");
        while (rs.next())
        {
             carton = rs.getString("carton");
        }
        conn.close();
        }catch(SQLException e){
            
        }
        return carton;
        
    }
    
}
