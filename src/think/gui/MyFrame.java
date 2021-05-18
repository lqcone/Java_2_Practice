package think.gui;

import javax.swing.*;

public class MyFrame extends JFrame {
    public MyFrame(String name){
        super(name);
        this.setLocation(100,100);
        this. setBounds(400,300,300,300);

        this.setVisible(true);
    }
    public MyFrame(){
        this.setLocation(100,100);
        this.setBounds(400,300,300,300);

        this.setVisible(true);
    }
    public void showTime(){
        JButton b1=new JButton("时间");
    }
}
