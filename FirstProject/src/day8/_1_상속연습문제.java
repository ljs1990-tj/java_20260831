package day8;

public class _1_상속연습문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
//		String str = cp.toString();
		System.out.println(cp + "입니다. ");
		// RED색의 (10,20)의 점입니다.

		ColorPoint zeroPoint = new ColorPoint(); // (0,0) 위치의 BLACK 색 점
		System.out.println(zeroPoint.toString() + "입니다.");
		ColorPoint cp2 = new ColorPoint(10, 10); // (10,10) 위치의 BLACK 색 점
		cp2.setXY(5, 5);
		cp2.setColor("RED");
		System.out.println(cp2.toString() + "입니다.");

	}

}
