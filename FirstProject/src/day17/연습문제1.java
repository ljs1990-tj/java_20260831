package day17;

public class 연습문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 이메일 도메인 추출하기
//		이메일 주소를 담은 문자열이 주어졌을 때, @ 기호 이후의 도메인 부분만 잘라내어 출력하는 코드를 작성하세요.
//
//		입력 예시: "goodjava@gmail.com"
//		출력 예시: "gmail.com"
		String email = "goodjava@gmail.com";
		int index = email.indexOf("@");
		String result1 = email.substring(index+1);
		System.out.println(result1);

//		2. 전화번호 하이픈(-) 제거하기
//		하이픈(-)이 포함된 전화번호 문자열이 주어졌을 때, 하이픈을 모두 제거하고 숫자만 남긴 문자열을 출력하는 코드를 작성하세요.
//
//		입력 예시: "010-1234-5678"
//		출력 예시: "01012345678"
		String phone = "010-1234-5678";
		String result2 = phone.replace("-", "");
		System.out.println(result2);
	}

}
