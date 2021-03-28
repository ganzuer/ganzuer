package com;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class demo extends JFrame {
    public static void main(String[] args){
        demo d= new demo();
        pan p =new pan();
        d.add(p);
        d.setVisible(true);
        d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        d.setBounds(500,400,500,500);
        d.setTitle("字符串的简易更改" );
    }
}
class pan extends JPanel implements ActionListener{
    JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9,jb10;
    JLabel jl1,jl2,jl3,jl4;
    JTextField jt1,jt2;
    pan(){
        this.setLayout(null);

        jb1 =new JButton("字符(串)索引");
        jb2 =new JButton("字符最后索引");
        jb3 =new JButton("字符串长度");
        jb4 =new JButton("字符串比较");
        jb5 =new JButton("转换小写");
        jb6 =new JButton("转换大写");
        jb7 =new JButton("整形转字符串");
        jb8 =new JButton("分割 空 字符串");
        jb9 =new JButton("切割字符串");
        jb10=new JButton("初始化");
        jl1 =new JLabel("输入字符(串):");
        jl2 =new JLabel("查找字符(串)在索引:");
        jl3 =new JLabel("字符(串)在索引为：");
        jl4 =new JLabel("结果");
        jt1 =new JTextField("");
        jt2 =new JTextField("");
        this.add(jb1);
        this.add(jb2);
        this.add(jb3);
        this.add(jb4);
        this.add(jb5);
        this.add(jb6);
        this.add(jb7);
        this.add(jb8);
        this.add(jb9);
        this.add(jb10);
        this.add(jl1);
        this.add(jl2);
        this.add(jl3);
        this.add(jl4);
        this.add(jt1);
        this.add(jt2);
        jb1.setBounds(50,380,130,50);
        jb2.setBounds(200,380,130,50);
        jb3.setBounds(50,200,130,50);
        jb4.setBounds(200,200,130,50);
        jb5.setBounds(50,260,130,50);
        jb6.setBounds(200,260,130,50);
        jb7.setBounds(50,320,130,50);
        jb8.setBounds(200,320,130,50);
        jb9.setBounds(350,380,130,50);
        jb10.setBounds(350,320,130,50);
        jl1.setBounds(50,50,150,50);
        jl2.setBounds(50,100,150,50);
        jl3.setBounds(50,150,150,50);
        jl4.setBounds(200,150,100,50);
        jt1.setBounds(200,60,150,25);
        jt2.setBounds(200,110,150,25);
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        jb4.addActionListener(this);
        jb5.addActionListener(this);
        jb6.addActionListener(this);
        jb7.addActionListener(this);
        jb8.addActionListener(this);
        jb9.addActionListener(this);
        jb10.addActionListener(this);
        jt1.addActionListener(this);
        jt2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        String message = e.getActionCommand();
        switch (message){
            case "字符(串)索引" :
                way1();
                break;
            case "字符最后索引" :
                way2();
                break;
            case "字符串长度" :
                way3();
                break;
            case "字符串比较" :
                way4();
                break;case "转换小写" :
                way5();
                break;
            case "转换大写" :
                way6();
                break;
            case "整形转字符串" :
                way7();
                break;
            case "分割 空 字符串" :
                way8();
                break;
            case "切割字符串" :
                way9();
                break;
            case "初始化" :
                way10();
                break;
        }
    }
    void way1(){
        String a =jt1.getText();
        String b =jt2.getText();
        int c =a.indexOf(b);
        String d =String.valueOf(c);
        jl4.setText(d);
    }
    void way2(){
        String a =jt1.getText();
        String b =jt2.getText();
        int c =a.lastIndexOf(b);
        String d =String.valueOf(c);
        jl4.setText(d);
    }
    void way3(){
        String a =jt1.getText();
        int b =a.length();
        String c = String.valueOf(b);
        jl4.setText(c);
    }
    void way4(){
        String a =jt1.getText();
        String b =jt2.getText();
        boolean c =a.equals(b);
        if(c==false){
            jl4.setText("不相等");
        }else{
            jl4.setText("相等");
        }
    }
    void way5(){
        String a =jt1.getText();
        String b =a.toLowerCase(Locale.ROOT);
        jl4.setText(b);
    }
    void way6(){
        String a =jt1.getText();
        String b =a.toUpperCase(Locale.ROOT);
        jl4.setText(b);
    }
    void way7(){
        String a =jt1.getText();
        String b =String.valueOf(a);
        jl4.setText(b);
    }
    void way8(){
        String a =jt1.getText();
        String[] b =a.split(" ");
        String f="";
        for(int c =0;c<=b.length-1;c++){
            String e =b[c]+" ";
            f=f+e;
        }
        jl4.setText(f);
    }
    void way9(){
        String a =jt1.getText();
        String b =jt1.getText();
        int c =Integer.parseInt(b);
        String d=a.substring(c);
        jl4.setText(d);
    }
    void way10(){
        jt1.setText("");
        jt2.setText("");
        jl4.setText("结果");
    }
}
