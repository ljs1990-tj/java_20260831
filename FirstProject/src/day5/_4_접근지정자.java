package day5;

public class _4_접근지정자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User();
		user.name = "홍길동";
		user.age = 30;
		user.addr = "인천";
//		user.gender = "남자"; private 라서 접근 불가
	}

}
