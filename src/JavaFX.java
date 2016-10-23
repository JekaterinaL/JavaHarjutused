import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Created by jekaterinal on 23.10.16.
 */
public class JavaFX extends Application {

    @Override //start meetod kirjutatakse ule Application klassist
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();
        Scene scene = new Scene(pane, 400, 300);

        primaryStage.setScene(scene);
        primaryStage.show();

        Circle ring = new Circle(50);
        ring.setCenterX(10);
        ring.setCenterY(50);
        pane.getChildren().add(ring); //laste toa ukse avamiseks

        ring.setOnMouseClicked(event -> { //eventhantler
            System.out.println("KLIKK");  //kontrollin eelnevalt, kas programm tootab, ehk kas ta klikkib
            ring.setCenterX(200);
        });

    }
}
