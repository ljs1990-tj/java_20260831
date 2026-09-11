package day10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class _4_복습문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 숫자의 범위(음수 허용x)
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		ArrayList<String> nameList = new ArrayList<>();
		
		System.out.println("======= 과일가게 프로그램 ======");
		while(true) {
			System.out.print("[ (1) 추가 (2) 가격수정 (3) 가격수정v2 (그 외) 종료 ] : ");
			int menu = s.nextInt();
			if(menu == 1) {
				// 과일이름, 가격을 입력받아서 map에 저장 후
				// 해당 map을 리스트에 저장
				HashMap<String, Object> map = new HashMap<>();
				System.out.print("과일 이름 : ");
				String name = s.next();
				map.put("name", name);
				
				System.out.print("가격 : ");
				int price= s.nextInt();
				map.put("price", price);
				
				list.add(map);
				nameList.add(name);
				System.out.println(list);
			} else if(menu == 2){
				// 과일 이름 입력받은 후 해당 과일 있으면
				// 가격 입력받아서 수정
				// 없으면 '해당 과일은 없습니다' 출력 후 메뉴로
				// 어제했던 for써도 되고, 메소드 만들어서 활용해도 됨
				// 추후 작업할 거 생각하면 메소드 만드는게 좀 더 좋다.
				System.out.print("과일 이름 : ");
				String name = s.next();
				HashMap<String, Object> fruit = FruitFunc.searchFruit(list, name);
				if(fruit != null) {
					System.out.print("수정할 가격 : ");
					int price = s.nextInt();
					fruit.put("price", price);
				} else {
					System.out.println("해당 과일은 없습니다");
				}
				
			} else if(menu == 3) {
				System.out.print("과일 이름 : ");
				String name = s.next();
				if(nameList.contains(name)) {
					int index = nameList.indexOf(name);
					HashMap<String, Object> fruit = list.get(index);
					System.out.print("수정할 가격 : ");
					int price = s.nextInt();
					fruit.put("price", price);
				} else {
					System.out.println("해당 과일은 없습니다");
				}
			}
		}
	}

}
