import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTreeTableView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;

public class Catalogo_UI_Controller implements Initializable {
    @FXML
    private JFXTreeTableView<Producto> tablaProductos;

    @FXML
    private JFXTextField txtBusqueda;

    @FXML
    private JFXRadioButton radClave;

    @FXML
    private JFXRadioButton radDescripcion;

    @FXML
    private JFXRadioButton radTelefonoProvedor;

    private int tipoBusqueda = 1;

    private final Busquedas busquedas = new Busquedas();
    public Tabla tabla;

    @FXML
    public void initialize(URL url, ResourceBundle resourceBundle){
        System.out.println("Controlador iniciado");
        this.tabla = new Tabla(tablaProductos);
        this.tabla.asignarTextoTablavacia("Busquemos algo");
        radClave.setSelected(true);

    }

    public void onSelectedSearchButtonClicked(javafx.scene.input.MouseEvent mouseEvent){
        this.hacerBusqueda();
    }

    public void onSelectedRadioClave(ActionEvent actionEvent) {
        radClave.setSelected(true);
        radDescripcion.setSelected(false);
        radTelefonoProvedor.setSelected(false);
        this.tipoBusqueda = 1;
        hacerBusqueda();
    }

    public void onSelectedRadioDescripcion(ActionEvent actionEvent) {
        radClave.setSelected(false);
        radDescripcion.setSelected(true);
        radTelefonoProvedor.setSelected(false);
        this.tipoBusqueda = 2;
        hacerBusqueda();
    }

    public void onSelectedRAdioTelefonoProvedor(ActionEvent actionEvent) {
        radClave.setSelected(false);
        radDescripcion.setSelected(false);
        radTelefonoProvedor.setSelected(true);
        this.tipoBusqueda = 3;
        this.tabla.limpiarTabla();
        hacerBusqueda();
    }

    public void hacerBusqueda(){
        this.tabla.limpiarTabla();
        //Busquemos
        if (busquedas.buscar(tipoBusqueda, txtBusqueda.getText())){
            Producto[] productos = busquedas.getProductos();
            try {
                for (Producto producto : productos) {
                    this.tabla.crearfila(producto.getClave(), producto.getDescripción(), producto.getUnidadMedida(), producto.getPrecioComoFloat(), producto.getUnidadComoINT(), producto.getProvedor(), producto.getDireccionCalle(), producto.getDireccionNumeroExterior(), producto.getDireccionNumeroInterior(), producto.getDireccionColonia(), producto.getDireccionAlcaldia(), producto.getTelefonoProvedor());
                }
            }catch (Exception e){
                System.out.println(e + "crear tabla");
            }
        }else{
            this.tabla.asignarTextoTablavacia("NO");
        }
    }

}
