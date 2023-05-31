package webListener;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
/*
 监听HttpSession的创建和销毁的监听器
 */

public class MyHttpSessionListener implements HttpSessionListener {
    //监听HttpSession的创建
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        System.out.println("HttpSession对象被创建了...");
    }
    //监听HttpSession的销毁
    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        System.out.println("HttpSession对象被销毁了....");
    }
}
