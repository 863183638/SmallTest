import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Dh'pc on 2015/7/4.
 */
public class Servlet extends HttpServlet {
    public int calculate(int a,int b,int c){
        int sum=0;
        switch (c){
            case 0:
                sum= a+b;
                break;
            case 1:
                sum= a-b;
                break;
            case 2:
                sum= a*b;
                break;
            case 3:
                sum= a/b;
                break;
        }
        return sum;
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        String a1=request.getParameter("first");
        String b1=request.getParameter("second");
        String c1=request.getParameter("flag");
        int a=Integer.valueOf(a1);
        int b=Integer.valueOf(b1);
        int c=Integer.valueOf(c1);
        int responseText=calculate(a,b,c);
        out.print(responseText);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
