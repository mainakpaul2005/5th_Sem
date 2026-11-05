public class TestMain {
    public static void main(String[] args) {
        Complex c1 = new Complex(5, 3);
        Complex c2 = new Complex(2, 1);

        System.out.println("First Complex Number:");
        c1.displayCNum();

        System.out.println("Second Complex Number:");
        c2.displayCNum();

        Complex c3 = new Complex();

        System.out.println("Addition:");
        c3 = c3.addCNum(c1, c2);
        c3.displayCNum();

        System.out.println("Subtraction:");
        c3 = c3.subCNum(c1, c2);
        c3.displayCNum();

        System.out.println("Multiplication:");
        c3 = c3.mulCNum(c1, c2);
        c3.displayCNum();

        System.out.println("Addition using object method:");
        c1.addCNum(c2);
        c1.displayCNum();

        System.out.println("Subtraction using object method:");
        c1.subCNum(c2);
        c1.displayCNum();
    }
}