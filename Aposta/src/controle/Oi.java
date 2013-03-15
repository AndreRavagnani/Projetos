package controle;

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
			String nome = request.getParameter("nome");
			request.setAttribute("nome", nome);
			
			String idade = request.getParameter("idade");
			request.setAttribute("idade", idade);
			
			String sexo = request.getParameter("sexo");
			request.setAttribute("sexo", sexo);
			
			String email = request.getParameter("email");
			request.setAttribute("email", email);
			
			String Brasil1 = request.getParameter("Brasil1");
			request.setAttribute("Brasil1", Brasil1);

			String Brasil2 = request.getParameter("Brasil2");
			request.setAttribute("Brasil2", Brasil2);

			String Brasil3 = request.getParameter("Brasil3");
			request.setAttribute("Brasil3", Brasil3);

			String Italia1 = request.getParameter("Italia1");
			request.setAttribute("Italia1", Italia1);

			String Italia2 = request.getParameter("Italia2");
			request.setAttribute("Italia2", Italia2);

			String Italia3 = request.getParameter("Italia3");
			request.setAttribute("Italia3", Italia3);
			
			String Espanha1 = request.getParameter("Espanha1");
			request.setAttribute("Espanha1", Espanha1 );

			String Espanha2 = request.getParameter("Espanha2");
			request.setAttribute("Espanha2", Espanha2);

			String Espanha3 = request.getParameter("Espanha3");
			request.setAttribute("Espanha3", Espanha3);

			String Japao1 = request.getParameter("Japao1");
			request.setAttribute("Japao1", Japao1);

			String Japao2 = request.getParameter("Japao2");
			request.setAttribute("Japao2", Japao2);

			String Japao3 = request.getParameter("Japao3");
			request.setAttribute("Japao3", Japao3);

			String Mexico1 = request.getParameter("Mexico1");
			request.setAttribute("Mexico1", Mexico1);

			String Mexico2 = request.getParameter("Mexico2");
			request.setAttribute("Mexico2", Mexico2);

			String Mexico3 = request.getParameter("Mexico3");
			request.setAttribute("Mexico3", Mexico3);

			String Taiti1 = request.getParameter("Taiti1");
			request.setAttribute("Taiti1", Taiti1);

			String Taiti2 = request.getParameter("Taiti2");
			request.setAttribute("Taiti2", Taiti2);

			String Taiti3 = request.getParameter("Taiti3");
			request.setAttribute("Taiti3", Taiti3);

			String Uruguai1 = request.getParameter("Uruguai1");
			request.setAttribute("Uruguai1", Uruguai1);

			String Uruguai2 = request.getParameter("Uruguai2");
			request.setAttribute("Uruguai2", Uruguai2);

			String Uruguai3 = request.getParameter("Uruguai3");
			request.setAttribute("Uruguai3", Uruguai3);

			String Nigeria1 = request.getParameter("Nigeria1");
			request.setAttribute("Nigeria1", Nigeria1);

			String Nigeria2 = request.getParameter("Nigeria2");
			request.setAttribute("Nigeria2", Nigeria2);

			String Nigeria3 = request.getParameter("Nigeria3");
			request.setAttribute("Nigeria3", Nigeria3);
			
			
			 RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp"); 
			 dispatcher.forward(request,response);
			}
	}


