package book;


class 植物{}

class Lader{
    float above;
    float bottom;
    float height;
    float area;
    float computeArea(){
        area=(above+bottom)*height/2.0f;
        return area;
    }
    void setHeight(float h){
        height=h;
    }
}

class Father{
    private String secrets;
    public int age;
    protected int assets;

}



class InitError{
    int x=10,y;
    void f(){
        int m;
        x=y;
    }
}

public class ClassShow {
}
