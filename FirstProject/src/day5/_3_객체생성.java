package day5;

public class _3_객체생성 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 종류 : 강아지, 이름 : 댕댕이, 나이 : 5 객체 생성
		Animal animal1 = new Animal("강아지", "댕댕이", 5);
		// 종류 : 고양이, 나이 : 3 객체 생성
		Animal animal2 = new Animal("고양이", 3); // '이름미정'
		
		new Animal();
	}

}
