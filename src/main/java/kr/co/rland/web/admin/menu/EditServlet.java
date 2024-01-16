package kr.co.rland.web.admin.menu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.co.rland.web.menu.Menu;
import kr.co.rland.web.menu.MenuRepository;
@WebServlet("/admin/menu/edit")
public class EditServlet extends HttpServlet{
	MenuRepository repository;
	
	public EditServlet() {
		repository = new MenuRepository();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		List<Menu> list = repository.findAll(1);
		Menu menu = new Menu();
		int id = Integer.parseInt(req.getParameter("s"));
		menu = repository.findByld(id);
		
//		req.setAttribute("s", id);
		req.setAttribute("menu", menu);
		req.getRequestDispatcher("edit.jsp").forward(req, resp);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Menu menu = new Menu();
		String korName = req.getParameter("kor-name");
		String engName = req.getParameter("eng-name");
		String price = req.getParameter("price");
		int id = Integer.parseInt(req.getParameter("id"));
//		String img = req.getParameter("img");
//		int like = 0;
		
		menu = repository.findByld(id);
		menu.setKorName(korName);
		menu.setEngName(engName);
		menu.setPrice(Integer.parseInt(price));
		List<Menu> list = new ArrayList<>();
		list = repository.findAll();
		list.set(id, menu);
		resp.sendRedirect("/admin/menu/list");
	}

}
