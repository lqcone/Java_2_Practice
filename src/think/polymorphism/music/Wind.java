package think.polymorphism.music;

class Wind extends Instrument{
    //重写接口方法
    public void play(Note n){
        System.out.println("Wind.play()"+n);
    }
}
