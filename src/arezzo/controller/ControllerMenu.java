package arezzo.controller;

import arezzo.model.Notes;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextInputDialog;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import partition.Melodie;

import java.io.*;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class ControllerMenu implements Initializable {

    @FXML
    private Menu menuMelodie, menuOutils;
    @FXML
    private MenuItem nouveau, open, save, quitter,
            renommer, transposer;

    public void ControllerMenu(){

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        open.setOnAction(e -> this.ouvrir());
        save.setOnAction(e -> enregistrer());
        quitter.setOnAction(e -> exit());
        nouveau.setOnAction(e -> nouveau());
        renommer.setOnAction(e -> changerNom());
        transposer.setOnAction(e -> transposer());
    }

    private Notes notes = new Notes();

    public void exit(){
        Platform.exit();
    }


    @FXML
    private void enregistrer()
    {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Enregistrer une parition :");
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("Arezzo files (*.arezzo)","*.arezzo");
        fileChooser.getExtensionFilters().add(extFilter);
        File file = fileChooser.showSaveDialog(new Stage());
        if (file != null) {
            try {
                FileOutputStream fos = new FileOutputStream(file.getPath());
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(notes.getNotes());
                oos.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    @FXML
    public void nouveau(){
        notes.reset();
    }

    @FXML
    private void ouvrir()
    {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open file: ");
        fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));
        FileChooser.ExtensionFilter extFilter =
                new FileChooser.ExtensionFilter("Arezzo files (*.arezzo)", "*.arezzo");
        fileChooser.getExtensionFilters().add(extFilter);
        File file = fileChooser.showOpenDialog(new Stage());
        if (file != null) {
            try {
                FileInputStream fileIn = new FileInputStream(file.getPath());
                ObjectInputStream ois = new ObjectInputStream(fileIn);
                Melodie melodie = (Melodie) ois.readObject();
                notes.setMelodie(notes.getNotes());
                ois.close();
                fileIn.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public void changerNom(){
        TextInputDialog input = new TextInputDialog("Renommer Partition");
        input.setHeaderText("Renommer votre partition");
        input.setContentText("Entrer nom partition :");

        Optional<String> nomPartition = input.showAndWait();

        if(nomPartition.isPresent()){
            notes.setTitle(nomPartition.get());
        }
    }



    private void transposer() {
        notes.transposer();
    }
}
