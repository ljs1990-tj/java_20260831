package day11;

import java.util.Scanner;

public class MyFunction {
	static Scanner s = new Scanner(System.in);
	public static int nonNegative(String msg) {
		while(true) {
			System.out.print(msg);
			int num = s.nextInt();
			if(num > 0) {
				return num;
			}
			System.out.println("0보다 큰 숫자를 입력해주세요.");
		}
	}
}
