package day2;

import java.util.Scanner;

public class _98_조건문참고사항 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열은 같다, 다르다를 '==', '!=' 로 비교하면 안된다.
		// 그래도 문자열 비교를 꼭 해보고 싶다면 equals() 메소르를 써야한다.
		String gender = "남자";
		if(gender.equals("남자")) {
			System.out.println("남자 입니다.");
		}
		
		
		// if문 실행결과가 한줄이면 중괄호 생략이 가능하다
		// 하지만 생략하지말자
		int age = 20;
		if(age >= 30) 
			System.out.println("30 이상!");
		
		System.out.println("두번째 줄");
	}
}
