package book;

public class E4_1 {
    public static void main(String args[]){
        XiyoujiRenwu zhubajie;//声明对象
        zhubajie=new XiyoujiRenwu();//使用默认构造方法
    }
}

class XiyoujiRenwu{
    float height,weight;
    String head,ear;
    void speak(String s){
        System.out.println(s);
    }
}
