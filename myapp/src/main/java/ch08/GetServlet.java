package ch08;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ch08/getServlet")
public class GetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//service가 없으면 자동적으로 doGet 호출
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String msg = request.getParameter("msg");
		out.println("<h1>Get Servlet</h1>"); 
		out.println("msg : "+ msg); 
	}

}
