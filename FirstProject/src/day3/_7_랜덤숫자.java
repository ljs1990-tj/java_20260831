package day3;

import java.util.Random;

public class _7_랜덤숫자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 랜덤하게 숫자를 제공해주는 클래스 Random
		// 랜덤 숫자를 제공해준 클래스는 크게 2가지(Random, Math)
		
		Random ran = new Random();
		int x = ran.nextInt(10); // 0~9 까지의 랜덤 숫자
		int y = ran.nextInt(6) + 1; // 1~6 까지 랜덤 숫자
		System.out.println(y);
		
	}
}
