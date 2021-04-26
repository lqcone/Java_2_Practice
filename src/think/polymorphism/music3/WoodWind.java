package think.polymorphism.music3;

import think.polymorphism.music.Note;

import static net.mindview.util.Print.print;

public class WoodWind extends Wind{
    void play(Note n){print("WoodWind.play()"+n);}
    void adjust(){print("Adjusting WoodWind");}
}
