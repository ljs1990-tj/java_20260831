package day11;

import java.sql.Statement;
import java.util.Scanner;

public class _3_업데이트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBClass db = new DBClass();
		Statement stmt = db.getStmt();
		Scanner s = new Scanner(System.in);
		try {
			// 1. 스캐너로 과일 이름 입력받기
			// 2. 수정할 가격 입력받아서 수정하기
			System.out.print("과일 이름 : ");
			String fruitName = s.next();
			System.out.print("수정할 가격 : ");
			int newPrice = s.nextInt();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}

}
