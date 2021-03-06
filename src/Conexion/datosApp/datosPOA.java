package datosApp;


/**
* datosApp/datosPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Persona.idl
* lunes 23 de abril de 2018 07:38:57 PM COT
*/

public abstract class datosPOA extends org.omg.PortableServer.Servant
 implements datosApp.datosOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("InsertarDatos", new java.lang.Integer (0));
    _methods.put ("ConsultarDatos", new java.lang.Integer (1));
    _methods.put ("EliminarDatos", new java.lang.Integer (2));
    _methods.put ("ActualizarDatos", new java.lang.Integer (3));
    _methods.put ("ListarDatos", new java.lang.Integer (4));
    _methods.put ("shutdown", new java.lang.Integer (5));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // datosApp/datos/InsertarDatos
       {
         int identificacion = in.read_long ();
         String nombre = in.read_wstring ();
         String apellido1 = in.read_wstring ();
         String apellido2 = in.read_wstring ();
         String genero = in.read_wstring ();
         boolean $result = false;
         $result = this.InsertarDatos (identificacion, nombre, apellido1, apellido2, genero);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // datosApp/datos/ConsultarDatos
       {
         int identificacion = in.read_long ();
         String $result = null;
         $result = this.ConsultarDatos (identificacion);
         out = $rh.createReply();
         out.write_wstring ($result);
         break;
       }

       case 2:  // datosApp/datos/EliminarDatos
       {
         int identificacion = in.read_long ();
         boolean $result = false;
         $result = this.EliminarDatos (identificacion);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 3:  // datosApp/datos/ActualizarDatos
       {
         int identificacion = in.read_long ();
         String nombre = in.read_wstring ();
         String apellido1 = in.read_wstring ();
         String apellido2 = in.read_wstring ();
         String genero = in.read_wstring ();
         boolean $result = false;
         $result = this.ActualizarDatos (identificacion, nombre, apellido1, apellido2, genero);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 4:  // datosApp/datos/ListarDatos
       {
         String $result = null;
         $result = this.ListarDatos ();
         out = $rh.createReply();
         out.write_wstring ($result);
         break;
       }

       case 5:  // datosApp/datos/shutdown
       {
         this.shutdown ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:datosApp/datos:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public datos _this() 
  {
    return datosHelper.narrow(
    super._this_object());
  }

  public datos _this(org.omg.CORBA.ORB orb) 
  {
    return datosHelper.narrow(
    super._this_object(orb));
  }


} // class datosPOA
