package day4;

import day5.User;

public class _999_접근지정자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User();
		user.name = "홍길동";
//		user.age = 30; 다른패키지이므로 default 접근 불가
//		user.addr = "인천"; 다른패키지이므로 protected 접근 불가
//		user.gender = "남자"; private 라서 접근 불가
	}

}
