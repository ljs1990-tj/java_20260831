package day8;

public class Fruit {
	private String name;
	private int price;
	
	Fruit(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Fruit f = (Fruit) obj;
		if(name.equals(f.getName()) && price == f.getPrice()) {
			return true;
		}
		
		return false;
	}
	
}
