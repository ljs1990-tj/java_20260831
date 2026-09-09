package day8;

public class PositivePoint extends Point{
	PositivePoint(){
		super(0, 0);
	}
	PositivePoint(int x, int  y){
		super(0, 0);
		if(x >= 0 && y >= 0) {
			super.move(x, y);
		}
	}
	
	@Override
	protected void move(int x, int y) {
		// TODO Auto-generated method stub
		if(x >= 0 && y >= 0) {
			super.move(x, y);
		}
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		// RED색의 (10,20)의 점
		return "(" + getX() + "," + getY() + ")의 점";
	}
}
