package kr.co.rland.web.admin.menu;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.co.rland.web.menu.Menu;
import kr.co.rland.web.menu.MenuRepository;

@WebServlet("/admin/menu/detail")
public class DetailServlet extends HttpServlet {
	MenuRepository repository;

	public DetailServlet() {
		repository = new MenuRepository();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("s"));
		Menu menu = repository.findByld(id);

		req.setAttribute("menu", menu);
		req.getRequestDispatcher("detail.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

}
