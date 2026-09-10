package day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class _6_Json문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 성적입력 프로그램
		// 입력하고 싶은 만큼 입력 후 종료하고 싶을 때 종료

		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		System.out.println("====== 성적 입력 프로그램 ======");
		
		while(true) {
			System.out.print("[ (1) 성적입력, (2) 성적확인 (그 외) 종료 ] : ");
			int menu = s.nextInt();
			if(menu == 1) {
				// 이름, 자바점수, db점수, html점수 입력받아서 map으로 만든 후
				// list에 저장
				HashMap<String, Object> map = new HashMap<>();
				System.out.print("이름 : ");
				String name = s.next();
				map.put("name", name);
				
				System.out.print("자바 : ");
				int java = s.nextInt();
				map.put("java", java);
				
				System.out.print("db : ");
				int db = s.nextInt();
				map.put("db", db);
				
				System.out.print("html : ");
				int html = s.nextInt();
				map.put("html", html);
				
				list.add(map);
				System.out.println(list);
			} else if(menu == 2){
				// 이름을 입력받은 후 해당 학생의 자바점수, db점수, html점수 출력
				// 해당 학생이 list에 존재하지 않으면 '등록된 학생이 아닙니다' 출력
				Boolean searchFlg = false;
				System.out.print("이름 : ");
				String name = s.next();
				for(int i=0; i<list.size(); i++) {
					HashMap<String, Object> user = list.get(i);
					if(name.equals(user.get("name"))) {
						System.out.print("자바 : " + user.get("java"));
						System.out.print(", db : " + user.get("db"));
						System.out.println(", html : " + user.get("html"));
						searchFlg = true;
						break;
					} 
				}
				
				if(!searchFlg) { // searchFlg == false
					System.out.println("등록된 학생이 아닙니다.");
				}
				
				
			} else {
				System.out.println("종료되었습니다!");
				break;
			}
		}		
	}
}
