
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
            String query= "INSERT INTO datos(identificacion, nombre, apellido1, apellido2, genero) VALUES ('"+identificacion+"','"+nombre+"','"+apellido1+"','"+apellido2+"','"+genero+"') ";
            conex.conexion();
            Statement st =conex.conex.createStatement();
            int valor=st.executeUpdate(query);
            if (valor>0) {
                resultado= true;
                JOptionPane.showMessageDialog(null, "dato insertado");
            }
            //cerramos los recursos
            st.close();
            conex.conex.close();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "identificacion ya existe....");
            }
        return resultado;
    }

    @Override
    public String ConsultarDatos(int identificacion) {
        String resultado="";
        try {
            String query="SELECT * FROM datos WHERE identificacion="+ identificacion;
            conex.conexion();
            Statement st=conex.conex.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next() ){
                resultado+= rs.getLong(1)+" - "
                        +rs.getString(2)+" - "
                        +rs.getString(3)+" - "
                        +rs.getString(4)+" - "
                        +rs.getString(5)+"\n";                           
            }
            //cerramos los recursos
            st.close();
            rs.close();
            conex.conex.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ocurrio un error"+ e.getMessage());
        }
        return resultado;
    }

    @Override
    public boolean EliminarDatos(int identificacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean ActualizarDatos(int identificacion, String nombre, String apellido1, String apellido2, String genero) {
        boolean resultado=false;
        try {
            String query="UPDATE datos SET identificacion="+identificacion+", nombre="+nombre+", apellido1="+apellido1+", apellido2="+apellido2+", genero="+genero+" WHERE identificacion="+identificacion;
            conex.conexion();
            Statement st=conex.conex.createStatement();
            int valor = st.executeUpdate(query);
            if (valor>0) {
                resultado = true;
                JOptionPane.showMessageDialog(null, "dato Actualizado");
            }
            //cerramos los recursos
            st.close();          
            conex.conex.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ocurrio un error al actualizar");
        }
        
        return resultado;
    }

    @Override
    public String ListarDatos() {
        String resultado="";
        
        try {
            String query="SELECT * FROM datos";
            conex.conexion();
            Statement st=conex.conex.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next() ){
                resultado+= rs.getLong(1)+" - "
                        +rs.getString(2)+" - "
                        +rs.getString(3)+" - "
                        +rs.getString(4)+" - "
                        +rs.getString(5)+"\n";                           
            }
            //cerramos los recursos
            st.close();
            rs.close();
            conex.conex.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ocurrio un error"+ e.getMessage());
        }     
        return resultado;            
    }

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        
    }
    
    

