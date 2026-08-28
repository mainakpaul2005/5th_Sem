class cal{
    public int add(int a,int b)
        {
            return a+b;
        }
}
public class prog2{
    public static void main(String[] args) {
        cal pg=new cal();         
        
        System.out.println("Sum:"+pg.add(200, 300));
    }
}
