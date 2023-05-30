package Weblistener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/*
ServletContextListener 监听器

事件源：ServletContext
监听器：MyServletContextListener
事件源和监听器绑定：通过配置方式绑定
 */
public class MyServletContextListener implements ServletContextListener {
    //监听ServletContext对象的创建
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContext对象被创建了....");
    }
    //监听ServletContext对象的销毁
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContext对象被销毁了.....");
    }
}
