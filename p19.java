/*Create a class named 'Print Number' to print various numbers of different data types by creating different methods with the same name 'printn' having a parameter for each data type. */
class PrintNumber {
    void printn(int a, char ch)
    {
        
        System.out.println(a + " "+ ch);
    }
    void printn(int c ,int d)
    { 
        this.printn(10,'c');
        int res1=c*d;
        System.out.println("Multiplication of two numbers"+res1);
    }

}
public class p19 
{
    public static void main(String[] args) {
        PrintNumber pe=new PrintNumber();
        pe.printn(20, 30);
    


    }
}
// Another progran
class PrintNumber {
    static void printn(int a, char ch)
     {
         
         System.out.println(a + " "+ ch);
     }
      static void printn(int c ,int d)
     { 
         
         int res1=c*d;
         System.out.println("Multiplication of two numbers"+res1);
     }
 
 }
 public class pp 
 {
     public static void main(String[] args) {
         PrintNumber pe=new PrintNumber();
         PrintNumber.printn(10,'v');
         PrintNumber.printn(10,20);
         
     
 
 
     }
 }