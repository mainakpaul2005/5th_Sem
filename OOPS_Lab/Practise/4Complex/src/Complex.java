
public class Complex {
	int a;
	int b;
	
	public Complex(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public Complex() {
		super();
	}
	
	public void displayCNum() {
		System.out.println(this.a+" + i"+this.b);
	}
	
	public void addCNum(Complex c) {
		this.a += c.a;
		this.b += c.b;
	}
	
	public Complex addCNum(Complex a, Complex b) {
		Complex c = new Complex();
		c.a = a.a + b.a;
		c.b = a.b + b.b;
		return c;
	}
	public void subCNum(Complex c) {
		this.a -= c.a;
		this.b -= c.b;
	}
	
	public Complex subCNum(Complex a, Complex b) {
		Complex c = new Complex();
		c.a = a.a - b.a;
		c.b = a.b - b.b;
		return c;
	}
	
	public Complex mulCNum(Complex a, Complex b) {
		Complex c = new Complex();
		
		c.a = (a.a*b.a)+(a.b*b.b);
		c.b = (a.a*b.b)+(a.b*b.a);
		
		return c;
		
	}
}
