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
public class ListServlet3 extends HttpServlet {
//	MenuRepository repository;
//
//	public ListServlet3() {
//		repository = new MenuRepository();
//	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		{
//			String title = request.getParameter("title");
//			String text = request.getParameter("text");
			// ?page=1&size=10 ->QueryString
			// ?p=1&s=10
//			String title = 11;
//			Stringg text = 0;
//			if (title != null && !title.equals(""))
//				title = request.getParameter("title"); // ?size = 10
//			if (text != null && !text.equals(""))
//				text = request.getParameter("text"); // ?size = 10

//			String size = request.getParameter("size"); // ?size = 10
//		int page = ?; ?page=1,2,3,,,,
//			System.out.printf("[size] = %s\n", size);

			PrintWriter pw = new PrintWriter(response.getOutputStream(),true);
			pw.write("test");
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
			pw.write("<label>제목:<input name=\"title\"></label>");
			pw.write("<label>내용:<textarea></textarea><input name=\"title\"></label>");
			pw.write("<input type=\"submit\" value=\"요청\">");
			pw.write("</form>");
			pw.write("</body>");
			pw.write("</html>");
			pw.flush();

		}

	}
}