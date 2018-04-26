
package proyectoconect;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conectar {
    
    /*creamos metodo para conectar*/
    public Connection conex;
  
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conex=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/formulario","root","");
            System.out.println("CONEXION ESTABLECIDA...!!");
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(conectar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(conectar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return conex;
    }
    
    
    
    
    
    
}
