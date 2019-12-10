

package paq_arquitectura;
import paq_logica.cls_sql;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GestionProyecto
{
    cls_sql clase_sql= new cls_sql();
    String sql;
    boolean exito;
    ResultSet resultado;



    public boolean nuevoProyecto(String nombreProyecto,String descripcion,int usuario,
                                 Red_FeedForward red, String tabla)
    {
        
     
        int num_proyecto=this.getSecuencia("tab_proyecto");
        paq_logica.cls_variables_globales.idProyecto= num_proyecto;
        paq_logica.cls_variables_globales.nombreProyecto= nombreProyecto;
   
        sql= clase_sql.armarQuery("insert_proyecto")+"(" +num_proyecto +",'" +nombreProyecto + "','"  + descripcion + "',"+ usuario +",1,now(),now() " + ",'" + tabla +"')";
        exito= clase_sql.ejecutar_sql(sql);

        if( !exito )
        {
            return false;
        }
        red.guardarRed(red, num_proyecto);
        return true;

    }

    public int getSecuencia(String tabla)
    {
        int codigo=0;
        if (tabla.equals("tab_capa"))
        {
            sql= " select ifnull(max(cap_id)+1,0) codigo from tab_capa";
        }
        if (tabla.equals("tab_proyecto"))
        {
            sql= " select ifnull(max(pro_id)+1,0) codigo from tab_proyecto";
        }
        if (tabla.equals("tab_red"))
        {
            sql= "select ifnull(max(red_id)+1,0) codigo from tab_red";
        }



        resultado=clase_sql.ejecutarSelect(sql);
        try
        {
            while(resultado.next())
            {
                codigo=resultado.getInt("codigo");
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return codigo;

    }

}
