package arezzo.controller;

import partition.Partition;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

public class ControllerPiano {

    private Synthesizer synthesizer;

    public void keyDo(){
        try {
            synthesizer = MidiSystem.getSynthesizer();
            synthesizer.open();
            Partition p = new Partition(synthesizer);
            p.play("C");
            p.setVolume(100);

        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void keyRe(){
        try {
            synthesizer = MidiSystem.getSynthesizer();
            Partition p = new Partition(synthesizer);
            p.play("D");
            p.setVolume(100);

        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void keyMi(){
        try {
            synthesizer = MidiSystem.getSynthesizer();
            Partition p = new Partition(synthesizer);
            p.play("E");
            p.setVolume(100);

        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void keyFa(){
        try {
            synthesizer = MidiSystem.getSynthesizer();
            Partition p = new Partition(synthesizer);
            p.play("F");
            p.setVolume(100);

        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void keySol(){
        try {
            synthesizer = MidiSystem.getSynthesizer();
            Partition p = new Partition(synthesizer);
            p.play("G");
            p.setVolume(100);

        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void keyLa(){
        try {
            synthesizer = MidiSystem.getSynthesizer();
            Partition p = new Partition(synthesizer);
            p.play("A");
            p.setVolume(100);

        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void keySi(){
        try {
            synthesizer = MidiSystem.getSynthesizer();
            Partition p = new Partition(synthesizer);
            p.play("B");
            p.setVolume(100);

        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }
    }
}
