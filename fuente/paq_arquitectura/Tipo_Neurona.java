

package paq_arquitectura;
import paq_logica.cls_sql;

/**
 *
 * @author Jonathan
 */
public class Tipo_Neurona
{
        private cls_sql clase_sql= new cls_sql();
        private java.sql.ResultSet resultado;

    public String getDescripcionTipoNeurona(int id_tipo)
    {
        resultado=clase_sql.ejecutarSelect("select tip_neu_descripcion from tab_tipo_neurona where tip_neu_id='"+ id_tipo + "'");
        try{
            return resultado.getString(1);
        }
        catch(java.sql.SQLException e)
        {
            e.printStackTrace();
            return "";
        }
    }

}
