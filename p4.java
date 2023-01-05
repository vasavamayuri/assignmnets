import java.util.Scanner;
public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, sum=0,n;
        float avg;
        {
            System.out.println("enter 5 numbers");
        }
        for(i=0;i<5;i++)
        {
            
            n=sc.nextInt();
            sum=sum+n;

        }
        avg=sum/5;
        System.out.println("The sum of 5 no is :" +sum );
        System.out.println("The Average is : " +avg);
    }
    
    
}
