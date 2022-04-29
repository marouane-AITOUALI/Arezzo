package arezzo.vues;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

public class ToucheDoControleur {

    public void handle(){
        try {
            Synthesizer synthesizer = MidiSystem.getSynthesizer();
            //System.out.printf("ggg");

        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }

    }
}
