package kr.co.rland.web.admin.menu;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.co.rland.web.menu.Menu;
import kr.co.rland.web.menu.MenuRepository;

@WebServlet("/admin/menu/list")
public class ListServlet extends HttpServlet {
	MenuRepository repository;

	public ListServlet() {
		repository = new MenuRepository();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Menu> list = repository.findAll(1);

		req.setAttribute("list", list);

		req.getRequestDispatcher("list.jsp").forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

}
