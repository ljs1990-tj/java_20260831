package day5;

public class ColorPoint extends Point {
	private String color; // 점의색

	public void setColor(String color) {
		this.color = color;
	}

	public void showColorPoint() { // 컬러점의좌표출력
		System.out.print(color);
		showPoint(); // Point 클래스의showPoint() 호출
	}
}
