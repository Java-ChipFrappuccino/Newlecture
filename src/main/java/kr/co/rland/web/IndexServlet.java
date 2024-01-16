package kr.co.rland.web;

import java.io.IOException;
import java.io.PrintStream;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class IndexServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Hello Servlet!");
		
		PrintStream out = new PrintStream(response.getOutputStream());
		out.println("Hello Client? I'm Servlet#####");
		out.println("고양이 강아지");
	}
}