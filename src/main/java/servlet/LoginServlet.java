package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String id = request.getParameter("id");
	    String pass = request.getParameter("pass");
	    
	    System.out.println("Get ID[" + id + "]");
	    System.out.println("Get PASS[" + pass + "]");
	    
	    Bean bean = new Bean(id, pass);
	    
        String page = "ng_page.jsp";
	    if (bean.login()) { 
	        page = "ok_page.jsp";
	    }
	    
        // requestの中に属性(Attribute)を設定する
        // ※属性(Attribute)はサーバ内で値のやり取りをする際に、使用する
        request.setAttribute("bean", bean);
	    
        // フォワードするサーブレット(SimpleDispatchServlet2)にディスパッチする処理
        RequestDispatcher dispatch = request.getRequestDispatcher(page);
        dispatch.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
