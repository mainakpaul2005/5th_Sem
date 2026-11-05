
public class BasicCalc {
	public int addNum(int... a) {
		int sum = 0;
		for(int i:a) {
			sum+=i;
		}
		return sum;
	}
	
	public int subNum(int... a) {
		int sub = 0;
		for(int i:a) {
			sub-=i;
		}
		return sub;
	}

}
