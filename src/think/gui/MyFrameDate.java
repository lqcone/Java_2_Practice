package think.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

public class MyFrameDate extends JFrame{
    MyLabel dateLabel,randomPickLabel,asignValue;
    JTextField t1;
    public MyFrameDate(String name){
        super(name);
        Container contentPane=getContentPane();
        contentPane.setLayout(new FlowLayout());
        this.setLocation(100,100);
        this.setBounds(400,300,300,300);


       // this.setVisible(true);
    }
    public MyFrameDate(){
        Container contentPane=getContentPane();
        contentPane.setLayout(new FlowLayout());
        this.setLocation(100,100);
        this.setBounds(400,300,300,300);

       // this.setVisible(true);
    }
    public void showTime(){

        JButton b1=new JButton("时间");

        JButton b2=new JButton("点名");
        JButton b3=new JButton("正弦计算");
        t1=new JTextField(4);
        dateLabel=new MyLabel("点击开始显示日期");
        randomPickLabel=new MyLabel("点击开始点名");
        asignValue=new MyLabel("点击开始计算");

        b1.setPreferredSize(new Dimension(70,20));

        b2.setPreferredSize(new Dimension(70,20));

        this.add(b1);
        add(dateLabel);
        this.add(b2);
        add(randomPickLabel);
        add(t1);
        add(b3);
        add(asignValue);
        ActionListener listener3=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculation();
            }
        };
        ActionListener listener2=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                randomPick();
            }
        };
        ActionListener listener=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showDate();
            }
        };
        b1.addActionListener(listener);
        b2.addActionListener(listener2);
        b3.addActionListener(listener3);


    }
    void showDate(){
        Date nowTime=new Date();
        dateLabel.setText(nowTime.toString());
    }
    void randomPick(){
        Random random=new Random();
        int i=random.nextInt(36);
        if(i==0||i==1){
            randomPickLabel.setText("202036060130");
        }
        else if(i<=10){
            randomPickLabel.setText("20208117010"+i);
        }
        else
            randomPickLabel.setText("2020811701"+i);
    }
    void calculation(){
        double an=Double.parseDouble(t1.getText());
        double result=Math.sqrt(an);
        asignValue.setText(String.valueOf(result));
    }
}
