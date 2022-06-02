package arezzo.model;

import java.util.ArrayList;

public class Notes {

    public ArrayList<String> notes = new ArrayList<>();

    private String title = "Partition Random";

    public void add(String s){
        notes.add(s);
    }

    public String getNotes(){
        StringBuffer s = new StringBuffer();
        for(int i =0; i < notes.size();i++){
            s.append(notes.get(i));
        }
        return s.toString();
    }

    public void setMelodie(String notes){
        this.reset();
        for(int i = 0; i < notes.length(); i++){
            this.notes.add(String.valueOf(notes.charAt(i)));
        }
    }

    public void reset(){
        notes.clear();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void transposer() {
    }
}
