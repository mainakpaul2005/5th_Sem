
public class TestMain {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		
		System.out.println("1+2 = "+c.addNum(1, 2));
		System.out.println("1+2+3 = "+c.addNum(1, 2, 3));
		System.out.println("1+2+3+4 = "+c.addNum(1, 2, 3, 4));
		
		System.out.println("1*2 = "+c.mulNum(1, 2));
		System.out.println("1*2*3 = "+c.mulNum(1, 2, 3));
		System.out.println("1*2*3*4 = "+c.mulNum(1, 2, 3, 4));
	}

}
