package think.polymorphism.music3;

import think.polymorphism.music.Note;

import static net.mindview.util.Print.print;

class Wind extends Instrument{
    void play(Note n){print("Wind.play()"+n);}
    String what(){return "Wind";}
    void adjust(){print("Adjust Wind");}
}
