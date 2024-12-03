package br.com.agenda.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ReceberMensagemServlets extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4131129718056693771L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeUsuario = request.getParameter("nomeUsuario");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Mensagem recebida</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>Olá, "+ nomeUsuario+ "</p>");
		out.println("</body>");
		out.println("</html>");
	}

	
}
