package arezzo.controller;

import partition.Partition;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
import java.util.ArrayList;

public class ControllerBoard {

    private ArrayList<String> arr = new ArrayList<>();
    public void add(String c) {
        arr.add(c);
    }

    public void jouerMelodie(){
        StringBuffer s = new StringBuffer();
        for(int i =0; i < arr.size();i++){
            s.append(arr.get(i));
        }
        arr.clear();
        Synthesizer synthesizer = null;
        try {
            synthesizer = MidiSystem.getSynthesizer();
            synthesizer.open();
        } catch (MidiUnavailableException e) {
            throw new RuntimeException(e);
        }

        Partition p = new Partition(synthesizer);
        p.setVolume(100);
        p.play(s.toString());
    }
}
