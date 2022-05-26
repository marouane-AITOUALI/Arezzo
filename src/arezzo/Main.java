package arezzo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("fxml/board.fxml"));
        Parent root2 = FXMLLoader.load(getClass().getResource("fxml/piano.fxml"));
        Parent root3 = FXMLLoader.load(getClass().getResource("fxml/mainMenu.fxml"));
        Parent root4 = FXMLLoader.load(getClass().getResource("fxml/partition.fxml"));

        BorderPane pere = new BorderPane();
        HBox hbox = new HBox();
        HBox hbox1 = new HBox();
        hbox.getChildren().addAll(root2, root);
        pere.setBottom(hbox);
        pere.setTop(root3);

        hbox1.getChildren().addAll(root4);
        pere.setCenter(hbox1);
        primaryStage.setTitle("Arezzo");
        primaryStage.setScene(new Scene(pere, 1400, 1000));
        primaryStage.setResizable(true);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
