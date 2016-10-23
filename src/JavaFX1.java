import com.sun.org.apache.xpath.internal.SourceTree;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Created by jekaterinal on 23.10.16.
 */
public class JavaFX1 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox vbox = new VBox();
        Scene login = new Scene(vbox, 300, 150); //Stage on paindlik ja alati votab Scene suurust
        primaryStage.setScene(login);
        Label pealkiri = new Label("Mis on parool?");
        TextField paroolField = new TextField();
        Button submitButton = new Button("Login");

        vbox.getChildren().addAll(pealkiri, paroolField, submitButton); //shift + F6 voimaldab muuta korraga nimed

        Circle ring = new Circle(50);
        Pane pane = new Pane();
        pane.getChildren().add(ring);
        Scene seesStseen = new Scene(pane, 600, 500);

        submitButton.setOnAction(event -> { //loogilised sulud
            String parool = paroolField.getText();
            if (parool.equals("minuSuperSecretPass")){
                System.out.println("Parool on oige");
                primaryStage.setScene(seesStseen);
            } else {
                System.out.println("Parool on vale");
            }
        });

        primaryStage.show();
    }
}
