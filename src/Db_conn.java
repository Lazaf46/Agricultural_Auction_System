import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Db_conn {
    private static Db_conn conn = null;
    private Db_conn(){}
    public static Db_conn getConn(){
        if(conn == null){
            conn = new Db_conn();
        }
        return conn;
    }
    
   public static void db_conn() throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/auction", "root", "root");
           // System.out.println("Successful");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Db_conn.class.getName()).log(Level.SEVERE, null, ex);
          
        }
   }
}
        

