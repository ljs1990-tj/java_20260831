package day5;

public class Point {
	private int x, y; // 한점을 구성하는 x, y 좌표

	public Point() {
		// TODO Auto-generated constructor stub
		System.out.println("부모클래스 생성자(Point)");
	}
	
	public Point(int x) {
		// TODO Auto-generated constructor stub
		this.x = x;
		System.out.println("인자 값을 받는 부모클래스 생성자(Point)");
	}
	public Point(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
		System.out.println("인자 값을 받는 부모클래스 생성자(Point)");
	}
	
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void showPoint() { // 점의 좌표 출력
		System.out.println("(" + x + "," + y + ")");
	}
}
