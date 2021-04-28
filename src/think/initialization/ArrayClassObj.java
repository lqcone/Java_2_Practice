package think.initialization;

import static net.mindview.util.Print.print;

class ArrayShow{
    void show(){print("hello!");}
}

public class ArrayClassObj {
    public static void main(String args[]){
        //
        ArrayShow a[]=new ArrayShow[10];
        print("length of a="+a.length);
        for(int i=0;i<a.length;i++){
            a[i].show();
        }
    }
}
