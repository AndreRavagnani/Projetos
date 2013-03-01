package br.com.agenda;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/oi")
public class Oi extends HttpServlet {
	@Override
	
		
		public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
			Date acesso = new Date();
			PrintWriter out = response.getWriter();
			out.println("<html><body><h1> A data do acesso é " + acesso + "</h1></body></html>" );	
		}
		public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
			String idade = request.getParameter("idade");
			String sexo = request.getParameter("sexo");
			String email = request.getParameter("email");
			String nome = request.getParameter("nome");
			String Brasil1 = request.getParameter("Brasil1");
			String Brasil2 = request.getParameter("Brasil2");
			String Brasil3 = request.getParameter("Brasil3");
			String Italia1 = request.getParameter("Italia1");
			String Italia2 = request.getParameter("Italia2");
			String Italia3 = request.getParameter("Italia3");
			String Espanha1 = request.getParameter("Espanha1");
			String Espanha2 = request.getParameter("Espanha2");
			String Espanha3 = request.getParameter("Espanha3");
			String Japao1 = request.getParameter("Japao1");
			String Japao2 = request.getParameter("Japao2");
			String Japao3 = request.getParameter("Japao3");
			String Mexico1 = request.getParameter("Mexico1");
			String Mexico2 = request.getParameter("Mexico2");
			String Mexico3 = request.getParameter("Mexico3");
			String Taiti1 = request.getParameter("Taiti1");
			String Taiti2 = request.getParameter("Taiti2");
			String Taiti3 = request.getParameter("Taiti3");
			String Uruguai1 = request.getParameter("Uruguai1");
			String Uruguai2 = request.getParameter("Uruguai2");
			String Uruguai3 = request.getParameter("Uruguai3");
			String Nigeria1 = request.getParameter("Nigeria1");
			String Nigeria2 = request.getParameter("Nigeria2");
			String Nigeria3 = request.getParameter("Nigeria3");
			PrintWriter out = response.getWriter();
			
			 RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp"); 
			 dispatcher.forward(request,response);
			
			out.println("<html><head><title> Casa De Apostas Ravagnani</title></head><body><h1>Bem Vindo A Casa De Apostas Ravagnani</h1><h2> Aberto As Apostas Para A Copa Das Confederações</h2><p> Favor Confirme os Seus Dados</br>Nome: "+ nome + " </br>Sexo: " + sexo + "</br>Email: " + email + "</body></html>");
		}
	}


