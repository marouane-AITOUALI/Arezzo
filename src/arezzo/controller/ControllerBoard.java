package arezzo.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import partition.Partition;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
import java.io.IOException;
import java.util.ArrayList;

public class ControllerBoard {
    private Synthesizer synthesizer;
    private Partition p ;
    @FXML
    Slider volume;

    {
        try {
            synthesizer = MidiSystem.getSynthesizer();
            synthesizer.open();
            this.p = new Partition(synthesizer);
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void setVolume(){
        double v = volume.getValue();
        p.setVolume(v);
    }
}
