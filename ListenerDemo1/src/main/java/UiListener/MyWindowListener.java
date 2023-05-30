package UiListener;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
/*
监听对象
 */
public class MyWindowListener implements WindowListener {

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("窗口关闭...");
        MyFrame myFrame= (MyFrame) e.getSource();
        System.out.println(myFrame.getName());
        System.exit(0);
    }
    @Override
    public void windowOpened(WindowEvent e) {

    }



    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
