package day6;

public class TJ_Student {
	String name;
	int stuNo;
	int money; // 개인 보유금액
	static int classMoney = 500000; // 회비(전체가 공유하는 값)
	
	TJ_Student(String name, int stuNo, int money){
		this.name = name;
		this.stuNo = stuNo;
		this.money = money;
	}
	
	void classMoneyInfo() {
		System.out.println("남은 회비 : " + classMoney);
	}
	
	static void moneyInfo() {
		// static멤버에서는 non-static멤버에 접근이 불가능하다.
		// non-static멤버는 객체를 만든 이후에 의미가 있기 때문에
//		System.out.println("남은 금액 : " + money);
	}
	
}
