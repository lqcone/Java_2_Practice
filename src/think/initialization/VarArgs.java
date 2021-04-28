package think.initialization;

class A{}

public class VarArgs {
    static void printArray(Object[] args){
        //foreach语法用来遍历数组
        for(Object obj:args){
            System.out.print(obj+" ");
        }
        System.out.println();
    }

}
