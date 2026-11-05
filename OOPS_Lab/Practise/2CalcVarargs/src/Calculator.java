
public class Calculator {
	
	public int addNum(int... nums) {
		int sum = 0;
		for(int a : nums) {
			sum += a;
		}
		return sum;
	}
	
	public int mulNum(int... nums) {
		int mul = 1;
		for(int a : nums) {
			mul *= a;
		}
		return mul;
	}
}
