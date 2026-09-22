package day17;

public class 문자열클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "abcdecfgh";
		
		// substring 인자값 숫자 1개면
		// 해당 위치부터 끝까지 문자열 리턴
		String result1 = text.substring(3);
		System.out.println(result1);
		
		// substring 인자값 숫자 2개면
		// 첫번째 값 부터 두번째 값 이전 까지
		String result2 = text.substring(3, 6); // 3부터 5까지
		System.out.println(result2);
		
		// 해당 문자열의 위치(index) 리턴
		// 여러개 있을 경우 맨 처음 나온 위치 리턴
		int result3 = text.indexOf("c");
		System.out.println(result3);
		
		// 여러개 있을 경우 맨 뒤에 나온 위치 리턴
		int result4 = text.lastIndexOf("c");
		System.out.println(result4);
		
		// 인자값의 위치에 있는 문자 리턴
		// 문자열(String)로 바꾸고 싶으면 문자열 더하기
		// or Character의 toString() 메소드
		// or String의 valueOf() 메소드
//		char result5 = text.charAt(3);
//		String result5 = text.charAt(3) + "";
//		String result5 = String.valueOf(text.charAt(3));
		String result5 = Character.toString(text.charAt(3));
		System.out.println(result5);
		
		// 문자열 대체 c -> A
		String result6 = text.replace("c", "A");
		System.out.println(result6);
	}
}
