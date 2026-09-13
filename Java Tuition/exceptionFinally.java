public class exceptionFinally {

  public static void main(String[] args) {
    try {
      // code that generates exception
      int result= 5 / 0;
      System.out.println("Result:"+result);
    }

    catch (ArithmeticException e) {
      System.out.println("ArithmeticException => " + e.getMessage());
    }
    
    finally {
      System.out.println("This is the finally block");
    }
  }

    
}
