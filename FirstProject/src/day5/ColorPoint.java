package day5;

public class ColorPoint extends Point {
	private String color; // 점의색
	
	public ColorPoint() {
		// TODO Auto-generated constructor stub
		System.out.println("자식클래스 생성자(ColorPoint)");
	}
	
	public ColorPoint(String color) {
		// TODO Auto-generated constructor stub
		// 자식클래스 생성자가 인자값이 있던 없던 무조건 부모의 기본생성자를 호출
		// 부모클래스의 생성자를 선택하고 싶으면 super();
		super(1, 3);
		this.color = color;
		System.out.println("인자 값 받는 생성자");

	}

	public void setColor(String color) {
		this.color = color;
	}

	public void showColorPoint() { // 컬러점의좌표출력
		System.out.print(color); // red
		showPoint(); // red(3,4)
	}
}
