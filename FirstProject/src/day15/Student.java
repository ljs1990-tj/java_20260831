package day15;

public class Student extends Person{

	private String stuNo;
	public Student(String name, int age, String addr, String stuNo) {
		super(name, age, addr);
		this.stuNo = stuNo;
	}
	
	public void study() {
		System.out.println("공부한다!");
	}
	
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		String info = super.getInfo() 
					+ "\n주소는 " + getAddr() + ", 학번은 " + stuNo + "입니다.";
		return info;
	}
	
	
}
