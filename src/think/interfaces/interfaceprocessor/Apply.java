package think.interfaces.interfaceprocessor;

import static net.mindview.util.Print.print;

public class Apply {
    public static void process(Processor p,Object input){
        print("Using Processor "+p.name());
        print(p.process(input));
    }
}
