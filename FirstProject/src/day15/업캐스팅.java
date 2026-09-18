package day15;

public class 업캐스팅 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person hong = new Person("홍길동", 30, "인천");
		Student kim = new Student("김철수", 25, "서울", "1234");
		
		Person p = kim;
		Student s = (Student) p;
		
		Object obj1 = hong;
		Object obj2 = kim;
	}

}
