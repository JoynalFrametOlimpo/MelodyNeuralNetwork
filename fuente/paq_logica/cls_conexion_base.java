
package paq_logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author Jonathan
 */
public class cls_conexion_base
{
    Connection conexion;
    private JOptionPane mensajes;

    public Connection getConeccion()
    {
        return conexion;
    }

    public boolean setConeccion()
    {
        try
        {
       
        Class.forName("com.mysql.jdbc.Driver");

        //conexion= DriverManager.getConnection("jdbc:mysql://localhost:3306/redesneuronales","root","olimpo");
          conexion= DriverManager.getConnection("jdbc:mysql://" + cls_variables_globales.urlBase
                                                                +":"
                                                                + cls_variables_globales.puertoBD
                                                                +"/"
                                                                + cls_variables_globales.nombreBD
                                                                , cls_variables_globales.usuarioBD,
                                                                cls_variables_globales.contraseñaBD);
       
        }
        catch(SQLException e)
        {
            switch (e.getErrorCode())
            {
                case 0:
                    mensajes.showMessageDialog(null, "No se puede establecer conexión con el servidor, revise configuración!","Conexión de Datos", mensajes.ERROR_MESSAGE);
                    break;
                case 1045:
                    mensajes.showMessageDialog(null, "Acceso negado para el usuario, revise password/usuario!","Conexión de Datos", mensajes.ERROR_MESSAGE);
                    break;
                case 1049:
                    mensajes.showMessageDialog(null, "Nombre de Base de Datos no existe, revise configuración!","Conexión de Datos", mensajes.ERROR_MESSAGE);
                    break;
            }

            return false;
        }
        catch(ClassNotFoundException e)
        {
            mensajes.showMessageDialog(null, "Clase de Conexion no encontrada", "Conexion de Datos", mensajes.ERROR_MESSAGE);
            return false;
        }
        return true;
    }




}
