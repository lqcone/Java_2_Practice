package practice;

public class SquareEquation {
    public static void main(String args[]){
        Animal a;
        Tiger b=new Tiger();
        a=b;
        Tiger c;
        c=(Tiger) a;
        c.climbTrees();
        Cat mimi;
       // if(a instanceof Cat){
        mimi=(Cat) a;
        Printer p1=new BWPrinter() ;
        mimi.play();//}
       // else
            System.out.println("mimi不是Cat及其子类创建的对象");


    }
}


class Animal {
    int height;
    void move(){
        System.out.println("Animal move");}
}
class Tiger extends Animal{
    int legs;
    void climbTrees(){}
    void move(){
        System.out.println("Tiger move");}
}
class Cat extends Animal{
    void play(){}
}
abstract class Printer{
   abstract void print();
}
class BWPrinter extends Printer{
     void print(){}
}

