//Write a Java program to print the ASCII value of a given character.
import java.util.Scanner;
public class p9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any character value");
        char c=sc.next().charAt(0);
        int res=(int)(c);
        System.out.println("ASCII value of character is"+res);


    }
    
}
