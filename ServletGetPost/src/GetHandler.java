

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetHandler
 */
@WebServlet("/GetHandler")
@WebInitParam(name = "employee",value="deepak")
public class GetHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetHandler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ServletContext servctx =  getServletContext();
		String value = servctx.getInitParameter("mysql");
	//	System.out.println(sc.getServletContext().getAttribute("mysql"));
		System.out.println("coming for contxt param " + value);
		System.out.println("--------");
		
		ServletConfig sc = getServletConfig();
		String dbname = sc.getInitParameter("dbname");
		System.out.println(dbname);
		
		PrintWriter pw = response.getWriter();
		pw.println("<html><body>");
		
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		pw.println("name = " + name + "<br>address = " + address);
		pw.println("</body></html>");
		System.out.println(name);
		System.out.println(address);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
