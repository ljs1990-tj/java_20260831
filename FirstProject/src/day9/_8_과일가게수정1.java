package day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class _8_과일가게수정1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		System.out.println("====== 과일 가게 프로그램 ======");
		
		while(true) {
			System.out.print("[ (1) 과일등록 (2) 가격수정 (3) 과일구매 (그 외) 종료 ] : ");
			int menu = s.nextInt();
			if(menu == 1) {
				HashMap<String, Object> map = new HashMap<>();
				System.out.print("과일이름 : ");
				String name = s.next();
				HashMap<String, Object> fruit = FruitFunc.searchFruit(list, name);
				if(fruit != null) {
					System.out.println("이미 등록된 과일 입니다");
				} else {
					map.put("name", name);
					
					int price = FruitFunc.nonNegative("가격 : ");
					map.put("price", price);
					
					int count = FruitFunc.nonNegative("개수 : ");
					map.put("count", count);
					
					list.add(map);
				}
			} else if(menu == 2) {
				System.out.print("수정할 과일 이름 : ");
				String name = s.next();
				HashMap<String, Object> fruit = FruitFunc.searchFruit(list, name);
				if(fruit != null) {
					int price = FruitFunc.nonNegative("수정할 가격 입력 : ");
					fruit.put("price", price);
				} else {
					System.out.println("해당 과일 없습니다.");
				}
			} else if(menu == 3) {
				System.out.print("구매할 과일 이름 : ");
				String name = s.next();
				HashMap<String, Object> fruit = FruitFunc.searchFruit(list, name);
				if(fruit != null) {
					System.out.println("변경 전 : " + fruit);
					
//					int count = FruitFunc.nonNegative("구매할 과일 개수 : ");
//					while((Integer) fruit.get("count") < count) {
//						count = FruitFunc.nonNegative("구매할 과일 개수 : ");
//					}
					
					int count = 0;
					do {
					
						count = FruitFunc.nonNegative("구매할 과일 개수 : ");
						if((Integer) fruit.get("count") < count) {
							System.out.println("현재 남은 과일의 개수는 " + (Integer) fruit.get("count") + " 입니다.");
						}
					} while ((Integer) fruit.get("count") < count);
					
					fruit.put("count", (Integer) fruit.get("count") - count);
					
					System.out.println("변경 후 : " + fruit);
				} else {
					System.out.println("해당 과일 없습니다.");
				}
			}
		}
	}

}
