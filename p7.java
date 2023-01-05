//Write a Java program that reads a positive integer and count the number of digits the number.
import java.util.Scanner;
public class p7 {
    public static void main(String[] args) {
        int lenght=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        while(num>0)
        {
            num=num/10;
            lenght=lenght+1;


        }
        System.out.println("Number of digits in the number:"+lenght);

    }
    
}
