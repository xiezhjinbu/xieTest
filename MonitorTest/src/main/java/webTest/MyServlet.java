package webTest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(name="MyServlet",urlPatterns={"/my"})
public class MyServlet implements Servlet {

	private transient ServletConfig config;
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.config=config;
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return config;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String servletName=config.getServletName();
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.print("<html><head></head>"+"<body>hello from"+servletName+"</body></html>");
		
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "MyServlet";
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
