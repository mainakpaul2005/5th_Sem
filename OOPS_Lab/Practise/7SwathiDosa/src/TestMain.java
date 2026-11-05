
public class TestMain {
	public static void main(String[] args) {
		Dosa d1 = new MasalaDosa();
		d1.makeDosa();
		d1.serveDosa();
		
		Dosa d2 = new OnionDosa();
		d2.makeDosa();
		d2.serveDosa();
	}
}
