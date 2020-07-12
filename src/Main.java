import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Catalogo_UI.fxml"));
        primaryStage.setTitle("Ohtona Store");
        primaryStage.setResizable(false);
        Image icon = new Image(getClass().getResourceAsStream("/images/ohtona_mini.png"));
        primaryStage.getIcons().add(icon);
        primaryStage.setScene(new Scene(root, 1000, 600));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}