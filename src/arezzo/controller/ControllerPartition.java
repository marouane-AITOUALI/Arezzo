package arezzo.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerPartition implements Initializable {
    private Button b = new Button();
    private Button b1 = new Button();
    private Button b2 = new Button();
    private Button b3 = new Button();
    private Button b4 = new Button();
    private Button b5 = new Button();




    @FXML
    ListView<Button> l = new ListView<>();

    ObservableList list = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Image image = new Image(getClass().getResourceAsStream("/croche.png"),40,40,true,true);
        ImageView imageView = new ImageView(image);
        b.setGraphic(imageView);

        Image image1 = new Image(getClass().getResourceAsStream("/noire.png"),40,40,true,true);
        ImageView imageView1 = new ImageView(image1);
        b1.setGraphic(imageView1);

        Image image2 = new Image(getClass().getResourceAsStream("/ronde.png"),40,40,true,true);
        ImageView imageView2 = new ImageView(image2);
        b2.setGraphic(imageView2);

        Image image3 = new Image(getClass().getResourceAsStream("/blanche.png"),40,40,true,true);
        ImageView imageView3 = new ImageView(image3);
        b3.setGraphic(imageView3);

        Image image4 = new Image(getClass().getResourceAsStream("/soupir.png"),40,40,true,true);
        ImageView imageView4 = new ImageView(image4);
        b4.setGraphic(imageView4);

        Image image5 = new Image(getClass().getResourceAsStream("/demiSoupir.png"),40,40,true,true);
        ImageView imageView5 = new ImageView(image5);
        b5.setGraphic(imageView5);

        list.addAll(b,b1,b2,b3,b5,b4);
        l.getItems().addAll(list);
    }
}
