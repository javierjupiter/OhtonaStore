import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    static String bd = "ohtona_store";
    static String login = "javierjupiter";
    static String password = "jupiter";
    static String url = "jdbc:mysql://localhost/" + bd;

    Connection conn = null;

    /* Constructor de DbConnection */
    public Conexion() {
        try{
            //obtenemos el driver de para mysql
            Class.forName("com.mysql.jdbc.Driver");
            //obtenemos la conexión
            conn = DriverManager.getConnection(url,login,password);
            if (conn!=null){
                System.out.println("Conección a base de datos "+bd+" OK");
            }
        }catch(SQLException e){
            System.out.println(e+ "Error en la conexion");
        }catch(ClassNotFoundException e){
            System.out.println(e+ "error en la conexion 2");
        }
    }
    /*Permite retornar la conexión*/
    public Connection getConnection(){
        return conn;
    }

    public void desconectar(){
        conn = null;
    }

}
