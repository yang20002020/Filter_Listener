package fuyu.filter;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
/*
通用的字符集编码过滤器
 */
public class GenericEncodingFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }
/*
在过滤器中增强request对象，并将增强后的request对象传递给Servlet
 */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //增强servletRequest
        HttpServletRequest httpServlet=(HttpServletRequest) servletRequest;
        MyHttpServletRequest myReq= new MyHttpServletRequest(httpServlet);
        //增强对象之后，放行 ；将增强后的request对象传递给Servlet
        filterChain.doFilter(myReq,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
