package filter;

import javax.servlet.*;
import java.io.IOException;

public class filterDemo33 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("FilterDemo33执行了......");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("FilterDemo33执行结束了......");
    }

    @Override
    public void destroy() {

    }
}
