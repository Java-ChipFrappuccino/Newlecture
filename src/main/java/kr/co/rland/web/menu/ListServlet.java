package kr.co.rland.web.menu;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/menu/list")
public class ListServlet extends HttpServlet {
	MenuRepository repository;

	public ListServlet() {
		repository = new MenuRepository();
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		
		int categoryId = 1;
		String query = "";
		int order = 1;
		int size = 10;
		int page1 = 1;            
		{
		   String c = request.getParameter("c");
		   String q = request.getParameter("q");
		   String o = request.getParameter("o");
		   String s = request.getParameter("s");
		   String p = request.getParameter("p");
		   // list?    -> null
		   // list?s=  -> 1.null, 2."", 3. "0"
		   // ?page=1&size=10 -> QueryString
		   // ?p=1&s=10
		               
		   if(c!=null && !c.equals(""))
		      categoryId = Integer.parseInt(c);
		   if(q!=null && !q.equals(""))
		      query = q;
		   if(o!=null && !o.equals(""))
		      order = Integer.parseInt(o);
		   if(s!=null && !s.equals(""))
		      size = Integer.parseInt(s);            
		   if(p!=null && !p.equals(""))
		      page1 = Integer.parseInt(p);
		   //int page = ?;   // ?page=1,2,3,
		   System.out.printf("size:%d\n",size);
		}

//		   MenuRepository repository = new MenuRepository();
//			List<Menu> list = new ArrayList<>();
//		   list = repository.findAll(1);
			List<Menu> list = repository.findAll(1);
		   
		   request.setAttribute("list", list);
//		   request.setAttribute("name", "태평");
//		   request.set
		   request
		   .getRequestDispatcher("list.jsp")
		   .forward(request, response);

	}
}