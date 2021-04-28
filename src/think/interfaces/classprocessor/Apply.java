package think.interfaces.classprocessor;

import java.util.Arrays;

import static net.mindview.util.Print.print;

class Processor{
    public String name(){
        return getClass().getSimpleName();
    }
    Object process(Object input){return input;}
}
class Upcase extends Processor{
    String process(Object input){
        return ((String)input).toUpperCase();
    }
}
class Downcase extends Processor{
    String process(Object input){
        return ((String)input).toLowerCase();
    }
}

class Splitter extends Processor{
    String process(Object input){
        //调用split()方法将input对象用空格分格
        return Arrays.toString(((String)input).split(" "));
    }
}

public class Apply {
    public static void process(Processor p,Object s){
        print("Using Process "+p.name());
        print(p.process(s));
    }
    public static String s="Disagreement with beliefs is by definition incorrect";
    //static Random s=new Random(22);
    public static void main(String args[]){
        process(new Upcase(),s);
        process(new Downcase(),s);
        process(new Splitter(),s);
    }
}
