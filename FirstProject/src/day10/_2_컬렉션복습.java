package day10;

import java.util.HashMap;

public class _2_컬렉션복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// HashMap => (key, value)
		HashMap<String, Object> map = new HashMap<>();
		map.put("name", "홍길동");
		map.put("age", 30);
		map.put("height", 170.1);
		System.out.println(map);
		
		System.out.println(map.get("name"));
		
		if(map.containsKey("age")) {
			System.out.println((Integer) map.get("age") + 1);
		}
		
		
	}
}
