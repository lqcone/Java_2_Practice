package think.polymorphism.music3;

import think.polymorphism.music.Note;

public class Music3 {
    public static void tune(Instrument i){
        i.play(Note.B_FLAT);
    }
    public static void tuneAll(Instrument e[]){
        for(Instrument i:e){
            tune(i);
        }
    }
    public static void main(String args[]){
        Instrument orchestra[]={new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new WoodWind()
        };
        tuneAll(orchestra);
    }
}
