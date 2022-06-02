package arezzo.controller;

import javafx.application.Platform;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ControllerMenu {



    public void exit(){
        Platform.exit();
    }


    private void enregistrer()
    {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Enregistrer une parition :");
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("*.arezzo");
        fileChooser.getExtensionFilters().add(extFilter);
        File file = fileChooser.showSaveDialog(new Stage());
        if (file != null) {
            try {
                FileOutputStream fos = new FileOutputStream(file.getPath());
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(model.getMelodie());
                oos.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
