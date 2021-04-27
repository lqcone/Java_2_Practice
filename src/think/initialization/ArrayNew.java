package think.initialization;

import java.util.Arrays;
import java.util.Random;

import static net.mindview.util.Print.print;

public class ArrayNew {
    public static void main(String args[]){
        int a[];
        Random rand=new Random(47);
        int r=rand.nextInt();
        if(r%2==0)
            a=new int[r];
        else
            a=new int[2*r];
        print("length of a="+a.length);
        //Arrays.toString()方法属于java.util标准库，产生一维数组可打印版本
        print(Arrays.toString(a));
    }
}
