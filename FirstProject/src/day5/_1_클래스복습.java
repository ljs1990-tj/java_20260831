package day5;

public class _1_클래스복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// '소나타' '검정' '1000'
		Car car1 = new Car("소나타", "검정", 1000);
		Car car2 = new Car("모닝", "노랑", 500);
		Car car3 = new Car("티코", "빨강");
		
		String txt = car1.carInfo();
		System.out.println(txt);
		
		car1.speedUp(100);
		car1.speedDown(30);
		car1.speedDown();
		
		// ======= Car 클래스 수정 =======
		// Car 클래스의 price 변수는 private 으로 선언
		int price = car1.getPrice(); 
		System.out.println(price); // '1000' 출력
		
		car1.setPrice(-100); // '가격은 1이상 입력해주세요' 출력
		car1.setPrice(1500);
		
		price = car1.getPrice(); 
		System.out.println(price); // '1500' 출력
		
		
	}
}
