import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Producto extends RecursiveTreeObject<Producto> {

    //Creamos las propiedades de la clase con la dirección desglosada en calle, numero exterior, numero interior, colonia y alcaldia

    private StringProperty clave;
    private StringProperty descripción;
    private StringProperty unidadMedida;
    private StringProperty precio;
    private StringProperty unidad;
    private StringProperty provedor;
    private Direccion direccionProvedor;
    private StringProperty telefonoProvedor;

    //Constructor para llenar todas las propiedades de esta clase y las de Dirección

    public Producto(String clave, String descripcion, String unidadMedida, double precio, int unidad, String provedor, String calle, String numeroExterior, String numeroInterior, String colonia, String alcaldia, String telefonoProvedor){
        this.clave = new SimpleStringProperty(clave);
        this.descripción = new SimpleStringProperty(descripcion);
        this.unidadMedida = new SimpleStringProperty(unidadMedida);
        this.precio = new SimpleStringProperty(Double.toString(precio));
        this.unidad = new SimpleStringProperty(Integer.toString(unidad));
        this.provedor = new SimpleStringProperty(provedor);
        this.telefonoProvedor = new SimpleStringProperty(telefonoProvedor);
        direccionProvedor = new Direccion(calle, numeroExterior, numeroInterior, colonia, alcaldia);
    }

    //Creamos un set para la StringProperty de cada propiedad de la clase

    public StringProperty claveProperty(){
        if (clave == null){
            this.clave = new SimpleStringProperty("[Vacio]");
        }
        return clave;
    }

    public StringProperty descripciónProperty(){
        if (descripción == null){
            this.descripción = new SimpleStringProperty("[Vacio]");
        }
        return this.descripción;
    }

    public StringProperty unidadMedidaProperty(){
        if (unidadMedida == null){
            this.unidadMedida = new SimpleStringProperty("[Vacio]");
        }
        return this.unidadMedida;
    }

    public StringProperty precioProperty(){
        if (precio == null){
            this.precio = new SimpleStringProperty("[VACIO]");
        }
        return this.precio;
    }

    public StringProperty unidadProperty(){
        if (unidad == null){
            this.unidad = new SimpleStringProperty("[VACIO]");
        }
        return this.unidad;
    }

    public StringProperty provedorProperty(){
        if (provedor == null){
            this.provedor = new SimpleStringProperty("[Vacio]");
        }
        return this.provedor;
    }

    public StringProperty telefonoProvedorProperty(){
        if (telefonoProvedor == null){
            this.telefonoProvedor = new SimpleStringProperty("[Vacio]");
        }
        return telefonoProvedor;
    }

    public  StringProperty calleProperty(){
        return direccionProvedor.calleProperty();
    }

    public StringProperty numeroExteriorProperty(){
        return direccionProvedor.numeroExteriorProperty();
    }

    public StringProperty numeroInteriorProperty(){
        return direccionProvedor.numeroInteriorProperty();
    }

    public StringProperty coloniaProperty(){
        return direccionProvedor.coloniaProperty();
    }

    public StringProperty alcaldiaProperty(){
        return direccionProvedor.alcaldiaProperty();
    }

    //creamos gets para cada propiedad y obtener solamente la cadena

    public String getProvedor() {
        return provedor.get();
    }

    public String getClave() {
        return clave.get();
    }

    public String getDescripción() {
        return descripción.get();
    }

    public String getUnidad() {
        return unidad.get();
    }

    public int getUnidadComoINT() {
        return Integer.parseInt(unidad.get());
    }

    public String getUnidadMedida() {
        return unidadMedida.get();
    }

    public String getPrecio() {
        return precio.get();
    }

    public double getPrecioComoFloat() {
        return Double.parseDouble(precio.get());
    }

    public String getTelefonoProvedor() {
        return telefonoProvedor.get();
    }

    public String getDireccionCalle(){
        return direccionProvedor.getCalle();
    }

    public String getDireccionNumeroExterior(){
        return direccionProvedor.getNumeroExterior();
    }

    public String getDireccionNumeroInterior(){
        return direccionProvedor.getNumeroInterior();
    }

    public String getDireccionAlcaldia(){
        return direccionProvedor.getAlcaldia();
    }

    public String getDireccionColonia(){
        return direccionProvedor.getColonia();
    }

    //Creamos un set para modificar el texto de una propiedad por separado

    public void setUnidad(int unidad) {
        this.unidad.set(Integer.toString(unidad));
    }

    public void setProvedor(String provedor) {
        this.provedor.set(provedor);
    }

    public void setDireccionCalle(String calle){
        this.direccionProvedor.setCalle(calle);
    }

    public void setDireccionNumeroExterior(String numeroExterior){
        this.direccionProvedor.setNumeroExterior(numeroExterior);
    }

    public void setDireccionNumeroInterior(String numeroInterior){
        this.direccionProvedor.setNumeroInterior(numeroInterior);
    }

    public void setDireccionAlcaldia(String alcaldia){
        this.direccionProvedor.setAlcaldia(alcaldia);
    }

    public void setDireccionColonia(String colonia){
        this.direccionProvedor.setColonia(colonia);
    }

    public void setClave(String clave) {
        this.clave.set(clave);
    }

    public void setDescripción(String descripción) {
        this.descripción.set(descripción);
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida.set(unidadMedida);
    }

    public void setPrecio(float precio) {
        this.precio.set(Float.toString(precio));
    }

    public void setTelefonoProvedor(String telefonoProvedor) {
        this.telefonoProvedor.set(telefonoProvedor);
    }
}
