package think.polymorphism.music3;

import think.polymorphism.music.Note;

import static net.mindview.util.Print.print;

class Brass extends Wind{
    void play(Note n){print("Brass.play()"+n);}
    void adjust(){print("Adjusting Brass");}
}
