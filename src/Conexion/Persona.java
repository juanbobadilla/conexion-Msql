
package Conexion;
import java.sql.*;

import javax.swing.JOptionPane;
import org.omg.CORBA.ORB;
import proyectoconect.conectar;


public class Persona {
    
    public class Persona extends datosApp.datosPOA{
        private ORB orb;
        
        public boolean InsertarPersona(int identificacion, String nombre, String apellido1, String apellido2, String genero){
        boolean resultado=false;
        try{
            String query="INSERT INTO datos(identificacion, nombre, apellido1, apellido2, genero) VALUES ("+identificacion+","+nombre+","+apellido1+","+apellido2+","+genero+") ";
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ocurrio un error"+ e.getMessage());
            }
        return resultado;
        }
        
        
    }
    
    
}
