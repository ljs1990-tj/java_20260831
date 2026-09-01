package day2;

public class _4_논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 논리연산자 참고 사항
		// # 논리연산자에서 기호를 2개 쓰는 이유
		System.out.println(false & true); // 한개써도 잘 된다.
		System.out.println(false && true);
		// 위에 두개 결과는 같음
		
		// ex) 나이가 6세 이하이면서 키가 100cm 이하일 경우 무료
		int age = 7;
		double height = 99.9;
		System.out.println(age <= 6 && height <= 100);
		System.out.println(age <= 6 & height <= 100);
		
		// 두개짜리는 앞에 결과에 따라 뒤에 계산을 생략할 수 있다.
		// ex) and(&&)에서는 앞에 결과가 false면 뒤에 계산을 할 필요가 없다.
		
		System.out.println(true || false);
		
	}

}
