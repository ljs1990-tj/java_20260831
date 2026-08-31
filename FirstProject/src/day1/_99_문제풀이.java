package day1;

public class _99_문제풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 변수 선언
		// 사원번호(empNo) - 정수, 
		// 사원이름(empName) - 문자, 부서(dept) - 문자, 
		// 급여(sal) - 정수, 키(height) - 실수
		
		// 아래와 같이 변수에 저장
		// 사원번호 : 1234, 이름 : 홍길동, 부서 : 영업, 급여 : 3000000
		// 키 : 179.9
		
		// 프린트문을 이용해서 아래와 같이 출력(변수 이용할 것)
		// '홍길동의 사번은 1234 부서는 영업팀, 키는 179.9cm 입니다.' 출력
		// '홍길동', '1234', '영업', '179.9'는 변수를 통해 출력
		
		int empNo = 1234;
		String empName;
		empName = "홍길동";
		String dept = "영업";
		int sal = 3000000;
		double height = 179.9;
		// '홍길동의 사번은 1234 부서는 영업팀, 키는 179.9cm 입니다.' 출력
		System.out.println(
			empName + "의 사번은 " + empNo + " 부서는 " + dept + ", 키는 "
			+ height + "cm 입니다."
		);
		
	}
}
