package fuyu.filter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.UnsupportedEncodingException;
/*
增强的类
 */
public class MyHttpServletRequest extends HttpServletRequestWrapper {
    private  HttpServletRequest request;
    public MyHttpServletRequest(HttpServletRequest request) {
        super(request);
        this.request=request;
    }
    //增强request.getParameter()方法
    @Override
    public String getParameter(String name) {
        //获取请求方法
        String method=request.getMethod();
        if("GET".equalsIgnoreCase(method)){
            //get方式的请求
            String value=super.getParameter(name);
            try {
                value=new String(value.getBytes("ISO-8859-1"),"UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
            return value;
        }else if("POST".equalsIgnoreCase(method)){
            //post方式的请求
            try {
                request.setCharacterEncoding("UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }

        }
        return super.getParameter(name);
    }
}
