package day2;

public class _15_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if ~ else if 처럼 조건이 많을 경우
		// switch ~ case 문을 통해 해결하는것도 가능
		
		// 90~100점 'A학점' 출력
		// 80~89점 'B학점' 출력
		// ... 60점 미만 'F학점' 출력
		int score = 100;
		
		switch (score / 10) {
		case 10:
		case 9:
			System.out.println("A학점");
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		case 6:
			System.out.println("D학점");
			break;
		default:
			System.out.println("F학점");
			break;
		}
		
		
	}
}
