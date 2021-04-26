package think.polymorphism.music3;

import think.polymorphism.music.Note;

import static net.mindview.util.Print.print;

class Instrument {
    void play(Note n){print("Instrument.play()"+n);}
    String what(){return "Instrument";}
    void adjust(){print("Adjusting Instrument");}
}
