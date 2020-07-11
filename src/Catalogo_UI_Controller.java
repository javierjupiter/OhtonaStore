import com.jfoenix.controls.JFXTreeTableView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class Catalogo_UI_Controller implements Initializable {
    @FXML
    private JFXTreeTableView<Producto> tablaProductos;

    private Busquedas busquedas = new Busquedas();
    private Producto[] productos;

    @FXML
    public void initialize(URL url, ResourceBundle resourceBundle){
        System.out.println("Controlador iniciado");
        /*Tabla tabla = new Tabla(tablaProductos);

        //Busquemos
        if (busquedas.buscar(3, "5135456542")){
            productos = busquedas.getProductos();
            try {
                for (int i = 0; i < productos.length; i++){
                    tabla.crearfila(productos[i].getClave(), productos[i].getDescripción(), productos[i].getUnidadMedida(), productos[i].getPrecioComoFloat(), productos[i].getUnidadComoINT(), productos[i].getProvedor(), productos[i].getDireccionCalle(), productos[i].getDireccionNumeroExterior(), productos[i].getDireccionNumeroInterior(),productos[i].getDireccionColonia(), productos[i].getDireccionAlcaldia(), productos[i].getTelefonoProvedor());
                }
            }catch (Exception e){
                System.out.println(e + "crear tabla");
            }
        }*/
    }


}
