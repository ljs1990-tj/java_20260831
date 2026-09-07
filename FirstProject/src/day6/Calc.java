package day6;

public class Calc extends _Calc{

	@Override
	int sum(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	int sum(int x, int y, int z) {
		// TODO Auto-generated method stub
		return x+y+z;
	}

	@Override
	int multiple(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}

	@Override
	double divide(int x, int y) {
		// TODO Auto-generated method stub
		return x/(double)y;
	}

}
