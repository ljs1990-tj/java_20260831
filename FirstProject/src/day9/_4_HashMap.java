package day9;

import java.util.ArrayList;
import java.util.HashMap;

public class _4_HashMap {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Object> hong = new HashMap<>();
		hong.put("name", "홍길동");
		hong.put("java", 95);
		hong.put("db", 92);
		hong.put("html", 96);
		System.out.println(hong);
		
		HashMap<String, Object> kim = new HashMap<>();
		kim.put("name", "김철수");
		kim.put("java", 91);
		kim.put("db", 99);
		kim.put("html", 92);
		System.out.println(kim);
		
		HashMap<String, Object> park = new HashMap<>();
		park.put("name", "박영희");
		park.put("java", 100);
		park.put("db", 99);
		park.put("html", 100);
		System.out.println(park);
		
		
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		list.add(hong);
		list.add(kim);
		list.add(park);
		System.out.println(list);
	}
}
