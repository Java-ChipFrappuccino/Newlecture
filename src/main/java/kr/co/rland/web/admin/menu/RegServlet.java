package kr.co.rland.web.admin.menu;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.co.rland.web.menu.Menu;
import kr.co.rland.web.menu.MenuRepository;

@WebServlet("/admin/menu/reg")
public class RegServlet extends HttpServlet {
	private MenuRepository repository;
	
	public RegServlet() {
		repository = new MenuRepository();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("GET요청");
		 request
		   .getRequestDispatcher("reg.jsp")
		   .forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("POST요청");
		String korName = request.getParameter("kor-name");
		String engName = request.getParameter("eng-name");
		String price = request.getParameter("price");
		String img = request.getParameter("img");
//		System.out.println(korName);
		
		Menu menu = new Menu();
		menu.setKorName(korName);
		menu.setEngName(engName);
		menu.setPrice(Integer.parseInt(price));
		menu.setImage(engName+".png");
		menu.setLike(0);
		menu.setId(0);
		repository.save(menu);
		
		response.sendRedirect("/admin/menu/list");
	}
	
//	@Override
//	protected void service(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//			super.service(request, response);
//		response.setContentType("text/html; charset=utf-8");
//		
////		String title = request.getParameter("t");
////		   String content = request.getParameter("c");
//		
//	if (request.getMethod().equals("POST")) {
//		String korName = request.getParameter("kor-name");
//		System.out.println(korName);
//		
//		response.sendRedirect("/menu/list");
//	
//		return;
//	}
//		   
//		   request
//		   .getRequestDispatcher("reg.jsp")
//		   .forward(request, response);
//	}
}
