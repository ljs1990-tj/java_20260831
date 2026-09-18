package day15;

import java.util.HashMap;

public class HashMap예제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// key, value
		HashMap<String, Object> hong = new HashMap<>();
		hong.put("name", "홍길동");
		hong.put("age", 30);
		hong.put("height", 170.1);
		
		HashMap<String, Object> addr = new HashMap<>();
		addr.put("도로명주소", "인천시 부평구 어쩌구 저쩌구 ...");
		addr.put("상세주소", "oo동 oo호");
		addr.put("우편번호", "123-123");
		
		hong.put("address", addr);
		System.out.println(hong);
		
		System.out.println(hong.get("name"));
		HashMap map = (HashMap<String, Object>) hong.get("address");
		System.out.println(map.get("도로명주소"));
		
	}

}
