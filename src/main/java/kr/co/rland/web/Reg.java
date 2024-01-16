package kr.co.rland.web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/notice-reg")
public class Reg extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		
		String title = request.getParameter("t");
		   String content = request.getParameter("c");
		   
		   PrintWriter pw = new PrintWriter(response.getOutputStream(), true);
		   pw.println(title);
		   pw.print(content);
		   pw.flush();
	}
}
