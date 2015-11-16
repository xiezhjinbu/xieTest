package webTest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="FormServlet",urlPatterns={"/form"})
public class FormServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final String TITLE="Order Form";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		pw.println("<html><head>");
		pw.println("<title>"+TITLE+"</title></head>");
		pw.println("<body><h1>"+TITLE+"</h1>");
		pw.println("<form method='post'>");
		pw.println("<table><tr><td>name:</td>");
		pw.println("<td><input name='name'/></td></tr>");
		pw.println("<td>&nbsp;</td>");
		pw.println("<tr><td><input type='reset'/><input type='submit'/></td></tr>");
		pw.println("</table></form></body></html>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		pw.println("<html><head>");
		pw.println("<title>"+TITLE+"</title></head>");
		pw.println("<body><h1>"+TITLE+"</h1>");
		pw.println("<form method='post'>");
		pw.println("<table><tr><td>name:</td>");
		pw.println("<td>"+req.getParameter("name")+"</td></tr>");
		pw.println("</table></form></body></html>");
	}
}
