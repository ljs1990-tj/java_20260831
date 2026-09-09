package day7;

public class GoodCalc implements Calculator{

	@Override
	public int sum(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public int sum(int x, int y, int z) {
		// TODO Auto-generated method stub
		return x+y+z;
	}

	@Override
	public int max(int x, int y) {
		// TODO Auto-generated method stub
//		int max = x > y ? x : y;
		return x > y ? x : y;
	}

	@Override
	public int min(int x, int y) {
		// TODO Auto-generated method stub
		return x > y ? y : x;
	}

}
