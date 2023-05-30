package UiListener;
import javax.swing.*;
/*
 GUI的小窗口 演示监听器
 */
public class MyFrame extends JFrame {
    public static void main(String[] args){
        //1.创建小窗口对象 （被监听的对象）
        MyFrame myFrame=new MyFrame();
        //设置窗口名称
        myFrame.setName("小窗口名称...");
        //设置窗口宽高
        myFrame.setBounds(0,0,200,180);
        //设置窗口显示
        myFrame.setVisible(true);
        //在事件上绑定监听器
        myFrame.addWindowListener(new MyWindowListener());
    }
}

