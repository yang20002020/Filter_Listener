package filter;

import javax.servlet.*;
import java.io.IOException;
/*
过滤器的入门案例
 */
public class FilterDemo1 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("FilterDemo1执行了....");
    }

    @Override
    public void destroy() {

    }
}
