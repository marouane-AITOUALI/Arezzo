package arezzo.controller;

import partition.Partition;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
import java.util.ArrayList;

public class ControllerPiano {

    private Synthesizer synthesizer;

    private ArrayList<String> melodie = new ArrayList<>();
    private Partition p;

    {
        try {
            synthesizer = MidiSystem.getSynthesizer();
            synthesizer.open();
            this.p = new Partition(synthesizer);
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }
    }



    public void keyDo(){
        p.play("C");
        p.setVolume(100);
        melodie.add("C");
    }

    public void keyRe(){
        p.play("D");
        p.setVolume(100);
        melodie.add("D");
    }

    public void keyMi(){
        p.play("E");
        p.setVolume(100);
        melodie.add("E");
    }

    public void keyFa(){
        p.play("F");
        p.setVolume(100);
        melodie.add("F");
    }

    public void keySol(){
        p.play("G");
        p.setVolume(100);
        melodie.add("G");
    }

    public void keyLa(){
        p.play("A");
        p.setVolume(100);
        melodie.add("A");
    }

    public void keySi(){
        p.play("B");
        p.setVolume(100);
        melodie.add("B");
    }

    public void jouerMelodie(){
        StringBuffer s = new StringBuffer();
        for(int i =0; i < melodie.size();i++){
            s.append(melodie.get(i));
        }
        melodie.clear();
        p.setVolume(100);
        p.play(s.toString());

    }

    public void doDiaz(){
        p.play("^C");
        p.setVolume(100);
        melodie.add("^C");
    }

    public void reDiaz(){
        p.play("^D");
        p.setVolume(100);
        melodie.add("^D");
    }

    public void faDiaz(){
        p.play("^F");
        p.setVolume(100);
        melodie.add("^F");
    }

    public void solDiaz(){
        p.play("^G");
        p.setVolume(100);
        melodie.add("^G");
    }

    public void laDiaz(){
        p.play("^A");
        p.setVolume(100);
        melodie.add("^A");
    }
}
