package kr.co.rland.web.menu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.tomcat.jdbc.pool.DataSource;

public class MenuRepository {
	private String dataSource;
	
    public MenuRepository() {
    	dataSource = "/Users/joon/Desktop/Workspace/RlandWeb/res/menu.csv";
    }
//    	List<Menu> list = new ArrayList<>();
    public List<Menu> findAll(int page) throws FileNotFoundException { //overroad instance method /오버로드된 객체 메서드
        int size = 10; //페이지에 표현되는 글 수
        int offSet = (page-1)*size; // 특정페이지마다 스킵할 글 수

        List<Menu> menuList = new ArrayList<>();
//        List menuList = new List(100);
        FileInputStream fos = new FileInputStream(dataSource);
        Scanner scanner = new Scanner(fos);
        scanner.nextLine();
        String line;
        String[] tokens;
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            tokens = line.split(",");
            Menu menu = new Menu();
            menu.setId(Integer.parseInt(tokens[0]));
            menu.setKorName(tokens[1]);
            menu.setEngName(tokens[2]);
            menu.setPrice(Integer.parseInt(tokens[3]));
            menu.setLike(Integer.parseInt(tokens[4]));
            menu.setImage(tokens[5]);
            menuList.add(menu);
        }
        return menuList;
    }
    
    public List<Menu> findAllByCategoryId(int id) throws FileNotFoundException { //overroad instance method /오버로드된 객체 메서드
//    	int size = 10; //페이지에 표현되는 글 수
//    	int offSet = (page-1)*size; // 특정페이지마다 스킵할 글 수
    	
//    	List<Menu> menuList = new ArrayList<>(100);
    	List<Menu> menuList = new ArrayList<>();
    	FileInputStream fos = new FileInputStream(dataSource);
    	Scanner scanner = new Scanner(fos);
    	scanner.nextLine();
    	String line;
    	String[] tokens;
    	while (scanner.hasNextLine()) {
    		line = scanner.nextLine();
    		tokens = line.split(",");
    		if (Integer.parseInt(tokens[6]) == id || id == 11) {
				
    		Menu menu = new Menu();
    		menu.setId(Integer.parseInt(tokens[0]));
    		menu.setKorName(tokens[1]);
    		menu.setEngName(tokens[2]);
    		menu.setPrice(Integer.parseInt(tokens[3]));
    		menu.setLike(Integer.parseInt(tokens[4]));
    		menu.setImage(tokens[5]);
    		menuList.add(menu);
    		}
    	}
    	return menuList;
    }
    
//    public MenuList findAllByCatogoryId() throws FileNotFoundException { //default instance method / 기본 객체 메서드
//            return findAllByCategoryId(0);
//        }
    
    public List<Menu> findAll() throws FileNotFoundException { //default instance method / 기본 객체 메서드
    	return findAll(0);
    }

    public void save(Menu menu) throws FileNotFoundException {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("id 입력: ");
//        menu.setId(Integer.parseInt(scanner.nextLine()));
//        System.out.print("korName 입력: ");
//        menu.setKorName(scanner.nextLine());
//        System.out.print("engName 입력: ");
//        menu.setEngName(scanner.nextLine());
//        System.out.print("가격 입력: ");
//        menu.setPrice(Integer.parseInt(scanner.nextLine()));
//        System.out.print("좋아요 입력: ");
//        menu.setLike(Integer.parseInt(scanner.nextLine()));
//        System.out.print("image 경로: ");
//        menu.setImage(scanner.nextLine());
        FileOutputStream fos = new FileOutputStream(dataSource,true);
        PrintStream pos = new PrintStream(fos);
        pos.printf("%d,%s,%s,%d,%d,%s\n", menu.getId(), menu.getKorName(), menu.getEngName(), menu.getPrice(), menu.getLike(), menu.getImage());


    }
    public Menu findByld(int id) throws FileNotFoundException {
    	Menu menu = new Menu();
    	FileInputStream fis = new FileInputStream(dataSource);
    	Scanner scanner = new Scanner(fis);
    	scanner.nextLine();
    	while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] tokens = line.split(",");
			if (Integer.parseInt(tokens[0]) == id) {
				menu.setId(id);
				menu.setKorName(tokens[1]);
				menu.setEngName(tokens[2]);
				menu.setPrice(Integer.parseInt(tokens[3]));
				menu.setLike(Integer.parseInt(tokens[4]));
				menu.setImage(tokens[5]);
			}
		}
		return menu;
	}
}

