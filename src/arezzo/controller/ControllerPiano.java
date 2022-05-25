package arezzo.controller;

import partition.Partition;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

public class ControllerPiano {

    private Synthesizer synthesizer;

    {
        try {
            synthesizer = MidiSystem.getSynthesizer();
            synthesizer.open();
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }
    }



    public void keyDo(){

        Partition p = new Partition(synthesizer);
        p.play("C");
        p.setVolume(100);

    }

    public void keyRe(){
        Partition p = new Partition(synthesizer);
        p.play("D");
        p.setVolume(100);

    }

    public void keyMi(){
        Partition p = new Partition(synthesizer);
        p.play("E");
        p.setVolume(100);

    }

    public void keyFa(){

        Partition p = new Partition(synthesizer);
        p.play("F");
        p.setVolume(100);

    }

    public void keySol(){

        Partition p = new Partition(synthesizer);
        p.play("G");
        p.setVolume(100);

    }

    public void keyLa(){

        Partition p = new Partition(synthesizer);
        p.play("A");
        p.setVolume(100);

    }

    public void keySi(){

        Partition p = new Partition(synthesizer);
        p.play("B");
        p.setVolume(100);

    }
}
