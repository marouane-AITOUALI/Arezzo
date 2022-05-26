package arezzo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("fxml/board.fxml"));
        Parent root2 = FXMLLoader.load(getClass().getResource("fxml/piano.fxml"));
        BorderPane pere = new BorderPane();
        pere.setLeft(root2);
        pere.setRight(root);
        primaryStage.setTitle("Arezzo");
        primaryStage.setScene(new Scene(pere, 1400, 1000));
        primaryStage.setResizable(true);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
