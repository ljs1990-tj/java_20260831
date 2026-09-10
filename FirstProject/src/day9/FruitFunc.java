package day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FruitFunc {
	static Scanner s = new Scanner(System.in);
	
	static HashMap<String,Object> searchFruit(ArrayList<HashMap<String,Object>> list, String name) {
		for(int i=0; i<list.size(); i++) {
			HashMap<String,Object> fruit = list.get(i);
			if(name.equals(fruit.get("name"))) {
				return fruit;
			}
		}
		return null;
		
	}
	
	static int nonNegative(String msg) {
		while(true) {
			System.out.print(msg);
			int num = s.nextInt();
			if(num > 0) {
				return num;
			} else {
				System.out.println("0보다 큰 숫자를 입력해주세요.");
			}
		}
		
	}
	
}
