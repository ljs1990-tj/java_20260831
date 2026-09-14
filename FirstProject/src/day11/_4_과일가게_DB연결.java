package day11;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class _4_과일가게_DB연결 {
	static DBClass db = new DBClass();
	static Statement stmt = db.getStmt();
	static Scanner s = new Scanner(System.in);
	
	public static void addFruit() {
		System.out.println("=== 과일 추가 ===");
	}
	public static void updateFruit() {
		System.out.println("=== 가격 수정 ===");
		// 1. 과일 이름 입력받아서 있는 과일이면 현재 가격 출력
		//    없는 과일이면 '해당 과일 없습니다' 출력 후 메뉴로 이동
		// 2. 새로운 가격을 입력받아서 해당 가격으로 수정 
		
	}
	public static void sellFruit() {
		System.out.println("=== 과일 판매 ===");
	}
	public static void checkFruit() {
		System.out.println("=== 과일 확인 ===");
		try {
			System.out.print("과일 이름 : ");
			String fruitName = "'" + s.next() + "'";
			
			String sql = "SELECT * FROM FRUIT WHERE FRUIT_NAME = " + fruitName;
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				System.out.print(fruitName + "의 가격은 " + rs.getInt("PRICE") + "원 입니다. ");
				System.out.println("남은 개수는 " + rs.getInt("CNT") + "개 입니다.");
			} else {
				System.out.println("해당 과일은 존재하지 않습니다.");
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			
			while(true) {
				System.out.print("[ (1) 과일 추가 (2) 가격 수정 (3) 판매 (4) 과일 확인 (그 외) 종료 ] : ");
				int menu = s.nextInt();
				
				switch (menu) {
				case 1:
					addFruit();
					break;
				case 2:
					updateFruit();
					break;
				case 3:
					sellFruit();
					break;
				case 4:
					checkFruit();
					break;
				default:
					System.out.println("종료되었습니다.");
					break;
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
