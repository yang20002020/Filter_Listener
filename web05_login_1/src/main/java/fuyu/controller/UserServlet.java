package fuyu.controller;

import fuyu.domain.User;
import fuyu.model.UserModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/UserServlet")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       try {
               //接收数据
               String username = req.getParameter("username");
               String password = req.getParameter("password");
               //封装数据
               User user = new User();
               user.setUsername(username);
               user.setPassword(password);
               //处理数据
               UserModel userModel = new UserModel();
              String password1= user.getPassword();
               User existUser = userModel.login(user);

               //根据页面结果页面跳转
               if (existUser == null) {
                   //登录失败
                   req.setAttribute("msg", "用户名或者密码错误");
                   req.getRequestDispatcher("/login.jsp").forward(req, resp);
               } else {
                   //登录成功
                   req.getSession().setAttribute("existUser", existUser);
                   String  stringPath=req.getContextPath();
                   System.out.println(stringPath);
                   resp.sendRedirect(req.getContextPath() + "/jsp/success.jsp");
               }
       }catch(Exception e){
           e.printStackTrace();
       }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
