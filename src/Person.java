public class Person {    //公有类申明
    //Persion类里定义的一个方法
    void speakHello(){

        System.out.println("nice to meet you");

    }
}

 class Xiti{
    /*
    * 以下是一个main方法
    * JVM将首先执行该方法
    * */
    public static void main(String args[]){
        Person zhang=new Person();     //定义一个Persion类型的对象
        zhang.speakHello();            //调用对象里的方法
    }
}
