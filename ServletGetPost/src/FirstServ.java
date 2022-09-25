import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServ extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("serice method");
		ServletConfig sc = getServletConfig();
		String dbname = sc.getInitParameter("dbname");
		System.out.println("coming from config param " + dbname);
		//String value = sc.getInitParameter("dbname");
		
		ServletContext servctx =  getServletContext();
		String value = servctx.getInitParameter("mysql");
	//	System.out.println(sc.getServletContext().getAttribute("mysql"));
		System.out.println("coming for contxt param " + value);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy method");
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init method");
	}

}
