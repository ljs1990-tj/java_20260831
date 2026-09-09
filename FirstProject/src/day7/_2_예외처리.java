package day7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _2_예외처리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print("나누기를 할 숫자를 입력해주세요 : ");
				int num = s.nextInt();
				System.out.println("100을 " + num + "으로 나누면 " + (100/num));
				break;
			} catch (ArithmeticException e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
				System.out.println("숫자를 0으로 나눌 수 없습니다.");
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("숫자를 입력해주세요!");
				s.next();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("예기치 못한 에러가 발생했습니다.");
			}
		}
		
		
		
		
		
	}

}
