package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdditionServlet
 */
@WebServlet("/InputServlet")
public class InputServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdditionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = new PrintWriter();
//        // 値の受け取り
//        String val1 = request.getParameter("value1");
//        String val2 = request.getParameter("value2");
//        
//        // String → int 変換
//        int value1 = Integer.parseInt(val1);
//        int value2 = Integer.parseInt(val2);
//        
//        AdditionBean bean = new AdditionBean();
//        // Beanへの値の設定
//        bean.setValue1(value1);
//        bean.setValue2(value2);
//        // 加算処理 (ansに加算結果が格納される)
//        bean.addtionExecution();
//        
//        request.setAttribute("bean", bean);
//
//        // フォワード処理
//        RequestDispatcher dispatch = request.getRequestDispatcher(
//            "/addition_output.jsp");
//        dispatch.forward(request, response);
        
        
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}

