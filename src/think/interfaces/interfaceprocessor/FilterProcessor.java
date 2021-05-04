package think.interfaces.interfaceprocessor;

import think.interfaces.filters.*;

class FilterAdapter implements Processor{
    Filter filterAdapter;
    FilterAdapter(Filter filterAdapter){
        this.filterAdapter=filterAdapter;
    }
    public Waveform process(Object input){
        return filterAdapter.process((Waveform) input);
    }
    public String name(){return filterAdapter.name();}
}

public class FilterProcessor {
    public static void main(String args[]){
        Waveform w=new Waveform();
        Apply.process(new FilterAdapter(new LowPass(1.0)),w);
        Apply.process(new FilterAdapter(new HighPass(5.0)),w);
        Apply.process(new FilterAdapter(new BandPass(3.0,4.0)),w);
    }
}
