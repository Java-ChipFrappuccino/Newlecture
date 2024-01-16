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

//@WebServlet("/menu/detail")
public class DetailServletOrigin extends HttpServlet {
	MenuRepository repository;
	
	public DetailServletOrigin() {
		repository = new MenuRepository();
	}
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		System.out.println("메뉴리스트");

//		response.setCharacterEncoding("euc-kr"); //실제 인코딩
		response.setContentType("text/html; charset=utf-8"); //읽을때 이 형식으로 읽어~
//		PrintStream out = new PrintStream(response.getOutputStream(),true,"utf-8");
		PrintWriter pw = new PrintWriter(response.getOutputStream());
		
		pw.write("<!DOCTYPE html>");
		pw.write("<html lang=\"en\">");
		pw.write("<head>\n");
		pw.write("    <meta charset=\"UTF-8\">");
		pw.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
		pw.write("    <title>Document</title>");
		pw.write("</head>");
		pw.write("<body>");
		for (int i = 0; i < 3; i++) {
			Menu menu = repository.findByld(i+1);
			int id = menu.getId();
			String korName = menu.getKorName();
			String engName = menu.getEngName();
			int price = menu.getPrice();
			int like = menu.getLike();
			String image = menu.getImage();
//			out.printf("<!DOCTYPE html>\n"
//					+ "<html lang=\"en\">\n"
//					+ "<head>\n"
//					+ "    <meta charset=\"UTF-8\">\n"
//					+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
//					+ "    <title>Document</title>\n"
//					+ "</head>\n"
			pw.write("<section>");
			pw.printf("      <h1><a href=\"detail\">%s</a></h1>" , korName);
			pw.printf("      <div>%s</div>" , image );
			pw.printf("      <div>%s</div>" , engName);
			pw.printf("      <div>%d</div>" , price);
			pw.printf("      <div>%d좋아요</div>", like);
			pw.write("</section>");
//					+ "<body><section>"
//					+ "      <h1><a href=\"detail\"%s</a></h1>"
//					+ "      <div>%s</div>"
//					+ "      <div>%s</div>"
//					+ "      <div>%d</div>"
//					+ "      <div>%d좋아요</div>"
//					+ "</section>"
//					+ "</body>"
//					+ "</html>", korName, image , engName, price, like);
			}
		pw.write("</body>");
		pw.write("</html>");
		pw.close();
			
			
		}
//		MenuList menuList = repository.findAll();
//		int size = menuList.size();
//		System.out.println(size);
//	        FileOutputStream fos = new FileOutputStream("res/menu.csv");
		
//		for (int i = 0; i < 1; i++) {
//			Menu menu = menuList.get(i);

	}
//}
