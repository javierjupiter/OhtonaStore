import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Direccion {

    //Creamos propiedades de la clase como StringProperty para entregar a la clase de Producto

    private StringProperty calle;
    private StringProperty numeroExterior;
    private StringProperty numeroInterior;
    private StringProperty colonia;
    private StringProperty alcaldia;

    //Creamos un constructor para llenar todas las propiedades al crear el objeto

    public Direccion(String calle, String numeroExterior, String numeroInterior, String colonia, String alcaldia){
        this.calle = new SimpleStringProperty(calle);
        this.numeroExterior = new SimpleStringProperty(numeroExterior);
        this.numeroInterior = new SimpleStringProperty(numeroInterior);
        this.colonia = new SimpleStringProperty(colonia);
        this.alcaldia = new SimpleStringProperty(alcaldia);
    }

    //Creamos un set para la StringProperty de cada propiedad de la clase

    public  StringProperty calleProperty(){
        if (calle == null){
            this.calle = new SimpleStringProperty("[Vacio]");
        }
        return calle;
    }

    public StringProperty numeroExteriorProperty(){
        if (numeroExterior == null){
            this.numeroExterior = new SimpleStringProperty("[Vacio]");
        }
        return numeroExterior;
    }

    public StringProperty numeroInteriorProperty(){
        if (numeroInterior == null){
            this.numeroInterior = new SimpleStringProperty("[Vacio]");
        }
        return numeroInterior;
    }

    public StringProperty coloniaProperty(){
        if (colonia == null){
            this.colonia = new SimpleStringProperty("[Vacio]");
        }
        return colonia;
    }

    public StringProperty alcaldiaProperty(){
        if (alcaldia == null){
            this.alcaldia = new SimpleStringProperty("[Vacio]");
        }
        return alcaldia;
    }

    //Creamos un set para modificar el texto de una propiedad por separado

    public void setCalle(String calle) {
        this.calle.set(calle);
    }

    public void setNumeroExterior(String numeroExterior) {
        this.numeroExterior.set(numeroExterior);
    }

    public void setAlcaldia(String alcaldia) {
        this.alcaldia.set(alcaldia);
    }

    public void setColonia(String colonia) {
        this.colonia.set(colonia);
    }

    public void setNumeroInterior(String numeroInterior) {
        this.numeroInterior.set(numeroInterior);
    }


    //creamos gets para cada propiedad y obtener solamente la cadena

    public String getCalle() {
        return calle.get();
    }

    public String getNumeroExterior() {
        return numeroExterior.get();
    }

    public String getNumeroInterior() {
        return numeroInterior.get();
    }

    public String getAlcaldia() {
        return alcaldia.get();
    }

    public String getColonia() {
        return colonia.get();
    }
}
