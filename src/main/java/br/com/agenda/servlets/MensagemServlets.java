package br.com.agenda.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MensagemServlets extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5615101154240745669L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title> Nome do usuário</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<form action=\"/agenda-servlets/receberMensagem\">");
		out.println("<p>Digite seu nome: </p>");
		out.println("<p><input type=\"text\" name=\"nomeUsuario\"></p>");
		out.println("<p><button type=\"submit\">Enviar!</button></p>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}

	
}
