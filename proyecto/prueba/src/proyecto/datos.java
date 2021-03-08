
package proyecto;

/**---------*/
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
/***----*/

public class datos {
    public static void datosentrada(int a, String b,String c,String d,String e,String f)throws SQLException
    {
        CallableStatement entrada = conexionsql.getconexionsql().prepareCall("{call alumnoc(?,?,?,?,?,?)}");
        entrada.setInt(1,a);
        entrada.setString(2,b);
        entrada.setString(3,c);
        entrada.setString(4,d);
        entrada.setString(5,e);
        entrada.setString(6,f);
        entrada.execute();

    }
     public static void borradodedatos(int a)throws SQLException
     {
          CallableStatement entrada = conexionsql.getconexionsql().prepareCall("{call borrardatos(?)}");
          entrada.setInt(1,a);
          entrada.execute();
     }
     public static void actualizacion(int a, String b,String c,String d,String e,String f,int g)throws SQLException
    {
        CallableStatement entrada = conexionsql.getconexionsql().prepareCall("{call edicion(?,?,?,?,?,?,?)}");
        entrada.setInt(1,a);
        entrada.setString(2,b);
        entrada.setString(3,c);
        entrada.setString(4,d);
        entrada.setString(5,e);
        entrada.setString(6,f);
        entrada.setInt(7,g);
        entrada.execute();

    }
}
