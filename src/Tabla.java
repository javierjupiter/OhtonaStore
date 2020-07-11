import com.jfoenix.controls.JFXTreeTableColumn;
import com.jfoenix.controls.JFXTreeTableView;
import com.jfoenix.controls.RecursiveTreeItem;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;

public class Tabla {

    //Arraylist para guardar cada dila de la tabla
    private ObservableList<Producto> productos = FXCollections.observableArrayList();


    //Inicializamos la tabla y la mostramos
    public Tabla(JFXTreeTableView<Producto> tablaProductos){

        //Creamos una columna y le decimos que será de tipo Producto
        JFXTreeTableColumn<Producto, String> claveColumn = new JFXTreeTableColumn<>("Clave");
        //Definimos el ancho con el que se mostrará al inicio esta columna
        claveColumn.setPrefWidth(150);
        //asignamos las String Propeerty de la clase Producto con una función Lambda
        claveColumn.setCellValueFactory((TreeTableColumn.CellDataFeatures<Producto, String> param) -> {
            if (claveColumn.validateValue(param)) return param.getValue().getValue().claveProperty();
            else return claveColumn.getComputedValue(param);
        });

        //Hacemos lo mismo para cada columna

        JFXTreeTableColumn<Producto, String> descripcionColumn = new JFXTreeTableColumn<>("Descripción");
        descripcionColumn.setPrefWidth(300);
        descripcionColumn.setCellValueFactory((TreeTableColumn.CellDataFeatures<Producto, String> param) ->{
            if (descripcionColumn.validateValue(param)) return param.getValue().getValue().descripciónProperty();
            else return descripcionColumn.getComputedValue(param);
        });

        JFXTreeTableColumn<Producto, String> unidadMedidaColumn = new JFXTreeTableColumn<>("Unidad de medida");
        unidadMedidaColumn.setPrefWidth(150);
        unidadMedidaColumn.setCellValueFactory((TreeTableColumn.CellDataFeatures<Producto, String> param) ->{
            if (descripcionColumn.validateValue(param)) return param.getValue().getValue().unidadMedidaProperty();
            else return descripcionColumn.getComputedValue(param);
        });

        JFXTreeTableColumn<Producto, String> precioColumn = new JFXTreeTableColumn<>("Precio");
        precioColumn.setPrefWidth(150);
        precioColumn.setCellValueFactory((TreeTableColumn.CellDataFeatures<Producto, String> param) ->{
            if (precioColumn.validateValue(param)) return param.getValue().getValue().precioProperty();
            else return precioColumn.getComputedValue(param);
        });

        JFXTreeTableColumn<Producto, String> unidadColumn = new JFXTreeTableColumn<>("Unidades");
        unidadColumn.setPrefWidth(150);
        unidadColumn.setCellValueFactory((TreeTableColumn.CellDataFeatures<Producto, String> param) ->{
            if (precioColumn.validateValue(param)) return param.getValue().getValue().unidadProperty();
            else return precioColumn.getComputedValue(param);
        });

        JFXTreeTableColumn<Producto, String> provedorColumn = new JFXTreeTableColumn<>("Provedor");
        provedorColumn.setPrefWidth(150);
        provedorColumn.setCellValueFactory((TreeTableColumn.CellDataFeatures<Producto, String> param) ->{
            if (precioColumn.validateValue(param)) return param.getValue().getValue().provedorProperty();
            else return precioColumn.getComputedValue(param);
        });

        JFXTreeTableColumn<Producto, String> direccionCalleColumn = new JFXTreeTableColumn<>("Calle de la direccion");
        direccionCalleColumn.setPrefWidth(150);
        direccionCalleColumn.setCellValueFactory((TreeTableColumn.CellDataFeatures<Producto, String> param) ->{
            if (direccionCalleColumn.validateValue(param)) return param.getValue().getValue().calleProperty();
            else return direccionCalleColumn.getComputedValue(param);
        });

        JFXTreeTableColumn<Producto, String> direccionNumeroExteriorColumn = new JFXTreeTableColumn<>("Número Exterior");
        direccionNumeroExteriorColumn.setPrefWidth(150);
        direccionNumeroExteriorColumn.setCellValueFactory((TreeTableColumn.CellDataFeatures<Producto, String> param) ->{
            if (direccionNumeroExteriorColumn.validateValue(param)) return param.getValue().getValue().numeroExteriorProperty();
            else return direccionNumeroExteriorColumn.getComputedValue(param);
        });

        JFXTreeTableColumn<Producto, String> direccionNumeroInteriorColumn = new JFXTreeTableColumn<>("Número Interior");
        direccionNumeroInteriorColumn.setPrefWidth(150);
        direccionNumeroInteriorColumn.setCellValueFactory((TreeTableColumn.CellDataFeatures<Producto, String> param) ->{
            if (direccionNumeroInteriorColumn.validateValue(param)) return param.getValue().getValue().numeroInteriorProperty();
            else return direccionNumeroInteriorColumn.getComputedValue(param);
        });

        JFXTreeTableColumn<Producto, String> coloniaColumn = new JFXTreeTableColumn<>("Colonia");
        coloniaColumn.setPrefWidth(150);
        coloniaColumn.setCellValueFactory((TreeTableColumn.CellDataFeatures<Producto, String> param) ->{
            if (coloniaColumn.validateValue(param)) return param.getValue().getValue().coloniaProperty();
            else return coloniaColumn.getComputedValue(param);
        });

        JFXTreeTableColumn<Producto, String> alcaldiaColumn = new JFXTreeTableColumn<>("Alcaldia");
        alcaldiaColumn.setPrefWidth(150);
        alcaldiaColumn.setCellValueFactory((TreeTableColumn.CellDataFeatures<Producto, String> param) ->{
            if (alcaldiaColumn.validateValue(param)) return param.getValue().getValue().alcaldiaProperty();
            else return alcaldiaColumn.getComputedValue(param);
        });

        JFXTreeTableColumn<Producto, String> telefonoProvedorColumn = new JFXTreeTableColumn<>("Telefono del Provedor");
        telefonoProvedorColumn.setPrefWidth(150);
        telefonoProvedorColumn.setCellValueFactory((TreeTableColumn.CellDataFeatures<Producto, String> param) ->{
            if (precioColumn.validateValue(param)) return param.getValue().getValue().telefonoProvedorProperty();
            else return precioColumn.getComputedValue(param);
        });

        //Creamos la raiz que tendrá la tabla, es decir, la fila 0
        final TreeItem<Producto> root = new RecursiveTreeItem<Producto>(productos, RecursiveTreeObject::getChildren);

        //se asigna la raiz al componente gráfico
        tablaProductos.setRoot(root);
        //Se oculta la raiz para que no se muestre en pantalla
        tablaProductos.setShowRoot(false);
        tablaProductos.setEditable(false);
        tablaProductos.setPrefWidth(1000);
        //Asignamos todas las columnas a la tabla para mostrar
        tablaProductos.getColumns().setAll(claveColumn,descripcionColumn, unidadMedidaColumn, precioColumn, unidadColumn, provedorColumn,direccionCalleColumn, direccionNumeroExteriorColumn, direccionNumeroInteriorColumn, coloniaColumn, alcaldiaColumn, telefonoProvedorColumn);
    }


    //Metodo para crear una nueva fila, recibe como parametro y los guarda en el arraylist que es propiedad de está clase
    public void crearfila(String clave, String descripcion, String unidadMedida, double precio, int unidad, String provedor, String calle, String numeroExterior, String numeroInterior, String colonia, String alcaldia, String telefonoProvedor){
        productos.add(new Producto(clave, descripcion, unidadMedida, precio, unidad, provedor, calle, numeroExterior, numeroInterior, colonia, alcaldia, telefonoProvedor));
    }

}
