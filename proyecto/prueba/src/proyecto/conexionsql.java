
package proyecto;
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class conexionsql {
    static Connection conect = null;
    public static Connection getconexionsql()
     {
            String url = "jdbc:sqlserver://localhost;databaseName=bdacademico";
                try
                    {
                         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                         
                    }
                catch(ClassNotFoundException e)
                    {
                        JOptionPane.showMessageDialog(null, "error de conexion", "alerta"+e.getMessage(),JOptionPane.ERROR_MESSAGE);
                        
                    }
            try{
                 conect = DriverManager.getConnection(url,"c137","antonio34");
                
               }
            catch(SQLException e)
               {
                 JOptionPane.showMessageDialog(null, "error ", "alerta"+e.getMessage(),JOptionPane.ERROR_MESSAGE);
                 System.exit(0);
               }
            return conect;
     }
   public static ResultSet consulta(String consulta)
   {
       Connection conexion = getconexionsql();
       Statement consult;
       try
       {
           consult = conexion.createStatement();
           ResultSet respuesta = consult.executeQuery(consulta);
           return respuesta;
       }
       catch(SQLException e)
       {
           JOptionPane.showMessageDialog(null, "error ", "alerta"+e.getMessage(),JOptionPane.ERROR_MESSAGE);
           return null;
       }
   }
   public static void main(String args[]) {
       conexionsql.getconexionsql();
      
   }
}
