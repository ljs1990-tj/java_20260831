package day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class _5_Json {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list 
			= new ArrayList<>();
		System.out.println("====== 성적 입력 프로그램 ======");
		
		for(int i=0; i<3; i++) {
			HashMap<String, Object> map = new HashMap<>();
			System.out.print("이름 : ");
			String name = scan.next();
			map.put("name", name);
			
			System.out.print("자바 점수 : ");
			int java = scan.nextInt();
			map.put("java", java);
			
			System.out.print("db 점수 : ");
			int db = scan.nextInt();
			map.put("db", db);
			
			list.add(map);
			System.out.println("==================================");
		}
		
		System.out.println(list);
	}
}
