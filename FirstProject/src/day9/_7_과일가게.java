package day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class _7_과일가게 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		System.out.println("====== 과일 가게 프로그램 ======");
		
		while(true) {
			System.out.print("[ (1) 과일등록 (2) 가격수정 (3) 미정 (그 외) 종료 ] : ");
			int menu = s.nextInt();
			if(menu == 1) {
				// 과일이름, 가격, 개수 입력받아서 map 저장 후
				// list에 저장
				// 단, 동일한 이름의 과일이 이미 있으면
				// '이미 등록된 과일 입니다' 출력 후 다시 메뉴로 이동
				HashMap<String, Object> map = new HashMap<>();
				Boolean searchFlg = false;
				System.out.print("과일이름 : ");
				String name = s.next();
				for(int i=0; i<list.size(); i++) {
					HashMap<String, Object> fruit = list.get(i);
					if(name.equals(fruit.get("name"))) {
						System.out.println("이미 등록된 과일 입니다");
						searchFlg = true;
						break;
					}
				}
				
				if(searchFlg) {
					continue;
				}
				
				map.put("name", name);
				
				System.out.print("가격 : ");
				int price = s.nextInt();
				map.put("price", price);
				
				System.out.print("개수 : ");
				int count = s.nextInt();
				map.put("count", count);
				
				list.add(map);
				
			} else if(menu == 2) {
				// 과일 이름 입력받아서 과일이 없으면 '해당 과일 없습니다' 출력
				// 있으면 가격 입력받아서 해당 가격으로 변경
				Boolean searchFlg = false;
				System.out.print("수정할 과일 이름 : ");
				String name = s.next();
				for(int i=0; i<list.size(); i++) {
					HashMap<String, Object> fruit = list.get(i);
					if(name.equals(fruit.get("name"))) {
						System.out.print("수정할 가격 입력 : ");
						int price = s.nextInt();
						fruit.put("price", price);
						searchFlg = true;
						break;
					}
				}
				if(!searchFlg) {
					System.out.println("해당 과일 없습니다.");
				}
				
				
			}
		}
	}
}
