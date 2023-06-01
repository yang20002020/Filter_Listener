package filter;

import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;

public class filterDemo4 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //获得过滤器的名称
        String filterName = filterConfig.getFilterName();
        System.out.println(filterName);
        //获得初始化参数
        String username = filterConfig.getInitParameter("username");
        String password = filterConfig.getInitParameter("password");
        System.out.println(username);
        System.out.println(password);
        //获得所有初始化参数的名称
        Enumeration<String> initNames = filterConfig.getInitParameterNames();
           while(initNames.hasMoreElements()){
               String name=initNames.nextElement();
              String value= filterConfig.getInitParameter(name);
               System.out.println(name+"   "+value);
           }
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

    }

    @Override
    public void destroy() {

    }
}
