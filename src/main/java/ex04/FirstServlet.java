package ex04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/first4")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
//		//sendRedirect
//		response.sendRedirect("second4?name=choi");
//		//Refresh
//		response.setHeader("Refresh", "1; url=second4?name=choi");
//		//location
//		out.print("<script>");
//		out.print("location.href='second4?name=seeun'");
//		out.print("</script>");
		//dispatch
		RequestDispatcher disp =  request.getRequestDispatcher("second4?text=hello");
		disp.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
