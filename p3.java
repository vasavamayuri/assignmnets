import java.util.Scanner;
public class p3 {
    public static void main(String[] args) {
        
    
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter year");
    int x=sc.nextInt();
    if((x%4==0 && x%100!=0)  ||(x%400==0))
    {
        System.out.println("leap year");
    }
    else
    {
        System.out.println("is not leap year");
    }

}
}
