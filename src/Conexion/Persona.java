
package Conexion;
import java.sql.*;

import javax.swing.JOptionPane;
import org.omg.CORBA.ORB;
import proyectoconect.conectar;



    public class Persona extends datosApp.datosPOA{
        private ORB orb;    
        conectar conex =new conectar();
       

    @Override
    public boolean InsertarDatos(int identificacion, String nombre, String apellido1, String apellido2, String genero) {
        boolean resultado=false;
        try{
            String query= "INSERT INTO datos(identificacion, nombre, apellido1, apellido2, genero) VALUES ("+identificacion+","+nombre+","+apellido1+","+apellido2+","+genero+") ";
            conex.conexion();
            Statement st =conex.conex.createStatement();
            int valor=st.executeUpdate(query);
            if (valor>0) {
                resultado= true;
                
            }
            //cerramos los recursos
            st.close();
            conex.conex.close();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ocurrio un error"+ e.getMessage());
            }
        return resultado;
    }

    @Override
    public String ConsultarDatos(int identificacion) {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean EliminarDatos(int identificacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean ActualizarDatos(int identificacion, String nombre, String apellido1, String apellido2, String genero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String ListarDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        
    }
    
    

