package book;


import static net.mindview.util.Print.print;

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
    String s="Hello world!";


    public static void main(String[] args) {
        String s2="夏天来了";
        String s3="夏天来了";
        //print(s2==s3);
        int x;
        String s="999";
        x=Integer.parseInt(s);
        //print(new Father());
        StringBuffer str=new StringBuffer("你好");
        print(str);
    }

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
