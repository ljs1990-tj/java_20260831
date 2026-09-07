package day6;

public class _2_복습문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 아래 코드가 main함수내에서 정상동작하도록
		// Person 클래스를 생성할 것
		// 모든 변수 private 선언할 것 
		// (모든 변수에 대해 get, set 메소드 생성할 것)
		Person hong = new Person("홍길동"); // 이름
		Person kim = new Person("김철수", 30); // 이름, 나이
		Person park = new Person("박영희", 25, "인천"); // 이름, 나이, 주소

		System.out.println(hong.getName()); // '홍길동' 출력
		System.out.println(hong.getAge()); // '나이가 등록되지 않았습니다' 출력
		hong.setAge(35);
		System.out.println(hong.getAge()); // '35' 출력

		System.out.println(kim.getInfo()); // '모든 정보가 입력되지 않았습니다' 출력
		System.out.println(park.getInfo()); // '이름 : 박영희, 나이 : 25, 주소 : 인천' 출력

	}

}
