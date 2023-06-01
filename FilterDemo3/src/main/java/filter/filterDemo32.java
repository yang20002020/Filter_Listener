package filter;

import javax.servlet.*;
import java.io.IOException;

public class filterDemo32 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init。。。。。");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("FilterDemo32执行了......");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("FilterDemo32执行结束了......");
    }

    @Override
    public void destroy() {
        System.out.println("destroy。。。。。");
    }
}
