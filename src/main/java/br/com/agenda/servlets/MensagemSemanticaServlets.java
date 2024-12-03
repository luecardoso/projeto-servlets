package br.com.agenda.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MensagemSemanticaServlets extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4250344464142443134L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title> Nome do usuário</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<form action=\"/agenda-servlets/mensagem\" method=\"post\">");
		out.println("<p>Digite seu nome: </p>");
		out.println("<p><input type=\"text\" name=\"nomeUsuario\"></p>");
		out.println("<p><button type=\"submit\">Enviar!</button></p>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nomeUsuario = req.getParameter("nomeUsuario");
		PrintWriter out = resp.getWriter();
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
