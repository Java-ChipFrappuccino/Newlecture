package kr.co.rland.web.menu;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Iterator;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/menu/detail")
public class DetailServlet extends HttpServlet {
	MenuRepository repository;
	
	public DetailServlet() {
		repository = new MenuRepository();
	}
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		System.out.println("메뉴리스트");

//		response.setCharacterEncoding("euc-kr"); //실제 인코딩
		response.setContentType("text/html; charset=utf-8"); //읽을때 이 형식으로 읽어~
//		PrintStream out = new PrintStream(response.getOutputStream(),true,"utf-8");
		
//		MenuRepository repository = new MenuRepository();
		int id = Integer.parseInt(request.getParameter("s")); 
//		int id = 3;
		Menu menu = repository.findByld(id);
//		int size = menuList.size();


		//for (int i = 0; i < size; i++) {
//		Menu menu = menuList.get(id-1);
			
			request.setAttribute("menu", menu);
			request.getRequestDispatcher("detail.jsp").forward(request, response);
		}

	}
//}
