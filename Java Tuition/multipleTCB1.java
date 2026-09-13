public class multipleTCB1 {
    
   public static void main(String args[]){
      try{
         int arr[]=new int[7];
         arr[10]=10/5;
         arr[5]= 10 / 0;
         System.out.println(" try block last statement");
      }
      catch(ArithmeticException z){
         System.out.println("don't divide a number by zero"+z.getMessage());
      }
      catch(ArrayIndexOutOfBoundsException e){
         System.out.println("array elements outside accessed of the limit");
      }
      catch(Exception e){
         System.out.println("Other Exception");
      }
      System.out.println("Outside try-catch block");
   
}

    
}
