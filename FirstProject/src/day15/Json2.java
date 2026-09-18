package day15;

import java.util.ArrayList;
import java.util.HashMap;

public class Json2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human h[] = {
				new Human("홍길동", 30), 
				new Human("김철수", 25),
				new Human("박영희", 20),
				new Human("김김김", 32),
				new Human("하하하", 40)
			};
		
		// key -> name, age
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		for(int i=0; i<h.length; i++) {
			HashMap<String, Object> map = new HashMap<>();
			map.put("name", h[i].getName());
			map.put("age", h[i].getAge());
			list.add(map);
		}
		
		System.out.println(list);
		
	}
}
