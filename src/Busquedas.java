import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Busquedas {

    private final Conexion conexion = new Conexion();
    private Producto producto = null;
    private Producto[] productos;

    public boolean buscarclave(String clave){
        try {
            ArrayList<Producto> listaProductos = new ArrayList<Producto>();
            Connection sql = this.conexion.getConnection();
            Statement select = sql.createStatement();
            String sentenciaSQL = "SELECT * FROM ohtona_store.inventario WHERE clave = '" + clave + "'";
            ResultSet resultadoConsulta = select.executeQuery(sentenciaSQL);

            while (resultadoConsulta.next()){
                this.producto = new Producto(resultadoConsulta.getString(1), resultadoConsulta.getNString(2), resultadoConsulta.getNString(3), resultadoConsulta.getDouble(4), resultadoConsulta.getInt(5), resultadoConsulta.getNString(6), resultadoConsulta.getNString(7), resultadoConsulta.getNString(8), resultadoConsulta.getNString(9), resultadoConsulta.getNString(10), resultadoConsulta.getNString(11), resultadoConsulta.getNString(12));
                listaProductos.add(producto);
            }
            return convertirArray(listaProductos);
        }catch (Exception e){
            System.out.println(e + ": El error fue al buscar");
            return false;
        }

    }

    public boolean convertirArray(ArrayList<Producto> arreglo){
        int contador = arreglo.size();
        this.productos = new Producto[contador];
        int i = 0;
        while (i < contador) {
            this.productos[i] = arreglo.get(i);
            i++;
        }

        return true;
    }

    public Producto[] getProductos() {

        return productos;
    }
}
