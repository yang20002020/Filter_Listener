package webListener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebServlet;

/*
监听ServletRequest对象的创建和销毁的监听器
 */

public class MyServletQuestListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        System.out.println("servletRequest对象被销毁了......");
    }

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        System.out.println("servletRequest对象被创建了....");
    }
}
