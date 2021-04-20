package book;

class People{
    private int averHeight=166;
    public int getAverHeight(){
        return averHeight;
    }
}
class ChinaPeople extends People{
    int height;
    public void setHeight(int h){
        height=h;
    }
    public int getHeight(){
        return height;
    }
}
class USPeople extends People{}

public class E5_2 {
    public static void main(String args[]){
        ChinaPeople zhangSan=new ChinaPeople();
        System.out.println("子类对象未继承的averageHeitht的值是："+zhangSan.getAverHeight());
        zhangSan.setHeight(178);
        System.out.println("子类对象的实例变量height的值是："+zhangSan.getHeight());

        boolean b1,b2,b3;
        People p=new People();
        System.out.println(zhangSan instanceof People);
        System.out.println(zhangSan instanceof ChinaPeople);
        System.out.println(p instanceof ChinaPeople);


    }
}
