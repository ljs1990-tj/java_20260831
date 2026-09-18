package day15;

public class 객체생성 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human hong = new Human("홍길동", 30);
//		hong.name = "홍길동";
		hong.walk();
		String result = hong.eat("라면");
		System.out.println(result);
		
		
	}
}
