package fuyu.filter;

import fuyu.domain.User;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
/*
权限过滤器
 */
public class PrivilegeFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
         //判断：判断用户是否已经登录了
         //如果登录了，放行。如果没有登录，回到登录页面
        HttpServletRequest req=(HttpServletRequest) servletRequest;
        User existUser=(User)req.getSession().getAttribute("existUser");
        //判断:
        if(existUser==null){
            //没有登录
            req.setAttribute("msg","您还没有登录！没有权限登录！");
            req.getRequestDispatcher("/login.jsp").forward(servletRequest,servletResponse);
        }else{
            //已经登录 ，放行
            filterChain.doFilter(servletRequest,servletResponse);
        }
    }

    @Override
    public void destroy() {

    }
}
