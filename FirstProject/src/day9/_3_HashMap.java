package day9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class _3_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		map.put("홍길동", 95);
		map.put("김철수", 91);
		map.put("이영희", 98);
		
		System.out.println(map);
		System.out.println(map.get("홍길동"));
		

		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		Iterator<String> keyList = keys.iterator();
		int sum = 0;
		while(keyList.hasNext()) {
			sum += map.get(keyList.next());
//			System.out.println(keyList.next());
		}
		System.out.println(sum);
	}
}
