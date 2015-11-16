package webTest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

@WebServlet(name="GenericDemoServlet",urlPatterns={"/generic"},initParams={
		@WebInitParam(name="admin",value="Harry Taciak"),
		@WebInitParam(name="email",value="admin@example.com")
	}
)
public class GenericDemoServlet extends GenericServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletConfig sc=getServletConfig();
		String admin=sc.getInitParameter("admin");
		String email=sc.getInitParameter("email");
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.print("<html><head>ServletConfig Demo</head><br/><body>"+"Admin:"+admin+"<br/>Email:"
					+email+"</body></html>");
	}

}
