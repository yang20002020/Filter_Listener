package bean;
import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;
import java.io.Serializable;

/*
监听HttpSession中的对象的钝化和活化的监听器
 */
public class Bean2 implements HttpSessionActivationListener, Serializable {
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sessionWillPassivate(HttpSessionEvent httpSessionEvent) {
         //钝化
        System.out.println("bean2被session钝化了....." );
    }

    @Override
    public void sessionDidActivate(HttpSessionEvent httpSessionEvent) {
           //活化
        System.out.println("bean2被session活化了....." );
    }
}
