
package paq_logica;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class cls_sql
{
    cls_conexion_base con= new cls_conexion_base();
    cls_sql clase_sql;
    String sql;
    private JOptionPane mensajes;

      public boolean ejecutar_sql(String sql)
    {
    try
    {
        con.setConeccion();
        Statement sentencia= con.getConeccion().createStatement();
        sentencia.execute(sql);
    }
    catch(SQLException ex)
    {
            mensajes.showMessageDialog(null, ex.toString(), "Prueba de Conexion de Datos", mensajes.ERROR_MESSAGE);
            return false;
    }
    return true;
    }

    public ResultSet ejecutarSelect(String sql)
    {
        ResultSet resultado;

        try
        {
         con.setConeccion();
         Statement sentencia= con.getConeccion().createStatement();
         resultado= sentencia.executeQuery(sql);
         return resultado;
        }
        catch(SQLException ex)
        {
            switch (ex.getErrorCode())
            {
                case 1046:
                    mensajes.showMessageDialog(null,"No hay base de datos seleccionada, revise configuración de datos!", "SQL", mensajes.ERROR_MESSAGE);
                    break;
            }
            return null;
        }  
    }


    public int numFilasTabla(String nombreTabla)
    {   int num_filas=0;
        
         sql= " SELECT table_row FROM `information_schema`.`Tables where table_name= '"  + nombreTabla +"'";
         clase_sql.ejecutarSelect(sql);
         try{
                num_filas= clase_sql.ejecutarSelect(sql).getInt("table_row");
         }
         catch(SQLException e)
         {
             e.printStackTrace();
         }
         return num_filas;
    }

    public String armarQuery(String sql)
    {

            if (sql.equals("select_table_schema"))
            {
                sql= "select table_name from tables where table_schema='";
            }
            if (sql.equals("select_db"))
            {
                sql= "select distinct(table_schema) from `information_schema`.`tables`";

            }
            if (sql.equals("insert_neurona"))
            {
                sql= "insert into tab_neurona(neu_id,neu_estado,neu_salida_deseada," +
                     "neu_potencial_lateral,neu_potencial_adelante, neu_potencial_atras,"+
                     "neu_norma_cuadratica_adelante,neu_norma_cuadratica_atras, " +
                     "neu_norma_cuadratica_lateral,tip_neu_id,cap_id,red_id,neu_peso_umbral) values ";
            }

            if (sql.equals("insert_capa"))
            {
                sql="insert into tab_capa (cap_id,cap_num_neuronas, cap_num_sinapsis_atras,"+
                    "cap_num_sinapsis_adelante, cap_num_sinapsis_lateral,red_id) values ";
            }

            if (sql.equals("insert_sinapsis"))
            {
                sql="insert into tab_sinapsis(sin_id_neurona_origen,sin_id_neurona_destino,sin_valor_peso,"+
                    "sin_potencial_sinaptico,tip_sin_id,id_capa_origen, id_capa_destino,id_red) values ";
            }

            if (sql.equals("insert_red"))
            {
                sql= "insert into tab_red(red_id, pro_id, red_num_capas,red_num_neuronas,red_factor_aprendizaje," +
                      " fun_id,red_peso1,red_peso2,red_ciclos,red_momento,red_error_patron, red_error_deseado) values ";
            }

            if (sql.equals("insert_pruebas"))
            {
                sql= "insert into tab_pruebas(idPrueba,numEntradas,numOcultas,numSalidas,factorAprendizaje,"+
                     "factorMomento,errorPorPatron,errorPorEpoca,ciclos,funcionActivacion,correctos,incorrectos,"+
                     "total,porError,tiempoEjecucion,epocasUtilizadas,observacion) values ";
            }
            if (sql.equals("select_pruebas"))
            {
                sql= "select idPrueba,numEntradas,numOcultas,numSalidas,factorAprendizaje,"+
                     "factorMomento,errorPorPatron,errorPorEpoca,ciclos,funcionActivacion,correctos,incorrectos,"+
                     "total,porError,tiempoEjecucion,epocasUtilizadas,observacion from tab_pruebas ";
            }
            if (sql.equals("insert_proyecto"))
            {
                sql= "insert into tab_proyecto(pro_id,pro_nombre,pro_descripcion,usu_id,pro_estado,pro_creado,pro_modificado,pro_tabla)" +
                      " values ";
            }
            if (sql.equals("select_proyecto"))
            {
                sql= "select a.pro_id, a.pro_nombre, a.pro_descripcion, a.pro_creado,a.pro_modificado,usu_nombre from " +
                      "tab_usuario b, tab_proyecto a where a.usu_id=b.usu_id";       
            }
            if(sql.equals("select_umbrales"))
            {
                sql= "select cap_id,neu_id,neu_peso_umbral from tab_neurona a, tab_proyecto b, tab_red c where b.pro_id=c.pro_id " +
                     " and c.red_id=a.red_id and b.pro_id=";
            }

            if (sql.equals("select_sinapsis"))
            {
                sql= "select id_red,id_capa_origen, sin_id_neurona_origen,id_capa_destino,sin_id_neurona_destino" +
                      ",sin_valor_peso from tab_sinapsis where id_red= ";
            }
            if (sql.equals("traer_proyecto_existente"))
            {
               sql="select proyecto.pro_id,proyecto.pro_descripcion,proyecto.pro_nombre,proyecto.pro_tabla,red.red_num_capas, " +
                    "red.red_num_neuronas,red.red_factor_aprendizaje,red.red_momento,red.red_error_deseado,red.fun_id,red.red_peso1," +
                    "red.red_peso2,red.red_ciclos,red.red_error_patron,capa.cap_id,capa.cap_num_neuronas," +
                    "capa.cap_num_sinapsis_atras,capa.cap_num_sinapsis_adelante,capa.cap_num_sinapsis_lateral" +
                    " from tab_red red,tab_proyecto proyecto,tab_capa capa where proyecto.pro_id=red.pro_id" +
                    " and red.red_id=capa.red_id and proyecto.pro_id= ";
             
            }
            if (sql.equals("limpiar_base_datos"))
            {
                sql= "call pr_limpiar_base_datos";

            }

            if (sql.equals("consultar_tabla"))
            {
                    sql=" SELECT * FROM `tablas`.`" ;
            }

            if (sql.equals("consultar_campos_tablas"))
            {
                    sql = " SELECT column_name, data_type FROM `information_schema`.`COLUMNS` where table_name='";
            }

            if(sql.equals("insert_patron"))
            {
                    sql= "insert into tab_patron(red_id,num_entradas,num_salidas) values ";

            }

            if (sql.equals("insert_detalle_patron"))
            {
                    sql= "insert into tab_detalle_patron (red_id, nombre_columna,tipo) values";
            }

            if (sql.equals("select_detalle_patron"))
            {
                    sql= "select nombre_columna, tipo from tab_detalle_patron where red_id=";
            }

            
    return sql;
    }
    
}
