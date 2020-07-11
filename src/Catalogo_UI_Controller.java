import com.jfoenix.controls.JFXTreeTableView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class Catalogo_UI_Controller implements Initializable {

    public ObservableList<Producto> productos = FXCollections.observableArrayList();

    @FXML
    private JFXTreeTableView<Producto> tablaProductos;

    @FXML
    public void initialize(URL url, ResourceBundle resourceBundle){
        System.out.println("Controlador iniciado");
        Tabla tabla = new Tabla(tablaProductos);


    }


}
