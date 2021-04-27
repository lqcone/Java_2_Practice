package think.initialization;

public class OverloadingVarargs {
    static void f(Character... args){
        System.out.print("first");
        for(Character c:args){
            System.out.print(" "+c);
        }
        System.out.println();
    }
    static void f(Integer... args){
        System.out.print("second");
        for(Integer c:args){
            System.out.print(" "+c);
        }
        System.out.println();
    }
    static void f(Long... args){
        System.out.print("third");
    }
    public static void main(String[] args){
        f('a','b','c');
        f(1,2,3);
        f(0L);
    }
}
