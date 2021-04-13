package practice;

import book.Tom;

public class Family {
    TV homeTV;
    void byTV(TV tv){
        homeTV=tv;
    }
    void remoteControl(int m){
        homeTV.setChannel(m);
    }
    void seeTV(){
        homeTV.showProgram();
    }
}


class Jerry{

    void g(){
        Tom cat1=new Tom();
        //cat1.weight=10;
        //cat1.f();
    }

}