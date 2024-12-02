package br.com.agenda.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloServlets extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5188168138372338872L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Mensagem enviada do Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>Vim pelo Servlet!</p>");
		out.println("</body>");
		out.println("</html>");
	}

	
}
