package day5;

public class _5_Private지정자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit apple = new Fruit("사과", 100, 3000);
		
		// private 선언된 민감한 정보는
		// 메소드를 통해서 간접적으로 제어해야 한다.
//		apple.price = 1000;
		System.out.println("변경 전 : " + apple.getPrice());
		apple.setPrice(1000);
		System.out.println("변경 후 : " + apple.getPrice());
		
	}
}
