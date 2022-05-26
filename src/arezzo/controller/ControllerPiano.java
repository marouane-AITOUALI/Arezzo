package arezzo.controller;

import partition.Partition;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
import java.util.ArrayList;

public class ControllerPiano {

    private Synthesizer synthesizer;
    private ControllerBoard controlBoard = new ControllerBoard();
    private ArrayList<String> melodie = new ArrayList<>();

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
        melodie.add("C");
        controlBoard.add("C");

    }

    public void keyRe(){
        Partition p = new Partition(synthesizer);
        p.play("D");
        p.setVolume(100);
        melodie.add("D");
        controlBoard.add("D");
    }

    public void keyMi(){
        Partition p = new Partition(synthesizer);
        p.play("E");
        p.setVolume(100);
        melodie.add("E");
        controlBoard.add("E");
    }

    public void keyFa(){

        Partition p = new Partition(synthesizer);
        p.play("F");
        p.setVolume(100);
        melodie.add("F");
        controlBoard.add("F");
    }

    public void keySol(){

        Partition p = new Partition(synthesizer);
        p.play("G");
        p.setVolume(100);
        melodie.add("G");
        controlBoard.add("G");
    }

    public void keyLa(){

        Partition p = new Partition(synthesizer);
        p.play("A");
        p.setVolume(100);
        melodie.add("A");
        controlBoard.add("A");
    }

    public void keySi(){

        Partition p = new Partition(synthesizer);
        p.play("B");
        p.setVolume(100);
        melodie.add("B");
        controlBoard.add("B");
    }

    public void jouerMelodie(){
        StringBuffer s = new StringBuffer();
        for(int i =0; i < melodie.size();i++){
            s.append(melodie.get(i));
        }
        melodie.clear();
        Partition p = new Partition(synthesizer);
        p.setVolume(100);
        p.play(s.toString());

    }

    public void doDiaz(){
        Partition p = new Partition(synthesizer);
        p.play("^C");
        p.setVolume(100);
        melodie.add("^C");
        controlBoard.add("^C");
    }

    public void reDiaz(){
        Partition p = new Partition(synthesizer);
        p.play("^D");
        p.setVolume(100);
        melodie.add("^D");
        controlBoard.add("^D");
    }

    public void faDiaz(){
        Partition p = new Partition(synthesizer);
        p.play("^F");
        p.setVolume(100);
        melodie.add("^F");
        controlBoard.add("^F");
    }

    public void solDiaz(){
        Partition p = new Partition(synthesizer);
        p.play("^G");
        p.setVolume(100);
        melodie.add("^G");
        controlBoard.add("^G");
    }

    public void laDiaz(){
        Partition p = new Partition(synthesizer);
        p.play("^A");
        p.setVolume(100);
        melodie.add("^A");
        controlBoard.add("^A");
    }
}
