package day2;

public class _3_논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// and, or
		
		// and(&&) 는 둘 다 참(true)이여야 결과가 참(true)
		
		System.out.println(true && true); // true
		System.out.println(true && false); // false
		System.out.println(false && true); // false
		System.out.println(false && false); // false
		
		// ex) 나이가 6세 이하이면서 키가 100cm 이하일 경우 무료
		int age = 5;
		double height = 99.9;
		System.out.println(age <= 6 && height <= 100); // true
		
		// or(||) 는 둘 중 하나라도 참(true)이면 결과가 참(true)
		System.out.println(true || true); // true
		System.out.println(true || false); // true
		System.out.println(false || true); // true
		System.out.println(false || false); // false
		
		// 6세 이하이거나 혹은 60세 이상일 경우 무료
		System.out.println(age <= 6 || age >= 60); // true
		
		
	}

}
