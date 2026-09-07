package day6;

public class _3_Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TJ_Student hong = new TJ_Student("홍길동", 1234, 50000);
		TJ_Student kim = new TJ_Student("김철수", 9876, 300000);
		
		kim.money -= 30000;
		// 홍길동의 money는 영향 x, non-static => 공유되지 않는 속성들
		System.out.println(hong.money); 
		
		kim.classMoney -= 100000;
		// static은 공유하는 값이므로 홍길동이 접근했을 때 10만원이 줄어든 상태로 출력
		System.out.println(hong.classMoney); 
		
		// static은 클래스 이름으로도 접근이 가능
		// non-static 클래스 이름으로 접근 불가능(객체 생성 후 접근)
//		TJ_Student.money = 10;
		
		TJ_Student.classMoney += 50000;
		System.out.println(TJ_Student.classMoney);
		
		kim.classMoneyInfo();
		
		TJ_Student.moneyInfo();
		
		
	}

}
