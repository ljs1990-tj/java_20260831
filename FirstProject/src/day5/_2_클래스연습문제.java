package day5;

public class _2_클래스연습문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 아래 코드의 오류를 없애고 정해진 형태로 동작하는
		// Food라는 클래스를 생성하기
		
		Food food1 = new Food("라면", 1000);
		Food food2 = new Food("김밥", 2000);
		
		food1.info(); // 결과 : "라면은 1000원 입니다" 출력
		food2.setPrice(2500);
		food2.info(); // 결과 : "김밥은 2500원 입니다" 출력
		
		int price = food1.getPrice();
		System.out.println(price); // '1000' 출력
		
		
	}
}
