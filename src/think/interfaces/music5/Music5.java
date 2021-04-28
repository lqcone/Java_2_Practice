package think.interfaces.music5;

import think.polymorphism.music.Note;

import static net.mindview.util.Print.print;

interface Instrument {
    //接口中的变量必须为常量
    int VALUE=5;
    //接口中的方法不能定义方法体
    //接口中的方法自动为public的
    void play(Note n);
    void adjust();
}

class Wind implements Instrument{
    public void play(Note n){
        print(this+".play()"+n);
    }
    public String toString(){return "Wind";}
    public void adjust(){print(this+".adjust()");}
}
class Percussion implements Instrument{
    public void play(Note n){
        print(this+".play()"+n);
    }
    public String toString(){return "Percussion";}
    public void adjust(){print(this+".adjust()");}
}
class Stringed implements Instrument{
    public void play(Note n){
        print(this+".play()"+n);
    }
    public String toString(){return "Stringed";}
    public void adjust(){print(this+".adjust()");}
}
class Brass extends Wind{
    public String ToString(){return "Brass";}
}
class WoodWind extends Wind{
    public String ToString(){return "WoodWind";}
}
public class Music5{
    static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Instrument e[]){
        for(Instrument i:e){
            tune(i);
        }
    }
    public static void main(String args[]){
        Instrument orchestra[]={new Wind(),new Percussion(),new Stringed(),new WoodWind(),new Brass()};
        tuneAll(orchestra);
    }

}