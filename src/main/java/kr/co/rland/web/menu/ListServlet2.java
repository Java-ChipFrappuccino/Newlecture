package kr.co.rland.web.menu;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet("/menu/list")
public class ListServlet2 extends HttpServlet {
	MenuRepository repository;

	public ListServlet2() {
		repository = new MenuRepository();
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		{
//			String s_ = request.getParameter("s");
			String c_ = request.getParameter("c");
			// ?page=1&size=10 ->QueryString
			// ?p=1&s=10
			int size = 11;
			int category = 0;
//			if (s_ != null && !s_.equals(""))
//				size = Integer.parseInt(request.getParameter("s")); // ?size = 10
			if (c_ != null && !c_.equals(""))
				category = Integer.parseInt(request.getParameter("c")); // ?size = 10

//			String size = request.getParameter("size"); // ?size = 10
//		int page = ?; ?page=1,2,3,,,,
			System.out.printf("[size] = %s\n", size);

			PrintWriter pw = new PrintWriter(response.getOutputStream(), true);

			pw.write("<!DOCTYPE html>");
			pw.write("<html lang=\"en\">");
			pw.write("<head>\n");
			pw.write("    <meta charset=\"UTF-8\">");
			pw.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
			pw.write("    <title>Document</title>");
			pw.write("</head>");
			pw.write("<body>");
			pw.write("<div>전체:<a href=\"?s=\">전체</a></div>");
			pw.write("<div>커피:<a href=\"?c=1\">커피</a></div>");
			pw.write("<div>피지오:<a href=\"?c=2\">피지오</a></div>");
			pw.write("<div>차:<a href=\"?c=3\">차</a></div>");
			pw.write("<form action=\"list\" method=\"get\">");
			pw.write("<label>개수:<input name=\"s\"></label>");
			pw.write("<input type=\"submit\" value=\"요청\">");
			pw.write("</form>");
			pw.write("</body>");
			pw.write("</html>");
//				pw.flush();
//			pw.close();

			System.out.println("메뉴리스트");
			MenuList menuList;
//			PrintStream out = new PrintStream(response.getOutputStream());
			if (category == 0) {

				menuList = repository.findAll(size);
			} else {

				menuList = repository.findAllByCategoryId(category);
			}
//			int size = menuList.size();
			System.out.println(size);
//	        FileOutputStream fos = new FileOutputStream("res/menu.csv");
			for (int i = 0; i < size; i++) {

				Menu menu = menuList.get(i);
				if(menu==null)
					break;
				
				int id = menu.getId();
				String korName = menu.getKorName();
				String engName = menu.getEngName();
				int price = menu.getPrice();
				int like = menu.getLike();
				String image = menu.getImage();

				pw.write("<section>");
				pw.printf("      <h1><a href=\"detail\">%s</a></h1>", korName);
				pw.printf("      <div>%s</div>", image);
				pw.printf("      <div>%s</div>", engName);
				pw.printf("      <div>%d</div>", price);
				pw.printf("      <div>%d좋아요</div>", like);
				pw.write("</section>");

//				out.printf("[%d] %s (%s) / %d원 / 좋아요(%d) [%s]<br>", id, korName, engName, price, like, image);
			}

		}

	}
}