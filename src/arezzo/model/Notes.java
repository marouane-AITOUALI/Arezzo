package arezzo.model;

import java.util.ArrayList;

public class Notes {

    public ArrayList<String> notes = new ArrayList<>();

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

    public void reset(){
        notes.clear();
    }
}
